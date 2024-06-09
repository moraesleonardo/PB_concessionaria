package info.moraes.pb_concessionaria.service;


import info.moraes.pb_concessionaria.model.Acessorio;

import java.util.List;

public interface AcessorioService {
    List<Acessorio> findAll();
    List<Acessorio> findAll(int page, int size, boolean ascending);
    List<Acessorio> findAllByName(String nome);
    List<Acessorio> findAllByNameContains(String nome);
}
