package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_up_btn.setOnClickListener({
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        })
    }
}