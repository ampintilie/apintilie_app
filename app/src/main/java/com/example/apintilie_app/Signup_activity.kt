package com.example.apintilie_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_signup_activity.*

class Signup_activity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_activity)
        auth = FirebaseAuth.getInstance()


        buttonsignup.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser() {
        if (user_sign.text.toString().isEmpty()) {
            user_sign.error = "Please enter email!"
            user_sign.requestFocus()
            return
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(user_sign.text.toString()).matches()) {
            user_sign.error = "Please enter a valid email!"
            user_sign.requestFocus()
            return
        }
        if(pass_sign.text.toString().isEmpty()){
            pass_sign.error = "Please enter password!"
            pass_sign.requestFocus()
            return
        }
        auth.createUserWithEmailAndPassword(user_sign.text.toString(), pass_sign.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(baseContext, "Sign Up successfully.", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(baseContext, "Sign Up failed. Try again after some time.", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
