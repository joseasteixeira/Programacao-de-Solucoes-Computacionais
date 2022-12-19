/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectarbanco.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Conexao {
    private String host ="localhost"; //UNF11DT0085725
    private String usuario ="root";
    private String senha ="";
    private String banco ="carros";
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet rs;
    
    public Conexao(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://" + host
                     + "/" + banco + "?user=" +usuario+ "&password=" +senha);
             JOptionPane.showMessageDialog(null,"Banco conectado");
                                 
         }catch(ClassNotFoundException ex){
             JOptionPane.showMessageDialog(null,"Não foi possivel "
                     + "encontrar o driver");
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Falha na Conexão: " + ex.getMessage());
             
         }        
    }
    
    public void inserir(){
        try {
            stmt = con.createStatement();
            sql = "insert into carros (marca,modelo,placa,ano) values ('Hyunday','HB20','ABC1D23',2022);";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Dados Cadastrados");
        } catch (SQLException ex) {
        }
   }
    
    public void listar(){       
       sql = "select * from carros";
       String listar="";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                listar+=rs.getInt(1)+" | ";
                listar+=rs.getString(2)+" | ";
                listar+=rs.getString(3)+" | ";
                listar+=rs.getString(4)+" | ";
                listar+=rs.getInt(5)+"\n";
            }
            JOptionPane.showMessageDialog(null,listar);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
   } 
    
   public void alterar(){
        try {
            stmt = con.createStatement();
            sql = "update carros set modelo='Creta' where modelo='HB20'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Dados Alterados");
        } catch (SQLException ex) {
        }
   }
   
   public void excluir(){
        try {
            stmt = con.createStatement();
            sql = "delete from carros where marca='Hyunday'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Dados Excluidos");
        } catch (SQLException ex) {
        }
   }
    
}
