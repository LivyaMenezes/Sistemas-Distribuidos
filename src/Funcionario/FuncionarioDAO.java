/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dácio Alves
 */
public class FuncionarioDAO {
    
    
     private Connection conexao;
      
     private PreparedStatement stmt;

     private ResultSet tupla;
     
     private List<Funcionario> ListaDeFuncionario= new ArrayList<Funcionario>();
   
    public FuncionarioDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
   
    //_____________________adiconar_______________________________________________________
    public void adicionaFuncionario(Funcionario f) throws SQLException{
        
        String  sql = "insert into funcionario (nome, senha) " +
                "values (?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        // Seta os valores
        stmt.setString(1, f.getNome());
        stmt.setString(2, f.getSenha());
     

        // Executa o código SQL
        stmt.execute();
        //Fecha conexão
        stmt.close();
    }
    
    
     public void AtualizarSenha(Funcionario func)
        {


		try
                {

			this.conexao.createStatement();

			this.stmt=this.conexao.prepareStatement("UPDATE funcionario SET nome=?, senha=? WHERE Id=?");

                                    this.stmt.setString(1, func.getNome());
                                    this.stmt.setString(2, func.getSenha());
                                    
                                    
                                    this.stmt.setInt(3, func.getId());


			this.stmt.execute();

			this.stmt.close();

			this.conexao.close();

					

		}

		catch(Exception e)
                {

		    System.out.println("Erro: "+e.toString());

				

		}			

	}
     
      public void retirarFuncionario(Funcionario funci){
            
            try
                {

			this.conexao.createStatement();

              this.stmt=conexao.prepareStatement("DELETE FROM funcionario WHERE Id=?");


                this.stmt.setInt(1, funci.getId());


			this.stmt.execute();

			this.stmt.close();

			this.conexao.close();			

		}

		catch(Exception e)
                {

		     System.out.println("erro: "+e.toString());

                    
                }
            
        } 
      
        public List<Funcionario> ListarFuncionario()
        {

               try
               {
			this.conexao.createStatement();

                        this.stmt = conexao.prepareStatement("SELECT * FROM funcionario");

			this.ListaDeFuncionario.clear();
                                
			this.tupla=stmt.executeQuery();

			while(this.tupla.next())
                        {

                                Funcionario fun= new Funcionario();
                                
                                fun.setId(this.tupla.getInt("id"));
                                fun.setNome(this.tupla.getString("nome"));
                                fun.setSenha(this.tupla.getString("senha"));
                                
                                
                        
			        this.ListaDeFuncionario.add(fun);
				

			}

			this.tupla.close();

			this.stmt.close();

			if(this.ListaDeFuncionario.size()>0)

			return this.ListaDeFuncionario;

			return null;

		}

		catch(Exception e)
                {

                        System.out.println("Erro : "+e.toString());

			return null;

		}

	}
}
