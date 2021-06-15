package controllers;

import models.Categorie;
import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.impl.CategorieServiceImpl;
import services.impl.ClientServiceImpl;

import java.util.List;

@RestController
@RequestMapping("client")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientServiceImpl service;

    @GetMapping("")
    public List<Client> findAll(){ return this.service.findall(); }

    @GetMapping("{id}")
    public Client findById(@PathVariable Long id){return this.service.findById(id);}

    @PostMapping("")
    public Client save(@RequestBody Client client){ return this.service.save(client); };

    @PutMapping("")
    public Client update(@RequestBody Client client){ return this.service.update(client);}

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){ this.service.delete(id); }

}
