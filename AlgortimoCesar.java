
package com.mycompany.proyecto;


class AlgortimoCesar {
    
    
    public String codificar(String letras, String texto){
        
        
        String textocodificado="";
        texto=texto.toLowerCase();
        char caracter;
        
        int clave=3;
        
        for (int i = 0; i < texto.length(); i++) {
            
            caracter=texto.charAt(i);
            int posicion=letras.indexOf(caracter);
            
            if(posicion ==-1) {
                
                textocodificado+=caracter;
            }else{
                
                
                posicion=(posicion+clave)%(letras.length());
                textocodificado+=letras.charAt(posicion);
                
            }

        }
         
        return textocodificado;
        
    }
    
}
