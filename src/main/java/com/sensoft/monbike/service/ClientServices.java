package com.sensoft.monbike.service;


import com.sensoft.monbike.dto.ClientDto;
import com.sensoft.monbike.entities.Client;
import com.sensoft.monbike.mapper.ClientMapper;
import com.sensoft.monbike.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

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
      return   clientRepository.findById(id);
    }

    public void deleteById(Long id) {
        if(id != null) {
            clientRepository.deleteById(id);
        }
    }

    public ClientDto findClientByTel(String tel) {
        Optional<Client> optionalClient= clientRepository.findClientByTel(tel);

        return  clientMapper.getOneClient(optionalClient);
    }
}
