package Funciones;
public class Proyecto1 {
    public static void main (String[] args){
        int empleados;        
        int categorias;
        int codigos;
        int y = 0;
        int e = 1;
        int[] antiguedad = new int[50];
        int matrix[][] = new int[50][3];

        for (int i = 0; i < 50; i++){
            for (int j = 0; j < 3; j++){
                if (j == 0){
                    matrix[i][j] = (int)Math.random()*1000 + 1;
                    System.out.println(matrix[i][j]);
                } else if (j == 1){
                    matrix[i][j] = (int)Math.random()*5 + 1;
                } else {
                    matrix[i][j] = (int)Math.random()*50;
                }
            
                }
            
                /*switch (matrix[i][j]){
                    case 1:
                        for (j = 1; j < 5; j ++){
                            System.out.println(matrix[i][j]);
                        }
                        break;
                    case 2:
                        for (j = 2; j < 50; j ++){
                            System.out.println(matrix[i][j]);

                        }
                        break;
                    
                }
                    }
                }
                
            }
        
            
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
*/
}
    }
}

/*
 * Random de codigo de todos los empleados, sus categorias y antiguedad. Empleados: 50
 * 
 * Categorias: Tecnico SR   Tecnico JN  Aministrativo  Staff general
 */







 