package com.nss.Login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.auth.AuthUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strUser: String? = intent.getStringExtra("Email")
        var strName: String? = intent.getStringExtra("Name")

        val tv = findViewById<TextView>(R.id.textView2)
        tv.text = "Logged in as $strName"


        button.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, CountActivity::class.java)
            startActivity(intent)

        }

        button3.setOnClickListener {

            AuthUI.getInstance().signOut(this).addOnCompleteListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

        }


    }

}