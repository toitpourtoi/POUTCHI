package com.example.poutchy


import android.graphics.PorterDuff
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<MeowBottomNavigation>(R.id.bottomNavigation)
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_message))
    }


}
