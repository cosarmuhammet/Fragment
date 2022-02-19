package com.example.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun ilkFragment (view : View){

        val supportManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val ilkFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout , ilkFragment)
            .commit()

    }

    fun ikinciFragment ( view : View) {

        val supportManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val ikinciFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout , ikinciFragment)
            .commit()

    }

}