package hello.firstassignment.item.infrastrcuture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, Long> {
}
