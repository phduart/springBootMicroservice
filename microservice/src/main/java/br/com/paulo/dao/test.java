package br.com.paulo.dao;

import java.sql.SQLException;

public class test {
	
	static SearchDao dao;

	public static void main(String[] args) throws SQLException {
//		ConnectionFactory factory = new ConnectionFactory();
//		Connection con = factory.getConnnection();
//		
//		Statement stm = con.createStatement();
//		stm.execute("SELECT first_name AS nome, last_name AS sobrenome from employees");
//		ResultSet rst = stm.getResultSet();
//		while(rst.next()) {
//			String nome = rst.getString("nome");
//			System.out.println(nome);
//		}
		SearchDao daoTeste = new SearchDao();
		System.out.println(daoTeste.existPessoa("101"));
		daoTeste.deletePessoa("101");
	}
}
