package com.example.apintilie_app

import android.content.Context
import android.os.Message
import android.widget.Toast
import java.security.MessageDigest

fun Context.toast(message: String) =
    Toast.makeText(this, message,Toast.LENGTH_SHORT).show()