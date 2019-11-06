package cn.kc.mvvmdemo.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import cn.kc.mvvmdemo.R
import cn.kc.mvvmdemo.ui.main.CopyActivity
import kotlinx.android.synthetic.main.act_login.*

/**
 * 作者： Abel .
 * 日期：2019/11/5
 * 说明：
 */
class LoginActivity : AppCompatActivity() {

    val mLoginViewModel: LoginViewModel by lazy {
        ViewModelProviders.of(this,object :ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return LoginViewModel(LoginRepository()) as T
            }
        })[LoginViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_login)
        init()
    }

    fun init() {
        login.setOnClickListener {
            mLoginViewModel.login()
        }

        mLoginViewModel.state.observe(this, object : Observer<ResultEnum> {
            override fun onChanged(t: ResultEnum?) {
                when (t) {
                    ResultEnum.SUCCESS -> {
                        val intent = Intent()
                        intent.setClass(this@LoginActivity, CopyActivity::class.java)
                        startActivity(intent)
                    }
                    ResultEnum.FAILED -> {
                        Toast.makeText(this@LoginActivity, "登录失败", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }

}