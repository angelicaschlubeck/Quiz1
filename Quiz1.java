/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Monto total que se debe pagar de la caja.
        
       double salario;
       double salSEM;
       double salIVM;
       double salTotal;
       salario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario base:"));
       
       salSEM= salario * 0.0925;
       salIVM= salario * 0.0508;
       salTotal= salSEM + salIVM;
       
       JOptionPane.showMessageDialog(null,"La empresa debera abonar a la CCSS el monto de" + salTotal + "por el concepto de SEM y IVM");
    }
    
}
