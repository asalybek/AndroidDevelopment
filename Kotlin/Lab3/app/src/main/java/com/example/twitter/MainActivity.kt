package com.example.twitter

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
    private val fragmentPage: FragmentPosts? = FragmentPosts.newInstance(true)
    private val fragmentLike: FragmentPosts? = FragmentPosts.newInstance(false)
    private var fm: FragmentManager? = null
    var active: Fragment = fragmentPage as Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fm = supportFragmentManager
        fm!!.beginTransaction().add(R.id.fragment_container, fragmentLike as Fragment, "2").hide(fragmentLike).commit()
        fm!!.beginTransaction().add(R.id.fragment_container, fragmentPage as Fragment, "1").commit()
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_bar)
        bottomNavigationView.setOnNavigationItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.action_list -> {
                        fm!!.beginTransaction().hide(active).show(fragmentPage).commit()
                        active = fragmentPage
                        return true
                    }
                    R.id.action_favorite -> {
                        fm!!.beginTransaction().hide(active).show(fragmentLike).commit()
                        active = fragmentLike
                        return true
                    }
                }
                return false
            }
        })
        if (savedInstanceState == null) {
            bottomNavigationView.setSelectedItemId(R.id.action_list)
        }
    }

    fun onPostLike() {
        fragmentPage?.updatePage()
        fragmentLike?.updateLike()
    }

}

