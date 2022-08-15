/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import javax.swing.*;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_8 {
    /*
    8. Ler o número total de eleitores de um município, o número de votos 
    brancos, nulos e válidos. Calcular e escrever o percentual que cada um 
    representa em relação ao total de eleitores.
    */
    public static void main(String[] args){
        Integer eleitores=Integer.parseInt(JOptionPane.showInputDialog("Iforme a quantidade de eleitores: "));
        Integer brancos=Integer.parseInt(JOptionPane.showInputDialog("Iforme a quantidade de votos brancos: "));
        Integer nulos=Integer.parseInt(JOptionPane.showInputDialog("Iforme a quantidade de votos nulos: "));
        Integer validos=Integer.parseInt(JOptionPane.showInputDialog("Iforme a quantidade de votos validos: "));
        JOptionPane.showMessageDialog(null,((float)brancos/eleitores*100)+"% dos votos foram brancos\n"
                                            +((float)nulos/eleitores*100)+"% dos votos foram nulos\n"
                                            +((float)validos/eleitores*100)+"% dos votos foram validos");
    }
}
