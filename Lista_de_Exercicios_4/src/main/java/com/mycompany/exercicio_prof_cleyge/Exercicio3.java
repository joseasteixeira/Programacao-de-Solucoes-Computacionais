/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_prof_cleyge;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio3 {
    /*
    3. Faça uma classe contendo um array que recebe o nome e o sexo de cinco 
    pessoas; a seguir o usuário fornece o sexo das pessoas que devem ser 
    apresentadas em tela.

    */
    public static void main(String[] args){
        /*
        Para que o codigo execute de forma correta o usuario de informar os 
        sexos todos de uma unica forma. por exemplo "m" p/ masculino e "f" p/
        feminino, ou pode escrever por completo, contando que mantenha o mesmo
        padrao em todas as vezes que for necessario informar o sexo.
        */
        String[][] nomeSexo=new String[5][2];
        String sexo;
        for(int i=0;i<nomeSexo.length;i++){
            for(int j=0;j<nomeSexo.length;j++){
                if(j==0){
                    nomeSexo[i][j]=JOptionPane.showInputDialog("Informe o "+(i+1)+"° nome: ");
                }
                if(j==1){
                    nomeSexo[i][j]=JOptionPane.showInputDialog("Informe o sexo da "+(i+1)+"° pessoa: ");
                }
            }
        }
        sexo=JOptionPane.showInputDialog("Informe o sexo para exibicao das pessoas: ");
        for(int i=0;i<nomeSexo.length;i++){
            for(int j=0;j<nomeSexo.length;j++){
                if(j==1&&nomeSexo[i][j].equals(sexo)){
                    JOptionPane.showMessageDialog(null,nomeSexo[i][0]);
                }
            }
        }
    }
}
