package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	

	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getUser(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		if (objeto==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
				
	}
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getALL() {
		List<Artista> lista = (List<Artista>) dao.findAll();
		return ResponseEntity.ok(lista); 
	}

	@PostMapping("/localizapornac")
	public ResponseEntity<Artista> logar(@RequestBody Artista objeto){
		Artista resposta = dao.findBynacionalidade(objeto.getNacionalidade());
		if (resposta==null) {
			return ResponseEntity.status(403).build();
			}
		return ResponseEntity.ok(resposta);
	}
	
	
	@GetMapping("/deleta/{cod}")
	public ResponseEntity<Artista> deleteById(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		dao.deleteById(objeto);
				
	}
	
	
	
	
	
	
	
	

}
