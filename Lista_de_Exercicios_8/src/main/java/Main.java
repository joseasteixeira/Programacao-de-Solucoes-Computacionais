/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import conectarbanco.controller.Conexao;
import conectarbanco.model.Carro;

/**
 *
 * @author Jose Teixeira
 */
public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();        
        conexao.inserir();
        conexao.listar();
        conexao.alterar();
        conexao.listar();
        conexao.excluir();
        conexao.listar();
    }
}
