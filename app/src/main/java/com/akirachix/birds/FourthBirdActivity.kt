package com.akirachix.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birds.databinding.ActivityFourthBirdBinding
import com.akirachix.birds.databinding.ActivityMainBinding
import com.akirachix.birds.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev3.setOnClickListener{
           finish()
        }
        binding.btnNext4.setOnClickListener{
            val intent = Intent(this ,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/626132614/photo/blue-fronted-redstart-the-beautiful-blue.jpg?s=2048x2048&w=is&k=20&c=knirH5os9GrcxGrV0MsBxTBa_F8YPvBmVY9h6iVkL_Y=")
            .into(binding.bird4)

    }
}