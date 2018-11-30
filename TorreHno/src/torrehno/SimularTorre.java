/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehno;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class SimularTorre {
     public void SimularTorre(){
     Scanner sc = new Scanner(System.in);
        Atributtos stdin = new Atributtos();
        System.out.println("Numero de discos: ");
        stdin.setN(sc.nextInt());
         System.out.println("Torre INICIAL!");
        drawtorre(stdin.getN(),1,0,0);//numero de anillos, fila inicial,anillos en la fila 2, anillos en la fila 3
        
        f3=0;f2=0;tam=stdin.getN();
        Hanoi(stdin.getN(),1,2,3);  //1:origen  2:auxiliar 3:destino
    }
  public static int f3;//representa los discos en la fila 3 que se acumulan
  public static int f2;//representan los discos en la fila 2 que se acumulan
  public static int tam;//representa el numero total de discos de la torre
  
  public static void Hanoi(int nn, int origen,  int auxiliar, int destino){
     
      
  if(nn==1){
  System.out.println("mover disco de " + origen + " a " + destino);
  if(destino==3){//se se movera un disco a la torre 3
      f3++;//aumenta el numero de anillos que tendra esa torre
  }else if(destino ==2){
      f2++;//si es a la torre 2 entonces aumentan los de la torre 2
  }
  if(origen==2){
    f2--;//en cambio si se mueven desde la torre 2 se quitaran de aqui
  }else if(origen==3){
    f3--;//lo mismo si se quitan de la torre 1
  }
  drawtorre(tam,1,f2,f3);//se dubuja la torre con sus respectivos anillos en cada fila
  }else{
     Hanoi(nn-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     
     if(destino==3){
      f3++; //lo mismo de arriba
     }else if(destino ==2){
      f2++;
     }
     if(origen==2){
         f2--;
     }else if(origen==3){
         f3--;
     }
     
     drawtorre(tam,1,f2,f3);//se dibujan los anillos en cada fila
     Hanoi(nn-1, auxiliar, origen, destino);
   }
 }
 
  public static void drawtorre(int nn,int lugar,int n2,int n3){
      String top =   "       ++        ++       ++";//string que representa la punta de la torre
      String base =  "       ++        ++       ++";//representa la base de la torre
      String vacio = "       ||        ||       ||";//representa zonas en dodne no hay anillos
      String[] discos = {
          "      xxxx      ","     xxxxxx     ","    xxxxxxxx    ","   xxxxxxxxxx   ","  xxxxxxxxxxxx  "," xxxxxxxxxxxxxx","xxxxxxxxxxxxxxxx"
      };//representa el icono por decirlo asi de cada anillo dependiendo de su peso
      String part = " ||";//representa un divisor entre torres
      String space = "      ";//representa un espacio entre torres
     
      int comp=nn; //se usa para ir comparando los anillos restantes
      int acm = 0;//se usa para comparar que vaya un anillo menor encima de uno mas grande
      int nt2=n2,nt3=n3;//se usa para comparar el numero de anillos restantes en las otras torres
      
      if(nt2==nn){
          nt2=0;
          lugar=2;
      }else if(nt3==nn){//se usa en el caso que todos los anillos esten en una torre
          nt3=0;
          lugar=3;
      }
      System.out.println(" ");//se usa para que no quede la torre pegada al texto anterior
      for(int i=9;i>0;i--){//se recorre desde 9 disminuyendo hasta 1 porque se imprime primero desde arriba
          if(i==9){
              System.out.println(top);//si esta en la punta se imprime la punta
          }else if(comp==i){//si el numero de anillos coincide con la posicion en la que estamos
              
                  for(int j=i;comp>acm;j--){//se iterara aparte el numero de anillos que existen
                  if(nt2>0 || nt3 >0){//si hay alguno en una torre que no sea la original entonces se agregaran en su lugar respectivo
                      if(nt3>0){
                          System.out.println(space+part+space+" "+part+discos[acm]);//agrega el disco actual en la fila 3
                          nt3--;//resta el numero de anillos restantes por poner en la fila 3
                      }else if(nt2>0){
                          System.out.println(space+part+" "+discos[acm]+"||");//agrega el disco actual en la fila 2
                          nt2--;//resta el numero de anillos restantes por poner en la fila 2
                      }
                  }else{//si no hay anillos en las otras torres entonces dibujara la torre dependiendo de en que fila se dijo que se pondria
                      
                      if(lugar==1){
                        System.out.println(discos[acm]+part+space+part);
                    }else if(lugar==2){
                        System.out.println(space+part+" "+discos[acm]+"||");
                    }else if(lugar==3){
                        System.out.println(space+part+space+" "+part+discos[acm]);
                    }
                  }
                    
                    acm++;//aumentara el peso del sigiente disco porque van de menor a mayor (uno pequeño sobre uno grande)
                    i=j;       //y va disminuyendo el nivel de la torre en general
                  }
              
              
          }else if(i!=1){//si no hemos llegado ni al disco ni al tope ni a la base entonces es una zona vacia
              System.out.println(vacio);//imprimimos una zona vacia
          }
          if(i==1){//si estamos en la base imprimimos la base
              System.out.println(base);
          }
      }
    }
  
}
