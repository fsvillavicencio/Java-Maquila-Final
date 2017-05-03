package Maquila;
public class Empleados {
    private int intId;
    private String strNombres;
    private double dblSalario;
    private String strLenguaje;

    public Empleados(int intId, String strNombres, double dblSalario, String strLenguaje) {//Cosntructor de la clase.
        this.intId = intId;
        this.strNombres = strNombres;
        this.dblSalario = dblSalario;
        this.strLenguaje = strLenguaje;
    }
    //Set y Get de los atributos.
    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public double getDblSalario() {
        return dblSalario;
    }

    public void setDblSalario(double dblSalario) {
        this.dblSalario = dblSalario;
    }

    public String getStrLenguaje() {
        return strLenguaje;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    @Override
    public String toString() {//to String.
        return "--- Empleados ---\n" + "Id: " + intId + "\nNombres: " + strNombres + "\nSalario Base: " + dblSalario + "\nLenguaje: " + strLenguaje + '\n';
    }
    
    
}
