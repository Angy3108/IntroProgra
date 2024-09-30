/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val1="";
        String val2="";
        String val3="";
        String val4="";
        int num=0;
        int num2=0;
        int num3=0;
        int num4=0;
        val1=JOptionPane.showInputDialog("Ingrese un número");
        val2=JOptionPane.showInputDialog("Ingrese un número");
        val3=JOptionPane.showInputDialog("Ingrese un número");
        val4=JOptionPane.showInputDialog("Ingrese un número");
        num=Integer.parseInt(val1);
        num2=Integer.parseInt(val2);
        num3=Integer.parseInt(val3);
        num4=Integer.parseInt(val4);
        if (num>num2 && num>num3 && num>num4){
            JOptionPane.showMessageDialog(null, "Entre "+num+" "+num2+" "+num3+" "+num4+" El mayor es: "+num);
        }else if (num2>num3 && num2>num4){
            JOptionPane.showMessageDialog(null, "Entre "+num+" "+num2+" "+num3+" "+num4+" El mayor es: "+num2);
        } else if (num3>num4 && num3>num){
            JOptionPane.showMessageDialog(null, "Entre "+num+" "+num2+" "+num3+" "+num4+" El mayor es: "+num3);
        } else {
            JOptionPane.showMessageDialog(null, "Entre "+num+" "+num2+" "+num3+" "+num4+" El mayor es: "+num4);
            
        }
    }
    
}
