package Graficas;

import java.util.ArrayList;

public class Grafica {
    private String tipo;
    private String titulo;
    private ArrayList<String> ejex;
    private ArrayList<String> ejey;
    private ArrayList<String> etiquetas;
    private ArrayList<String> valores;
    private ArrayList<String> unir;
    private String tipoCP;
    private ArrayList<String> total;
    private String extra;

    public Grafica(String tipo) {
        this.tipo = tipo;
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

    public ArrayList<String> getEjey() {
        return ejey;
    }

    public void setEjey(ArrayList<String> ejey) {
        this.ejey = ejey;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<String> getValores() {
        return valores;
    }

    public void setValores(ArrayList<String> valores) {
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

    public ArrayList<String> getTotal() {
        return total;
    }

    public void setTotal(ArrayList<String> total) {
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
