package com.example.talkssogi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.talkssogi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /*setContentView(R.layout.activity_main)*/

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*// 페이지 2를 표시하도록 설정
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Page2Fragment())
                .commitNow()
        }

        ////////////page5로 가기/////////
        val buttonOpenPage5 = findViewById<Button>(R.id.button_open_page5)
        buttonOpenPage5.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }
        ////////////////////////////// */

        // Page6Fragment를 로드합니다.
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, Page6Fragment())
                .commit()
        }
    }
}