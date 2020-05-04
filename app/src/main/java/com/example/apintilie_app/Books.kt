package com.example.apintilie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apintilie_app.Adapter
import com.example.apintilie_app.Book
import com.example.apintilie_app.R
import kotlinx.android.synthetic.main.books.*

class Books : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.books)

        val arrayList = ArrayList<Book>()

        arrayList.add(
            Book(
                "BGP Implementation",
                "Bgp concepts",
                R.drawable.bgp
            )
        )
        arrayList.add(
            Book(
                "Network Warrior",
                "Network concepts",
                R.drawable.network
            )
        )
        arrayList.add(
            Book(
                "Wireless Network Deployments",
                "Wireless Network",
                R.drawable.netw1
            )
        )
        arrayList.add(Book("Python", "Learn Python", R.drawable.python))
        arrayList.add(
            Book(
                "Dive into Python3",
                "Learn Python",
                R.drawable.python3
            )
        )
        arrayList.add(
            Book(
                "Python Tricks",
                "Learn Python",
                R.drawable.python1
            )
        )
        arrayList.add(
            Book(
                "C++",
                "The C++ Programming Language",
                R.drawable.cc
            )
        )
        arrayList.add(
            Book(
                "TCP/IP",
                "Internetworking with TCP/IP.Principles, protocols and architecture",
                R.drawable.tcp
            )
        )
        arrayList.add(
            Book(
                "Java for Absolut Beginners",
                "Learn to Program the Fundamentals the Java 9+ way",
                R.drawable.java
            )
        )
        arrayList.add(
            Book(
                "Arduino",
                "Arduino Programming",
                R.drawable.arduino
            )
        )
        arrayList.add(
            Book(
                "Android Cookbook",
                "Learn Python",
                R.drawable.android
            )
        )



        val Adapter = Adapter(arrayList, this)
        recycle.layoutManager = LinearLayoutManager(this)
        recycle.adapter = Adapter

    }
}
