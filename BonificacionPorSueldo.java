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
            //Las categorías se agrupan como casos de modo que se puedan seleccionar ingresando sus respectivos números cuando se pida por print
        }
        System.out.println("El salario por hora correspondiente a esa categoria es de: " + salarios );
        //Una vez seleccionada la categoría, luego de que el programa analice los casos y seleccione uno, saldrá por consola el texto + la variable "salarios", la cual se almacena luego de que el caso haya sido seleccionado

        Funciones.informeDeEmpleados.infoEmpleados();
        //Se llama a la función informeDeEmpleados para poder trabajar con ella
        double codigo, bonificacion, cantidad_de_horas_trabajadas, precio_por_hora,antiguedad,sueldo, sueldo_total;
        //Las variables son establecidas como valores double
      
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
        //Se piden los datos necesarios para llevar a cabo las operaciones

        bonificacion=0;
        //Se declara la variable "bonificacion"
        sueldo=cantidad_de_horas_trabajadas*precio_por_hora;
        //El salario por hora se multiplica con las horas trabajadas. El sueldo variará dependiendo de los valores que se ingresen para ambas variables


        if(sueldo>=300 && antiguedad >=1 && antiguedad<=50)
        //Se pone una condición para poder calcular el bono a los salarios
            bonificacion= sueldo*0.1 * antiguedad;
        //Si la condición se cumple entonces habrá bonificación para el empleado
        sueldo_total=sueldo+bonificacion;
        //El sueldo total será el sueldo neto + la bonificación
        System.out.println("Antiguedad del empleado: " + antiguedad);
        System.out.println("Categoria del empleado: " + salarios);
        System.out.println("Valor de bonificacion: " + bonificacion);
        System.out.println("Valor de sueldo: " + sueldo);
        System.out.println("Valor de sueldo total: " + sueldo_total);
        //Los datos ingresados y los valores obtenidos de las operaciones saldrán por consola

    }
  } 

