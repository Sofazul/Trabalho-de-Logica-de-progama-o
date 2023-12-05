/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VelocidadeMulta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a velocidade máxima permitida: ");
        int velocidadeMaxima = entrada.nextInt();
        
        System.out.println("Informe a velocidade do motorista: ");
        int velocidadeMotorista = entrada.nextInt();
        
        
        int velocidadeExcedida = velocidadeMotorista - velocidadeMaxima;
        if (velocidadeExcedida > 0) {
            int multa = velocidadeExcedida * 5;
            System.out.println("A multa será de R$" + multa + "00.");
        }else{
            System.out.println("Não há multa");  
           
        
        
        }  
    }
}
