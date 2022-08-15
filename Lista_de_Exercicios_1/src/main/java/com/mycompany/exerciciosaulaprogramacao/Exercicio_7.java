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
public class Exercicio_7 {
    /*
    7. Ler a idade de uma pessoaem anos, meses e dias e exibir a idade dessa
    pessoa expressa apenas em dias. Considerar ano com 365 dias e m~es com 30 dias.
    */
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String aux;
        System.out.println("Informe sua idade\n Anos: ");
        aux=in.readLine();
        Integer anos=Integer.valueOf(aux).intValue();
        System.out.println("Meses: ");
        aux=in.readLine();
        Integer meses=Integer.valueOf(aux).intValue();
        System.out.println("Dias: ");
        aux=in.readLine();
        Integer dias=Integer.valueOf(aux).intValue();
        
        System.out.println("Você tem "+(anos*365+meses*30+dias)+" dias de idade");
    }
}
