package algorithm.kelvin.app.covid19.indonesian

import algorithm.kelvin.utils.recyclerview.setupAdapterData
import algorithm.kelvin.utils.viewModelCovidIndonesian
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_covid_indonesian.*
import kotlinx.android.synthetic.main.item_covid_indonesian_data.view.*

class CovidIndonesian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid_indonesian)

        val covidViewModel = viewModelCovidIndonesian(this)

        covidViewModel.getDataCovidIndonesian().observe(this, Observer { dataCovidID ->
            rv_item_covid_indonesian.setupAdapterData(R.layout.item_covid_indonesian_data, this, dataCovidID) {
                data {
                    viewAdapterData.name_provinsi.text = item?.attributes?.Provinsi
                    viewAdapterData.amount_positive_covid_ID.text = item?.attributes?.Kasus_Posi.toString()
                    viewAdapterData.amount_recover_covid_ID.text = item?.attributes?.Kasus_Semb.toString()
                    viewAdapterData.amount_die_covid_ID.text = item?.attributes?.Kasus_Meni.toString()
                }
                setLayoutManager(linearLayoutManager(), 0)
                setAdapter()
            }
        })
    }
}
