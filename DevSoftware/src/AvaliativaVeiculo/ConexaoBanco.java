package AvaliativaVeiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoBanco {

    private static ConexaoBanco instance = null;
    private Connection connection;

    // Informações de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/PRECISO COLOCAR O BANCO"; //FAZER A CONEXÃO COM O BANCO
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";

    private ConexaoBanco() {
        try {
            // FAZER A INICIALIZAÇAO
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com exceções de conexão aqui
        }
    }

    public static ConexaoBanco getInstance() {
        if (instance == null) {
            synchronized (ConexaoBanco.class) {
                if (instance == null) {
                    instance = new ConexaoBanco();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
