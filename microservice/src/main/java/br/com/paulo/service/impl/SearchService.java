package br.com.paulo.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.paulo.dao.SearchDao;
import br.com.paulo.entity.PessoaDTO;
import br.com.paulo.service.InterfaceSearchService;

@Service
public class SearchService implements InterfaceSearchService {

	@Override
	public List<PessoaDTO> getPessoas() throws SQLException {
		SearchDao dao = new SearchDao();
		return dao.getPessoas();
	}

}
