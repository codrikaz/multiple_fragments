package com.example.fragdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragdemo.R
import com.example.fragdemo.orrangeFragment
import com.example.fragdemo.SkyBlueFragment

class MainActivity : AppCompatActivity() {
    var fragOne: Button? = null
    var fragTwo: Button? = null
    private val toolbar: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragOne = findViewById(R.id.fragOne)
        fragTwo = findViewById(R.id.fragTwo)

        with(fragOne) {
            this?.setOnClickListener(View.OnClickListener {
                replaceFragment(orrangeFragment())
            })
        }
        with(fragTwo) {
            this?.setOnClickListener(View.OnClickListener {
                replaceFragment(SkyBlueFragment()) })
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}