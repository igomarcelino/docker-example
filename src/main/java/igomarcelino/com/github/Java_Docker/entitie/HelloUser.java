package igomarcelino.com.github.Java_Docker.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HelloUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_message;

    private String hello_message;

    public Integer getId_message() {
        return id_message;
    }

    public void setId_message(Integer id_message) {
        this.id_message = id_message;
    }

    public String getHello_message() {
        return hello_message;
    }

    public void setHello_message(String hello_message) {
        this.hello_message = hello_message;
    }
}
