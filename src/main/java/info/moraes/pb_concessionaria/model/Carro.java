package info.moraes.pb_concessionaria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "CARRO")
public class Carro {
    @NotBlank
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 0, max = 20)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @ManyToOne
    private Marca marca;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Acessorio> acessorios;

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modelo=" + modelo +
                ", marca=" + marca +
                ", acessorios=" + acessorios +
                '}';
    }
}
