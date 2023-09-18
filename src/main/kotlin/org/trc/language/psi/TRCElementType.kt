package org.trc.language.psi

import org.trc.language.TRCLanguage
import com.intellij.psi.tree.IElementType

/**
 * Blueprint for all elements types that will appear in the Psi tree.
 * The GrammarKit parser generator will create a list of possible element types for us
 * depending on the BNF grammar provided.
 *
 * For instance, if you look at the [org.trc.language.parser]
 * you will find that there is a `plus_expr` rule which in this case that there will be
 * a [TRCPlusExpr] node in the Psi tree with an element type of [TRCTypes.PLUS_EXPR]
 */
class TRCElementType(debugName: String): IElementType(debugName, TRCLanguage.INSTANCE)