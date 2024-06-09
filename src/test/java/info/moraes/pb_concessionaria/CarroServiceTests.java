package info.moraes.pb_concessionaria;


import info.moraes.pb_concessionaria.model.Carro;
import info.moraes.pb_concessionaria.model.Modelo;
import info.moraes.pb_concessionaria.model.Marca;
import info.moraes.pb_concessionaria.service.CarroService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class CarroServiceTests {

    @Autowired
    CarroService carroService;

    @Test
    @DisplayName("Deve inserir um carro no Banco.")
    public void testaInsert() {
        Modelo modelo = Modelo.builder().id(1).build();
        Marca marca = Marca.builder().id(1).build();
        List<Carro> all = carroService.getAll();
        int estadoInicial = all.size();
        Carro carro = new Carro();
        carro.setNome("Corolla");
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carroService.save(carro);
        all = carroService.getAll();
        int estadoFinal = all.size();
        assertEquals(estadoInicial + 1, estadoFinal);
    }

    @Test
    @DisplayName("Deve deletar um carro do banco")
    public void testaDelete() {
        Modelo modelo = Modelo.builder().id(1).build();
        Marca marca = Marca.builder().id(1).build();
        Carro carro = new Carro();
        carro.setNome("Corolla");
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carroService.save(carro);
        List<Carro> all = carroService.getAll();
        int estadoInicial = all.size();
        Carro carro2 = all.get(0);
        carroService.deleteById(carro2.getId());
        all = carroService.getAll();
        int estadoFinal = all.size();
        assertEquals(estadoInicial - 1, estadoFinal);
    }
}
