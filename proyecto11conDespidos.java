public class proyecto11{
    public static void main(String[] args){
        int codigos[][] = new int[50][3];
        
        for(int j = 0; j < 3; j++){                                 //Cambia las columnas a completar luego de un giro.
            for(int i = 0; i < 50; i++){                            //Completa las columnas de forma completamente vertical
                if(j == 0){                                         //Si la colunma es "0", entonces se completara dicha columna
                    codigos[i][0] = (int)(Math.random()*50)+1;
                        for(int n = 0; n < i; n++){
                            if(codigos[i][0] == codigos[n][0]){
                                codigos[i][0] = codigos[i][0] + 1000;
                            }
                            }
                        
                    
                }else if(j == 1){                                   //Si la colunma es "1", entonces se completara dicha columna
                    codigos[i][j] = (int)(Math.random()*5)+1;
                }else if(j == 2){                                   //Si la colunma es "2", entonces se completara dicha columna
                    codigos[i][j] = (int)(Math.random()*50)+1;
                }
            }
        }
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 50; i++){
                if(j == 0){ 
                System.out.println("Empleados: " + codigos[i][j]); //Se digitaran todos los códigos.
                    if(i == 49){
                        System.out.println("---------------------------------");
                    }else{}
                }else if(j == 1){
                    System.out.println("Catalogos: " + codigos[i][j]); //Se digitaran todos los catalogos de cada uno de los empleados.
                    if(i == 49){
                        System.out.println("---------------------------------");
                    }else{}
                }else if(j == 2){
                    System.out.println("Antiguedad: " + codigos[i][j]);     //Se digitara la antiguedad de los empleados en la empresa.
                }
       }
}

//Despidos.


//boolean salida = false;
//System.out.println("Quiere salir de este programa? ");
//System.out.println("Si: 1      No:2");



    System.out.print("Ingrese cuantos empleados quiere despedir: ");    
    int n = Integer.parseInt(System.console().readLine());
        if((n<50) && (n>0)){

        
    
    for(int y = 0; y<n; y++){   //El programa repetira la acción dependiento de los digitado por el usuario (Siempre que esten dentro de los limites).
    System.out.print("Digite a que empleado/s quiere despedir mediante su código: ");
    int d = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < 50; i++){ //Recorrera todos los arrays de los códigos
           if(codigos[i][0] == d){ //Si el código existe se ejecutará el despido
            System.out.println("Empleado despedido: " + codigos[i][0]);
                codigos[i][0] = 0; //El código cambia a valor 0 (despedido/vacante disponible).
                i = 50; //Cuando el código se encuentra se reinicializa el programa para colocar otro código.
           }else if(codigos[i][0] != d){    
                if(i == 49){
                    System.out.println("El código digitado no existe.");
                }
                 if(codigos[i][0] == 0){ //Si el valor es 0 (despedido/vacante disponible) se le informará.
                     i = 50;
                     System.out.println("El empleado ya fue despedido.");
           }
           }

        }
        
    }

}else if(n>50){
    System.out.println("Se ha sobrepasado el límite.");
}else{System.out.println("Resultado indefinido");}

}


}










/*public class proyecto11{
    public static void main(String[] args){
        int codigos[][] = new int[5][3];

    int numeros = 0;
        for(int j = 0; j < 3; j++){                                 //Cambia las columnas a completar luego de un giro.
            for(int i = 0; i < 5; i++){                            //Completa las columnas de forma completamente vertical
                if(j == 0){                                         //Si la colunma es "0", entonces se completara dicha columna
                    codigos[i][j] = (int)(Math.random()*50)+1;
                        for(int o = 0; o < 5; o++){
                            if(codigos[o][0] == codigos[i][0]){
                                codigos[i][0] = (int)(Math.random()*50)+1;
                                
                                    
                            }else{}
                        }
                }else if(j == 1){                                   //Si la colunma es "1", entonces se completara dicha columna
                    codigos[i][j] = (int)(Math.random()*5)+1;
                }else if(j == 2){                                   //Si la colunma es "2", entonces se completara dicha columna
                    codigos[i][j] = (int)(Math.random()*50)+1;
                }
            }
        }
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 5; i++){
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







 */


