/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_10 {
    /*
    10. Escrever um algoritimo que leia um valor inicial A e imprima a sequencia
    de valores do calculo de A! e o resultado. EX: 5!=5*4*3*2*1=120.
    */
    public static void main(String[] args){
        int valor, resultado=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        valor=scan.nextInt();
        System.out.print(valor+"! = ");
        do{
            if(valor==0){
                resultado=1;
                System.out.print("\b\b");
            }else;
            if(valor>0){
                resultado*=valor;
                System.out.print(valor+"*");
                valor--;
            }else;
        }while(valor>0);
        System.out.print("\b = "+resultado);
    }
}
