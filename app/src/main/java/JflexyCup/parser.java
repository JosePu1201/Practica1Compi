
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package JflexyCup;

import java_cup.runtime.*;
import Graficas.Grafica;
import JflexyCup.Lexico;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\050\000\002\002\004\000\002\002\004\000\002\004" +
    "\006\000\002\004\006\000\002\011\004\000\002\011\010" +
    "\000\002\012\010\000\002\012\002\000\002\007\007\000" +
    "\002\007\011\000\002\007\011\000\002\007\011\000\002" +
    "\007\003\000\002\013\003\000\002\013\005\000\002\014" +
    "\005\000\002\014\003\000\002\020\003\000\002\003\005" +
    "\000\002\003\005\000\002\003\003\000\002\005\005\000" +
    "\002\005\005\000\002\005\003\000\002\006\005\000\002" +
    "\006\003\000\002\006\003\000\002\015\007\000\002\015" +
    "\011\000\002\010\007\000\002\010\011\000\002\010\011" +
    "\000\002\010\011\000\002\010\007\000\002\010\007\000" +
    "\002\010\007\000\002\010\003\000\002\016\003\000\002" +
    "\016\003\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\200\000\004\004\004\001\002\000\006\005\010\006" +
    "\011\001\002\000\004\002\006\001\002\000\004\002\000" +
    "\001\002\000\004\002\001\001\002\000\004\035\145\001" +
    "\002\000\004\035\012\001\002\000\022\007\013\012\021" +
    "\013\015\014\020\015\016\016\014\017\023\036\017\001" +
    "\002\000\004\037\141\001\002\000\004\037\134\001\002" +
    "\000\004\037\123\001\002\000\004\037\115\001\002\000" +
    "\006\004\uffdd\027\uffdd\001\002\000\004\037\060\001\002" +
    "\000\004\037\047\001\002\000\006\004\030\027\031\001" +
    "\002\000\004\037\024\001\002\000\004\040\025\001\002" +
    "\000\004\031\026\001\002\000\022\007\013\012\021\013" +
    "\015\014\020\015\016\016\014\017\023\036\017\001\002" +
    "\000\006\004\uffde\027\uffde\001\002\000\006\005\010\006" +
    "\011\001\002\000\004\030\033\001\002\000\004\002\ufffe" +
    "\001\002\000\004\040\034\001\002\000\004\026\035\001" +
    "\002\000\004\031\036\001\002\000\006\002\ufffa\027\037" +
    "\001\002\000\004\030\041\001\002\000\004\002\ufffc\001" +
    "\002\000\004\040\042\001\002\000\004\026\043\001\002" +
    "\000\004\031\044\001\002\000\006\002\ufffa\027\037\001" +
    "\002\000\004\002\ufffb\001\002\000\004\002\ufffd\001\002" +
    "\000\004\034\050\001\002\000\004\040\052\001\002\000" +
    "\004\033\055\001\002\000\006\032\053\033\ufff4\001\002" +
    "\000\004\040\052\001\002\000\004\033\ufff3\001\002\000" +
    "\004\031\056\001\002\000\022\007\013\012\021\013\015" +
    "\014\020\015\016\016\014\017\023\036\017\001\002\000" +
    "\006\004\uffe2\027\uffe2\001\002\000\004\034\061\001\002" +
    "\000\004\035\063\001\002\000\004\033\112\001\002\000" +
    "\010\030\064\041\072\042\070\001\002\000\010\030\064" +
    "\041\072\042\070\001\002\000\016\022\104\023\105\031" +
    "\ufff0\032\ufff0\033\ufff0\036\ufff0\001\002\000\024\022\uffea" +
    "\023\uffea\024\uffea\025\uffea\026\uffea\031\uffea\032\uffea\033" +
    "\uffea\036\uffea\001\002\000\024\022\uffed\023\uffed\024\100" +
    "\025\101\026\uffed\031\uffed\032\uffed\033\uffed\036\uffed\001" +
    "\002\000\024\022\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7" +
    "\031\uffe7\032\uffe7\033\uffe7\036\uffe7\001\002\000\004\032" +
    "\073\001\002\000\024\022\uffe8\023\uffe8\024\uffe8\025\uffe8" +
    "\026\uffe8\031\uffe8\032\uffe8\033\uffe8\036\uffe8\001\002\000" +
    "\010\030\064\041\072\042\070\001\002\000\004\036\075" +
    "\001\002\000\006\032\076\033\uffe6\001\002\000\004\035" +
    "\063\001\002\000\004\033\uffe5\001\002\000\010\030\064" +
    "\041\072\042\070\001\002\000\010\030\064\041\072\042" +
    "\070\001\002\000\024\022\uffeb\023\uffeb\024\uffeb\025\uffeb" +
    "\026\uffeb\031\uffeb\032\uffeb\033\uffeb\036\uffeb\001\002\000" +
    "\024\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\031\uffec" +
    "\032\uffec\033\uffec\036\uffec\001\002\000\010\030\064\041" +
    "\072\042\070\001\002\000\010\030\064\041\072\042\070" +
    "\001\002\000\024\022\uffee\023\uffee\024\100\025\101\026" +
    "\uffee\031\uffee\032\uffee\033\uffee\036\uffee\001\002\000\024" +
    "\022\uffef\023\uffef\024\100\025\101\026\uffef\031\uffef\032" +
    "\uffef\033\uffef\036\uffef\001\002\000\010\022\104\023\105" +
    "\026\111\001\002\000\024\022\uffe9\023\uffe9\024\uffe9\025" +
    "\uffe9\026\uffe9\031\uffe9\032\uffe9\033\uffe9\036\uffe9\001\002" +
    "\000\004\031\113\001\002\000\022\007\013\012\021\013" +
    "\015\014\020\015\016\016\014\017\023\036\017\001\002" +
    "\000\006\004\uffe3\027\uffe3\001\002\000\006\020\120\021" +
    "\117\001\002\000\004\031\121\001\002\000\004\031\uffdb" +
    "\001\002\000\004\031\uffdc\001\002\000\022\007\013\012" +
    "\021\013\015\014\020\015\016\016\014\017\023\036\017" +
    "\001\002\000\006\004\uffe0\027\uffe0\001\002\000\004\034" +
    "\124\001\002\000\010\030\064\041\072\042\070\001\002" +
    "\000\004\033\131\001\002\000\006\032\127\033\ufff1\001" +
    "\002\000\010\030\064\041\072\042\070\001\002\000\004" +
    "\033\ufff2\001\002\000\004\031\132\001\002\000\022\007" +
    "\013\012\021\013\015\014\020\015\016\016\014\017\023" +
    "\036\017\001\002\000\006\004\uffe1\027\uffe1\001\002\000" +
    "\010\030\064\041\072\042\070\001\002\000\004\031\137" +
    "\001\002\000\004\031\uffda\001\002\000\022\007\013\012" +
    "\021\013\015\014\020\015\016\016\014\017\023\036\017" +
    "\001\002\000\006\004\uffdf\027\uffdf\001\002\000\004\040" +
    "\142\001\002\000\004\031\143\001\002\000\022\007\013" +
    "\012\021\013\015\014\020\015\016\016\014\017\023\036" +
    "\017\001\002\000\006\004\uffe4\027\uffe4\001\002\000\014" +
    "\007\146\010\152\011\151\014\147\036\150\001\002\000" +
    "\004\037\177\001\002\000\004\037\171\001\002\000\006" +
    "\004\ufff5\027\ufff5\001\002\000\004\037\163\001\002\000" +
    "\004\037\155\001\002\000\006\004\030\027\031\001\002" +
    "\000\004\002\uffff\001\002\000\004\034\156\001\002\000" +
    "\004\040\052\001\002\000\004\033\160\001\002\000\004" +
    "\031\161\001\002\000\014\007\146\010\152\011\151\014" +
    "\147\036\150\001\002\000\006\004\ufff8\027\ufff8\001\002" +
    "\000\004\034\164\001\002\000\010\030\064\041\072\042" +
    "\070\001\002\000\004\033\166\001\002\000\004\031\167" +
    "\001\002\000\014\007\146\010\152\011\151\014\147\036" +
    "\150\001\002\000\006\004\ufff7\027\ufff7\001\002\000\004" +
    "\034\172\001\002\000\004\035\063\001\002\000\004\033" +
    "\174\001\002\000\004\031\175\001\002\000\014\007\146" +
    "\010\152\011\151\014\147\036\150\001\002\000\006\004" +
    "\ufff6\027\ufff6\001\002\000\004\040\200\001\002\000\004" +
    "\031\201\001\002\000\014\007\146\010\152\011\151\014" +
    "\147\036\150\001\002\000\006\004\ufff9\027\ufff9\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\200\000\004\002\004\001\001\000\004\004\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\026\001" +
    "\001\000\002\001\001\000\004\004\045\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\050\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\053\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\056\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\061\001\001\000\002\001\001\000\012\003" +
    "\064\005\066\006\065\020\070\001\001\000\010\003\107" +
    "\005\066\006\065\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\003\064\005\066\006\065\020" +
    "\073\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\076\001\001\000\002\001\001\000\004\006\102\001" +
    "\001\000\004\006\101\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\106\006\065\001\001\000\006\005" +
    "\105\006\065\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\113\001\001\000\002\001\001\000\004\016\115" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\121\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\003\064\005\066\006\065\014\124\020" +
    "\125\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\003\064\005\066\006\065\020\127\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\132\001\001\000\002" +
    "\001\001\000\014\003\064\005\066\006\065\017\134\020" +
    "\135\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\137\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\143\001\001\000\002\001\001" +
    "\000\004\007\152\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\153\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\156\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\007\161\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\003\064\005\066\006\065\014\164" +
    "\020\125\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\167\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\172\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\175\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\201\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public Symbol do_action(
    int                        act_num,
    lr_parser parser,
    Stack            stack,
    int                        top)
    throws Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 
public parser(Lexico lexer) {
        super(lexer);
    }
	private ArrayList<Grafica> array = new ArrayList<Grafica>();
	private ArrayList<String> array1 = new ArrayList<String>();
	private ArrayList<String> array3 = new ArrayList<String>();
	Grafica nueva;
	public void nuevaG(String tipo){
		nueva = new Grafica(tipo);
	}
	//agregar y reset
	public void killAd(){
		array.add(nueva);
		nueva = null;
	}
	public void killArray(){
		array1 = null;
		array1 = new ArrayList<String>();
	}
	public void report_error(String message, Object info) {
        System.out.println("public void report_error");
    }
    
    public void report_fatal_error(String message, Object info) {
        System.out.println("public void report_fatal_error");
    }
public void syntax_error(Symbol cur_token) {
        System.out.println("El error es el simbolo: " + sym.terminalNames[cur_token.sym]);
        System.out.println(String.format("En la posicion: %d, %d", cur_token.left, cur_token.right));
    }

    public void unrecovered_syntax_error(Symbol cur_token) {
        if (cur_token.sym == sym.EOF) {
            System.out.println("public void unrecoveredsyntax_error");
        }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    lr_parser CUP$parser$parser,
    Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
      /* Symbol object for return from actions */
      Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicio ::= DEF tipoGrafica 
            {
              Object RESULT =null;
		int kleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int kright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object k = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println("Esto es un Def"+k.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // tipoGrafica ::= BARRAS LLIZQUIERDA barras d 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoGrafica",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // tipoGrafica ::= PIE LLIZQUIERDA expresionpie d 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoGrafica",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // d ::= DEF tipoGrafica 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",7, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // d ::= EJECUTAR PIZQUIERDA PAL PDERECHA PYCOMA f 
            {
              Object RESULT =null;
		int graficaleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int graficaright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object grafica = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",7, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // f ::= EJECUTAR PIZQUIERDA PAL PDERECHA PYCOMA f 
            {
              Object RESULT =null;
		int graficaleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int graficaright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object grafica = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // f ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",8, ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // barras ::= TITULO DPUNTOS PAL PYCOMA barras 
            {
              Object RESULT =null;
		int titleleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int titleright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object title = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("barras",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // barras ::= EJEX DPUNTOS CIZQUIERDA itemsEjex CDERECHA PYCOMA barras 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("barras",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // barras ::= EJEY DPUNTOS CIZQUIERDA valores CDERECHA PYCOMA barras 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("barras",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // barras ::= UNIR DPUNTOS CIZQUIERDA llaves CDERECHA PYCOMA barras 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("barras",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // barras ::= LLDERECHA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("barras",5, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // itemsEjex ::= PAL 
            {
              Object RESULT =null;
		int itemleft = ((Symbol)CUP$parser$stack.peek()).left;
		int itemright = ((Symbol)CUP$parser$stack.peek()).right;
		Object item = (Object)((Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("itemsEjex",9, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // itemsEjex ::= PAL COMA itemsEjex 
            {
              Object RESULT =null;
		int itemleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int itemright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object item = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("itemsEjex",9, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // valores ::= operacion COMA operacion 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valores",10, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // valores ::= operacion 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valores",10, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // operacion ::= a 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // a ::= a SUM md 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("a",1, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // a ::= a REST md 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("a",1, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // a ::= md 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("a",1, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // md ::= md MULT ag 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("md",3, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // md ::= md DIV ag 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("md",3, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // md ::= ag 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("md",3, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ag ::= PIZQUIERDA a PDERECHA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ag",4, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ag ::= ENTERO 
            {
              Object RESULT =null;
		int enteroleft = ((Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((Symbol)CUP$parser$stack.peek()).right;
		Object entero = (Object)((Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ag",4, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ag ::= DECIMAL 
            {
              Object RESULT =null;
		int decimalleft = ((Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((Symbol)CUP$parser$stack.peek()).right;
		Object decimal = (Object)((Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ag",4, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // llaves ::= LLIZQUIERDA operacion COMA operacion LLDERECHA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("llaves",11, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // llaves ::= LLIZQUIERDA operacion COMA operacion LLDERECHA COMA llaves 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("llaves",11, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expresionpie ::= TITULO DPUNTOS PAL PYCOMA expresionpie 
            {
              Object RESULT =null;
		int titleleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int titleright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object title = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expresionpie ::= UNIR DPUNTOS CIZQUIERDA llaves CDERECHA PYCOMA expresionpie 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expresionpie ::= ETIQUETAS DPUNTOS CIZQUIERDA itemsEjex CDERECHA PYCOMA expresionpie 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expresionpie ::= VALORES DPUNTOS CIZQUIERDA valores CDERECHA PYCOMA expresionpie 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expresionpie ::= TIPO DPUNTOS tipo PYCOMA expresionpie 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expresionpie ::= TOTAL DPUNTOS total PYCOMA expresionpie 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expresionpie ::= EXTRA DPUNTOS PAL PYCOMA expresionpie 
            {
              Object RESULT =null;
		int extraleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int extraright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object extra = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expresionpie ::= LLDERECHA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionpie",6, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // tipo ::= CANT 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",12, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // tipo ::= PORCENTAJE 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",12, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // total ::= operacion 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("total",13, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    lr_parser CUP$parser$parser,
    Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
