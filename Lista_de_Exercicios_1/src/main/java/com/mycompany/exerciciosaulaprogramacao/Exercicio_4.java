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
public class Exercicio_4 {
    /*
    4. Ler um valor inteiro e retornar seu antecessor.
    */
    public static void main(String[] args){
        Integer valor=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: ", "Digite aqui"));
        JOptionPane.showMessageDialog(null, "O antecessor é: "+(valor-1));
    }
}
