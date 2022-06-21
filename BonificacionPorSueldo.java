package Funciones;
import java.util.Scanner;
public class BonificacionPorSueldo {  
    public static void bonificacionxSueldo() {
    Scanner sn = new Scanner(System.in);
     
        System.out.println("Este programa sirve para ver cuanto gana cada categoria de empleado por hora + el bono segun su antiguedad.");    
        System.out.println("1. Técnico SR");
        System.out.println("2. Técnico JR");
        System.out.println("3. Administrativo");
        System.out.println("4. Staff general");
        System.out.println("ingrese el numero de la categoria a la que pertenece : ");
        int categoria= sn.nextInt();  
        String salarios;

        switch(categoria){
            case 1:
            salarios="Técnico SR ($550 x/Hr)";
            break;
            case 2:
            salarios="Técnico JR ($380 x/Hr)";
            break;
            case 3:
            salarios="Administrativo ($400 x/Hr)";
            break;
            case 4:
            salarios="Staff general ($300 x/Hr)";
            break;
            default:
            salarios="No existe esa categoria";
        }
        System.out.println("El salario por hora correspondiente a esa categoria es de: " + salarios );

        Funciones.informeDeEmpleados.infoEmpleados();
        double codigo, bonificacion, cantidad_de_horas_trabajadas, precio_por_hora,antiguedad,sueldo, sueldo_total;
        //System.out.print("Ingresa el codigo del empleado: ");
        //codigo = sn.nextDouble();
        //sn.nextLine();
        System.out.print("Ingresa el valor de cantidad de horas trabajadas: ");
        cantidad_de_horas_trabajadas = sn.nextDouble();
        sn.nextLine();
        System.out.print("Ingresa el valor de precio por hora: ");
        System.out.println("\nTécnico SR ($550 x/Hr) - Técnico JR ($380 x/Hr)");
        System.out.println("Administrativo ($400 x/Hr) - Staff general ($300 x/Hr)");
        precio_por_hora = sn.nextDouble();
        sn.nextLine();
        System.out.print("Ingrese hace cuantos años trabaja en nuestra empresa: ");
        antiguedad = sn.nextDouble();
        sn.nextLine();

        bonificacion=0;
        sueldo=cantidad_de_horas_trabajadas*precio_por_hora;
        //sueldo=0;

        if(sueldo>=300 && antiguedad >=1 && antiguedad<=50)

            bonificacion= sueldo*0.1 * antiguedad;

        sueldo_total=sueldo+bonificacion;
        //System.out.println("Codigo de empleado: " + codigo);
        System.out.println("Antiguedad del empleado: " + antiguedad);
        System.out.println("Categoria del empleado: " + salarios);
        System.out.println("Valor de bonificacion: " + bonificacion);
        System.out.println("Valor de sueldo: " + sueldo);
        System.out.println("Valor de sueldo total: " + sueldo_total);

    }
  } 

