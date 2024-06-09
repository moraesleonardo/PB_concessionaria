package info.moraes.pb_concessionaria.service;


import info.moraes.pb_concessionaria.model.Modelo;

import java.util.List;
import java.util.Optional;

public interface ModeloService {
    List<Modelo> findAll();
    Optional<Modelo> findById(Integer id);
}
