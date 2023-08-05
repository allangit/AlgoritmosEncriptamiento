
package com.mycompany.proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
       
        
        AlgortimoCesar cesar=new AlgortimoCesar();
        String letras="abcdefghijklmnñopqrstuvwxyz";
        String frase;
        Scanner entrada=new Scanner(System.in);
        entrada.useDelimiter("\n");
        System.out.println("Ingrese el texto::");
        frase=entrada.next();
        
        System.out.println("Mensaje cifrado:::"+cesar.codificar(letras, frase));
        
        
    }
}
