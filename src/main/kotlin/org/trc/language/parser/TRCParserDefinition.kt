package org.trc.language.parser

import org.trc.language.TRCLanguage
import org.trc.language.lexer.TRCLexerAdapter
import org.trc.language.psi.TRCFile
import org.trc.language.psi.TRCTokenSets
import org.trc.language.psi.TRCTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class TRCParserDefinition: ParserDefinition {
    private val FILE = IFileElementType(TRCLanguage.INSTANCE)

    override fun createLexer(project: Project?): Lexer {
        return TRCLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return TRCParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return TRCTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TRCTokenSets.STRINGS
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return TRCTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return TRCFile(viewProvider)
    }
}