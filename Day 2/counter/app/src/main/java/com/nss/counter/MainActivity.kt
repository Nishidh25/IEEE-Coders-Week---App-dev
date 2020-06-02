package com.nss.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "Incremented!", Toast.LENGTH_SHORT)
            myToast.show()
            count()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "Counter Reset to 0!", Toast.LENGTH_LONG)
            myToast.show()
            reset()
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "Decremented!", Toast.LENGTH_LONG)
            myToast.show()
            minus()
        }
    }
    fun count(){
        val tv = findViewById<TextView>(R.id.textView2)
        val countString = tv.text.toString()
        var count = countString.toInt()
        count++
        tv.text = count.toString()
    }
    fun minus(){
        val tv = findViewById<TextView>(R.id.textView2)
        val countString = tv.text.toString()
        var count = countString.toInt()
        count--
        tv.text = count.toString()
    }
    fun reset(){
        val tv = findViewById<TextView>(R.id.textView2)
        var count = 0
        tv.text = count.toString()
    }
}