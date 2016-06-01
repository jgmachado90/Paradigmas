/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkgdo.forno;

import java.util.Random;

/**
 *
 * @author joao
 */
public class Bolacha{
    Forma f;
    int tipo;
    protected final int REDONDA = 0,
                        RETANGULAR = 1,
                        TRIANGULAR = 2;
    
    public Bolacha(Ponto p){
        Random r = new Random();
        tipo = r.nextInt(3);
         System.out.format(" %d ", tipo);
        if (tipo == REDONDA){
            Circulo c = new Circulo(p, (r.nextInt()%5) + 5);
            f = (Forma) c;
        }
        if(tipo == RETANGULAR){
            Retangulo rt = new Retangulo(p, ((r.nextInt()%5)+5) , ((r.nextInt()%5)+5)); 
            f = (Forma) rt;
        }
        if(tipo == TRIANGULAR){
            Triangulo t = new Triangulo(p, ((r.nextInt()%5)+5) , ((r.nextInt()%5)+5) );
            f = (Forma) t;
        }
    }
    
    public float getarea(){
        return f.getArea();
    }
    
    public int getTipo(){
        return tipo;
    }
    
}