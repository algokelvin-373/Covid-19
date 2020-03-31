package algorithm.kelvin.utils.response

import algorithm.kelvin.api.data.ApiInstance
import algorithm.kelvin.api.data.CovidDataIndonesian
import algorithm.kelvin.utils.BuildConfig
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.*

fun getResponseDataCovidIndonesian(disposable: CompositeDisposable): LiveData<ArrayList<CovidDataIndonesian>> {
    val list = MutableLiveData<ArrayList<CovidDataIndonesian>>()
    disposable.add(
        ApiInstance.create(BuildConfig.URL).getDataApiCovidIndonesian()
            .subscribeOn(Schedulers.io())
            .subscribe ({
                Log.i("covid", it.toString())
                list.postValue(it)
            },{
                Log.e("covid", it.message.toString())
            }))
    return list
}