package com.dexels.navajo.dsl.rr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dexels.navajo.dsl.rr.services.ReactiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOT", "RULE_PARENT", "RULE_TML_SEPARATOR", "RULE_SQBRACKET_OPEN", "RULE_AT", "RULE_SQBRACKET_CLOSE", "RULE_TML_EXISTS", "RULE_OR", "RULE_AND", "RULE_EQUALSEQUALS", "RULE_NEQUALS", "RULE_LT", "RULE_GT", "RULE_LTEQ", "RULE_GTEQ", "RULE_PLUS", "RULE_MULTIPLY", "RULE_NOT", "RULE_MINUS", "RULE_BRACKET_OPEN", "RULE_BRACKET_CLOSE", "RULE_COMMA", "RULE_NUMBER", "RULE_HASH", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_CURLYOPEN", "RULE_CURLYCLOSE", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_WS", "RULE_COLON", "RULE_DOLLAR", "RULE_HEADER", "RULE_EQUALS", "RULE_PIPE"
    };
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


        public InternalReactiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReactiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReactiveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReactive.g"; }



     	private ReactiveGrammarAccess grammarAccess;

        public InternalReactiveParser(TokenStream input, ReactiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ReactiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalReactive.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReactive.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalReactive.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReactive.g:71:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleOrExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:77:2: ( ( (lv_expressions_0_0= ruleOrExpression ) )* )
            // InternalReactive.g:78:2: ( (lv_expressions_0_0= ruleOrExpression ) )*
            {
            // InternalReactive.g:78:2: ( (lv_expressions_0_0= ruleOrExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_SQBRACKET_OPEN||LA1_0==RULE_TML_EXISTS||(LA1_0>=RULE_NOT && LA1_0<=RULE_BRACKET_OPEN)||LA1_0==RULE_NUMBER||(LA1_0>=RULE_LITERALSTRING && LA1_0<=RULE_CURLYOPEN)||(LA1_0>=RULE_NULL && LA1_0<=RULE_FALSE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactive.g:79:3: (lv_expressions_0_0= ruleOrExpression )
            	    {
            	    // InternalReactive.g:79:3: (lv_expressions_0_0= ruleOrExpression )
            	    // InternalReactive.g:80:4: lv_expressions_0_0= ruleOrExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getExpressionsOrExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleOrExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressions",
            	    					lv_expressions_0_0,
            	    					"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePathElement"
    // InternalReactive.g:100:1: entryRulePathElement returns [String current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final String entryRulePathElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathElement = null;


        try {
            // InternalReactive.g:100:51: (iv_rulePathElement= rulePathElement EOF )
            // InternalReactive.g:101:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // InternalReactive.g:107:1: rulePathElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) ;
    public final AntlrDatatypeRuleToken rulePathElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_PARENT_2=null;
        Token this_TML_SEPARATOR_3=null;


        	enterRule();

        try {
            // InternalReactive.g:113:2: ( (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) )
            // InternalReactive.g:114:2: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            {
            // InternalReactive.g:114:2: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_DOT:
                {
                alt2=2;
                }
                break;
            case RULE_PARENT:
                {
                alt2=3;
                }
                break;
            case RULE_TML_SEPARATOR:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReactive.g:115:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReactive.g:123:3: this_DOT_1= RULE_DOT
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_2); 

                    			current.merge(this_DOT_1);
                    		

                    			newLeafNode(this_DOT_1, grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalReactive.g:131:3: this_PARENT_2= RULE_PARENT
                    {
                    this_PARENT_2=(Token)match(input,RULE_PARENT,FOLLOW_2); 

                    			current.merge(this_PARENT_2);
                    		

                    			newLeafNode(this_PARENT_2, grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalReactive.g:139:3: this_TML_SEPARATOR_3= RULE_TML_SEPARATOR
                    {
                    this_TML_SEPARATOR_3=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_2); 

                    			current.merge(this_TML_SEPARATOR_3);
                    		

                    			newLeafNode(this_TML_SEPARATOR_3, grammarAccess.getPathElementAccess().getTML_SEPARATORTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleTmlExpression"
    // InternalReactive.g:150:1: entryRuleTmlExpression returns [EObject current=null] : iv_ruleTmlExpression= ruleTmlExpression EOF ;
    public final EObject entryRuleTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTmlExpression = null;


        try {
            // InternalReactive.g:150:54: (iv_ruleTmlExpression= ruleTmlExpression EOF )
            // InternalReactive.g:151:2: iv_ruleTmlExpression= ruleTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTmlExpression=ruleTmlExpression();

            state._fsp--;

             current =iv_ruleTmlExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTmlExpression"


    // $ANTLR start "ruleTmlExpression"
    // InternalReactive.g:157:1: ruleTmlExpression returns [EObject current=null] : (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) ;
    public final EObject ruleTmlExpression() throws RecognitionException {
        EObject current = null;

        Token this_SQBRACKET_OPEN_0=null;
        Token lv_absolute_1_0=null;
        Token lv_param_2_0=null;
        Token this_TML_SEPARATOR_4=null;
        Token this_SQBRACKET_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_elements_3_0 = null;

        AntlrDatatypeRuleToken lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:163:2: ( (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) )
            // InternalReactive.g:164:2: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            {
            // InternalReactive.g:164:2: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            // InternalReactive.g:165:3: this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE
            {
            this_SQBRACKET_OPEN_0=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_4); 

            			newLeafNode(this_SQBRACKET_OPEN_0, grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0());
            		
            // InternalReactive.g:169:3: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalReactive.g:170:4: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    {
                    // InternalReactive.g:170:4: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    // InternalReactive.g:171:5: lv_absolute_1_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_1_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_4); 

                    					newLeafNode(lv_absolute_1_0, grammarAccess.getTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTmlExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"absolute",
                    						true,
                    						"com.dexels.navajo.dsl.rr.Reactive.TML_SEPARATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalReactive.g:187:3: ( (lv_param_2_0= RULE_AT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_AT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactive.g:188:4: (lv_param_2_0= RULE_AT )
                    {
                    // InternalReactive.g:188:4: (lv_param_2_0= RULE_AT )
                    // InternalReactive.g:189:5: lv_param_2_0= RULE_AT
                    {
                    lv_param_2_0=(Token)match(input,RULE_AT,FOLLOW_4); 

                    					newLeafNode(lv_param_2_0, grammarAccess.getTmlExpressionAccess().getParamATTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTmlExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"param",
                    						true,
                    						"com.dexels.navajo.dsl.rr.Reactive.AT");
                    				

                    }


                    }
                    break;

            }

            // InternalReactive.g:205:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalReactive.g:206:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalReactive.g:206:4: (lv_elements_3_0= rulePathElement )
            // InternalReactive.g:207:5: lv_elements_3_0= rulePathElement
            {

            					newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_elements_3_0=rulePathElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTmlExpressionRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"com.dexels.navajo.dsl.rr.Reactive.PathElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:224:3: (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TML_SEPARATOR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReactive.g:225:4: this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_4=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_4); 

            	    				newLeafNode(this_TML_SEPARATOR_4, grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0());
            	    			
            	    // InternalReactive.g:229:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalReactive.g:230:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalReactive.g:230:5: (lv_elements_5_0= rulePathElement )
            	    // InternalReactive.g:231:6: lv_elements_5_0= rulePathElement
            	    {

            	    						newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_5_0=rulePathElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTmlExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_5_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.PathElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_SQBRACKET_CLOSE_6=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_2); 

            			newLeafNode(this_SQBRACKET_CLOSE_6, grammarAccess.getTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTmlExpression"


    // $ANTLR start "entryRuleExistsTmlExpression"
    // InternalReactive.g:257:1: entryRuleExistsTmlExpression returns [EObject current=null] : iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF ;
    public final EObject entryRuleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsTmlExpression = null;


        try {
            // InternalReactive.g:257:60: (iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF )
            // InternalReactive.g:258:2: iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistsTmlExpression=ruleExistsTmlExpression();

            state._fsp--;

             current =iv_ruleExistsTmlExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsTmlExpression"


    // $ANTLR start "ruleExistsTmlExpression"
    // InternalReactive.g:264:1: ruleExistsTmlExpression returns [EObject current=null] : (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) ;
    public final EObject ruleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        Token this_TML_EXISTS_0=null;
        Token this_SQBRACKET_OPEN_1=null;
        Token lv_absolute_2_0=null;
        Token lv_param_3_0=null;
        Token this_TML_SEPARATOR_5=null;
        Token this_SQBRACKET_CLOSE_7=null;
        AntlrDatatypeRuleToken lv_elements_4_0 = null;

        AntlrDatatypeRuleToken lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:270:2: ( (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) )
            // InternalReactive.g:271:2: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            {
            // InternalReactive.g:271:2: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            // InternalReactive.g:272:3: this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE
            {
            this_TML_EXISTS_0=(Token)match(input,RULE_TML_EXISTS,FOLLOW_6); 

            			newLeafNode(this_TML_EXISTS_0, grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0());
            		
            this_SQBRACKET_OPEN_1=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_4); 

            			newLeafNode(this_SQBRACKET_OPEN_1, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1());
            		
            // InternalReactive.g:280:3: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalReactive.g:281:4: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    {
                    // InternalReactive.g:281:4: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    // InternalReactive.g:282:5: lv_absolute_2_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_2_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_4); 

                    					newLeafNode(lv_absolute_2_0, grammarAccess.getExistsTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExistsTmlExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"absolute",
                    						true,
                    						"com.dexels.navajo.dsl.rr.Reactive.TML_SEPARATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalReactive.g:298:3: ( (lv_param_3_0= RULE_AT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_AT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactive.g:299:4: (lv_param_3_0= RULE_AT )
                    {
                    // InternalReactive.g:299:4: (lv_param_3_0= RULE_AT )
                    // InternalReactive.g:300:5: lv_param_3_0= RULE_AT
                    {
                    lv_param_3_0=(Token)match(input,RULE_AT,FOLLOW_4); 

                    					newLeafNode(lv_param_3_0, grammarAccess.getExistsTmlExpressionAccess().getParamATTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExistsTmlExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"param",
                    						true,
                    						"com.dexels.navajo.dsl.rr.Reactive.AT");
                    				

                    }


                    }
                    break;

            }

            // InternalReactive.g:316:3: ( (lv_elements_4_0= rulePathElement ) )
            // InternalReactive.g:317:4: (lv_elements_4_0= rulePathElement )
            {
            // InternalReactive.g:317:4: (lv_elements_4_0= rulePathElement )
            // InternalReactive.g:318:5: lv_elements_4_0= rulePathElement
            {

            					newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_elements_4_0=rulePathElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistsTmlExpressionRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"com.dexels.navajo.dsl.rr.Reactive.PathElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:335:3: (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TML_SEPARATOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReactive.g:336:4: this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_5=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_4); 

            	    				newLeafNode(this_TML_SEPARATOR_5, grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0());
            	    			
            	    // InternalReactive.g:340:4: ( (lv_elements_6_0= rulePathElement ) )
            	    // InternalReactive.g:341:5: (lv_elements_6_0= rulePathElement )
            	    {
            	    // InternalReactive.g:341:5: (lv_elements_6_0= rulePathElement )
            	    // InternalReactive.g:342:6: lv_elements_6_0= rulePathElement
            	    {

            	    						newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_6_0=rulePathElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExistsTmlExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_6_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.PathElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_SQBRACKET_CLOSE_7=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_2); 

            			newLeafNode(this_SQBRACKET_CLOSE_7, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsTmlExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalReactive.g:368:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalReactive.g:368:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalReactive.g:369:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalReactive.g:375:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_2_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:381:2: ( ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )* ) )
            // InternalReactive.g:382:2: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )* )
            {
            // InternalReactive.g:382:2: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )* )
            // InternalReactive.g:383:3: ( (lv_parameters_0_0= ruleAndExpression ) ) ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )*
            {
            // InternalReactive.g:383:3: ( (lv_parameters_0_0= ruleAndExpression ) )
            // InternalReactive.g:384:4: (lv_parameters_0_0= ruleAndExpression )
            {
            // InternalReactive.g:384:4: (lv_parameters_0_0= ruleAndExpression )
            // InternalReactive.g:385:5: lv_parameters_0_0= ruleAndExpression
            {

            					newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameters_0_0=ruleAndExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.AndExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:402:3: ( () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReactive.g:403:4: () ( (lv_operations_2_0= RULE_OR ) ) ( (lv_parameters_3_0= ruleAndExpression ) )
            	    {
            	    // InternalReactive.g:403:4: ()
            	    // InternalReactive.g:404:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalReactive.g:410:4: ( (lv_operations_2_0= RULE_OR ) )
            	    // InternalReactive.g:411:5: (lv_operations_2_0= RULE_OR )
            	    {
            	    // InternalReactive.g:411:5: (lv_operations_2_0= RULE_OR )
            	    // InternalReactive.g:412:6: lv_operations_2_0= RULE_OR
            	    {
            	    lv_operations_2_0=(Token)match(input,RULE_OR,FOLLOW_8); 

            	    						newLeafNode(lv_operations_2_0, grammarAccess.getOrExpressionAccess().getOperationsORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExpressionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"operations",
            	    							lv_operations_2_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.OR");
            	    					

            	    }


            	    }

            	    // InternalReactive.g:428:4: ( (lv_parameters_3_0= ruleAndExpression ) )
            	    // InternalReactive.g:429:5: (lv_parameters_3_0= ruleAndExpression )
            	    {
            	    // InternalReactive.g:429:5: (lv_parameters_3_0= ruleAndExpression )
            	    // InternalReactive.g:430:6: lv_parameters_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalReactive.g:452:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalReactive.g:452:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalReactive.g:453:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalReactive.g:459:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:465:2: ( ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) )
            // InternalReactive.g:466:2: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            {
            // InternalReactive.g:466:2: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            // InternalReactive.g:467:3: ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            {
            // InternalReactive.g:467:3: ( (lv_parameters_0_0= ruleEqualityExpression ) )
            // InternalReactive.g:468:4: (lv_parameters_0_0= ruleEqualityExpression )
            {
            // InternalReactive.g:468:4: (lv_parameters_0_0= ruleEqualityExpression )
            // InternalReactive.g:469:5: lv_parameters_0_0= ruleEqualityExpression
            {

            					newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_parameters_0_0=ruleEqualityExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.EqualityExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:486:3: ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReactive.g:487:4: ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    {
            	    // InternalReactive.g:487:4: ( (lv_operations_1_0= RULE_AND ) )
            	    // InternalReactive.g:488:5: (lv_operations_1_0= RULE_AND )
            	    {
            	    // InternalReactive.g:488:5: (lv_operations_1_0= RULE_AND )
            	    // InternalReactive.g:489:6: lv_operations_1_0= RULE_AND
            	    {
            	    lv_operations_1_0=(Token)match(input,RULE_AND,FOLLOW_10); 

            	    						newLeafNode(lv_operations_1_0, grammarAccess.getAndExpressionAccess().getOperationsANDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExpressionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"operations",
            	    							lv_operations_1_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.AND");
            	    					

            	    }


            	    }

            	    // InternalReactive.g:505:4: ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    // InternalReactive.g:506:5: (lv_parameters_2_0= ruleEqualityExpression )
            	    {
            	    // InternalReactive.g:506:5: (lv_parameters_2_0= ruleEqualityExpression )
            	    // InternalReactive.g:507:6: lv_parameters_2_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_parameters_2_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalReactive.g:529:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalReactive.g:529:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalReactive.g:530:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalReactive.g:536:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:542:2: ( ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) )
            // InternalReactive.g:543:2: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            {
            // InternalReactive.g:543:2: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            // InternalReactive.g:544:3: ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            {
            // InternalReactive.g:544:3: ( (lv_parameters_0_0= ruleRelationalExpression ) )
            // InternalReactive.g:545:4: (lv_parameters_0_0= ruleRelationalExpression )
            {
            // InternalReactive.g:545:4: (lv_parameters_0_0= ruleRelationalExpression )
            // InternalReactive.g:546:5: lv_parameters_0_0= ruleRelationalExpression
            {

            					newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameters_0_0=ruleRelationalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.RelationalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:563:3: ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EQUALSEQUALS) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_NEQUALS) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactive.g:564:4: ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    {
                    // InternalReactive.g:564:4: ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    // InternalReactive.g:565:5: ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    {
                    // InternalReactive.g:565:5: ( (lv_operations_1_0= RULE_EQUALSEQUALS ) )
                    // InternalReactive.g:566:6: (lv_operations_1_0= RULE_EQUALSEQUALS )
                    {
                    // InternalReactive.g:566:6: (lv_operations_1_0= RULE_EQUALSEQUALS )
                    // InternalReactive.g:567:7: lv_operations_1_0= RULE_EQUALSEQUALS
                    {
                    lv_operations_1_0=(Token)match(input,RULE_EQUALSEQUALS,FOLLOW_12); 

                    							newLeafNode(lv_operations_1_0, grammarAccess.getEqualityExpressionAccess().getOperationsEQUALSEQUALSTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_1_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.EQUALSEQUALS");
                    						

                    }


                    }

                    // InternalReactive.g:583:5: ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    // InternalReactive.g:584:6: (lv_parameters_2_0= ruleRelationalExpression )
                    {
                    // InternalReactive.g:584:6: (lv_parameters_2_0= ruleRelationalExpression )
                    // InternalReactive.g:585:7: lv_parameters_2_0= ruleRelationalExpression
                    {

                    							newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleRelationalExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_2_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.RelationalExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReactive.g:604:4: ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    {
                    // InternalReactive.g:604:4: ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    // InternalReactive.g:605:5: ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    {
                    // InternalReactive.g:605:5: ( (lv_operations_3_0= RULE_NEQUALS ) )
                    // InternalReactive.g:606:6: (lv_operations_3_0= RULE_NEQUALS )
                    {
                    // InternalReactive.g:606:6: (lv_operations_3_0= RULE_NEQUALS )
                    // InternalReactive.g:607:7: lv_operations_3_0= RULE_NEQUALS
                    {
                    lv_operations_3_0=(Token)match(input,RULE_NEQUALS,FOLLOW_12); 

                    							newLeafNode(lv_operations_3_0, grammarAccess.getEqualityExpressionAccess().getOperationsNEQUALSTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_3_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.NEQUALS");
                    						

                    }


                    }

                    // InternalReactive.g:623:5: ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    // InternalReactive.g:624:6: (lv_parameters_4_0= ruleRelationalExpression )
                    {
                    // InternalReactive.g:624:6: (lv_parameters_4_0= ruleRelationalExpression )
                    // InternalReactive.g:625:7: lv_parameters_4_0= ruleRelationalExpression
                    {

                    							newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_4_0=ruleRelationalExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_4_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.RelationalExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalReactive.g:648:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalReactive.g:648:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalReactive.g:649:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalReactive.g:655:1: ruleRelationalExpression returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_2_0=null;
        Token lv_operations_4_0=null;
        Token lv_operations_6_0=null;
        Token lv_operations_8_0=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:661:2: ( ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) )
            // InternalReactive.g:662:2: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            {
            // InternalReactive.g:662:2: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            // InternalReactive.g:663:3: () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            {
            // InternalReactive.g:663:3: ()
            // InternalReactive.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalReactive.g:670:3: ( (lv_parameters_1_0= ruleAdditiveExpression ) )
            // InternalReactive.g:671:4: (lv_parameters_1_0= ruleAdditiveExpression )
            {
            // InternalReactive.g:671:4: (lv_parameters_1_0= ruleAdditiveExpression )
            // InternalReactive.g:672:5: lv_parameters_1_0= ruleAdditiveExpression
            {

            					newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_parameters_1_0=ruleAdditiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"com.dexels.navajo.dsl.rr.Reactive.AdditiveExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:689:3: ( ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            int alt12=5;
            switch ( input.LA(1) ) {
                case RULE_LT:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_GT:
                    {
                    alt12=2;
                    }
                    break;
                case RULE_LTEQ:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_GTEQ:
                    {
                    alt12=4;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // InternalReactive.g:690:4: ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    {
                    // InternalReactive.g:690:4: ( ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    // InternalReactive.g:691:5: ( (lv_operations_2_0= RULE_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalReactive.g:691:5: ( (lv_operations_2_0= RULE_LT ) )
                    // InternalReactive.g:692:6: (lv_operations_2_0= RULE_LT )
                    {
                    // InternalReactive.g:692:6: (lv_operations_2_0= RULE_LT )
                    // InternalReactive.g:693:7: lv_operations_2_0= RULE_LT
                    {
                    lv_operations_2_0=(Token)match(input,RULE_LT,FOLLOW_12); 

                    							newLeafNode(lv_operations_2_0, grammarAccess.getRelationalExpressionAccess().getOperationsLTTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_2_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.LT");
                    						

                    }


                    }

                    // InternalReactive.g:709:5: ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    // InternalReactive.g:710:6: (lv_parameters_3_0= ruleAdditiveExpression )
                    {
                    // InternalReactive.g:710:6: (lv_parameters_3_0= ruleAdditiveExpression )
                    // InternalReactive.g:711:7: lv_parameters_3_0= ruleAdditiveExpression
                    {

                    							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_3_0=ruleAdditiveExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_3_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.AdditiveExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReactive.g:730:4: ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    {
                    // InternalReactive.g:730:4: ( ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    // InternalReactive.g:731:5: ( (lv_operations_4_0= RULE_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    {
                    // InternalReactive.g:731:5: ( (lv_operations_4_0= RULE_GT ) )
                    // InternalReactive.g:732:6: (lv_operations_4_0= RULE_GT )
                    {
                    // InternalReactive.g:732:6: (lv_operations_4_0= RULE_GT )
                    // InternalReactive.g:733:7: lv_operations_4_0= RULE_GT
                    {
                    lv_operations_4_0=(Token)match(input,RULE_GT,FOLLOW_12); 

                    							newLeafNode(lv_operations_4_0, grammarAccess.getRelationalExpressionAccess().getOperationsGTTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_4_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.GT");
                    						

                    }


                    }

                    // InternalReactive.g:749:5: ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    // InternalReactive.g:750:6: (lv_parameters_5_0= ruleAdditiveExpression )
                    {
                    // InternalReactive.g:750:6: (lv_parameters_5_0= ruleAdditiveExpression )
                    // InternalReactive.g:751:7: lv_parameters_5_0= ruleAdditiveExpression
                    {

                    							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_5_0=ruleAdditiveExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_5_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.AdditiveExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReactive.g:770:4: ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    {
                    // InternalReactive.g:770:4: ( ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    // InternalReactive.g:771:5: ( (lv_operations_6_0= RULE_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    {
                    // InternalReactive.g:771:5: ( (lv_operations_6_0= RULE_LTEQ ) )
                    // InternalReactive.g:772:6: (lv_operations_6_0= RULE_LTEQ )
                    {
                    // InternalReactive.g:772:6: (lv_operations_6_0= RULE_LTEQ )
                    // InternalReactive.g:773:7: lv_operations_6_0= RULE_LTEQ
                    {
                    lv_operations_6_0=(Token)match(input,RULE_LTEQ,FOLLOW_12); 

                    							newLeafNode(lv_operations_6_0, grammarAccess.getRelationalExpressionAccess().getOperationsLTEQTerminalRuleCall_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_6_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.LTEQ");
                    						

                    }


                    }

                    // InternalReactive.g:789:5: ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    // InternalReactive.g:790:6: (lv_parameters_7_0= ruleAdditiveExpression )
                    {
                    // InternalReactive.g:790:6: (lv_parameters_7_0= ruleAdditiveExpression )
                    // InternalReactive.g:791:7: lv_parameters_7_0= ruleAdditiveExpression
                    {

                    							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_7_0=ruleAdditiveExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_7_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.AdditiveExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalReactive.g:810:4: ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    {
                    // InternalReactive.g:810:4: ( ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    // InternalReactive.g:811:5: ( (lv_operations_8_0= RULE_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    {
                    // InternalReactive.g:811:5: ( (lv_operations_8_0= RULE_GTEQ ) )
                    // InternalReactive.g:812:6: (lv_operations_8_0= RULE_GTEQ )
                    {
                    // InternalReactive.g:812:6: (lv_operations_8_0= RULE_GTEQ )
                    // InternalReactive.g:813:7: lv_operations_8_0= RULE_GTEQ
                    {
                    lv_operations_8_0=(Token)match(input,RULE_GTEQ,FOLLOW_12); 

                    							newLeafNode(lv_operations_8_0, grammarAccess.getRelationalExpressionAccess().getOperationsGTEQTerminalRuleCall_2_3_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"operations",
                    								lv_operations_8_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.GTEQ");
                    						

                    }


                    }

                    // InternalReactive.g:829:5: ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    // InternalReactive.g:830:6: (lv_parameters_9_0= ruleAdditiveExpression )
                    {
                    // InternalReactive.g:830:6: (lv_parameters_9_0= ruleAdditiveExpression )
                    // InternalReactive.g:831:7: lv_parameters_9_0= ruleAdditiveExpression
                    {

                    							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_parameters_9_0=ruleAdditiveExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_9_0,
                    								"com.dexels.navajo.dsl.rr.Reactive.AdditiveExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalReactive.g:854:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalReactive.g:854:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalReactive.g:855:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalReactive.g:861:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:867:2: ( ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalReactive.g:868:2: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalReactive.g:868:2: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )* )
            // InternalReactive.g:869:3: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )*
            {
            // InternalReactive.g:869:3: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) )
            // InternalReactive.g:870:4: (lv_parameters_0_0= ruleMultiplicativeExpression )
            {
            // InternalReactive.g:870:4: (lv_parameters_0_0= ruleMultiplicativeExpression )
            // InternalReactive.g:871:5: lv_parameters_0_0= ruleMultiplicativeExpression
            {

            					newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_parameters_0_0=ruleMultiplicativeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.MultiplicativeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:888:3: (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalReactive.g:889:4: this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_15); 

            	    				newLeafNode(this_PLUS_1, grammarAccess.getAdditiveExpressionAccess().getPLUSTerminalRuleCall_1_0());
            	    			
            	    // InternalReactive.g:893:4: ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    // InternalReactive.g:894:5: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalReactive.g:894:5: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    // InternalReactive.g:895:6: lv_parameters_2_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_parameters_2_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalReactive.g:917:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalReactive.g:917:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalReactive.g:918:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalReactive.g:924:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:930:2: ( ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) )
            // InternalReactive.g:931:2: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            {
            // InternalReactive.g:931:2: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            // InternalReactive.g:932:3: ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            {
            // InternalReactive.g:932:3: ( (lv_parameters_0_0= ruleUnaryExpression ) )
            // InternalReactive.g:933:4: (lv_parameters_0_0= ruleUnaryExpression )
            {
            // InternalReactive.g:933:4: (lv_parameters_0_0= ruleUnaryExpression )
            // InternalReactive.g:934:5: lv_parameters_0_0= ruleUnaryExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_parameters_0_0=ruleUnaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.UnaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactive.g:951:3: ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTIPLY) ) {
                    alt14=1;
                }
                else if ( (LA14_0==RULE_TML_SEPARATOR) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalReactive.g:952:4: ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    {
            	    // InternalReactive.g:952:4: ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    // InternalReactive.g:953:5: ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    {
            	    // InternalReactive.g:953:5: ( (lv_operations_1_0= RULE_MULTIPLY ) )
            	    // InternalReactive.g:954:6: (lv_operations_1_0= RULE_MULTIPLY )
            	    {
            	    // InternalReactive.g:954:6: (lv_operations_1_0= RULE_MULTIPLY )
            	    // InternalReactive.g:955:7: lv_operations_1_0= RULE_MULTIPLY
            	    {
            	    lv_operations_1_0=(Token)match(input,RULE_MULTIPLY,FOLLOW_17); 

            	    							newLeafNode(lv_operations_1_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsMULTIPLYTerminalRuleCall_1_0_0_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"operations",
            	    								lv_operations_1_0,
            	    								"com.dexels.navajo.dsl.rr.Reactive.MULTIPLY");
            	    						

            	    }


            	    }

            	    // InternalReactive.g:971:5: ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    // InternalReactive.g:972:6: (lv_parameters_2_0= ruleUnaryExpression )
            	    {
            	    // InternalReactive.g:972:6: (lv_parameters_2_0= ruleUnaryExpression )
            	    // InternalReactive.g:973:7: lv_parameters_2_0= ruleUnaryExpression
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_parameters_2_0=ruleUnaryExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"parameters",
            	    								lv_parameters_2_0,
            	    								"com.dexels.navajo.dsl.rr.Reactive.UnaryExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReactive.g:992:4: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    {
            	    // InternalReactive.g:992:4: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    // InternalReactive.g:993:5: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    {
            	    // InternalReactive.g:993:5: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) )
            	    // InternalReactive.g:994:6: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    {
            	    // InternalReactive.g:994:6: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    // InternalReactive.g:995:7: lv_operations_3_0= RULE_TML_SEPARATOR
            	    {
            	    lv_operations_3_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_17); 

            	    							newLeafNode(lv_operations_3_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsTML_SEPARATORTerminalRuleCall_1_1_0_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"operations",
            	    								lv_operations_3_0,
            	    								"com.dexels.navajo.dsl.rr.Reactive.TML_SEPARATOR");
            	    						

            	    }


            	    }

            	    // InternalReactive.g:1011:5: ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    // InternalReactive.g:1012:6: (lv_parameters_4_0= ruleUnaryExpression )
            	    {
            	    // InternalReactive.g:1012:6: (lv_parameters_4_0= ruleUnaryExpression )
            	    // InternalReactive.g:1013:7: lv_parameters_4_0= ruleUnaryExpression
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_parameters_4_0=ruleUnaryExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"parameters",
            	    								lv_parameters_4_0,
            	    								"com.dexels.navajo.dsl.rr.Reactive.UnaryExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalReactive.g:1036:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalReactive.g:1036:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalReactive.g:1037:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalReactive.g:1043:1: ruleUnaryExpression returns [EObject current=null] : ( ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        Token this_MINUS_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject this_PrimaryExpression_4 = null;



        	enterRule();

        try {
            // InternalReactive.g:1049:2: ( ( ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression ) )
            // InternalReactive.g:1050:2: ( ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression )
            {
            // InternalReactive.g:1050:2: ( ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_NOT && LA16_0<=RULE_MINUS)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||LA16_0==RULE_SQBRACKET_OPEN||LA16_0==RULE_TML_EXISTS||LA16_0==RULE_BRACKET_OPEN||LA16_0==RULE_NUMBER||(LA16_0>=RULE_LITERALSTRING && LA16_0<=RULE_CURLYOPEN)||(LA16_0>=RULE_NULL && LA16_0<=RULE_FALSE)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactive.g:1051:3: ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) )
                    {
                    // InternalReactive.g:1051:3: ( (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_NOT) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_MINUS) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalReactive.g:1052:4: (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                            {
                            // InternalReactive.g:1052:4: (this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                            // InternalReactive.g:1053:5: this_NOT_0= RULE_NOT ( (lv_parameters_1_0= rulePrimaryExpression ) )
                            {
                            this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_12); 

                            					newLeafNode(this_NOT_0, grammarAccess.getUnaryExpressionAccess().getNOTTerminalRuleCall_0_0_0());
                            				
                            // InternalReactive.g:1057:5: ( (lv_parameters_1_0= rulePrimaryExpression ) )
                            // InternalReactive.g:1058:6: (lv_parameters_1_0= rulePrimaryExpression )
                            {
                            // InternalReactive.g:1058:6: (lv_parameters_1_0= rulePrimaryExpression )
                            // InternalReactive.g:1059:7: lv_parameters_1_0= rulePrimaryExpression
                            {

                            							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_parameters_1_0=rulePrimaryExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_1_0,
                            								"com.dexels.navajo.dsl.rr.Reactive.PrimaryExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalReactive.g:1078:4: (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) )
                            {
                            // InternalReactive.g:1078:4: (this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) ) )
                            // InternalReactive.g:1079:5: this_MINUS_2= RULE_MINUS ( (lv_parameters_3_0= rulePrimaryExpression ) )
                            {
                            this_MINUS_2=(Token)match(input,RULE_MINUS,FOLLOW_12); 

                            					newLeafNode(this_MINUS_2, grammarAccess.getUnaryExpressionAccess().getMINUSTerminalRuleCall_0_1_0());
                            				
                            // InternalReactive.g:1083:5: ( (lv_parameters_3_0= rulePrimaryExpression ) )
                            // InternalReactive.g:1084:6: (lv_parameters_3_0= rulePrimaryExpression )
                            {
                            // InternalReactive.g:1084:6: (lv_parameters_3_0= rulePrimaryExpression )
                            // InternalReactive.g:1085:7: lv_parameters_3_0= rulePrimaryExpression
                            {

                            							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_parameters_3_0=rulePrimaryExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"com.dexels.navajo.dsl.rr.Reactive.PrimaryExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1105:3: this_PrimaryExpression_4= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_4=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalReactive.g:1117:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalReactive.g:1117:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalReactive.g:1118:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalReactive.g:1124:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_BRACKET_OPEN_1=null;
        Token this_BRACKET_CLOSE_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:1130:2: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) ) )
            // InternalReactive.g:1131:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) )
            {
            // InternalReactive.g:1131:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==RULE_SQBRACKET_OPEN||LA17_0==RULE_TML_EXISTS||LA17_0==RULE_NUMBER||(LA17_0>=RULE_LITERALSTRING && LA17_0<=RULE_CURLYOPEN)||(LA17_0>=RULE_NULL && LA17_0<=RULE_FALSE)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_BRACKET_OPEN) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactive.g:1132:3: ( (lv_parameters_0_0= ruleLiteral ) )
                    {
                    // InternalReactive.g:1132:3: ( (lv_parameters_0_0= ruleLiteral ) )
                    // InternalReactive.g:1133:4: (lv_parameters_0_0= ruleLiteral )
                    {
                    // InternalReactive.g:1133:4: (lv_parameters_0_0= ruleLiteral )
                    // InternalReactive.g:1134:5: lv_parameters_0_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_0_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_0_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1152:3: (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE )
                    {
                    // InternalReactive.g:1152:3: (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE )
                    // InternalReactive.g:1153:4: this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE
                    {
                    this_BRACKET_OPEN_1=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_18); 

                    				newLeafNode(this_BRACKET_OPEN_1, grammarAccess.getPrimaryExpressionAccess().getBRACKET_OPENTerminalRuleCall_1_0());
                    			
                    // InternalReactive.g:1157:4: ( (lv_parameters_2_0= ruleOrExpression ) )
                    // InternalReactive.g:1158:5: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // InternalReactive.g:1158:5: (lv_parameters_2_0= ruleOrExpression )
                    // InternalReactive.g:1159:6: lv_parameters_2_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_2_0=ruleOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_BRACKET_CLOSE_3=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_2); 

                    				newLeafNode(this_BRACKET_CLOSE_3, grammarAccess.getPrimaryExpressionAccess().getBRACKET_CLOSETerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionName"
    // InternalReactive.g:1185:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalReactive.g:1185:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalReactive.g:1186:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalReactive.g:1192:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalReactive.g:1198:2: (this_ID_0= RULE_ID )
            // InternalReactive.g:1199:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalReactive.g:1209:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalReactive.g:1209:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalReactive.g:1210:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalReactive.g:1216:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token this_BRACKET_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_BRACKET_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:1222:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE ) )
            // InternalReactive.g:1223:2: ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE )
            {
            // InternalReactive.g:1223:2: ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE )
            // InternalReactive.g:1224:3: ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE
            {
            // InternalReactive.g:1224:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalReactive.g:1225:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalReactive.g:1225:4: (lv_name_0_0= ruleFunctionName )
            // InternalReactive.g:1226:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.dexels.navajo.dsl.rr.Reactive.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACKET_OPEN_1=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_21); 

            			newLeafNode(this_BRACKET_OPEN_1, grammarAccess.getFunctionCallAccess().getBRACKET_OPENTerminalRuleCall_1());
            		
            // InternalReactive.g:1247:3: ( (lv_parameters_2_0= ruleOrExpression ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_SQBRACKET_OPEN||LA18_0==RULE_TML_EXISTS||(LA18_0>=RULE_NOT && LA18_0<=RULE_BRACKET_OPEN)||LA18_0==RULE_NUMBER||(LA18_0>=RULE_LITERALSTRING && LA18_0<=RULE_CURLYOPEN)||(LA18_0>=RULE_NULL && LA18_0<=RULE_FALSE)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactive.g:1248:4: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // InternalReactive.g:1248:4: (lv_parameters_2_0= ruleOrExpression )
                    // InternalReactive.g:1249:5: lv_parameters_2_0= ruleOrExpression
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_parameters_2_0=ruleOrExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalReactive.g:1266:3: (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalReactive.g:1267:4: this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_21); 

            	    				newLeafNode(this_COMMA_3, grammarAccess.getFunctionCallAccess().getCOMMATerminalRuleCall_3_0());
            	    			
            	    // InternalReactive.g:1271:4: ( (lv_parameters_4_0= ruleOrExpression ) )
            	    // InternalReactive.g:1272:5: (lv_parameters_4_0= ruleOrExpression )
            	    {
            	    // InternalReactive.g:1272:5: (lv_parameters_4_0= ruleOrExpression )
            	    // InternalReactive.g:1273:6: lv_parameters_4_0= ruleOrExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_parameters_4_0=ruleOrExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            this_BRACKET_CLOSE_5=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACKET_CLOSE_5, grammarAccess.getFunctionCallAccess().getBRACKET_CLOSETerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleDateLiteral"
    // InternalReactive.g:1299:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalReactive.g:1299:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalReactive.g:1300:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
             newCompositeNode(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;

             current =iv_ruleDateLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // InternalReactive.g:1306:1: ruleDateLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token this_HASH_2=null;
        Token this_NUMBER_3=null;
        Token this_HASH_4=null;
        Token this_NUMBER_5=null;
        Token this_HASH_6=null;
        Token this_NUMBER_7=null;
        Token this_HASH_8=null;
        Token this_NUMBER_9=null;
        Token this_HASH_10=null;
        Token this_NUMBER_11=null;


        	enterRule();

        try {
            // InternalReactive.g:1312:2: ( ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER ) )
            // InternalReactive.g:1313:2: ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER )
            {
            // InternalReactive.g:1313:2: ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER )
            // InternalReactive.g:1314:3: () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER
            {
            // InternalReactive.g:1314:3: ()
            // InternalReactive.g:1315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateLiteralAccess().getExpressionAction_0(),
            					current);
            			

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            			newLeafNode(this_NUMBER_1, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1());
            		
            this_HASH_2=(Token)match(input,RULE_HASH,FOLLOW_24); 

            			newLeafNode(this_HASH_2, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_2());
            		
            this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            			newLeafNode(this_NUMBER_3, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3());
            		
            this_HASH_4=(Token)match(input,RULE_HASH,FOLLOW_24); 

            			newLeafNode(this_HASH_4, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_4());
            		
            this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            			newLeafNode(this_NUMBER_5, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5());
            		
            this_HASH_6=(Token)match(input,RULE_HASH,FOLLOW_24); 

            			newLeafNode(this_HASH_6, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_6());
            		
            this_NUMBER_7=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            			newLeafNode(this_NUMBER_7, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7());
            		
            this_HASH_8=(Token)match(input,RULE_HASH,FOLLOW_24); 

            			newLeafNode(this_HASH_8, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_8());
            		
            this_NUMBER_9=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            			newLeafNode(this_NUMBER_9, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9());
            		
            this_HASH_10=(Token)match(input,RULE_HASH,FOLLOW_24); 

            			newLeafNode(this_HASH_10, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_10());
            		
            this_NUMBER_11=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            			newLeafNode(this_NUMBER_11, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleLiteral"
    // InternalReactive.g:1369:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalReactive.g:1369:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalReactive.g:1370:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalReactive.g:1376:1: ruleLiteral returns [EObject current=null] : ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleDateLiteral ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token lv_valueString_2_0=null;
        Token lv_operations_3_0=null;
        Token this_BRACKET_OPEN_4=null;
        Token lv_valueString_5_0=null;
        Token this_COMMA_6=null;
        Token this_BRACKET_CLOSE_8=null;
        Token lv_expressionType_10_0=null;
        Token this_COMMA_12=null;
        Token this_CURLYCLOSE_14=null;
        Token lv_elements_15_0=null;
        Token lv_elements_16_0=null;
        Token lv_elements_17_0=null;
        Token lv_elements_18_0=null;
        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_21_0 = null;



        	enterRule();

        try {
            // InternalReactive.g:1382:2: ( ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleDateLiteral ) ) ) )
            // InternalReactive.g:1383:2: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleDateLiteral ) ) )
            {
            // InternalReactive.g:1383:2: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleDateLiteral ) ) )
            int alt22=12;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalReactive.g:1384:3: ( () this_NUMBER_1= RULE_NUMBER )
                    {
                    // InternalReactive.g:1384:3: ( () this_NUMBER_1= RULE_NUMBER )
                    // InternalReactive.g:1385:4: () this_NUMBER_1= RULE_NUMBER
                    {
                    // InternalReactive.g:1385:4: ()
                    // InternalReactive.g:1386:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getExpressionAction_0_0(),
                    						current);
                    				

                    }

                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    				newLeafNode(this_NUMBER_1, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactive.g:1398:3: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    {
                    // InternalReactive.g:1398:3: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    // InternalReactive.g:1399:4: (lv_valueString_2_0= RULE_LITERALSTRING )
                    {
                    // InternalReactive.g:1399:4: (lv_valueString_2_0= RULE_LITERALSTRING )
                    // InternalReactive.g:1400:5: lv_valueString_2_0= RULE_LITERALSTRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_2); 

                    					newLeafNode(lv_valueString_2_0, grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueString",
                    						lv_valueString_2_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.LITERALSTRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReactive.g:1417:3: ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE )
                    {
                    // InternalReactive.g:1417:3: ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE )
                    // InternalReactive.g:1418:4: ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE
                    {
                    // InternalReactive.g:1418:4: ( (lv_operations_3_0= RULE_FORALL ) )
                    // InternalReactive.g:1419:5: (lv_operations_3_0= RULE_FORALL )
                    {
                    // InternalReactive.g:1419:5: (lv_operations_3_0= RULE_FORALL )
                    // InternalReactive.g:1420:6: lv_operations_3_0= RULE_FORALL
                    {
                    lv_operations_3_0=(Token)match(input,RULE_FORALL,FOLLOW_20); 

                    						newLeafNode(lv_operations_3_0, grammarAccess.getLiteralAccess().getOperationsFORALLTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"operations",
                    							lv_operations_3_0,
                    							"com.dexels.navajo.dsl.rr.Reactive.FORALL");
                    					

                    }


                    }

                    this_BRACKET_OPEN_4=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_25); 

                    				newLeafNode(this_BRACKET_OPEN_4, grammarAccess.getLiteralAccess().getBRACKET_OPENTerminalRuleCall_2_1());
                    			
                    // InternalReactive.g:1440:4: ( (lv_valueString_5_0= RULE_LITERALSTRING ) )
                    // InternalReactive.g:1441:5: (lv_valueString_5_0= RULE_LITERALSTRING )
                    {
                    // InternalReactive.g:1441:5: (lv_valueString_5_0= RULE_LITERALSTRING )
                    // InternalReactive.g:1442:6: lv_valueString_5_0= RULE_LITERALSTRING
                    {
                    lv_valueString_5_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_26); 

                    						newLeafNode(lv_valueString_5_0, grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueString",
                    							lv_valueString_5_0,
                    							"com.dexels.navajo.dsl.rr.Reactive.LITERALSTRING");
                    					

                    }


                    }

                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_18); 

                    				newLeafNode(this_COMMA_6, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_2_3());
                    			
                    // InternalReactive.g:1462:4: ( (lv_parameters_7_0= ruleOrExpression ) )
                    // InternalReactive.g:1463:5: (lv_parameters_7_0= ruleOrExpression )
                    {
                    // InternalReactive.g:1463:5: (lv_parameters_7_0= ruleOrExpression )
                    // InternalReactive.g:1464:6: lv_parameters_7_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_7_0=ruleOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiteralRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_BRACKET_CLOSE_8=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_2); 

                    				newLeafNode(this_BRACKET_CLOSE_8, grammarAccess.getLiteralAccess().getBRACKET_CLOSETerminalRuleCall_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReactive.g:1487:3: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    {
                    // InternalReactive.g:1487:3: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    // InternalReactive.g:1488:4: (lv_parameters_9_0= ruleFunctionCall )
                    {
                    // InternalReactive.g:1488:4: (lv_parameters_9_0= ruleFunctionCall )
                    // InternalReactive.g:1489:5: lv_parameters_9_0= ruleFunctionCall
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_9_0=ruleFunctionCall();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_9_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.FunctionCall");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalReactive.g:1507:3: ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE )
                    {
                    // InternalReactive.g:1507:3: ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE )
                    // InternalReactive.g:1508:4: ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE
                    {
                    // InternalReactive.g:1508:4: ( (lv_expressionType_10_0= RULE_CURLYOPEN ) )
                    // InternalReactive.g:1509:5: (lv_expressionType_10_0= RULE_CURLYOPEN )
                    {
                    // InternalReactive.g:1509:5: (lv_expressionType_10_0= RULE_CURLYOPEN )
                    // InternalReactive.g:1510:6: lv_expressionType_10_0= RULE_CURLYOPEN
                    {
                    lv_expressionType_10_0=(Token)match(input,RULE_CURLYOPEN,FOLLOW_27); 

                    						newLeafNode(lv_expressionType_10_0, grammarAccess.getLiteralAccess().getExpressionTypeCURLYOPENTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"expressionType",
                    							lv_expressionType_10_0,
                    							"com.dexels.navajo.dsl.rr.Reactive.CURLYOPEN");
                    					

                    }


                    }

                    // InternalReactive.g:1526:4: ( (lv_parameters_11_0= ruleOrExpression ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID||LA20_0==RULE_SQBRACKET_OPEN||LA20_0==RULE_TML_EXISTS||(LA20_0>=RULE_NOT && LA20_0<=RULE_BRACKET_OPEN)||LA20_0==RULE_NUMBER||(LA20_0>=RULE_LITERALSTRING && LA20_0<=RULE_CURLYOPEN)||(LA20_0>=RULE_NULL && LA20_0<=RULE_FALSE)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalReactive.g:1527:5: (lv_parameters_11_0= ruleOrExpression )
                            {
                            // InternalReactive.g:1527:5: (lv_parameters_11_0= ruleOrExpression )
                            // InternalReactive.g:1528:6: lv_parameters_11_0= ruleOrExpression
                            {

                            						newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_28);
                            lv_parameters_11_0=ruleOrExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLiteralRule());
                            						}
                            						add(
                            							current,
                            							"parameters",
                            							lv_parameters_11_0,
                            							"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalReactive.g:1545:4: (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalReactive.g:1546:5: this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    {
                    	    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_27); 

                    	    					newLeafNode(this_COMMA_12, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4_2_0());
                    	    				
                    	    // InternalReactive.g:1550:5: ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    // InternalReactive.g:1551:6: (lv_parameters_13_0= ruleOrExpression )
                    	    {
                    	    // InternalReactive.g:1551:6: (lv_parameters_13_0= ruleOrExpression )
                    	    // InternalReactive.g:1552:7: lv_parameters_13_0= ruleOrExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_parameters_13_0=ruleOrExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"com.dexels.navajo.dsl.rr.Reactive.OrExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    this_CURLYCLOSE_14=(Token)match(input,RULE_CURLYCLOSE,FOLLOW_2); 

                    				newLeafNode(this_CURLYCLOSE_14, grammarAccess.getLiteralAccess().getCURLYCLOSETerminalRuleCall_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalReactive.g:1576:3: ( (lv_elements_15_0= RULE_NULL ) )
                    {
                    // InternalReactive.g:1576:3: ( (lv_elements_15_0= RULE_NULL ) )
                    // InternalReactive.g:1577:4: (lv_elements_15_0= RULE_NULL )
                    {
                    // InternalReactive.g:1577:4: (lv_elements_15_0= RULE_NULL )
                    // InternalReactive.g:1578:5: lv_elements_15_0= RULE_NULL
                    {
                    lv_elements_15_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_elements_15_0, grammarAccess.getLiteralAccess().getElementsNULLTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"elements",
                    						lv_elements_15_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalReactive.g:1595:3: ( (lv_elements_16_0= RULE_TODAY ) )
                    {
                    // InternalReactive.g:1595:3: ( (lv_elements_16_0= RULE_TODAY ) )
                    // InternalReactive.g:1596:4: (lv_elements_16_0= RULE_TODAY )
                    {
                    // InternalReactive.g:1596:4: (lv_elements_16_0= RULE_TODAY )
                    // InternalReactive.g:1597:5: lv_elements_16_0= RULE_TODAY
                    {
                    lv_elements_16_0=(Token)match(input,RULE_TODAY,FOLLOW_2); 

                    					newLeafNode(lv_elements_16_0, grammarAccess.getLiteralAccess().getElementsTODAYTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"elements",
                    						lv_elements_16_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.TODAY");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalReactive.g:1614:3: ( (lv_elements_17_0= RULE_TRUE ) )
                    {
                    // InternalReactive.g:1614:3: ( (lv_elements_17_0= RULE_TRUE ) )
                    // InternalReactive.g:1615:4: (lv_elements_17_0= RULE_TRUE )
                    {
                    // InternalReactive.g:1615:4: (lv_elements_17_0= RULE_TRUE )
                    // InternalReactive.g:1616:5: lv_elements_17_0= RULE_TRUE
                    {
                    lv_elements_17_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    					newLeafNode(lv_elements_17_0, grammarAccess.getLiteralAccess().getElementsTRUETerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"elements",
                    						lv_elements_17_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.TRUE");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalReactive.g:1633:3: ( (lv_elements_18_0= RULE_FALSE ) )
                    {
                    // InternalReactive.g:1633:3: ( (lv_elements_18_0= RULE_FALSE ) )
                    // InternalReactive.g:1634:4: (lv_elements_18_0= RULE_FALSE )
                    {
                    // InternalReactive.g:1634:4: (lv_elements_18_0= RULE_FALSE )
                    // InternalReactive.g:1635:5: lv_elements_18_0= RULE_FALSE
                    {
                    lv_elements_18_0=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    					newLeafNode(lv_elements_18_0, grammarAccess.getLiteralAccess().getElementsFALSETerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"elements",
                    						lv_elements_18_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.FALSE");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalReactive.g:1652:3: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    {
                    // InternalReactive.g:1652:3: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    // InternalReactive.g:1653:4: (lv_parameters_19_0= ruleTmlExpression )
                    {
                    // InternalReactive.g:1653:4: (lv_parameters_19_0= ruleTmlExpression )
                    // InternalReactive.g:1654:5: lv_parameters_19_0= ruleTmlExpression
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_19_0=ruleTmlExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_19_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.TmlExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalReactive.g:1672:3: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    {
                    // InternalReactive.g:1672:3: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    // InternalReactive.g:1673:4: (lv_parameters_20_0= ruleExistsTmlExpression )
                    {
                    // InternalReactive.g:1673:4: (lv_parameters_20_0= ruleExistsTmlExpression )
                    // InternalReactive.g:1674:5: lv_parameters_20_0= ruleExistsTmlExpression
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_20_0=ruleExistsTmlExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_20_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.ExistsTmlExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalReactive.g:1692:3: ( (lv_parameters_21_0= ruleDateLiteral ) )
                    {
                    // InternalReactive.g:1692:3: ( (lv_parameters_21_0= ruleDateLiteral ) )
                    // InternalReactive.g:1693:4: (lv_parameters_21_0= ruleDateLiteral )
                    {
                    // InternalReactive.g:1693:4: (lv_parameters_21_0= ruleDateLiteral )
                    // InternalReactive.g:1694:5: lv_parameters_21_0= ruleDateLiteral
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_21_0=ruleDateLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_21_0,
                    						"com.dexels.navajo.dsl.rr.Reactive.DateLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\4\1\uffff\1\4\1\uffff\2\4";
    static final String dfa_3s = "\1\11\1\12\1\uffff\1\12\1\uffff\2\12";
    static final String dfa_4s = "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\3\2\1\1\1\uffff\1\2",
            "\3\4\1\3\1\uffff\1\4\1\2",
            "",
            "\3\2\1\5\2\uffff\1\4",
            "",
            "\3\4\1\6\2\uffff\1\2",
            "\3\2\1\5\2\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "169:3: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String dfa_7s = "\2\4\2\uffff\3\4";
    static final String dfa_8s = "\1\11\1\12\2\uffff\3\12";
    static final String dfa_9s = "\2\uffff\1\2\1\1\3\uffff";
    static final String[] dfa_10s = {
            "\3\2\1\1\1\uffff\1\2",
            "\3\3\1\4\1\uffff\1\3\1\2",
            "",
            "",
            "\3\2\1\5\2\uffff\1\3",
            "\3\3\1\6\2\uffff\1\2",
            "\3\2\1\5\2\uffff\1\3"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "280:3: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String dfa_11s = "\16\uffff";
    static final String dfa_12s = "\1\uffff\1\15\14\uffff";
    static final String dfa_13s = "\2\4\14\uffff";
    static final String dfa_14s = "\2\44\14\uffff";
    static final String dfa_15s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1";
    static final String dfa_16s = "\16\uffff}>";
    static final String[] dfa_17s = {
            "\1\4\3\uffff\1\12\2\uffff\1\13\17\uffff\1\1\1\uffff\1\2\1\3\1\5\1\uffff\1\6\1\7\1\10\1\11",
            "\1\15\2\uffff\2\15\2\uffff\21\15\1\14\10\15",
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
            ""
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_11;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1383:2: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleDateLiteral ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001EE9C00912L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001EE9C01910L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001EE9C02910L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001EE9C00910L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001EE9D00910L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001EE9E00990L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001EEBC00910L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001EEFC00910L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001FEDC00910L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000104000000L});

}