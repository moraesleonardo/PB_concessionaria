package info.moraes.pb_concessionaria.repository;



import info.moraes.pb_concessionaria.model.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcessorioRepository extends JpaRepository<Acessorio, Integer> {
    List<Acessorio> findAllByNome(String nome);
    List<Acessorio> findAllByNomeContains(String nome);
    List<Acessorio> findAllByNomeContainsOrDescricaoContains(String nome, String descricao);
}
