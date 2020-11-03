package br.com.paulo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulo.api.SearchAPI;
import br.com.paulo.entity.PessoaDTO;
import br.com.paulo.service.impl.SearchService;

@RestController
public class SearchController implements SearchAPI{

	@Autowired
	SearchService service;

	public List<PessoaDTO> getPessoas() throws SQLException {
		return service.getPessoas();
	}
	
	public boolean deletePessoa(String id) throws SQLException {
		return service.deletarPessoa(id);
	}

}
