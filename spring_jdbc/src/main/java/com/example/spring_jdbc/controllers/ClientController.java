package com.example.spring_jdbc.controllers;

import com.example.spring_jdbc.model.Client;
import com.example.spring_jdbc.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/")
    public String client(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("client", clientService.listClients(name));
        return "name";
    }

    @GetMapping("/client/{id}")
    public String clientInfo(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
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
