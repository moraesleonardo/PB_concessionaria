package info.moraes.pb_concessionaria.controller;

import info.moraes.pb_concessionaria.model.Carro;
import info.moraes.pb_concessionaria.repository.CarroRepository;
import info.moraes.pb_concessionaria.service.CarroService;

import info.moraes.pb_concessionaria.exception.ResourceNotFoundException;
import info.moraes.pb_concessionaria.payload.MessagePayload;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/carro")
public class CarroController {
    Logger logger = LoggerFactory.getLogger(CarroController.class);
    final CarroRepository carroRepository;
    final CarroService carroService;

    public CarroController(CarroService carroService, CarroRepository carroRepository) {
        this.carroService = carroService;
        this.carroRepository = carroRepository;
    }
/*
    @GetMapping
    public ResponseEntity<List<Carro>> getAll(@RequestParam(required = false) Optional<String> nome) {
        if (nome.isEmpty()) {
            return ResponseEntity.ok(carroService.getAll());
        } else {
            List<Carro> carros = carroService.filterByName(nome.get());
            if (carros.isEmpty()) {
                return ResponseEntity.notFound().build();
            } else {
                return ResponseEntity.ok(carros);
            }
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        try {
            Carro localizado = carroService.getById(id);
            return ResponseEntity.ok(localizado);
        } catch (ResourceNotFoundException ex) {
            Map<String, String> message = Map.of("Message", ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @Operation(summary = "Salva um carro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Carro salvo",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Carro.class))})
    })
    @PostMapping
    public ResponseEntity<MessagePayload> save(@RequestBody Carro carro) {
        carroService.save(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new MessagePayload("Criado com sucesso"));
    }

    @Operation(summary = "Atualiza um carro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Atualizado com sucesso",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MessagePayload.class))}),
            @ApiResponse(responseCode = "404", description = "Ocorreu um erro",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MessagePayload.class))})
    })
    @PutMapping("/{id}")
    public ResponseEntity<MessagePayload> update(@PathVariable Integer id, @RequestBody Carro carro) {
        try {
            carroService.update(id, carro);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new MessagePayload("Atualizado com sucesso"));
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessagePayload(ex.getMessage()));
        }
    }

    @Operation(summary = "Deleta um carro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Deletado com sucesso",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MessagePayload.class))}),
            @ApiResponse(responseCode = "404", description = "Ocorreu um erro",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MessagePayload.class))})
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<MessagePayload> delete(@PathVariable Integer id) {
        logger.info("Deletando um carro");
        try {
            carroService.deleteById(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new MessagePayload("Deletado com sucesso"));
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessagePayload(ex.getMessage()));
        }
    }

 */
}
