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
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.println("Informe a segunda nota: ");
        int nota2 = entrada.nextInt();
        
        float media = (nota1 + nota2)/2;
        if (media >= 70) {
            System.out.println("Aprovado: " +media);
        }else if (media >= 40) {
            System.out.println("Em exame final"+media);
            System.out.println("Infome a nota do exame: ");
            int notaFinal =  entrada.nextInt();
            float resul = notaFinal + media;
                if (resul >= 100) {
                System.out.println("Aprovado"+media);
            }else{
                System.out.println("Reprovado"+media); 
                
            }
          
            }else{
            System.out.println("Reprovado");
        }
        
        
        }
        
        
    }
