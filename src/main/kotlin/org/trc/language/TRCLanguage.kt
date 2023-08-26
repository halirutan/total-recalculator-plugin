package org.trc.language

import com.intellij.lang.Language

class TRCLanguage: Language("TRC") {

    companion object {
        val INSTANCE = TRCLanguage()
    }
}