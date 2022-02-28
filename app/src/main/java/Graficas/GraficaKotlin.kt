package Graficas

open class GraficaKotlin {
    private var tipoDef: String?            //
    private var titulo: String?             //
    private var tipo: String? = null        //
    private var Ejex: ejeX? = null          //
    private var Ejey: ejeY? = null          //
    private var etiqueta: Etiqueta? = null  //
    private var valor: Valores? = null      //
    private var unir: Unir? =null           //
    private var extra: String? = null       //

    constructor(tipoDef: String, titulo: String) {
        this.tipoDef = tipoDef
        this.titulo = titulo
    }
}