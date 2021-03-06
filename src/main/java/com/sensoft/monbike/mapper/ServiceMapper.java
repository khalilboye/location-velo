package com.sensoft.monbike.mapper;

import com.sensoft.monbike.dto.ServiceDto;
import com.sensoft.monbike.entities.Service;
import org.springframework.stereotype.Component;

@Component
public class ServiceMapper {


    public Service toService(ServiceDto serviceDto) {

        Service service = new Service();

        service.setNom(serviceDto.getNom());
        service.setCouleur(serviceDto.getCouleur());
        service.setDescription(serviceDto.getDescription());
        service.setTitre(serviceDto.getTitre());
        service.setUriImage(serviceDto.getUriImage());
        return service ;

    }
}
