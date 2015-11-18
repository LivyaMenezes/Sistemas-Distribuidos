package Produto;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProdutoDAO {    
      
     private Connection conexao;
      
     private PreparedStatement stmt;

     private ResultSet tupla;
     
     private List<Produto> ListaDeProdutos= new ArrayList<Produto>();
   
    public ProdutoDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
   
    //_____________________adiconar_______________________________________________________
    public void adicionaProduto(Produto b) throws SQLException{
        
        String  sql = "insert into produto (nomeProduto, quantidadeProduto, valorProduto) " +
                "values (?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        // Seta os valores
        stmt.setString(1, b.getNomeProduto());
        stmt.setInt(2, b.getQuantidadeProduto());
        stmt.setDouble(3, b.getValorProduto());

        // Executa o código SQL
        stmt.execute();
        //Fecha conexão
        stmt.close();
    }
    
    //________________________________________________________________________________
        
    //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$lista$$$$$$$$$$
          public List<Produto> ListarProduto()
        {
                
                                

               try
               {

			this.conexao.createStatement();

                        this.stmt = conexao.prepareStatement("SELECT * FROM produto");

			this.ListaDeProdutos.clear();
                                
			this.tupla=stmt.executeQuery();

			while(this.tupla.next())
                        {

                                Produto beb1= new Produto();
                                
                                beb1.setId(this.tupla.getInt("id"));
                                beb1.setNomeProduto(this.tupla.getString("nomeProduto"));
                                beb1.setQuantidadeProduto(this.tupla.getInt("quantidadeProduto"));
                                beb1.setValorProduto(this.tupla.getDouble("valorProduto"));
                                
                        
			        this.ListaDeProdutos.add(beb1);
				

			}

			this.tupla.close();

			this.stmt.close();

			if(this.ListaDeProdutos.size()>0)

			return this.ListaDeProdutos;

			return null;

		}

		catch(Exception e)
                {

                        System.out.println("Erro : "+e.toString());

			return null;

		}

	}
        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
          
       //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public void excluirProduto(Produto b){
            
            try
                {

			this.conexao.createStatement();

              this.stmt=conexao.prepareStatement("DELETE FROM produto WHERE Id=?");


                this.stmt.setInt(1, b.getId());


			this.stmt.execute();

			this.stmt.close();

			this.conexao.close();			

		}

		catch(Exception e)
                {

		     System.out.println("erro: "+e.toString());

                    
		}

            
        } 
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        public void AtualizarProduto(Produto bebi)
        {


		try
                {

			this.conexao.createStatement();

			this.stmt=this.conexao.prepareStatement("UPDATE produto SET nomeProduto=?, valorProduto=?, quantidadeProduto=? WHERE Id=?");

                                    this.stmt.setString(1, bebi.getNomeProduto());
                                    this.stmt.setInt(2, bebi.getQuantidadeProduto());
                                    this.stmt.setDouble(3, bebi.getValorProduto());
                                    
                                    this.stmt.setInt(4, bebi.getId());


			this.stmt.execute();

			this.stmt.close();

			this.conexao.close();

					

		}

		catch(Exception e)
                {

		    System.out.println("Erro: "+e.toString());

				

		}

				

	}
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
