package br.com.cookiesoft.pratica_ci_cd_fullcycle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomarTest {

    private Somar somar;
    
    @BeforeEach
    public void setup() {
        somar = new Somar();
    }

    @Test
    public void testSomar() {
        int resultado = somar.somar(2, 3);
        assert resultado == 5;
    }

}
