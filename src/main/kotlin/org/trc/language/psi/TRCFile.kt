package org.trc.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.trc.language.TRCFileType
import org.trc.language.TRCLanguage


/**
 * A TRC file is the root node in the Psi tree for every file.
 * The whole tree of structure for the code in the file is represented as children
 * of this type of node.
 *
 * @param viewProvider The file view provider associated with this TRC file.
 */
class TRCFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, TRCLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return TRCFileType()
    }
}