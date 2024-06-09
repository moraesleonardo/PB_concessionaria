package info.moraes.pb_concessionaria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "MARCAS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String pais;
    private String email;

    @Column(name = "data_fundacao")
    private LocalDate dataFundacao;
}
