package com.example.spring_jdbc.services;

import com.example.spring_jdbc.repositories.ClientRepository;
import com.example.spring_jdbc.model.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository ClientRepository;

//    public List<Client> listClients (String name)   {
////        if (name != null) return ClientRepository.findByName(name);
////        return ClientRepository.findAll();
////    }
@RequestMapping("/")
    public List<Client> getClient() {
        return ClientRepository.findAll();
    }

    public void saveClient(Client Client) {
        log.info("Saving new {}", Client);
        ClientRepository.save(Client);
    }

    public void deleteClient(Long id) {
        ClientRepository.deleteById(id);
    }

    public Client getClientById(Long id) {

        return ClientRepository.findById(id).orElse(null);
    }
}
