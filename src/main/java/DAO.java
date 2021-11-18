import java.sql.*;

public class DAO {

    public static final String URL = "jdbc:postgresql://localhost:5432/douglas";
    public static final String USER = "postgres";
    public static final String PASSWORD = "12345";

    public static void createTable() {
        Connection connection;
        Statement statement;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS CONTACORRENTE (ID INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL, NOME TEXT NOT NULL, IDAGENCIA TEXT NOT NULL, IDCONTACORRENTE TEXT NOT NULL, SALDOATUALIZADO TEXT NOT NULL)";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void insertIntoTable(String nome, String numero, String idagencia, String idcontacorrente) {
        Connection connection;
        PreparedStatement preparedStatement;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "INSERT INTO CONTACORRENTE (NOME, IDAGENCIA, IDCONTACORRENTE, SALDOATUALIZADO) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, numero);
            preparedStatement.setString(3, numero);
            preparedStatement.setString(4, numero);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void readTable() {
        Connection connection;
        Statement statement;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CONTACORRENTE ORDER BY ID ASC");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");
                String idagencia = resultSet.getString("IDAGENCIA");
                String idcontacorrente = resultSet.getString("IDCONTACORRENTE");
                String saldoatualizado = resultSet.getString("SALDOATUALIZADO");
                System.out.println("\n" + "ID = " + id + " | NOME = " + nome + " | NUMERO DA AGENCIA = " + idagencia + " | NUMERO DA CONTA = " + idcontacorrente + " | SALDO ATUALIZADO = " + saldoatualizado);
            }
            statement.close();
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
