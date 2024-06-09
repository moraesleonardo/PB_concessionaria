package info.moraes.pb_concessionaria.service.impl;


import info.moraes.pb_concessionaria.model.Acessorio;
import info.moraes.pb_concessionaria.repository.AcessorioRepository;
import info.moraes.pb_concessionaria.service.AcessorioService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcessorioServiceImpl implements AcessorioService {
    private final AcessorioRepository acessorioRepository;

    @Override
    public List<Acessorio> findAll() {
        return acessorioRepository.findAll();
    }

    @Override
    public List<Acessorio> findAll(int page, int size, boolean ascending) {
        Sort order = ascending ? Sort.by("nome").ascending() : Sort.by("nome").descending();
        PageRequest pageRequest = PageRequest.of(page, size, order);
        return acessorioRepository.findAll(pageRequest).getContent();
    }

    @Override
    public List<Acessorio> findAllByName(String nome) {
        return acessorioRepository.findAllByNome(nome);
    }

    @Override
    public List<Acessorio> findAllByNameContains(String nome) {
        return acessorioRepository.findAllByNomeContains(nome);
    }
}
