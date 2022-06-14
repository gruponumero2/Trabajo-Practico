public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Este programa sirve para ver cuanto gana cada categoria de empleado por hora.");
        System.out.println("Si desea saber mas informacion, ingrese el numero de la categoria a la que pertenece: ");
        System.out.println("1.Técnico SR");
        System.out.println("2.Técnico JR");
        System.out.println("3.Administrativo");
        System.out.println("4.Staff general");
        int categoria=Integer.parseInt(System.console().readLine());
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
        

    }
}
