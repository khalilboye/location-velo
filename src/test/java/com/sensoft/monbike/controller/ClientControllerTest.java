package com.sensoft.monbike.controller;

import com.sensoft.monbike.service.ClientServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClientControllerTest {

    @InjectMocks
    ClientController clientController;

    @Mock
    ClientServices employeeDAO;

    @Test
    void findAll() {
    }

    @Test
    void newClient() {
    }

    @Test
    void findOneCar() {
    }

    @Test
    void findbymail() {
    }

    @Test
    void deleteBook() {
    }
}