package com.akirachix.birds

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birds.databinding.ActivityFifthBirdBinding
import com.akirachix.birds.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev4.setOnClickListener { finish() }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1441699462/photo/beautiful-winter-scenery-with-european-finch-birds-perched-on-the-branch-within-a-heavy.jpg?s=2048x2048&w=is&k=20&c=tBEXwLS0WkoCWZigU41Vbt83gTH7iagDb9xGARFpG24=")
            .into(binding.bird5)
    }
}