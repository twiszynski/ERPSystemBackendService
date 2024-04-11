package pl.twisz.BackendJFX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.twisz.BackendJFX.entity.QuantityType;

public interface QuantityTypeRepository extends JpaRepository<QuantityType, Long> {
}
