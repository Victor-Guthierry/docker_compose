package br.edu.ifpe.web4.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpe.web4.model.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findAll();
	
	Cliente findByEmail(String email);
	Cliente findByNome(String nome);

}
