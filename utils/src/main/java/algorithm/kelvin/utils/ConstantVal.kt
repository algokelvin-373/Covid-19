package algorithm.kelvin.utils

import algorithm.kelvin.utils.viewmodel.CovidViewModel
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

//TODO: Define ViewModel Variable
fun viewModelCovidIndonesian(context: Context) = ViewModelProvider(context as ViewModelStoreOwner)[CovidViewModel::class.java]