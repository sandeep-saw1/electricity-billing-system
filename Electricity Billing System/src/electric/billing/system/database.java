package electric.billing.system;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;

    public database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_System", "root", "S@nd33pS@w2025");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
