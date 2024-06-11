package com.akirachix.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birds.databinding.ActivitySecondBirdBinding
import com.akirachix.birds.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev2.setOnClickListener{
            val intent = Intent(this ,SecondBirdActivity::class.java)
            finish()
        }
        binding.btnNext3.setOnClickListener{
            val intent = Intent(this ,FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1283092289/photo/house-finch-perched-on-a-tree-branch.jpg?s=2048x2048&w=is&k=20&c=gnePxWZ_2T-AOl_dPjJRVSCoO_g9a_G0nV3UpDddAbo=")
            .into(binding.bird3)
    }
}