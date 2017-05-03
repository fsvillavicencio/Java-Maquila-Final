package Maquila;

import java.util.ArrayList;

public class Registro {
    ArrayList<Empleados> listEmpleados = new ArrayList<>();//Array list de Empleados.
    ArrayList<Lider> listLider = new ArrayList<>();//Array list de Lider.
    ArrayList<ProgramadorJAVA> listPro = new ArrayList<>();//Array list de ProgramadorJAVA.
    
    
    //Se agrega un nuevo empleado.
    public void agregarEmpleado(Empleados obje){
        listEmpleados.add(obje);
    }
    //Se muestran los Empleados.
    public void mostraEmpleado(){
        for(Empleados arrEmpleados: listEmpleados){
            System.out.println(arrEmpleados);
        }
    }
    //Se agrega un nuevo Lider.
    public void agregarLider(Lider objl){
        listLider.add(objl);
    }
    //Se muestra un nuevo Lider.
    public void mostraLider(){
        for(Lider arrLider: listLider){
            System.out.println(arrLider);
        }
    }
    //Se agrega un nuevo Programador de JAVA.
    public void agregarProJava(ProgramadorJAVA objp){
        listPro.add(objp);
    }
    //Se muestran los Programadores en JAVA.
    public void mostraProJava(){
        for(ProgramadorJAVA arrPro: listPro){
            System.out.println(arrPro);
        }
    }
}
