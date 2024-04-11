package pl.twisz.BackendJFX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.twisz.BackendJFX.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
