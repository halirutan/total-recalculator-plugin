package org.trc.language.psi

import com.intellij.psi.tree.TokenSet


/**
 * The `TRCTokenSets` provides a collection of helpful token sets.
 * For instance, if a language has both line and block comments, you can define
 * a token set `COMMENTS` to capture both types of comments.
 *
 * Several features or methods in the IntelliJ Platform expect token sets. For instance,
 * the parser interface itself wants to have a token set of comments in
 * `com.intellij.lang.ParserDefinition.getCommentTokens`. Therefore, it's helpful to collect
 * often used token sets.
 */
class TRCTokenSets {
    companion object {
        val STRINGS = TokenSet.create(TRCTypes.STRING)
        val COMMENTS = TokenSet.create(TRCTypes.COMMENT)
    }
}