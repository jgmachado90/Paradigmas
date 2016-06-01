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
public class Triangulo extends Forma{
    protected float b, h;
    protected int tipo;
    public Triangulo(int tipo,Ponto p, float b, float h){
        pontos = new Ponto[3];
        pontos[0] = p;
        this.b = b;
        this.h = h;
        this.tipo = tipo;
        
    }
            
    @Override
    public float getArea() {
        float area = (float)(b*h)/2;
        return area;
    }
    
    public Ponto getPonto(){
        return pontos[0];
    }
    
     public int getTipo(){
        return tipo;
    }
    
}
