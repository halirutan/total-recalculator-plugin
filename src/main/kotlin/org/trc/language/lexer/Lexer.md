# Package org.trc.language.lexer

This thing is [link](org.trc.language.lexer.TRCLexerAdapter) and let's see if it works.

```jflex
package org.trc.language.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.trc.language.psi.TRCTypes.*;

%%

%{
  public _TRCLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TRCLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  ";"                 { return SEMICOLON; }
  "="                 { return EQUAL; }
  "("                 { return LEFT_PAREN; }
  ")"                 { return RIGHT_PAREN; }
  "+"                 { return OP_PLUS; }
  "-"                 { return OP_MINUS; }
  "*"                 { return OP_TIMES; }
  "/"                 { return OP_DIVIDE; }
  "!"                 { return OP_FACTORIAL; }

  {SPACE}             { return SPACE; }
  {COMMENT}           { return COMMENT; }
  {NUMBER}            { return NUMBER; }
  {ID}                { return ID; }
  {STRING}            { return STRING; }

}

[^] { return BAD_CHARACTER; }
```