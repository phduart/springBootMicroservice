package br.com.paulo.dao;

import java.sql.Connection;
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
		
		stm.execute("SELECT first_name AS nome, last_name AS sobrenome from employees");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			listPessoa.add(new PessoaDTO(rst.getString("nome"), rst.getString("sobrenome")));
		}
		return listPessoa;
	}

}
