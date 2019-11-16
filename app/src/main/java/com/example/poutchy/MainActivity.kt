package com.example.poutchy


<<<<<<< HEAD
import android.os.Bundle
=======
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
>>>>>>> fdd5d8f872ae826c4ab010c559633db2953915b8
import androidx.appcompat.app.AppCompatActivity
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<MeowBottomNavigation>(R.id.bottomNavigation)
<<<<<<< HEAD
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_message))
    }
=======
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_message))
    }


>>>>>>> fdd5d8f872ae826c4ab010c559633db2953915b8
}
