package com.mx.gruposicoss.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity(),View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvSalute.setOnClickListener(this)
        println("OnCreate")

    }



    override fun onStart(){
        super.onStart()
        println("OnStart")
        Log.i(MainActivity::class.java.simpleName, "OnStart")
    }


    override fun onResume(){
        super.onResume()
        println("onResume")
        Log.wtf(MainActivity::class.java.simpleName, "onResume")
    }
    override fun onPause(){
        super.onPause()
        println("onPause")
        Log.d(MainActivity::class.java.simpleName, "onPause")
    }

    override fun onRestart(){
        super.onRestart()
        println("onRestart")
        Log.d(MainActivity::class.java.simpleName, "onRestart")
    }
    override fun onDestroy(){
        super.onDestroy()
        println("onDestroy")
        Log.e(MainActivity::class.java.simpleName, "onDestroy")
    }


    fun toSecond(view:View){
       // Log.wtf(MainActivity::class.java.simpleName,"OnclickEvent")
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)

    }


    override fun onClick(view: View?) {
        when(view?.id){
            tvSalute.id ->{
                Log.d(MainActivity::class.java.simpleName,"onClickInterface")
            }
        }


    }


}
