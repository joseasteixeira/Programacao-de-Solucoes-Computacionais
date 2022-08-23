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
public class Exercicio_13 {
    /*
    13.  A nota final de um estudante é calculada a partir de três notas 
    atribuídas respectivamente a um trabalho de laboratório, à avaliação 
    semestral e a um exame final. A média das três notas mencionadas 
    anteriormente obedece aos pesos a seguir:
        NOTA PESO
        Trabalho de laboratório 2
        Avaliação semestral 3
        Exame final 5
    */
    public static void main(String[] args){
        float notaTrabalhoLaboratorio, notaAvaliacaoSemestral, notaExameFinal, media=0;
        notaTrabalhoLaboratorio=Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do trabalho de laboratorio:"));
        notaAvaliacaoSemestral=Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da avaliação semestral:"));
        notaExameFinal=Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do exame final:"));
        media=notaTrabalhoLaboratorio*0.2f+notaAvaliacaoSemestral*0.3f+notaExameFinal*0.5f;
        JOptionPane.showMessageDialog(null,"Nota final: "+media);
    }
}
