/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_18_08;

import javax.swing.JOptionPane;
//import java.math.*;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio8 {
    /*
    8.  Fazer um programa que calcula e mostra a área de um círculo, 
    sabendo que: área = pi * r^2.
    */
    public static void main(String[] args){
        double r, area=0;
        r=Double.parseDouble(JOptionPane.showInputDialog("Informe o raio do circulo:"));
        area=Math.PI*Math.pow(r,2);
        JOptionPane.showMessageDialog(null,"A area do circulo è: "+area);
    }
}
