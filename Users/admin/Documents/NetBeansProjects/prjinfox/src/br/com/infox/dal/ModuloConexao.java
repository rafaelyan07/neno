package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //metedo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //traz o driver
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informacoes refernte ao banco
        String url = "jdbc:mysql://localhost/dbinfox";
        String user = "root";
        String password = "070295";
        //estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
