/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalista;

/**
 *
 * @author Agustin
 */
import java.util.ArrayList;
import java.util.List;

public class PruebaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<String>();
        
        lista.add("Path 1");
        lista.add("Path 2");
        lista.add("Path 3");
        
        
        int i;
        for (i=0; i< lista.size();i++){
            System.out.println(lista.get(i));
        
        }
    }
    
}
