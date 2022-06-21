public class proyecto11{
    public static void main(String[] args){
        int codigos[][] = new int[50][3];
        
        for(int j = 0; j < 3; j++){                                 //Cambia las columnas a completar luego de un giro.
            for(int i = 0; i < 50; i++){                            //Completa las columnas de forma completamente vertical
                if(j == 0){                                         //Si la colunma es "0", entonces se completara dicha columna
                    codigos[i][0] = (int)(Math.random()*1000)+1;
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


System.out.println("--------------------------------------------");  
    System.out.println("Ingrese cuantos empleados quiere despedir: ");
        
    int n = Integer.parseInt(System.console().readLine());
System.out.println("--------------------------------------------");  
        if((n<50) && (n>0)){

        
    
    for(int y = 0; y<n; y++){   //  <El programa repetira la acción dependiento de lo digitado por el usuario (Siempre que esten dentro de los limites).
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
           }

        }
        
    }

}else if(n>50){
    System.out.println("Se ha sobrepasado el límite.");
}else if(n<=0){
    System.out.println("Resultado indefinido");
}



// Reclutamiento
System.out.println("--------------------------------------------");   
   System.out.print("Ingrese cuantos empleados quiere contratar: ");    
   int m = Integer.parseInt(System.console().readLine());
System.out.println("--------------------------------------------");  
       if((m<50) && (m>0)){

           for(int u = 0; u<m; u++){   //El programa repetira la acción dependiento de los digitado por el usuario (Siempre que esten dentro de los limites).
               System.out.print("Digite código de nuevo empleado: ");
               int r = Integer.parseInt(System.console().readLine());

               for(int i = 0; i < 50; i++){ 
                   if(codigos[i][0] == 0){
                        for(int j = 0; j < 50; j++){ 
                            if(codigos[j][0] != r){  
                                if(j == 49){
                                System.out.println("Empleado reclutado: " + r);
                                    codigos[i][0] = r; 
                                    i = 50; ///Cuando el código se encuentra se reinicializa el programa para colocar otro código.
                                }else{}
                            }else if(codigos[j][0] == r){
                                System.out.println("El código " + r + " ya está elegido.");
                                j = 50;
                                i = 50;
                             }
                        }
                    }else if(codigos[i][0] != 0){    
                        if(i == 49){
                            System.out.println("Sin vacantes");
                        }        
                        
                        }
           
                }
                   
            }
           
           }else if(m>50){
               System.out.println("Se ha sobrepasado el límite.");
           }else if(m<=0){
            System.out.println("Resultado indefinido");
   }
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


