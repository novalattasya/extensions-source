package eu.kanade.tachiyomi.extension.pt.wintersun

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class WinterSun : Madara(
    "Winter Sun",
    "https://wintersunscan.com",
    "pt-BR",
    SimpleDateFormat("dd 'de' MMMMM 'de' yyyy", Locale("pt", "BR")),
) {
    override val useNewChapterEndpoint = true
}
