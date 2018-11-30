/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Alexis
 */
public class RTorre {
     public void RTorre() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Atributtos stdin = new Atributtos();
        System.out.println("================================================");
        System.out.println("               Numero de discos:                ");
        
        stdin.setN(Integer.parseInt(br.readLine()));
        System.out.println("================================================");
        Hanoi(stdin.getN(),1,2,3);  //1:origen  2:auxiliar 3:destino
    }
    
    
  public static void Hanoi(int nn, int origen,  int auxiliar, int destino){
  if(nn==1){
  System.out.println("mover disco de " + origen + " a " + destino);
  
  }else{
     Hanoi(nn-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(nn-1, auxiliar, origen, destino);
   }
 }
}
