package algorithm.kelvin.utils.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel: ViewModel() {
    val disposable = CompositeDisposable()
    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}