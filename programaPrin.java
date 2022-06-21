import java.util.Scanner;
import Funciones.informeDeEmpleados;
import Funciones.PagoXhoraSegunCategoria;
import Funciones.BonificacionPorSueldo;
public class programaPrin {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        do{
            System.out.println("\n1. Info de Empleados(Codigo,Categoria,Antiguedad / Despidos-Contrataciones)");
            System.out.println("2. Informe de Pago por Hora segun la Categoria");
            System.out.println("3. Salario semanal de los empleados");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Has seleccionado la opcion 1"); 
                Funciones.informeDeEmpleados.infoEmpleados();
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                Funciones.PagoXhoraSegunCategoria.pagoXhora();
                break;
             case 3:
                System.out.println("Has seleccionado la opcion 3");
                Funciones.BonificacionPorSueldo.bonificacionxSueldo();
                break;
             case 4:
                salir=true;
                break;
             default:
                System.out.println("Solo números entre 1 y 4");
        }
    }
    while(!salir);

    }
}
    
