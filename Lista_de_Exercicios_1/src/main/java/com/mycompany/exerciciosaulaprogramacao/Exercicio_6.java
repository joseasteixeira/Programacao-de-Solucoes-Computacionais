/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_6 {
    /*
    6. Ler a idade de uma pessoa expressa em anos e exibir expressa em dias
    (considere que um ano tem 365 dias).
    */
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String aux;
        
        System.out.println("Digite sua idade: ");
        aux=in.readLine();
        Integer idade=Integer.valueOf(aux).intValue();
        System.out.printf("Você tem %d dias de idade",(idade*365));
    }
}
