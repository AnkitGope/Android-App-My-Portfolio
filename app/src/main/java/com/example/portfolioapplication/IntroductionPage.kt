package com.example.portfolioapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroductionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction_page)

        val buttonSkills= findViewById<Button>(R.id.btnSkills)
        val buttonEducation=findViewById<Button>(R.id.btnEducation)
        val buttonWork=findViewById<Button>(R.id.btnWork)
        val buttonConnect=findViewById<Button>(R.id.btnConnect)
        buttonSkills.setOnClickListener {
            intent= Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        buttonConnect.setOnClickListener {
            intent= Intent(this,ConnectActivity::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }
        buttonWork.setOnClickListener {
            intent=Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }







    }
}