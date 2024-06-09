package info.moraes.pb_concessionaria;


import info.moraes.pb_concessionaria.model.Acessorio;
import info.moraes.pb_concessionaria.service.AcessorioService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AcessorioServiceTests {

    @Autowired
    AcessorioService acessorioService;

    @Test
    @DisplayName("Deve buscar um acessório pelo nome")
    public void buscaPeloNome() {
        List<Acessorio> result = acessorioService.findAllByName("Ar Condicionado");
        assertEquals(1, result.size());

        List<Acessorio> startsWithA = acessorioService.findAllByNameContains("A");
        assertEquals(2, startsWithA.size());  // Ajuste o número esperado de acordo com seus dados reais de teste
    }
}
