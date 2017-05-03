package Maquila;
class ProgramadorJAVA extends Empleados{
    private double dblSueldoJava;
    public ProgramadorJAVA(int intId, String strNombres, double dblSalario, String strLenguaje) {//Costructor de la clase.
        super(intId, strNombres, dblSalario, strLenguaje);
    }

    public double salarioJava(){//Se calcula el salario por saber JAVA.
        dblSueldoJava = super.getDblSalario() + (super.getDblSalario() * 0.20);
        return dblSueldoJava;
    }

    @Override
    public String toString() {//to String.
        return super.toString() + "Sueldo Java: " + salarioJava() + '\n';
    }
    
    
    
}
