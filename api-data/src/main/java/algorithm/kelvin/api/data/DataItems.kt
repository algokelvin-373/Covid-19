package algorithm.kelvin.api.data

data class CovidIndonesian(val covidDataIndonesian: ArrayList<CovidDataIndonesian>)
data class CovidDataIndonesian(val attributes: CovidDataAttributeIndonesian)
data class CovidDataAttributeIndonesian(val Provinsi: String, val Kasus_Posi: Int, val Kasus_Semb: Int, val Kasus_Meni: Int)