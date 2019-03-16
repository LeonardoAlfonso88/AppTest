package com.example.apptest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.widget.TextView

class SecondActivity : AppCompatActivity()
{

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }




    fun showRandomNumber()
    {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_number, count)
    }
}
