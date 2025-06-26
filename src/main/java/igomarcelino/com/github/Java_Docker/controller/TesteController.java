package igomarcelino.com.github.Java_Docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Instant;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @GetMapping
    public ResponseEntity<String> testeApi(){
        var time = Timestamp.from(Instant.now());
        System.out.println("Live Funcionando");
        return ResponseEntity.ok().body("Teste realizado com Sucesso " + time);
    }

}
