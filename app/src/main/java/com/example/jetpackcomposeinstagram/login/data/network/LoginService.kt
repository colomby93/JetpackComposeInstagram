package com.example.jetpackcomposeinstagram.login.data.network

import com.example.jetpackcomposeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {

    val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String,password:String){
        //coroutine
        withContext(Dispatchers.IO){
            val response = retrofit.create(LoginClient::class.java).doloLogin(user,password)
            response.body()?.success
        }
    }

}