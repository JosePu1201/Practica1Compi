/*primera seccion*/
package com.jgranados.jflex_cup.sumas;
import java_cup.runtime.*;
%%

/*Segunda seccion: Configuracion*/
%class Lexico
%unicode
%line
%column
%cup
// Palaras reservadas 
Barras = "Barras"
Pie = "Pie"
Dif = [D|d][e][f] 
titulo = "titulo"
ejex = "ejex"
ejey = "ejey"
etiquetas = "etiquetas"
valores = "valores"
unir = "unir"
tipo = "tipo"
Cantidad = "Cantidad"
Porcentaje = "Porcentaje"
total = "total"
extra = "extra"
Ejecutar = "Ejecutar"
//Reglas lexicas
Palabra = [\"][[a-z]|[A-Z]|[0-9]|[" "]]+[\"]
Entero = [0-9]+
Decimal = [0-9]+[.][0-9]+
Comentario = [#][[a-z]|[A-Z]|[0-9]|[" "]]*[\n]*
Espacios = [\t]|[\f][\n]



%%
{Dif} 	            	{System.out.println("No entra aqui");
						return new Symbol(sym.DEF,yyline+1,yycolumn+1,yytext());
}
{Barras} 	        {return new Symbol(sym.BARRAS,yyline+1,yycolumn+1,yytext());}
{Ejecutar} 	        {return new Symbol(sym.EJECUTAR,yyline+1,yycolumn+1,yytext());}          
{Pie}		        {return new Symbol(sym.PIE,yyline+1,yycolumn+1,yytext());}
{titulo} 	        {return new Symbol(sym.TITULO,yyline+1,yycolumn+1,yytext());}
{ejex} 		        {return new Symbol(sym.EJEX,yyline+1,yycolumn+1,yytext());}
{ejey}              {return new Symbol(sym.EJEY,yyline+1,yycolumn+1,yytext());}
{etiquetas}         {return new Symbol(sym.ETIQUETAS,yyline+1,yycolumn+1,yytext());}
{valores}           {return new Symbol(sym.VALORES ,yyline+1,yycolumn+1,yytext());}
{unir}              {return new Symbol(sym.UNIR,yyline+1,yycolumn+1,yytext());}
{tipo}              {return new Symbol(sym.TIPO,yyline+1,yycolumn+1,yytext());}
{Cantidad}          {return new Symbol(sym.CANT,yyline+1,yycolumn+1,yytext());}
{Porcentaje}        {return new Symbol(sym.PORCENTAJE,yyline+1,yycolumn+1,yytext());}
{total}             {return new Symbol(sym.TOTAL,yyline+1,yycolumn+1,yytext());}
{extra} {           return new Symbol(sym.EXTRA,yyline+1,yycolumn+1,yytext());}                  
/*operadores artmeticos*/
["+"]               {return new Symbol(sym.SUM,yyline+1,yycolumn+1,yytext());}
["-"]               {return new Symbol(sym.REST,yyline+1,yycolumn+1,yytext());}
["*"]               {return new Symbol(sym.MULT,yyline+1,yycolumn+1,yytext());}
["/"]               {return new Symbol(sym.DIV,yyline+1,yycolumn+1,yytext());}
["("]               {return new Symbol(sym.PIZQUIERDA,yyline+1,yycolumn+1,yytext());}
[")"]               {return new Symbol(sym.PDERECHA,yyline+1,yycolumn+1,yytext());}
/*Otros caracteres */
[","]               {return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());}
[";"]               {return new Symbol(sym.PYCOMA,yyline+1,yycolumn+1,yytext());}
[":"]               {return new Symbol(sym.DPUNTOS,yyline+1,yycolumn+1,yytext());}
["["]               {return new Symbol(sym.CIZQUIERDA,yyline+1,yycolumn+1,yytext());}
["]"]               {return new Symbol(sym.CDERECHA,yyline+1,yycolumn+1,yytext());}
["{"]               {return new Symbol(sym.LLIZQUIERDA,yyline+1,yycolumn+1,yytext());}
["}"]               {return new Symbol(sym.LLDERECHA,yyline+1,yycolumn+1,yytext());}
{Palabra}           {System.out.println(yytext());
					return new Symbol(sym.PAL,yyline+1,yycolumn+1,yytext());}    
{Entero}            {return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());}
{Decimal}           {return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}      
{Comentario}        {} 
//Ignorar saltos de linea
{Espacios} {}
[^]     {}
