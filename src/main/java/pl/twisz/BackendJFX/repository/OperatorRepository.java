package pl.twisz.BackendJFX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.twisz.BackendJFX.entity.Operator;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator, Long> {

    public Optional<Operator> findByLogin(String login);
}
