package Graficas

open class Grafica {
    private var tipoDef: String
    private var titulo: String
    private var tipo: String
    private var Ejex: ejeX
    private var Ejey: ejeY
    private var etiqueta: Etiqueta
    private var valor: Valores
    private var unir: Unir
    private var extra: String

    constructor(tipoDef: String, titulo: String) {
        this.tipoDef = tipoDef
        this.titulo = titulo
    }

    fun getTipoDef: String {
        return this.tipoDef
        var prueba : Prueb
        var salida : String = prueba.salida()

    }

    fun getTitulo: String {
        return this.titulo
    }
}