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
public class Ponto {
   private float x, y;
  
   
   public Ponto (){
        x = 0;
        y = 0;
   }
   
   
   public Ponto (float x, float y){
        this.x = x;
        this.y = y;
   } 
  
   public void setpoint(float a, float b){
        x = a;
        y = b;
   }
   
   public void movepoint(float dx, float dy){
        x = x+dx;
        y = y+dy;
   }
   
   public void showpoint(){
       System.out.println("x = " + x + "\ny = " + y);
   }
   
   public float getx(){
       return x;
   }
   public float gety(){
       return y;
   }
   
}
    