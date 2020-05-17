package com.sensoft.monbike.controller;

import com.sensoft.monbike.entities.Commande;
import com.sensoft.monbike.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("alquiler")
public class CommandeController {


        @Autowired
        private CommandeService commandeService;

        @GetMapping("/all-commande")
        List<Commande> findAllCommande() {
            return commandeService.findAll()
                    ;
        }

        //return 201 instead of 200
        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping("/add-commande")
        void newCommande(@RequestBody @Valid Commande commande) {

           commandeService.save(commande); //reparationServices.save(clientDto);
        }
/*
        // Find
        @GetMapping("/client/{id}")
        Client findOneCar(@PathVariable @Min(1) Long id) {
            return reparationServices.findClientById(id)
                    .orElseThrow(() -> new ClientNotFoundException(id));
        }

    // Find
    @GetMapping("/client")
    Client findbynumero(@Param("tel") String tel) {
        return reparationServices.findClientByTel(tel)
                .orElseThrow(() -> new ClientNotFoundException(tel));
    }



        @DeleteMapping("/books/{id}")
        void deleteBook(@PathVariable Long id) {
            reparationServices.deleteById(id);
        }


 */

}
