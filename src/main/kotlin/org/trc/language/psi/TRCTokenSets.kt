package org.trc.language.psi

import com.intellij.psi.tree.TokenSet

class TRCTokenSets {
    companion object {
        val STRINGS = TokenSet.create(TRCTypes.STRING)
        val COMMENTS = TokenSet.create(TRCTypes.COMMENT)
    }
}