package org.trc.language

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.ui.IconManager
import com.intellij.ui.PlatformIcons
import javax.swing.Icon

class TRCFileType: LanguageFileType(TRCLanguage.INSTANCE) {

    override fun getName(): String {
        return "Total Recalculator File"
    }

    override fun getDescription(): String {
        return "Calculator language"
    }

    override fun getDefaultExtension(): String {
        return "trc"
    }

    override fun getIcon(): Icon {
        return IconManager.getInstance().getPlatformIcon(PlatformIcons.JavaFileType)
    }

    companion object {
        val INSTANCE = TRCFileType()
    }

}