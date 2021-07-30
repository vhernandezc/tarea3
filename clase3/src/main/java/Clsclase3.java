
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vh367
 */
public class Clsclase3 {
    private static String [][]comisiones = new String[3][4];
    
    private static final  int Nombre = 0;
    private static final  int Enero = 1;
    private static final  int Febrero = 2;
    private static final  int Marzo = 3;
    
    //private static final  int Total= 4;
    //private static final  int Promedio= 5;
    
    public static int colu;
    public static void cargaInformacion(int fila ){
    Scanner r = new Scanner(System.in);
    
    System.out.println("ingrese Nombre:"+(fila+1));
     colu=r.nextInt();
    
    System.out.println("ingrese Enero :");
     colu = r.nextInt();
    
    System.out.println("ingrese Febrero:");
     colu = r.nextInt();
    
    System.out.println("ingrese Marzo:");
     colu = r.nextInt();
     
    }
    
    
     
    public void Suma_columna()
    {
       
        
}

 
   
 
     public static void imprimirDecorado(String[][] ma){
       for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                if (y != ma[x].length ) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   }
    public static void ingreso_datos(){
        for (int i =0; i < 3; i++){
    cargaInformacion(i);
    }
    }
  
    public static void menu()
    {
        
     Scanner obj=new Scanner(System.in);
     int menugen;
     String a;
        System.out.println("que opcion deseas ?" );
        System.out.println("1. ingresar datos \t2.total de un mes\t3.datos mayores y menores\n4.totales de filas\t5.buscar datos");
        menugen=obj.nextInt();
        
        switch(menugen){
            case 1:  
            ingreso_datos();
            imprimirDecorado(comisiones);
          
           
            break;
            case 2: System.out.println("1.total de enero\t2.total de febrero\ttotal de marzo");
           
            int menu2;
            menu2=obj.nextInt();
             switch(menu2){
                 case 1:
                 ;break;
                 case 2:a="total de febrero";break;
                 case 3:a="total de marzo";break;
             }break;
             
            case 3: a ="datos mayores y menores";
          
        }
        }
    
  
    
    public static void main(String[] args) {
        
       /* ingreso_datos();
        imprimirDecorado(comisiones);*/
        
       
       menu();
        
    }
    
    
}
