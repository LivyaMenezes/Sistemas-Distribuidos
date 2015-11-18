/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dácio Alves
 */
public class Conexao {
      public static Connection getConexao() throws SQLException {
        //Captura de exceções SQLException, uso obrigatório para JDBC
        try { 
            //Registra um driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao Banco");
            //Estabelece uma conexão
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge", "root", "1234");

        } catch (ClassNotFoundException e) {
            //Exceção gerada para informar o erro
            throw new SQLException(e.getMessage());
        }
    }
}
