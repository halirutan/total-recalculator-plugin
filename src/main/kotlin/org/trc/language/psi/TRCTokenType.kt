package org.trc.language.psi

import org.trc.language.TRCLanguage
import com.intellij.psi.tree.IElementType

/**
 * Represents a token type in the TRC language.
 * A token is an element that is emitted from `org.trc.language.lexer._TRCLexer` and is
 * used in the parser to create the structured tree defining the code in a file (Psi tree).
 *
 * @param debugName The debug name of the token type.
 */
class TRCTokenType(debugName: String): IElementType(debugName, TRCLanguage.INSTANCE)