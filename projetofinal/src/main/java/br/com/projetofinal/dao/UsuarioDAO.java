package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

//DAO = Design Patter (Data Acess Object) , metodos CRUD


public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
	/*
	 * Metodos que o spring cria automaticamente:
	 * 
	 * save() Gravar ou atualizar
	 * findById() consultar pela chave primaria
	 * findALL() consulta todas as linhas
	 * deleteById() apagar pela chave primaria
	 * deleteAll() apaga tudo
	 * count() retorna qte de linhas
	 * existsById() retorna um boolean se existe ou nao
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
