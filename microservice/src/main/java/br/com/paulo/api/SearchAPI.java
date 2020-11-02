package br.com.paulo.api;


import java.sql.SQLException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.paulo.entity.PessoaDTO;

@CrossOrigin
@RequestMapping(path = { "/api" }, produces = { MediaType.APPLICATION_JSON_VALUE })
public interface SearchAPI {
	
	@RequestMapping(method = RequestMethod.GET, path="/getPessoas")
	@ResponseBody
	List<PessoaDTO> getPessoas() throws SQLException;
	
	@RequestMapping(method = RequestMethod.DELETE, path="/deletePessoa/{id}")
	@ResponseBody
	boolean deletePessoa(@PathVariable String Id) throws SQLException;

}
