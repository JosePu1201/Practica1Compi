package Graficas;

import java.util.ArrayList;

public class Grafica {
    private String tipo = "";
    private String titulo = "";
    private ArrayList<String> ejex = new ArrayList<>();
    private ArrayList<Double> ejey = new ArrayList<>();
    private ArrayList<String> etiquetas = new ArrayList<>();
    private ArrayList<Double> valores = new ArrayList<>();
    private ArrayList<String> unir = new ArrayList<>();
    private String tipoCP ="";
    private double total=0;
    private String extra="";

    public Grafica() {

    }
    public void reset(){
        tipo = "";
        titulo = "";
        ejex.clear();
        ejey.clear();
        etiquetas.clear();
        valores.clear();
        unir.clear();
        tipoCP = "";
        total = 0;
        extra = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getEjex() {
        return ejex;
    }

    public void setEjex(ArrayList<String> ejex) {
        this.ejex = ejex;
    }

    public ArrayList<Double> getEjey() {
        return ejey;
    }

    public void setEjey(ArrayList<Double> ejey) {
        this.ejey = ejey;
    }
    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<Double> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Double> valores) {
        this.valores = valores;
    }

    public ArrayList<String> getUnir() {
        return unir;
    }

    public void setUnir(ArrayList<String> unir) {
        this.unir = unir;
    }

    public String getTipoCP() {
        return tipoCP;
    }

    public void setTipoCP(String tipoCP) {
        this.tipoCP = tipoCP;
    }

    public double  getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Grafica{" +
                "tipo='" + tipo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ejex=" + ejex +
                ", ejey=" + ejey +
                ", etiquetas=" + etiquetas +
                ", valores=" + valores +
                ", unir=" + unir +
                ", tipoCP='" + tipoCP + '\'' +
                ", total=" + total +
                ", extra='" + extra + '\'' +
                '}';
    }
}
