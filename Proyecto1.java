public class Proyecto1 {
    public static void main (String[] args){      
        int categorias;
        int y = 0;
        int e = 1;
        int antiguedad;
        int codigos[][] = new int[50][3];
        /*do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((trampaX == tesoroX) && (trampaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;*/

        for (int i = 0; i < codigos.length; i++){
            for (int j = 0; j < codigos[0].length; j++){
                if(j == 0){
                    codigos[i][j] = (int)(Math.random()*1000)+1;
                }else if(j == 1){
                    codigos[i][j] = (int)(Math.random()*5)+1;
                }else if(j == 2){
                    codigos[i][j] = (int)(Math.random()*50)+1;
                    
                }
                }
                }
                
 
                for(int j = 0; j < 3; j++){
                    for(int i = 0; i < 50; i++){
                        if(j == 0){ 
                        System.out.println("Empleados: " + codigos[i][j]);
                            if(i == 49){
                                System.out.println("---------------------------------");
                            }else{}
                        }else if(j == 1){
                            System.out.println("Catalogos: " + codigos[i][j]);
                            if(i == 49){
                                System.out.println("---------------------------------");
                            }else{}
                        }else if(j == 2){
                            System.out.println("Antiguedad: " + codigos[i][j]);
                        }
                    }
            }
    }
}
        
            
         /*codigos[i] = (int)(Math.random()*1001 + 1);
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


/*
 * Random de codigo de todos los empleados, sus categorias y antiguedad. Empleados: 50
 * 
 * Categorias: Tecnico SR   Tecnico JN  Aministrativo  Staff general
 */








