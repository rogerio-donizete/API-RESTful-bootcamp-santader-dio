package me.dio.santander_bootcamp_java.domain.model.repository;

import me.dio.santander_bootcamp_java.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
