package com.sensoft.monbike.controller;

import com.sensoft.monbike.dto.ClientServiceDto;
import com.sensoft.monbike.dto.ServiceDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.entities.Service;
import com.sensoft.monbike.service.ClientServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.log.LogFormatUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("services")
public class ServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @Autowired
    private  ClientServices clientServices ;

    /**
     * POST /services : Create a new service.
     */
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client-service")
    public void associateSiretToServiceClient(@RequestBody Client client ,Service service)
            throws URISyntaxException {

        LOGGER.debug("REST request to associate Siret to Service : {}");
        clientServices.associateSiretToServiceClient(client, service);
    }


    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add-service")
    Service newClient(@RequestBody ServiceDto serviceDto) {

        return clientServices.saveService(serviceDto);
    }


}
