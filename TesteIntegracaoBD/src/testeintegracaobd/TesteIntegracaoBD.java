
package testeintegracaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author davif
 */
public class TesteIntegracaoBD {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String nomeServidor = "localhost:3306";
    private static final String nomeBanco = "banco";
    private static final String caminho = "jdbc:mysql://" + nomeServidor + "/" + nomeBanco;
    private static final String usuario = "root";
    private static final String senhaBanco = "DAVI890";

    public static void main(String[] args) {
        try {
            System.setProperty("jdbc.Drivers", driver);
            Connection connection = DriverManager.getConnection(caminho, usuario, senhaBanco);
            System.out.println("Sucesso de conexao");
            Statement sta = connection.createStatement();
            ResultSet result = sta.executeQuery("SELECT * FROM ALUNO");
            System.out.println("Retornando valores da tabela de alunos:");
            while(result.next()){
                String nome = result.getString("NOME");
                System.out.println(nome);
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

}
