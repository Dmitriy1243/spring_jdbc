package com.example.spring_jdbc.controllers;

import com.example.spring_jdbc.model.Client;
import com.example.spring_jdbc.repositories.ClientRepository;
import com.example.spring_jdbc.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @Autowired
    private final ClientRepository clientRepository;

    @RequestMapping("/")
    public List<Client> getClient() {
        return clientRepository.findAll();
    }
//    public String client(@RequestParam(name = "name", required = false) String name) {
//        clientService.listClients(name);
//        return "name";
//    }

    @RequestMapping("/client/{id}")
    public String clientInfo(@PathVariable Long id) {
        clientService.getClientById(id);
        return "client-info";
    }

    @PostMapping("/client/create")
    public String createClient(Client client) {
        clientService.saveClient(client);
        return "redirect:/";
    }

    @PostMapping("/client/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "redirect:/";
    }
}
