/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_prof_cleyge;

import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio4 {
    /*
    4. Faça uma classe que simule a ocupação de quartos de um hotel. Considere 
    que existem cinco andares e dez quartos por andar. O objetivo é saber se um 
    quarto está ou não ocupado. A classe deve possuir um menu com as opções: 
    1-Imprimir lista de quartos, 2-Definir ocupação e 3-Sair. A opção 1 lista 
    todos os quartos, informando se estão ou não ocupados, a opção 2 permite 
    definir o status "ocupado" ou "livre" para qualquer um dos quartos. A opção 
    3 encerra o programa.
    */
    
    
    public static void main(String[] args){
        boolean[][] quartos={{true, false, false ,true, false, false, false, true, false, true},
                                    {true, false, false ,true, false, false, false, true, false, true},
                                    {true, false, false ,true, false, false, false, true, false, true},
                                    {true, false, false ,true, false, false, false, true, false, true},
                                    {true, false, false ,true, false, false, false, true, false, true}};
        int opcoes=0;
        Scanner scan=new Scanner(System.in);
        
        while(opcoes!=3){
            System.out.println("\nOpções:\n1-Imprimir lista de quartos\n2-Definir ocupação\n3-Sair");
            opcoes=scan.nextInt();
            if(opcoes==1){
                System.out.println("Quarto     |    1     |   2    |   3    |     4    |    5   |   6    |    7   |    8     |    9   |   10 ");
                for(int i=0;i<5;i++){
                    System.out.print("Andar "+i+" -> ");
                    for(int j=0;j<10;j++){
                        if(quartos[i][j]){
                            System.out.print("| Ocupado  ");
                        }else{
                            System.out.print("| Livre  ");
                        }
                    }
                    System.out.println();
                }
            }else;
            if(opcoes==2){
                int andar, quarto;
                String status;
                System.out.println("Informe o numero do andar: ");
                andar=scan.nextInt();
                System.out.println("Informe o numero do quarto: ");
                quarto=scan.nextInt();
                System.out.println("Informe o status do quarto: ");
                status=scan.next();
                switch(status){
                    case "Livre":quartos[andar][quarto-1]=false;
                    break;
                    case "livre":quartos[andar][quarto-1]=false;
                    break;
                    case "LIVRE":quartos[andar][quarto-1]=false;
                    break;
                    case "Ocupado":quartos[andar][quarto-1]=true;
                    break;
                    case "ocupado":quartos[andar][quarto-1]=true;
                    break;
                    case "OCUPADO":quartos[andar][quarto-1]=true;
                    break;
                    default: System.out.println("Opcao Invalida!");
                }
            }else;
            if(opcoes!=1&&opcoes!=2){
                System.out.print("Opção Invalida!");
            }else;
        }
        
    }
}

