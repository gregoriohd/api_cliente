package br.com.gregoriohd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gregoriohd.model.Cliente;
import br.com.gregoriohd.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> obterTodos(){
		return new ResponseEntity<List<Cliente>>(service.obterTodos(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		service.salvar(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
	}
}
