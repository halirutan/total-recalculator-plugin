package org.trc.language.psi

import org.trc.language.TRCLanguage
import com.intellij.psi.tree.IElementType

class TRCTokenType(debugName: String): IElementType(debugName, TRCLanguage.INSTANCE) {
}