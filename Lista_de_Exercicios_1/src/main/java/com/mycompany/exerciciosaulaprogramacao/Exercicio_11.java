/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_11 {
    /*
    11.  Uma revendedora de carros usados paga a seus funcionários vendedores um 
    salário fixo por mês, mais uma comissão também fixa para cada carro vendido 
    e mais 5% do valor das vendas por ele efetuadas. Ler o número de carros por 
    ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele 
    recebe por carro vendido. Calcular e exibir o salário final do vendedor.
    */
    public static void main(String[] args){
        Integer numeroCarrosVendidos=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros vendidos: "));
        Double valorTotalVendas=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas: "));
        Double salarioFixo=Double.parseDouble(JOptionPane.showInputDialog("Informe o salario fixo: "));
        Double valorPorCarro=Double.parseDouble(JOptionPane.showInputDialog("Informe a comissão por carro vendido: "));
        Double salarioFinal=salarioFixo+(valorPorCarro*numeroCarrosVendidos)+(valorTotalVendas*0.05d);
        JOptionPane.showMessageDialog(null,"O salario final do vendedor é R$ "+salarioFinal);
    }
}
