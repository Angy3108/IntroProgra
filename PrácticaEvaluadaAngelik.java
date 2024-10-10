/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class PrácticaEvaluadaAngelik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables 
        int emp = 0;
        double salary = 0;
        double total = 0;
        int i = 0;
        //cantidad de empleados
        emp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));

        //ciclo para preguntar los salarios
        while (i < emp) {
            salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario individual del empleado: "));
            total = ((salary * 0.0925) + (salary * 0.0508)) + total;
            i++;
        }
        //Resultados
        System.out.println("La empresa deberá abonar a la CCSS el monto de: " + total + " por concepto de SEM y IVM");

    }

}
