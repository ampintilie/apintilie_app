package com.example.apintilie_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonsignup


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        buttonsignup.setOnClickListener {
            startActivity(Intent(this, Signup_activity::class.java))
            finish()
        }

        login.setOnClickListener {
            Login()
        }
    }


    public override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    fun updateUI(currentUser: FirebaseUser?){

    }


    private fun Login() {

        if (user.text.toString().isEmpty()) {
            user.error = "Please enter email!"
            user.requestFocus()
            return
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(user.text.toString()).matches()) {
            user.error = "Please enter a valid email!"
            user.requestFocus()
            return
        }
        if(pass.text.toString().isEmpty()){
            pass.error = "Please enter password!"
            pass.requestFocus()
            return
        }
        auth.signInWithEmailAndPassword(user.text.toString(),pass.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(baseContext, " Login successfully", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, FirstPage::class.java))
                } else {
                    Toast.makeText(baseContext, " Login failed", Toast.LENGTH_SHORT).show()
                }
            }
    }
}

