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
    float b, h;
    public Triangulo(Ponto p, float b, float h){
        pontos = new Ponto[3];
        pontos[0] = p;
        this.b = b;
        this.h = h;
        
    }
            
    @Override
    public float getArea() {
        float area = (float)(b*h)/2;
        return area;
    }
    
    public Ponto getPonto(){
        return pontos[0];
    }
    
}
