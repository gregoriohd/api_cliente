package br.com.gregoriohd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gregoriohd.model.Cliente;
import br.com.gregoriohd.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> obterTodos() {
		return repository.findAll();
	}

	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}

	public Cliente obterPorId(Long id) {
		return repository.findById(id).get();
	}

	public Cliente atualizar(Cliente cliente, Long id) {
		cliente.setId(id);
		repository.save(cliente);
		return cliente;
	}
	
	public void remover(Long id) {
		repository.deleteById(id);
	}

}
