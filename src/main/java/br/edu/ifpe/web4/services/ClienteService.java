package br.edu.ifpe.web4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpe.web4.DAO.ClienteDAO;
import br.edu.ifpe.web4.model.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO clienteDao;
	
	public List<Cliente> listarClientes(){
        return clienteDao.findAll();
    }
	
	public Cliente getClienteByEmail(String email){
	    Cliente cliente =  clienteDao.findByEmail(email);
	    return cliente;
	}
	
	public void editarCliente(Cliente cliente){
        clienteDao.save(cliente);
	}
	
	public void deletarCliente(Long id){
		Cliente cliente = clienteDao.findById(id).get();
	    clienteDao.delete(cliente);
	}
	
	public void adicionarCliente(Cliente cliente){
        clienteDao.save(cliente);
    }
	
	public Cliente getClienteById(Long id){
	        return clienteDao.findById(id).get();
	}
	
}
