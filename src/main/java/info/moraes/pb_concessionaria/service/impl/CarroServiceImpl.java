package info.moraes.pb_concessionaria.service.impl;

import info.moraes.pb_concessionaria.model.Carro;
import info.moraes.pb_concessionaria.repository.CarroRepository;
import info.moraes.pb_concessionaria.service.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {
    private final CarroRepository carroRepository;

    @Override
    public List<Carro> getAll() {
        return carroRepository.findAll();
    }

    @Override
    public Optional<Carro> findById(Integer id) {
        return carroRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        carroRepository.deleteById(id);
    }

    @Override
    public void save(Carro carro) {
        carroRepository.save(carro);
    }

    @Override
    public Carro update(Integer id, Carro atualizado) {
        atualizado.setId(id);
        return carroRepository.save(atualizado);
    }
}
