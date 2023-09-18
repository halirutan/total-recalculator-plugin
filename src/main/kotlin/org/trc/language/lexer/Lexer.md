# Package org.trc.language.lexer

For breaking the code into lexical tokens, a so-called lexer is required.
It takes the code and breaks it into meaningful chunks (tokens) which are then the basis
for the parser ([org.trc.language.parser]).
The parser will in turn create a tree from the sequence of tokens to represent the structure
of the code.
At the lowest level, the leafs of this tree will be the tokens.

Here, we use the lexer generator JFlex to create a lexer from a `.jflex` definition file that in it's
core uses regular expressions that define how specific tokes are matched.
The automatically generated lexer code is then used with [an adapter](org.trc.language.lexer.TRCLexerAdapter) to
make it suitable for the IntelliJ Platform interface.

Below, you see the JFlex definition that can also be found by navigating to the source code:

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