package com.example.demo.data;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    private Voiture v = new Voiture("McQueen",10000);
    @Test
    void creerVoiture(){
        assertEquals(this.v.getMarque(),"McQueen");
        assertEquals(this.v.getPrix(),10000);
    }
    @ Test
    void idVoiture(){
        this.v.setId(5);
        assertEquals(this.v.getId(),5);
    }

    @Test
    void testMarque(){
        this.v.setMarque("Flash");
        assertEquals(this.v.getMarque(),"Flash");
    }

    @Test
    void testPrix(){
        this.v.setPrix(200);
        assertEquals(this.v.getPrix(),200);
    }

}
