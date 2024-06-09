package info.moraes.pb_concessionaria.service;
import info.moraes.pb_concessionaria.model.Carro;

import java.util.List;
import java.util.Optional;

public interface CarroService {
    List<Carro> getAll();
    Optional<Carro> findById(Integer id);
    void deleteById(Integer id);
    void save(Carro carro);
    Carro update(Integer id, Carro atualizado);
}
