package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void testAjouter(){
        doNothing().when(statistiqueImpl).ajouter(new Voiture("Flash",5000));

    }

    @Test
    void testPrix() throws Exception {

        doThrow(Exception.class).when(statistiqueImpl).prixMoyen();

        statistiqueImpl.ajouter(new Voiture("McFlurry",2000));

        when.(statistiqueImpl.prixMoyen()).thenReturn(new Echantillon(1,2000));

    }

}
