package kg.unicapp.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }
    private fun setupView() {
        val button = findViewById<Button>(R.id.button4)
        val button2 = findViewById<Button>(R.id.button5)
        val button3 = findViewById<Button>(R.id.button6)

        button.setOnClickListener {
            val intent1 = Intent (this, Activity2::class.java)
            startActivity(intent1)

        }
        button2.setOnClickListener {
            val intent2 = Intent (this, Activity3::class.java)
            startActivity(intent2)

        }
        button3.setOnClickListener {
            val intent3 = Intent (this, Activity4::class.java)
            startActivity(intent3)

        }


    }
}