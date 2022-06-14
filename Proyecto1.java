public class Proyecto1 {
    public static void main(String[] args){
        int[] empleados = new int[50];        
        int[] categorias = new int[5];
        int[] codigos = new int[50];
        int y = 0;
        int e = 1;
        int[] antiguedad = new int[50];



        for(int i = 1; i < 50; i++){
            
            codigos[i] = (int)(Math.random()*1001 + 1);
            System.out.println("Códigos de empleados: " + codigos[i]); 
    }
System.out.println("-------------------------------");

        for(int i = 0; i<= 4; i++){
            categorias[i] = (int)(Math.random()*4 + 1);
            System.out.println("Categorias de empleados: " + categorias[i]); 
    }
        for(int i = 1; i < 50; i++){
            antiguedad[i] = (int)(Math.random()*32 + 1);
            System.out.println("Antiguedad: " + antiguedad[i]);
    }
System.out.println("-------------------------------");

while(e < 50){
    e++;
        System.out.print("Empleado: " + codigos[e] + " |  Antiguedad: " + antiguedad[e]);
        categorias[y] = (int)(Math.random()*4 + 1);
        System.out.println(" |  Categorias: " + categorias[y]);

}
}
}
/*
 * Random de codigo de todos los empleados, sus categorias y antiguedad. Empleados: 50
 * 
 * Categorias: Tecnico SR   Tecnico JN  Aministrativo  Staff general
 */







 