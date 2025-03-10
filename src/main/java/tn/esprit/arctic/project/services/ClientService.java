package tn.esprit.arctic.project.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.project.entity.Client;
import tn.esprit.arctic.project.repositories.ClientRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;


    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Long id, Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }
}