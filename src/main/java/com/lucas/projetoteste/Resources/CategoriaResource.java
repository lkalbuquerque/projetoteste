package com.lucas.projetoteste.Resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.projetoteste.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar(){
		Categoria cat1 = new Categoria(1, "Papelaria", "Setor 2");
		Categoria cat2 = new Categoria(2, "Informática", "Setor 3");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);	
		
		return lista;
	}

}
