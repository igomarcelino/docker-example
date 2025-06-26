package igomarcelino.com.github.Java_Docker.repositories;

import igomarcelino.com.github.Java_Docker.entitie.HelloUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloUserRepository extends JpaRepository<HelloUser, Integer> {
}
