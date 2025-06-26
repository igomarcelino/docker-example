package igomarcelino.com.github.Java_Docker.controller;

import igomarcelino.com.github.Java_Docker.entitie.HelloUser;
import igomarcelino.com.github.Java_Docker.repositories.HelloUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("messages")
public class MessagesController {

    private final HelloUserRepository helloUserRepository;

    public MessagesController(HelloUserRepository helloUserRepository) {
        this.helloUserRepository = helloUserRepository;
    }

    @GetMapping
    public ResponseEntity<List<HelloUser>> messages(){
        var messagesList = helloUserRepository.findAll();
        return ResponseEntity.ok().body(messagesList);
    }

}
