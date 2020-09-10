package com.sensoft.monbike.service;


import com.sensoft.monbike.dto.ClientDto;
import com.sensoft.monbike.dto.ServiceDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.entities.ClientServiceAssocPK;
import com.sensoft.monbike.entities.ClientServiceAssociation;
import com.sensoft.monbike.entities.Service;
import com.sensoft.monbike.error.ClientNotFoundException;
import com.sensoft.monbike.mapper.ClientMapper;
import com.sensoft.monbike.mapper.ServiceMapper;
import com.sensoft.monbike.repository.ClientRepository;
import com.sensoft.monbike.repository.ClientServiceAssociationRepository;
import com.sensoft.monbike.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private ClientServiceAssociationRepository serviceAssociationRepository;

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ServiceMapper serviceMapper;

    public   void associateSiretToServiceClient(Client client, Service service) {

            ClientServiceAssociation assoc = new ClientServiceAssociation();
            ClientServiceAssocPK serviceAssociation = new ClientServiceAssocPK();
            serviceAssociation.setService(service);
            serviceAssociation.setClient(client);
            assoc.setId(serviceAssociation);

            serviceAssociationRepository.save(assoc);
    }

    public List<ClientDto> findAll() {

        List<Client> clientList = clientRepository.findAll();
        List<ClientDto> clientDtoList = clientMapper.fromClient(clientList);

        return clientDtoList;
    }

    public Client save(ClientDto clientDto) {

        Client client = clientMapper.toClient(clientDto);
        return  clientRepository.save(client);
    }

    public Optional<Client> findClientById(Long id) {

        Optional<Client> client = clientRepository.findById(id);

        if(!client.isPresent() ||  client==null ){
           throw new  ClientNotFoundException(id);
        }

        return  client;
    }

    public void deleteById(Long id) {
        if(id != null) {
            clientRepository.deleteById(id);
        }
    }

    public ClientDto findClientByTel(String tel) {
        Optional<Client> optionalClient= clientRepository.findClientByTel(tel);
         if(optionalClient==null){
             throw new ClientNotFoundException("Client not found"+optionalClient.get().getId());
         }
        return  clientMapper.getOneClient(optionalClient);
    }

    public Service saveService(ServiceDto serviceDto) {

        Service service = serviceMapper.toService(serviceDto);

        return serviceRepository.save(service);
    }
}
