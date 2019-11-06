package cn.kc.mvvmdemo.ui.login

import androidx.lifecycle.ViewModel

/**
 * 作者： Abel .
 * 日期：2019/11/5
 * 说明：
 */
class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    val state = repository.state

    fun login(user:String,password:String) = repository.login(user,password)

}