/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkgdo.forno;

/**
 *
 * @author joao
 */
public class Retangulo extends Forma{
    protected int w, h, tipo;
    
    
    public Retangulo(int tipo, Ponto p, int w, int h){
        pontos = new Ponto[4];
        pontos[0] = p;
        this.w = w;
        this.h = h;
        this.tipo = tipo;
        
    }
    
    @Override
    public float getArea() {
        int area = w*h; 
        return area;
    }
    
    @Override
    public Ponto getPonto(){
        return pontos[0];
    }
    
    public int getTipo(){
        return tipo;
    }
    
}
