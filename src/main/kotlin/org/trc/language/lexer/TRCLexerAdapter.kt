package org.trc.language.lexer

import com.intellij.lexer.FlexAdapter

/**
 * Just an adapter for the lexer that is automatically created with JFlex from
 * the input file `_TRCLexer.flex` you find in the sources.
 * In general, this adapter takes care of making the JFlex lexer compatible with the interface that the
 * IntelliJ Platform expects.
 */
class TRCLexerAdapter : FlexAdapter(_TRCLexer())