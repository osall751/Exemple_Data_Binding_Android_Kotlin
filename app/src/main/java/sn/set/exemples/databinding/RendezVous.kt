package sn.set.exemples.databinding

import java.util.*

data class RendezVous(
    var idRv: String = UUID.randomUUID().toString(),
    var lieuRv: String ="",
    var descriptionRv: String = "",
    var dateRv: Date = Date()
)