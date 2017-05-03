package Maquila;
class Lider extends Empleados{
    private double dblSueldoLider;
    private int intNum;
    public Lider(int intId, String strNombres, double dblSalario, String strLenguaje, int intNum) {//Constructor de la clase.
        super(intId, strNombres, dblSalario, strLenguaje);
        this.intNum = intNum;
    }
    //Se calcula el sueldo del lider.
    public double dblSueldoLider(){
        dblSueldoLider = super.getDblSalario() + ((super.getDblSalario() * 0.10) * intNum);
        return dblSueldoLider;
    }

    @Override
    public String toString() {//to String.
        return "--- LIDER DE EQUIPO ---\n" + super.toString() + "Sueldo Lider: " + dblSueldoLider() + "\nNumero de Integrantes: " + intNum + '\n';
    }
    
    
    
}
