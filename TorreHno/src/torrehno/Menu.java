/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


/**
 *
 * @author Alexis
 */
public class Menu {
    
    //public static void main(String[] args) throws IOException {
        // TODO code application logic here
        public void Menu01() throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean salir = false;
            int opcion = 0;
        while(!salir){
            do{
            System.out.println("================================================");
            System.out.println("===               BIENVENIDO                 ===");
            System.out.println("================================================");
            System.out.println("===      1. Resolver Torre de Hanoid         ===");
            System.out.println("===      2. Simular montecar                 ===");
            System.out.println("===      3. Simular Torre                    ===");
            System.out.println("===      4. Salir                            ===");
            System.out.println("================================================");
            
            try {
                System.out.println("===        Ingresa una opcion                ===");
                opcion=Integer.parseInt(br.readLine());
                System.out.println("================================================");
                 switch(opcion){
                case 1:
                RTorre tor = new RTorre();
                tor.RTorre();
                    break;
                case 2:
                SimultaorMontecarlo MonteC =  new SimultaorMontecarlo();
                MonteC.MonteCarlos();
                    break;
                case 3:
                SimularTorre simul = new SimularTorre();
                simul.SimularTorre();
                    break;
                case 4:
                    salir=true;
                    break;          
                default:
                    System.out.println("================================================");
                    System.out.println("===         Elige una opcion correcta        ===");
                    System.out.println("================================================");
                    
                    System.out.println("Presione Enter para continuar......>");
                    br.readLine();
                    Atributtos atri = new Atributtos();
                    atri.limpiarPantalla();
            }
            } catch (Exception ex) {
                System.out.println("================================================");
                System.out.println("Debes insertar un numero");
                br.readLine();
                System.out.println("================================================");
            }
        }while(opcion<=0 || opcion>4);
        }
        }
}
          