/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dener
 */
public class ATV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc, n1, n2;
        
        Calculadora calc = new Calculadora();
        
        do{             
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Calculadora \n Created by Dener \n\n Escolha uma opção: \n\n 1- Soma \n 2- Subtração \n 3- Mutiplicação \n 4- Divisão \n 5- Potenciação \n\n 0- Sair \n\n", "Calculadora", 1));
            
        switch(opc){
            case 1:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Soma \n Digite o Primeiro Número: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Soma \n Digite o Segundo Número: "));
                JOptionPane.showMessageDialog(null, "Resultado da soma: " + calc.Somar(n1, n2));break;
            case 2:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Subtração \n Digite o Primeiro Número: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Subtração \n Digite o Segundo Número: "));
                JOptionPane.showMessageDialog(null, "Resultado da subtração: " + calc.Sub(n1, n2));break;              
            case 3:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Multiplicação \n Digite o Primeiro Número: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Multiplicação \n Digite o Segundo Número: "));
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + calc.Mult(n1, n2));break;                
            case 4:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Divisão\n Digite o Primeiro Número: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Divisão \n Digite o Segundo Número: "));
                JOptionPane.showMessageDialog(null, "Resultado da divisão: " + calc.Div(n1, n2));break;                
            case 5:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Potenciação \n Digite um Número: "));                
                JOptionPane.showMessageDialog(null, "Resultado da potenciação: " + calc.Quad(n1));break;
                
            default:
                System.out.println("Opção Inválida");break;
        }
    }while(opc != 0);   
    
}
}
