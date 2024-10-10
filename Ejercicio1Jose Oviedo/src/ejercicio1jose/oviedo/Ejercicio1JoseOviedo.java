/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1jose.oviedo;

import javax.swing.JOptionPane;

/**
 *
 * @author joviedo
 */
public class Ejercicio1JoseOviedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        
       double SEM = 9.25;
       double IVM = 5.08;
       double salarioEmpleadoDouble = 0;
       String SalarioEmpleado = "";
       String IngresarUsuario = "";
       double montoApagar = 0;
       
       
       
       IngresarUsuario = JOptionPane.showInputDialog("Ingrese el usuario");
       
       
       SalarioEmpleado = JOptionPane.showInputDialog("Ingrese el salario");
       salarioEmpleadoDouble = Double.parseDouble(SalarioEmpleado);
      
        
        montoApagar = (salarioEmpleadoDouble * SEM + salarioEmpleadoDouble * IVM);
        System.out.println("La empresa debera abaonar a ala CCSS el monto de " + montoApagar + " por concepto de SEM Y IVM ");
        
    
        
        
        
        
        
       
       
        System.out.println("Ingrese");
       
     
       
       
        
    }
    
}
