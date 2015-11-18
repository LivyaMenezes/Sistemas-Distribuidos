
package Mesa;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dácio Alves
 */
public class MesaDAO {
    
    ArrayList<Mesa> mesasGeral = new ArrayList<Mesa>();
    
    
    private Connection conexao;
      
    private PreparedStatement stmt;

    private ResultSet tupla;
    
    
    public void adiconarMesa(Mesa mesa) throws SQLException{
        
            String  sql = "insert into mesa (idProduto, valorTotal) " +
                "values (?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

       

        // Executa o código SQL
        stmt.execute();
        //Fecha conexão
        stmt.close();
    }
    }
    


