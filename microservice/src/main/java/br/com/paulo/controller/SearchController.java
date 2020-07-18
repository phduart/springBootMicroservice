package br.com.paulo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.paulo.api.SearchAPI;
import br.com.paulo.entity.PessoaDTO;
import br.com.paulo.service.impl.SearchService;

@RestController
public class SearchController implements SearchAPI{
	
	SearchService service;


	public List<PessoaDTO> getPessoas() {
		PessoaDTO p1 = new PessoaDTO("Paulo", "Duarte");
		return Arrays.asList(p1, p1, p1);
	}
	
	

}
