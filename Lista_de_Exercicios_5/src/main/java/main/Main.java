/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import sistemadecadastro.Formulario;

/**
 *
 * @author Jose Teixeira
 */
public class Main {
    /*
    Faça um sistema em java que cadastre e imprima o nome de 20 pessoas.
    */
    public static void main(String[] args){
        Formulario[] formulario=new Formulario[20];
        for(int i=0;i<formulario.length;i++){
            formulario[i]=new Formulario(JOptionPane.showInputDialog("Informe o "+(i+1)+"° nome: "));
        }
        for(int i=0;i<formulario.length;i++){
            JOptionPane.showMessageDialog(null,(i+1)+"° Pessoa\nNome: "+formulario[i].getNome());
        }
    }
}
