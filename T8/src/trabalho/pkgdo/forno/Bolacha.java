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
        // System.out.format(" %d ", tipo);
        if (tipo == REDONDA){
            Circulo c = new Circulo(tipo, p, (r.nextInt(4)) + 1);
            f = (Forma) c;
        }
        if(tipo == RETANGULAR){
            Retangulo rt = new Retangulo(tipo, p, ((r.nextInt(9))+1) , ((r.nextInt(9))+1)); 
            f = (Forma) rt;
        }
        if(tipo == TRIANGULAR){
            Triangulo t = new Triangulo(tipo, p, ((r.nextInt(9))+1) , ((r.nextInt(9))+1) );
            f = (Forma) t;
        }
    }
    
    public float getarea(){
        return f.getArea();
    }
    
    public Ponto getPonto(){
        return f.getPonto();
    }
    
    public int getTipo(){
        return f.getTipo();
    }
    
}