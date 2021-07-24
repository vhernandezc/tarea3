/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author vh367
 */
public class clase22 {
    public static Scanner teclado=new Scanner (System.in);
    public static void ejemplo1(){
        String edadstr="20";
     int edad=Integer.parseInt(edadstr);
        System.out.println("edad = " + edad);
        
        
        
        char e ="hola".charAt(3);
        System.out.println("e = " + e);
        
        
        
          System.out.println("dime tu edad");
        edad=Integer.parseInt(teclado.nextLine());
        System.out.println("edad = " + edad);
        
      
         System.out.println("dime tu edad en letras");
         char letra=teclado.nextLine().charAt(1);
         System.out.println("edad = " + letra);
         
         
         String texto=String.valueOf(1234);
         
         short a=129;
         byte b=(byte)a;
         
                 
    }
  
    public static void area(){
        
        double radio;
        double area;
        
        System.out.println("ingrese el radio");
        radio=teclado.nextDouble();
       // radio=Double.parseDouble(teclado.nextLine());
       area=Math.PI*Math.pow(radio, radio);
        System.out.println("area = " + area);
    }
        public static void codigoA()
        {
            String texto;
            int codigo=0;
            System.out.println("ingresa un numero");
            texto=teclado.nextLine();
            codigo=Integer.parseInt(texto);
            char caracter=(char)codigo;
            System.out.println("caracter = " + caracter);
            
            Scanner sc = new Scanner(System.in);
		int primer = 'a';
		int ultimo = 'l';
 
		System.out.print("Introduce el caracter: ");
		char letra = sc.next().charAt(0);
		System.out.print("El caracter complementario es: ");
		int resultado = ultimo-letra;
		System.out.println((char)(primer+resultado));
          
        }
    public static void letra(){
        String palabra="palabra";
        String AScii ="";
        
        for (int x=0;x<palabra.length();x++){
            System.out.println("letra = " + palabra.charAt(x)+"codigo="+(int)palabra.charAt(x));
        }
        
    }
    public static void main(String[] args) {
       // ejemplo1();
        //area();
          codigoA();
          letra();
         
        
                
    }
    
    
}
