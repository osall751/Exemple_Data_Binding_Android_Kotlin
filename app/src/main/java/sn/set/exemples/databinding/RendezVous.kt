package sn.set.exemples.databinding

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import java.util.*

data class RendezVous(
    var idRv: String = UUID.randomUUID().toString(),
    var lieuRv: String ="",
    var descriptionRv: String = "",
    var dateRv: Date = Date()
)