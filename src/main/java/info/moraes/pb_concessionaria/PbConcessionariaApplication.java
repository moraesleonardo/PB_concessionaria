package info.moraes.pb_concessionaria;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class PbConcessionariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbConcessionariaApplication.class, args);
    }

}
