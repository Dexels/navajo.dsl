package com.dexels.navajo.dsl.rr.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactiveLexer extends Lexer {
    public static final int RULE_LITERALSTRING=30;
    public static final int RULE_DOLLAR=39;
    public static final int RULE_SQBRACKET_OPEN=8;
    public static final int RULE_TML_EXISTS=10;
    public static final int RULE_GT=26;
    public static final int RULE_NOT=12;
    public static final int RULE_BRACKET_CLOSE=15;
    public static final int RULE_AT=20;
    public static final int RULE_NULL=33;
    public static final int RULE_AND=22;
    public static final int RULE_HASH=18;
    public static final int RULE_FORALL=31;
    public static final int RULE_TRUE=35;
    public static final int RULE_TODAY=34;
    public static final int RULE_PLUS=11;
    public static final int RULE_DOT=5;
    public static final int RULE_OR=21;
    public static final int EOF=-1;
    public static final int RULE_EQUALSEQUALS=23;
    public static final int RULE_PARENT=6;
    public static final int RULE_CURLYCLOSE=19;
    public static final int RULE_GTEQ=28;
    public static final int RULE_CURLYOPEN=32;
    public static final int RULE_TML_SEPARATOR=7;
    public static final int RULE_ID=4;
    public static final int RULE_SQBRACKET_CLOSE=9;
    public static final int RULE_COMMA=16;
    public static final int RULE_WS=37;
    public static final int RULE_COLON=38;
    public static final int RULE_NEQUALS=24;
    public static final int RULE_NUMBER=17;
    public static final int RULE_MINUS=13;
    public static final int RULE_MULTIPLY=29;
    public static final int RULE_LT=25;
    public static final int RULE_LTEQ=27;
    public static final int RULE_FALSE=36;
    public static final int RULE_BRACKET_OPEN=14;

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
            // InternalReactive.g:4085:10: ( '!' )
            // InternalReactive.g:4085:12: '!'
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
            // InternalReactive.g:4087:13: ( ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )? )
            // InternalReactive.g:4087:15: ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )?
            {
            // InternalReactive.g:4087:15: ( '0' .. '9' )+
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
            	    // InternalReactive.g:4087:16: '0' .. '9'
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

            // InternalReactive.g:4087:27: ( RULE_DOT ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactive.g:4087:28: RULE_DOT ( '0' .. '9' )+
                    {
                    mRULE_DOT(); 
                    // InternalReactive.g:4087:37: ( '0' .. '9' )+
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
                    	    // InternalReactive.g:4087:38: '0' .. '9'
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
            // InternalReactive.g:4089:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReactive.g:4089:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReactive.g:4089:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalReactive.g:4091:11: ( ( 'true' | 'TRUE' ) )
            // InternalReactive.g:4091:13: ( 'true' | 'TRUE' )
            {
            // InternalReactive.g:4091:13: ( 'true' | 'TRUE' )
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
                    // InternalReactive.g:4091:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:4091:21: 'TRUE'
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
            // InternalReactive.g:4093:12: ( ( 'false' | 'FALSE' ) )
            // InternalReactive.g:4093:14: ( 'false' | 'FALSE' )
            {
            // InternalReactive.g:4093:14: ( 'false' | 'FALSE' )
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
                    // InternalReactive.g:4093:15: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:4093:23: 'FALSE'
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
            // InternalReactive.g:4095:11: ( ( 'null' | 'NULL' ) )
            // InternalReactive.g:4095:13: ( 'null' | 'NULL' )
            {
            // InternalReactive.g:4095:13: ( 'null' | 'NULL' )
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
                    // InternalReactive.g:4095:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:4095:21: 'NULL'
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
            // InternalReactive.g:4097:12: ( ( 'today' | 'TODAY' ) )
            // InternalReactive.g:4097:14: ( 'today' | 'TODAY' )
            {
            // InternalReactive.g:4097:14: ( 'today' | 'TODAY' )
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
                    // InternalReactive.g:4097:15: 'today'
                    {
                    match("today"); 


                    }
                    break;
                case 2 :
                    // InternalReactive.g:4097:23: 'TODAY'
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
            // InternalReactive.g:4099:13: ( 'FORALL' )
            // InternalReactive.g:4099:15: 'FORALL'
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
            // InternalReactive.g:4101:13: ( '..' )
            // InternalReactive.g:4101:15: '..'
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
            // InternalReactive.g:4103:9: ( '@' )
            // InternalReactive.g:4103:11: '@'
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
            // InternalReactive.g:4105:20: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalReactive.g:4105:22: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalReactive.g:4105:27: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalReactive.g:4105:28: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalReactive.g:4105:69: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalReactive.g:4107:12: ( ':' )
            // InternalReactive.g:4107:14: ':'
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
            // InternalReactive.g:4109:21: ( '[' )
            // InternalReactive.g:4109:23: '['
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
            // InternalReactive.g:4111:22: ( ']' )
            // InternalReactive.g:4111:24: ']'
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
            // InternalReactive.g:4113:20: ( '/' )
            // InternalReactive.g:4113:22: '/'
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
            // InternalReactive.g:4115:17: ( '?' )
            // InternalReactive.g:4115:19: '?'
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
            // InternalReactive.g:4117:13: ( '$' )
            // InternalReactive.g:4117:15: '$'
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
            // InternalReactive.g:4119:19: ( '(' )
            // InternalReactive.g:4119:21: '('
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
            // InternalReactive.g:4121:20: ( ')' )
            // InternalReactive.g:4121:22: ')'
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

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:4123:12: ( ',' )
            // InternalReactive.g:4123:14: ','
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
            // InternalReactive.g:4125:10: ( 'AND' )
            // InternalReactive.g:4125:12: 'AND'
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
            // InternalReactive.g:4127:9: ( 'OR' )
            // InternalReactive.g:4127:11: 'OR'
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
            // InternalReactive.g:4129:11: ( '#' )
            // InternalReactive.g:4129:13: '#'
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
            // InternalReactive.g:4131:16: ( '{' )
            // InternalReactive.g:4131:18: '{'
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
            // InternalReactive.g:4133:17: ( '}' )
            // InternalReactive.g:4133:19: '}'
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
            // InternalReactive.g:4135:19: ( '==' )
            // InternalReactive.g:4135:21: '=='
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
            // InternalReactive.g:4137:14: ( '!=' )
            // InternalReactive.g:4137:16: '!='
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
            // InternalReactive.g:4139:11: ( '+' )
            // InternalReactive.g:4139:13: '+'
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

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactive.g:4141:12: ( '-' )
            // InternalReactive.g:4141:14: '-'
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
            // InternalReactive.g:4143:15: ( '*' )
            // InternalReactive.g:4143:17: '*'
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
            // InternalReactive.g:4145:11: ( '<=' )
            // InternalReactive.g:4145:13: '<='
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
            // InternalReactive.g:4147:11: ( '>=' )
            // InternalReactive.g:4147:13: '>='
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
            // InternalReactive.g:4149:9: ( '<' )
            // InternalReactive.g:4149:11: '<'
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
            // InternalReactive.g:4151:9: ( '>' )
            // InternalReactive.g:4151:11: '>'
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
            // InternalReactive.g:4153:10: ( '.' )
            // InternalReactive.g:4153:12: '.'
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
            // InternalReactive.g:4155:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReactive.g:4155:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReactive.g:4155:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactive.g:4155:11: '^'
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

            // InternalReactive.g:4155:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
        // InternalReactive.g:1:8: ( RULE_NOT | RULE_NUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_LITERALSTRING | RULE_COLON | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_MINUS | RULE_MULTIPLY | RULE_LTEQ | RULE_GTEQ | RULE_LT | RULE_GT | RULE_DOT | RULE_ID )
        int alt12=36;
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
                // InternalReactive.g:1:268: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 21 :
                // InternalReactive.g:1:279: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 22 :
                // InternalReactive.g:1:288: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 23 :
                // InternalReactive.g:1:296: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 24 :
                // InternalReactive.g:1:306: RULE_CURLYOPEN
                {
                mRULE_CURLYOPEN(); 

                }
                break;
            case 25 :
                // InternalReactive.g:1:321: RULE_CURLYCLOSE
                {
                mRULE_CURLYCLOSE(); 

                }
                break;
            case 26 :
                // InternalReactive.g:1:337: RULE_EQUALSEQUALS
                {
                mRULE_EQUALSEQUALS(); 

                }
                break;
            case 27 :
                // InternalReactive.g:1:355: RULE_NEQUALS
                {
                mRULE_NEQUALS(); 

                }
                break;
            case 28 :
                // InternalReactive.g:1:368: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 29 :
                // InternalReactive.g:1:378: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 30 :
                // InternalReactive.g:1:389: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 31 :
                // InternalReactive.g:1:403: RULE_LTEQ
                {
                mRULE_LTEQ(); 

                }
                break;
            case 32 :
                // InternalReactive.g:1:413: RULE_GTEQ
                {
                mRULE_GTEQ(); 

                }
                break;
            case 33 :
                // InternalReactive.g:1:423: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 34 :
                // InternalReactive.g:1:431: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 35 :
                // InternalReactive.g:1:439: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 36 :
                // InternalReactive.g:1:448: RULE_ID
                {
                mRULE_ID(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\43\2\uffff\6\41\1\56\13\uffff\2\41\7\uffff\1\62\1\64\3\uffff\11\41\2\uffff\1\41\1\77\4\uffff\11\41\1\111\1\uffff\1\112\1\41\1\112\4\41\2\120\2\uffff\2\121\2\122\1\41\3\uffff\1\124\1\uffff";
    static final String DFA12_eofS =
        "\125\uffff";
    static final String DFA12_minS =
        "\1\11\1\75\2\uffff\1\157\1\117\1\141\1\101\1\165\1\125\1\56\13\uffff\1\116\1\122\7\uffff\2\75\3\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1\114\2\uffff\1\104\1\60\4\uffff\1\145\1\141\1\105\1\101\1\163\1\123\1\101\1\154\1\114\1\60\1\uffff\1\60\1\171\1\60\1\131\1\145\1\105\1\114\2\60\2\uffff\4\60\1\114\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\75\2\uffff\1\162\1\122\1\141\1\117\1\165\1\125\1\56\13\uffff\1\116\1\122\7\uffff\2\75\3\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1\114\2\uffff\1\104\1\172\4\uffff\1\145\1\141\1\105\1\101\1\163\1\123\1\101\1\154\1\114\1\172\1\uffff\1\172\1\171\1\172\1\131\1\145\1\105\1\114\2\172\2\uffff\4\172\1\114\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\27\1\30\1\31\1\32\1\34\1\35\1\36\2\uffff\1\44\1\33\1\1\11\uffff\1\11\1\43\2\uffff\1\37\1\41\1\40\1\42\12\uffff\1\26\11\uffff\1\25\1\4\5\uffff\1\6\1\7\1\5\1\uffff\1\10";
    static final String DFA12_specialS =
        "\125\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\3\2\uffff\1\3\22\uffff\1\3\1\1\1\uffff\1\30\1\22\2\uffff\1\14\1\23\1\24\1\36\1\34\1\25\1\35\1\12\1\20\12\2\1\15\1\uffff\1\37\1\33\1\40\1\21\1\13\1\26\4\41\1\7\7\41\1\11\1\27\4\41\1\5\6\41\1\16\1\uffff\1\17\2\41\1\uffff\5\41\1\6\7\41\1\10\5\41\1\4\6\41\1\31\1\uffff\1\32",
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
            "",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\63",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\113",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
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
            return "1:1: Tokens : ( RULE_NOT | RULE_NUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_LITERALSTRING | RULE_COLON | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_MINUS | RULE_MULTIPLY | RULE_LTEQ | RULE_GTEQ | RULE_LT | RULE_GT | RULE_DOT | RULE_ID );";
        }
    }
 

}