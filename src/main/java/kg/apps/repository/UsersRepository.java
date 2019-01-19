package kg.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kg.apps.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer>
{
    Optional<Users> findByUsername(String username);
}