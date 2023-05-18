package org.techtown.mytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.techtown.mytest.databinding.ActivityIntroBinding
import org.techtown.mytest.databinding.ActivityMainBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, NaviActivity::class.java)
            startActivity(intent)
        },2000)
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}