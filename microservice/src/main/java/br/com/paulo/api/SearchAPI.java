package br.com.paulo.api;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.paulo.entity.PessoaDTO;

@RequestMapping(path = { "/api" }, produces = { MediaType.APPLICATION_JSON_VALUE })
public interface SearchAPI {
	
	@RequestMapping(method = RequestMethod.GET, path="/getPessoas")
	@ResponseBody
	List<PessoaDTO> getPessoas();

}