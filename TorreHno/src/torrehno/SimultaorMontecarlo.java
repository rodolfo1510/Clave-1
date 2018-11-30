/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehno;

import static com.sun.javafx.fxml.expression.Expression.modulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alexis
 */
public class SimultaorMontecarlo {
    
       public void MonteCarlos() throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       Atributtos stdin = new Atributtos();  
        System.out.println("================================================");
        System.out.print("Escriba una semilla o valor inicial: ");
           stdin.setSemilla(Integer.parseInt(br.readLine()));
        System.out.println("================================================");
        System.out.print("Escriba una constante multiplicativa: ");
           stdin.setCmultiplicativa(Integer.parseInt(br.readLine()));
        System.out.println("================================================");
        System.out.print("Escriba el módulo o el numero de repeticiiones: ");
           stdin.setModulo(Integer.parseInt(br.readLine()));
        System.out.println("================================================");

for (stdin.i=1; stdin.i<=20; stdin.i++){
     stdin.numero = (stdin.getCmultiplicativa()*stdin.getSemilla()) % stdin.getModulo();   
     stdin.numero2 = (int) ((double)stdin.numero / (double)(stdin.getModulo()-1));
     System.out.printf("%d. %d (%.4f)\n", stdin.i ,stdin.numero ,stdin.numero2 ); 
     stdin.semilla = stdin.numero; 
}
    }
    
}
