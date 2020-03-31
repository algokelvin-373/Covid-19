package algorithm.kelvin.utils.viewmodel

import algorithm.kelvin.utils.response.getResponseDataCovidIndonesian

class CovidViewModel: BaseViewModel() {
    fun getDataCovidIndonesian() = getResponseDataCovidIndonesian(disposable)
}