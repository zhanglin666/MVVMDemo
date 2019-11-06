package cn.kc.mvvmdemo.ui.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import cn.kc.mvvmdemo.ui.main.ApiCodeException
import cn.kc.mvvmdemo.ui.main.UserBean
import cn.kc.mvvmdemo.ui.main.WanResponse
import io.reactivex.Observable
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * 作者： Abel .
 * 日期：2019/11/5
 * 说明：
 */
class LoginRepository {

    val compositeDisposable by lazy { CompositeDisposable() }

    val state: MutableLiveData<ResultEnum> by lazy {
        MutableLiveData<ResultEnum>()
    }

    fun login() {
        val disposable = wanService.login("245400", "245400")
            .subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
//            .compose(handlerResult())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                state.value=ResultEnum.SUCCESS
            }, {
                state.value=ResultEnum.FAILED
//                Log.d("HomeRepository", "load banner error::" + ApiCodeException.checkException(it))
            })
        compositeDisposable.add(disposable)
    }

    fun <T> handlerResult(): ObservableTransformer<WanResponse<List<T>>, List<T>> {
        return ObservableTransformer { upstream ->
            upstream.flatMap { t ->
                return@flatMap if (t.code == 0) {
                    Observable.create<List<T>> {
                        try {
                            it.onNext(t.data)
                            it.onComplete()
                        } catch (e: Exception) {
                            it.onError(e)
                        }
                    }
                } else {
                    Observable.error { ApiCodeException(t.msg) }
                }
            }
        }
    }
}