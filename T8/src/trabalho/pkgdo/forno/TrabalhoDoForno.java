/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkgdo.forno;

import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class TrabalhoDoForno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto t = new Ponto();
        int tipo = 0;
        float maior=0;
        
        ArrayList<Bolacha> b = new ArrayList<>();
        for(int i=0;i<5;i++){
            for (int j=0; j<10; j++){
               Ponto p = new Ponto(i*10, j*10);
               b.add(new Bolacha(p));
            }
        }
        
        for(int i=0;i<50;i++)
            System.out.println("tipo: " + b.get(i).getTipo() + " area: " + b.get(i).getarea());   
     
        for(int i=0;i<50;i++){
            if(b.get(i).getarea() > maior){
                maior = b.get(i).getarea();
                t = b.get(i).f.getPonto();
                tipo = b.get(i).f.getTipo();
            }
        }
        
        
        System.out.println("\n\nA area da maior bolacha e: = " + maior);
        System.out.println("\n A posicao do ponto e: ");
        t.showpoint();
       
        System.out.println("\nO formato da bolacha e: ");
      
        if(tipo == 0){
            System.out.println("Circular");
        }
        if(tipo == 1){
            System.out.println("Retangular");
        }
        if(tipo == 2){
            System.out.println("Triangular");
        }
    }
        
}
