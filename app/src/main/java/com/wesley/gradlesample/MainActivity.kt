package com.wesley.gradlesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wesley.mylibrary2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(
            id = 1,
            name = ""
        )

        val student = Student()
        val person = Persons(
            id = 1,
            name = ""
        )

        val bird = Bird(
            id = 1,
        )

        //val users = Users()

        //val okHttp = OkHttp()
    }
}