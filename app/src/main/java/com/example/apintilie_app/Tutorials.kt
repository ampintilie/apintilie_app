package com.example.apintilie_app

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.apintilie_app.R

class Tutorials : AppCompatActivity() {

    private lateinit var video: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorials)

        val mediaController = MediaController(this)
        video = findViewById(R.id.video1)
        video.setMediaController(mediaController)
        mediaController.setAnchorView(video)
        val uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/apintilie-app.appspot.com/o/MicroNugget_%20What%20is%20BGP%20and%20BGP%20Configuration%20Explained%20%7C%20CBT%20Nuggets.mp4?alt=media&token=3b110f75-7fa3-429c-87dc-cce01123d273")
        video.setVideoURI(uri)
        video.start()

    }
}
