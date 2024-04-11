package pl.twisz.BackendJFX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.twisz.BackendJFX.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
