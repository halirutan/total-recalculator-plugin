package org.trc.language.lexer

import com.intellij.lexer.FlexAdapter

/**
 * Just an adapter for the lexer automatically created from [this](./_TRCLexer.flex)
 */
class TRCLexerAdapter : FlexAdapter(_TRCLexer()) {
}