package info.moraes.pb_concessionaria.service.impl;


import info.moraes.pb_concessionaria.model.Modelo;
import info.moraes.pb_concessionaria.repository.ModeloRepository;
import info.moraes.pb_concessionaria.service.ModeloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModeloServiceImpl implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Override
    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    @Override
    public Optional<Modelo> findById(Integer id) {
        return modeloRepository.findById(id);
    }
}
