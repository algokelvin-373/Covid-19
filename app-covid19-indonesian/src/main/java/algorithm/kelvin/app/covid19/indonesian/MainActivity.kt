package algorithm.kelvin.app.covid19.indonesian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_covid_19_indonesian.setOnClickListener { startActivity(Intent(this, CovidIndonesian::class.java)) }
    }
}
