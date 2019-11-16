package com.example.poutchy.Activities


import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.poutchy.Fragments.LevelsFragment
import com.example.poutchy.R




class MainActivity : AppCompatActivity() {
    private var content: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<MeowBottomNavigation>(R.id.bottomNavigation)
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_explore))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_filter_black_24dp))

        bottomNavigation.setOnClickMenuListener({ model ->
            if (model.id === 1){
                val fragment = LevelsFragment()
                addFragment(fragment)
            }

            else if (model.id === 2){
                val fragment = LevelsFragment()
                addFragment(fragment)
            }


            else if (model.id === 3){
                val fragment = LevelsFragment()
                addFragment(fragment)
            }

            else
                null
        })
        content = findViewById(R.id.frame_container)
        val fragment = LevelsFragment()
        addFragment(fragment)
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(
                 R.anim.design_bottom_sheet_slide_in,
                 R.anim.design_bottom_sheet_slide_out
             )
            .replace(R.id.frame_container, fragment, fragment.javaClass.getSimpleName())
            .addToBackStack(fragment.javaClass.getSimpleName())
            .commit()
    }


}
