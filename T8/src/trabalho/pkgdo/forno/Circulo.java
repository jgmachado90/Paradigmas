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
public class Circulo extends Forma{
    protected int tipo;
    protected float raio;
    
    public Circulo(int tipo,Ponto p, float raio){
        pontos = new Ponto[1];
        p.movepoint(raio, raio);
        pontos[0] = p;
        this.raio = raio;
        this.tipo = tipo;
    }
    
    @Override
    public float getArea(){
        float area = (3.14f * (raio * raio));
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
