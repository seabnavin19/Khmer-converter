package com.example.khmerconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khmerconverter.length
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=Intent(this,length::class.java)
        var iw=Intent(this,weight::class.java)
        lengt.setOnClickListener(){
            startActivity(i)
        }
        weigh.setOnClickListener(){
            startActivity(iw)
        }

    }


}