package com.dexels.navajo.dsl.rr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactiveLexer extends Lexer {
    public static final int RULE_LITERALSTRING=29;
    public static final int RULE_DOLLAR=39;
    public static final int RULE_SQBRACKET_OPEN=8;
    public static final int RULE_TML_EXISTS=11;
    public static final int RULE_GT=17;
    public static final int RULE_NOT=22;
    public static final int RULE_AT=9;
    public static final int RULE_BRACKET_CLOSE=25;
    public static final int RULE_NULL=33;
    public static final int RULE_AND=13;
    public static final int RULE_HASH=28;
    public static final int RULE_FORALL=30;
    public static final int RULE_EQUALS=41;
    public static final int RULE_TRUE=35;
    public static final int RULE_TODAY=34;
    public static final int RULE_PLUS=20;
    public static final int RULE_DOT=5;
    public static final int RULE_OR=12;
    public static final int EOF=-1;
    public static final int RULE_EQUALSEQUALS=14;
    public static final int RULE_PARENT=6;
    public static final int RULE_CURLYCLOSE=32;
    public static final int RULE_GTEQ=19;
    public static final int RULE_CURLYOPEN=31;
    public static final int RULE_TML_SEPARATOR=7;
    public static final int RULE_ID=4;
    public static final int RULE_SQBRACKET_CLOSE=10;
    public static final int RULE_COMMA=26;
    public static final int RULE_WS=37;
    public static final int RULE_COLON=38;
    public static final int RULE_NEQUALS=15;
    public static final int RULE_NUMBER=27;
    public static final int RULE_HEADER=40;
    public static final int RULE_MULTIPLY=21;
    public static final int RULE_MINUS=23;
    public static final int RULE_LT=16;
    public static final int RULE_LTEQ=18;
    public static final int RULE_PIPE=42;
    public static final int RULE_FALSE=36;
    public static final int RULE_BRACKET_OPEN=24;

    // delegates
    // delegators

    public InternalReactiveLexer() {;} 
    public InternalReactiveLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReactiveLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReactive.g"; }

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1714:10: ( '!' )
            // InternalReactive.g:1714:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1716:13: ( ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )? )
            // InternalReactive.g:1716:15: ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )?
            {
            // InternalReactive.g:1716:15: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactive.g:1716:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalReactive.g:1716:27: ( RULE_DOT ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactive.g:1716:28: RULE_DOT ( '0' .. '9' )+
                    {
                    mRULE_DOT(); 
                    // InternalReactive.g:1716:37: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalReactive.g:1716:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1718:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReactive.g:1718:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReactive.g:1718:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalReactive.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1720:11: ( ( 'true' | 'TRUE' ) )
            // InternalReactive.g:1720:13: ( 'true' | 'TRUE' )
            {
            // InternalReactive.g:1720:13: ( 'true' | 'TRUE' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='T') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalReactive.g:1720:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1720:21: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1722:12: ( ( 'false' | 'FALSE' ) )
            // InternalReactive.g:1722:14: ( 'false' | 'FALSE' )
            {
            // InternalReactive.g:1722:14: ( 'false' | 'FALSE' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='f') ) {
                alt6=1;
            }
            else if ( (LA6_0=='F') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactive.g:1722:15: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1722:23: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1724:11: ( ( 'null' | 'NULL' ) )
            // InternalReactive.g:1724:13: ( 'null' | 'NULL' )
            {
            // InternalReactive.g:1724:13: ( 'null' | 'NULL' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='n') ) {
                alt7=1;
            }
            else if ( (LA7_0=='N') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactive.g:1724:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1724:21: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_TODAY"
    public final void mRULE_TODAY() throws RecognitionException {
        try {
            int _type = RULE_TODAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1726:12: ( ( 'today' | 'TODAY' ) )
            // InternalReactive.g:1726:14: ( 'today' | 'TODAY' )
            {
            // InternalReactive.g:1726:14: ( 'today' | 'TODAY' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='t') ) {
                alt8=1;
            }
            else if ( (LA8_0=='T') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactive.g:1726:15: 'today'
                    {
                    match("today"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1726:23: 'TODAY'
                    {
                    match("TODAY"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TODAY"

    // $ANTLR start "RULE_FORALL"
    public final void mRULE_FORALL() throws RecognitionException {
        try {
            int _type = RULE_FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1728:13: ( 'FORALL' )
            // InternalReactive.g:1728:15: 'FORALL'
            {
            match("FORALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FORALL"

    // $ANTLR start "RULE_PARENT"
    public final void mRULE_PARENT() throws RecognitionException {
        try {
            int _type = RULE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1730:13: ( '..' )
            // InternalReactive.g:1730:15: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENT"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1732:9: ( '@' )
            // InternalReactive.g:1732:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_LITERALSTRING"
    public final void mRULE_LITERALSTRING() throws RecognitionException {
        try {
            int _type = RULE_LITERALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1734:20: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalReactive.g:1734:22: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalReactive.g:1734:27: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReactive.g:1734:28: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalReactive.g:1734:69: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALSTRING"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1736:12: ( ':' )
            // InternalReactive.g:1736:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SQBRACKET_OPEN"
    public final void mRULE_SQBRACKET_OPEN() throws RecognitionException {
        try {
            int _type = RULE_SQBRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1738:21: ( '[' )
            // InternalReactive.g:1738:23: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBRACKET_OPEN"

    // $ANTLR start "RULE_SQBRACKET_CLOSE"
    public final void mRULE_SQBRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_SQBRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1740:22: ( ']' )
            // InternalReactive.g:1740:24: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBRACKET_CLOSE"

    // $ANTLR start "RULE_TML_SEPARATOR"
    public final void mRULE_TML_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_TML_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1742:20: ( '/' )
            // InternalReactive.g:1742:22: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TML_SEPARATOR"

    // $ANTLR start "RULE_TML_EXISTS"
    public final void mRULE_TML_EXISTS() throws RecognitionException {
        try {
            int _type = RULE_TML_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1744:17: ( '?' )
            // InternalReactive.g:1744:19: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TML_EXISTS"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1746:13: ( '$' )
            // InternalReactive.g:1746:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_BRACKET_OPEN"
    public final void mRULE_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1748:19: ( '(' )
            // InternalReactive.g:1748:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_OPEN"

    // $ANTLR start "RULE_BRACKET_CLOSE"
    public final void mRULE_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1750:20: ( ')' )
            // InternalReactive.g:1750:22: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_CLOSE"

    // $ANTLR start "RULE_HEADER"
    public final void mRULE_HEADER() throws RecognitionException {
        try {
            int _type = RULE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1752:13: ( '=>' )
            // InternalReactive.g:1752:15: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEADER"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1754:13: ( '=' )
            // InternalReactive.g:1754:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1756:12: ( ',' )
            // InternalReactive.g:1756:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1758:10: ( 'AND' )
            // InternalReactive.g:1758:12: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1760:9: ( 'OR' )
            // InternalReactive.g:1760:11: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1762:11: ( '#' )
            // InternalReactive.g:1762:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_CURLYOPEN"
    public final void mRULE_CURLYOPEN() throws RecognitionException {
        try {
            int _type = RULE_CURLYOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1764:16: ( '{' )
            // InternalReactive.g:1764:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLYOPEN"

    // $ANTLR start "RULE_CURLYCLOSE"
    public final void mRULE_CURLYCLOSE() throws RecognitionException {
        try {
            int _type = RULE_CURLYCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1766:17: ( '}' )
            // InternalReactive.g:1766:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLYCLOSE"

    // $ANTLR start "RULE_EQUALSEQUALS"
    public final void mRULE_EQUALSEQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALSEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1768:19: ( '==' )
            // InternalReactive.g:1768:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALSEQUALS"

    // $ANTLR start "RULE_NEQUALS"
    public final void mRULE_NEQUALS() throws RecognitionException {
        try {
            int _type = RULE_NEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1770:14: ( '!=' )
            // InternalReactive.g:1770:16: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEQUALS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1772:11: ( '+' )
            // InternalReactive.g:1772:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1774:11: ( '->' )
            // InternalReactive.g:1774:13: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1776:12: ( '-' )
            // InternalReactive.g:1776:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_MULTIPLY"
    public final void mRULE_MULTIPLY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1778:15: ( '*' )
            // InternalReactive.g:1778:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY"

    // $ANTLR start "RULE_LTEQ"
    public final void mRULE_LTEQ() throws RecognitionException {
        try {
            int _type = RULE_LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1780:11: ( '<=' )
            // InternalReactive.g:1780:13: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LTEQ"

    // $ANTLR start "RULE_GTEQ"
    public final void mRULE_GTEQ() throws RecognitionException {
        try {
            int _type = RULE_GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1782:11: ( '>=' )
            // InternalReactive.g:1782:13: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTEQ"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1784:9: ( '<' )
            // InternalReactive.g:1784:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1786:9: ( '>' )
            // InternalReactive.g:1786:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1788:10: ( '.' )
            // InternalReactive.g:1788:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:1790:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReactive.g:1790:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReactive.g:1790:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactive.g:1790:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReactive.g:1790:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactive.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    public void mTokens() throws RecognitionException {
        // InternalReactive.g:1:8: ( RULE_NOT | RULE_NUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_LITERALSTRING | RULE_COLON | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_HEADER | RULE_EQUALS | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_PIPE | RULE_MINUS | RULE_MULTIPLY | RULE_LTEQ | RULE_GTEQ | RULE_LT | RULE_GT | RULE_DOT | RULE_ID )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalReactive.g:1:10: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 2 :
                // InternalReactive.g:1:19: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 3 :
                // InternalReactive.g:1:31: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 4 :
                // InternalReactive.g:1:39: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 5 :
                // InternalReactive.g:1:49: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 6 :
                // InternalReactive.g:1:60: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 7 :
                // InternalReactive.g:1:70: RULE_TODAY
                {
                mRULE_TODAY(); 

                }
                break;
            case 8 :
                // InternalReactive.g:1:81: RULE_FORALL
                {
                mRULE_FORALL(); 

                }
                break;
            case 9 :
                // InternalReactive.g:1:93: RULE_PARENT
                {
                mRULE_PARENT(); 

                }
                break;
            case 10 :
                // InternalReactive.g:1:105: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 11 :
                // InternalReactive.g:1:113: RULE_LITERALSTRING
                {
                mRULE_LITERALSTRING(); 

                }
                break;
            case 12 :
                // InternalReactive.g:1:132: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 13 :
                // InternalReactive.g:1:143: RULE_SQBRACKET_OPEN
                {
                mRULE_SQBRACKET_OPEN(); 

                }
                break;
            case 14 :
                // InternalReactive.g:1:163: RULE_SQBRACKET_CLOSE
                {
                mRULE_SQBRACKET_CLOSE(); 

                }
                break;
            case 15 :
                // InternalReactive.g:1:184: RULE_TML_SEPARATOR
                {
                mRULE_TML_SEPARATOR(); 

                }
                break;
            case 16 :
                // InternalReactive.g:1:203: RULE_TML_EXISTS
                {
                mRULE_TML_EXISTS(); 

                }
                break;
            case 17 :
                // InternalReactive.g:1:219: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 18 :
                // InternalReactive.g:1:231: RULE_BRACKET_OPEN
                {
                mRULE_BRACKET_OPEN(); 

                }
                break;
            case 19 :
                // InternalReactive.g:1:249: RULE_BRACKET_CLOSE
                {
                mRULE_BRACKET_CLOSE(); 

                }
                break;
            case 20 :
                // InternalReactive.g:1:268: RULE_HEADER
                {
                mRULE_HEADER(); 

                }
                break;
            case 21 :
                // InternalReactive.g:1:280: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 22 :
                // InternalReactive.g:1:292: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 23 :
                // InternalReactive.g:1:303: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 24 :
                // InternalReactive.g:1:312: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 25 :
                // InternalReactive.g:1:320: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 26 :
                // InternalReactive.g:1:330: RULE_CURLYOPEN
                {
                mRULE_CURLYOPEN(); 

                }
                break;
            case 27 :
                // InternalReactive.g:1:345: RULE_CURLYCLOSE
                {
                mRULE_CURLYCLOSE(); 

                }
                break;
            case 28 :
                // InternalReactive.g:1:361: RULE_EQUALSEQUALS
                {
                mRULE_EQUALSEQUALS(); 

                }
                break;
            case 29 :
                // InternalReactive.g:1:379: RULE_NEQUALS
                {
                mRULE_NEQUALS(); 

                }
                break;
            case 30 :
                // InternalReactive.g:1:392: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 31 :
                // InternalReactive.g:1:402: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 32 :
                // InternalReactive.g:1:412: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 33 :
                // InternalReactive.g:1:423: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 34 :
                // InternalReactive.g:1:437: RULE_LTEQ
                {
                mRULE_LTEQ(); 

                }
                break;
            case 35 :
                // InternalReactive.g:1:447: RULE_GTEQ
                {
                mRULE_GTEQ(); 

                }
                break;
            case 36 :
                // InternalReactive.g:1:457: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 37 :
                // InternalReactive.g:1:465: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 38 :
                // InternalReactive.g:1:473: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 39 :
                // InternalReactive.g:1:482: RULE_ID
                {
                mRULE_ID(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\43\2\uffff\6\41\1\56\12\uffff\1\61\1\uffff\2\41\4\uffff\1\65\1\uffff\1\67\1\71\3\uffff\11\41\5\uffff\1\41\1\104\6\uffff\11\41\1\116\1\uffff\1\117\1\41\1\117\4\41\2\125\2\uffff\2\126\2\127\1\41\3\uffff\1\131\1\uffff";
    static final String DFA12_eofS =
        "\132\uffff";
    static final String DFA12_minS =
        "\1\11\1\75\2\uffff\1\157\1\117\1\141\1\101\1\165\1\125\1\56\12\uffff\1\75\1\uffff\1\116\1\122\4\uffff\1\76\1\uffff\2\75\3\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1\114\5\uffff\1\104\1\60\6\uffff\1\145\1\141\1\105\1\101\1\163\1\123\1\101\1\154\1\114\1\60\1\uffff\1\60\1\171\1\60\1\131\1\145\1\105\1\114\2\60\2\uffff\4\60\1\114\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\75\2\uffff\1\162\1\122\1\141\1\117\1\165\1\125\1\56\12\uffff\1\76\1\uffff\1\116\1\122\4\uffff\1\76\1\uffff\2\75\3\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1\114\5\uffff\1\104\1\172\6\uffff\1\145\1\141\1\105\1\101\1\163\1\123\1\101\1\154\1\114\1\172\1\uffff\1\172\1\171\1\172\1\131\1\145\1\105\1\114\2\172\2\uffff\4\172\1\114\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\uffff\1\26\2\uffff\1\31\1\32\1\33\1\36\1\uffff\1\41\2\uffff\1\47\1\35\1\1\11\uffff\1\11\1\46\1\24\1\34\1\25\2\uffff\1\37\1\40\1\42\1\44\1\43\1\45\12\uffff\1\30\11\uffff\1\27\1\4\5\uffff\1\6\1\7\1\5\1\uffff\1\10";
    static final String DFA12_specialS =
        "\132\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\3\2\uffff\1\3\22\uffff\1\3\1\1\1\uffff\1\31\1\22\2\uffff\1\14\1\23\1\24\1\36\1\34\1\26\1\35\1\12\1\20\12\2\1\15\1\uffff\1\37\1\25\1\40\1\21\1\13\1\27\4\41\1\7\7\41\1\11\1\30\4\41\1\5\6\41\1\16\1\uffff\1\17\2\41\1\uffff\5\41\1\6\7\41\1\10\5\41\1\4\6\41\1\32\1\uffff\1\33",
            "\1\42",
            "",
            "",
            "\1\45\2\uffff\1\44",
            "\1\47\2\uffff\1\46",
            "\1\50",
            "\1\51\15\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\57",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\66",
            "\1\70",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\120",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_NOT | RULE_NUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_LITERALSTRING | RULE_COLON | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_HEADER | RULE_EQUALS | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_PIPE | RULE_MINUS | RULE_MULTIPLY | RULE_LTEQ | RULE_GTEQ | RULE_LT | RULE_GT | RULE_DOT | RULE_ID );";
        }
    }
 

}