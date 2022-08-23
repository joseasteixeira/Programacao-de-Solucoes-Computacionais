/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_18_08;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_17 {
    /*
    17.  Ler uma temperatura em graus Celsius e apresenta-la convertida em graus 
    Fahrenheit. A fórmula de conversão é: F = C∗ (9.0/5.0)+32.0, sendo F a 
    temperatura em Fahrenheit e C a temperatura em Celsius.
    */
    public static void main(String[] args){
        float temperaturaFahrenheit=0, temperaturaCelcius;
        temperaturaCelcius=Float.parseFloat(JOptionPane.showInputDialog("Informe a temperatura em Celcius:"));
        temperaturaFahrenheit=temperaturaCelcius*(9f/5)+32f;
        JOptionPane.showMessageDialog(null,"Atemperatura em Fahrenheit é: "+temperaturaFahrenheit);
    }
}
