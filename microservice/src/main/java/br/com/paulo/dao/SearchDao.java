package br.com.paulo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.paulo.entity.PessoaDTO;

public class SearchDao {
	
	public List<PessoaDTO> getPessoas() throws SQLException{
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.getConnnection();
		Statement stm = con.createStatement();
		List<PessoaDTO> listPessoa = new ArrayList<PessoaDTO>();
		
		stm.execute("SELECT first_name AS nome, last_name AS sobrenome, salary as salario from employees");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			listPessoa.add(new PessoaDTO(rst.getString("nome"), rst.getString("sobrenome"), rst.getInt("salario")));
		}
		return listPessoa;
	}
	
	public boolean deletePessoa(String id)throws SQLException{
		if(existPessoa(id)) {
			ConnectionFactory factory = new ConnectionFactory();
			Connection con = factory.getConnnection();
			PreparedStatement statement = con.prepareStatement("DELETE FROM employees WHERE employee_id = ?");
			statement.setString(1, id);
			statement.execute();
			System.out.println("DELETADO id " + id);
			return true;
		} else {
			System.out.println("NOT FOUND!");
			return false;
		}
	}
	
	public boolean existPessoa(String id) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.getConnnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM employees WHERE employee_id = ?");
		statement.setString(1, id);
		statement.execute();
		ResultSet rst = statement.getResultSet();
		if (rst.next() == false) {
			return false;
		}
		return true;
	}

}
