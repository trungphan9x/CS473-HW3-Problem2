package com.trung.hw3problem2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.trung.hw3problem2.data.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val users = arrayListOf<User>().apply {
        add(User("Trung", "Phan", "trung@gmail.com", "123456"))
        add(User("Bill", "Gate", "bill@gmail.com", "1234568"))
        add(User("Steve", "Job", "steve@gmail.com", "1234567"))
        add(User("Adele", "Adele", "adele@gmail.com", "1234561"))
        add(User("Marry", "Alex", "marry@gmail.com", "1234568"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQUEST_CODE_REGISTER -> {
                if (resultCode == Activity.RESULT_OK) {
                    data?.let {
                        val registeredUser = it.getSerializableExtra("user") as? User
                        registeredUser?.let {
                            users.add(registeredUser)
                            Toast.makeText(this, "User Registration is success!!!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    private fun setListener() {
        button_sign_in.setOnClickListener {
            val email = edtEmailAddress.text.toString().trim()
            val password = edtPassword.text.toString().trim()
            if (!email.isNullOrEmpty() && !password.isNullOrEmpty() && users.any { it.username == email && it.password == password}) {
                startActivity(Intent(this, ShoppingCategoryActivity::class.java).apply {
                    putExtra("username", email)
                })
            } else {
                Toast.makeText(this, "Your username or password is invalid!!!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_create_new_account.setOnClickListener {
            startActivityForResult(Intent(this, RegisterActivity::class.java), REQUEST_CODE_REGISTER)
        }

        tv_forgot_password.setOnClickListener {
            val email = edtEmailAddress.text.toString().trim()
            if (!email.isNullOrEmpty()) {
                val password =  users.find { it.username == email}.let { it!!.password }
                sendEmail(email, "Hi! Here is your password", password)
            } else {
                Toast.makeText(this, "Please input your email address", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun sendEmail(recipient: String, subject: String, message: String) {
        val mIntent = Intent(Intent.ACTION_SEND).apply {
            data = Uri.parse("mailto:")
            type = "text/plain"
            putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, message)
        }

        try {
            startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
        }
        catch (e: Exception){
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }

    companion object {
        val REQUEST_CODE_REGISTER = 1
    }
}