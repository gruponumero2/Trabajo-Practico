public class Proyecto11ConCondicion{
    public static void main(String[] args){
        int codigos[][] = new int[50][3];

    int numeros = 0;
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 50; i++){
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
                } if (codigos[i][j] == codigos[i][j]) {
                    codigos[i][j] = (int)(Math.random()*1000)+1;
                }
            } 
    }
        
}

}





