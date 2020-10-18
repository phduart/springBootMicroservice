package br.com.paulo.service;

import java.sql.SQLException;
import java.util.List;

import br.com.paulo.entity.PessoaDTO;

public interface InterfaceSearchService {

	public List<PessoaDTO> getPessoas() throws SQLException;
	
	public boolean deletarPessoa(String id) throws SQLException;
}
