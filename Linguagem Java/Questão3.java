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
public class nomeIdades {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoas:");
        int tamanhoArray, maiorIdade, posicaoMaior;
        tamanhoArray = entrada.nextInt();
        String[] nomes = new String [tamanhoArray];
        int [] idades = new int [tamanhoArray];
        
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Dados da [%d] da pessoa \n", i+1);
            System.out.print("Nome:");
            nomes[i] = entrada.next();
            System.out.print("Idade:");
            idades[i] = entrada.nextInt();
        }
        maiorIdade = idades[0];
        posicaoMaior = 0;
        int cont = 0;
        
        for (int i = 0; i < tamanhoArray; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                cont+=1;
            
                
            }
        }
        System.out.printf("A pessoa mais velha é: "+nomes[cont]);
    }
}
