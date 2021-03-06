package com.sensoft.monbike.controller;

import com.sensoft.monbike.dto.ClientDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.error.ClientNotFoundException;
import com.sensoft.monbike.service.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("alquiler")
public class ClientController {


        @Autowired
        private ClientServices clientServices;

        @GetMapping("/all-client")
        List<ClientDto> findAll() {
            return clientServices.findAll();
        }

        // Save
        //return 201 instead of 200
        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping("/add-client")
        Client newClient(@RequestBody @Valid ClientDto clientDto) {

            return clientServices.save(clientDto);
        }

        // Find
        @GetMapping("/client/{id}")
        Client findOneCar(@PathVariable @Min(1) Long id) {
            return clientServices.findClientById(id)
                    .orElseThrow(() -> new ClientNotFoundException(id));
        }

    // Find
    @GetMapping("/client")
    ClientDto findbymail(@Param("tel") String tel) {
        return clientServices.findClientByTel(tel);
               // .orElseThrow(() -> new ClientNotFoundException(tel));
    }

     @DeleteMapping("/client/{id}")
        void deleteBook(@PathVariable Long id) {
            clientServices.deleteById(id);
        }


}
