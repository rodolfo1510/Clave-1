/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehno;

import java.awt.Robot;

/**
 *
 * @author Alexis
 */
public class Atributtos {   

    //DELARACION DE VARIABLES DE RTORRE
    int n;
    //DECLARACION DE VARIABLES DE SimultaorMontecarlo
    int semilla;
    int cmultiplicativa;
    int caditiva;
    int modulo;
    int i, numero;  
    double numero2; 
    
    public Atributtos(){
        
    }
    public  Atributtos(int semilla, int cmultiplicativa, int caditiva, int modulo){
            this.semilla=semilla;
            this.cmultiplicativa=cmultiplicativa;
            this.caditiva=caditiva;
            this.modulo=modulo;
        }
    public int getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public int getCmultiplicativa() {
        return cmultiplicativa;
    }

    public void setCmultiplicativa(int cmultiplicativa) {
        this.cmultiplicativa = cmultiplicativa;
    }

    public int getCaditiva() {
        return caditiva;
    }

    public void setCaditiva(int caditiva) {
        this.caditiva = caditiva;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void limpiarPantalla() {

        try {

            Robot robbie = new Robot();

            robbie.keyPress(17);

            robbie.keyPress(76);

            robbie.keyRelease(17);

            robbie.keyRelease(76);



            Thread.sleep(100);
            
            // esto es para jcreator

            robbie.keyPress(17);

            robbie.keyPress(16);

            robbie.keyPress(82);

            robbie.keyRelease(17);

            robbie.keyRelease(16);

            robbie.keyRelease(82);

            Thread.sleep(100);

        } catch (Exception ex) {

        }
    }
}
