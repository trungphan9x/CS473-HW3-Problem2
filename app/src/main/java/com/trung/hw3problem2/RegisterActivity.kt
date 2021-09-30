package com.trung.hw3problem2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.trung.hw3problem2.data.User
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setListener()
    }

    private fun setListener() {
        buttonCreateAccount.setOnClickListener {
            val firstname = edtFirstname.text.toString().trim()
            val lastname = edtLastname.text.toString().trim()
            val email = edtEmailAddress.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if (!firstname.isNullOrEmpty() && !lastname.isNullOrEmpty() && !email.isNullOrEmpty() && !password.isNullOrEmpty()) {
                val user = User(firstname, lastname, email, password)
                setResult(Activity.RESULT_OK, Intent().apply {
                    putExtra("user", user)
                })
                finish()
            } else {
                Toast.makeText(this, "Input valuesare invalid", Toast.LENGTH_LONG).show()
            }
        }
    }
}