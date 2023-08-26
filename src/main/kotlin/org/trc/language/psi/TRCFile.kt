package org.trc.language.psi

import org.trc.language.TRCFileType
import org.trc.language.TRCLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class TRCFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, TRCLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return TRCFileType.INSTANCE
    }
}