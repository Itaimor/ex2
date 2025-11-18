public interface TokenNames {
  /* terminals */
  public static final int EOF = 0;
  public static final int PLUS = 1;
  public static final int MINUS = 2;
  public static final int TIMES = 3;
  public static final int DIVIDE = 4;
  public static final int LPAREN = 5;
  public static final int RPAREN = 6;
  // public static final int NUMBER = 7; //Was in the starter code, does not exist in ex1.pdf
  public static final int ID = 7;

  // Brackets and braces
  public static final int LBRACK = 8;      // [
  public static final int RBRACK = 9;      // ]
  public static final int LBRACE = 10;     // {
  public static final int RBRACE = 11;     // }

  // Punctuation
  public static final int COMMA = 12;      // ,
  public static final int DOT = 13;        // .
  public static final int SEMICOLON = 14;  // ;

  // Operators
  public static final int ASSIGN = 15;     // :=
  public static final int EQ = 16;         // =
  public static final int LT = 17;         // <
  public static final int GT = 18;         // >

  // Keywords
  public static final int ARRAY = 19;      // array
  public static final int CLASS = 20;      // class
  public static final int RETURN = 21;     // return
  public static final int WHILE = 22;      // while
  public static final int IF = 23;         // if
  public static final int ELSE = 24;       // else
  public static final int NEW = 25;        // new
  public static final int EXTENDS = 26;    // extends
  public static final int NIL = 27;        // nil

  // Type keywords
  public static final int TYPE_INT = 28;     // int
  public static final int TYPE_STRING = 29;  // string
  public static final int TYPE_VOID = 30;    // void

  // Tokens with values
  public static final int INT = 31;          // integer literal
  public static final int STRING = 32;       // string literal

  // Error token
  public static final int ERROR = 33;        // lexical error
}
