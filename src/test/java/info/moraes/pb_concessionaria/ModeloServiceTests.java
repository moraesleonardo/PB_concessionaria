package info.moraes.pb_concessionaria;


import info.moraes.pb_concessionaria.model.Modelo;
import info.moraes.pb_concessionaria.service.ModeloService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ModeloServiceTests {

    @Autowired
    ModeloService modeloService;

    @Test
    @DisplayName("Deve retornar todos os modelos")
    public void testaFindAll() {
        List<Modelo> all = modeloService.findAll();
        assertEquals(3, all.size());  // Ajuste o número esperado de acordo com seus dados reais de teste
    }

    @Test
    @DisplayName("Deve retornar por ID")
    public void testaFindById() {
        Optional<Modelo> byId = modeloService.findById(1);
        assertTrue(byId.isPresent());
        Optional<Modelo> naoExistente = modeloService.findById(1000);
        assertTrue(naoExistente.isEmpty());
    }
}
