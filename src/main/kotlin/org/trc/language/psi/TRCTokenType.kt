package org.trc.language.psi

import org.trc.language.TRCLanguage
import com.intellij.psi.tree.IElementType

/**
 * Represents a token type in the TRC language. A token is an element that is emitted from `org.trc.language.lexer._TRCLexer`.
 *  `_TRCLexer`
 *
 * @param debugName The debug name of the token type.
 */
class TRCTokenType(debugName: String): IElementType(debugName, TRCLanguage.INSTANCE)