package api.spring.boot.udemy.service;

import api.spring.boot.udemy.model.Cliente;
import api.spring.boot.udemy.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository clientesRepository){
        this.repository = clientesRepository;
    }

    public void salvarCliente(Cliente c){
        validarCliente(c);
        ClientesRepository cR = new ClientesRepository();
        this.repository.persist(c);
    }

    public void validarCliente(Cliente c){
        // Aplicando Validações

    }
}
