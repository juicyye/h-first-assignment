package hello.firstassignment.item.infrastrcuture;

import hello.firstassignment.item.domain.Item;
import hello.firstassignment.item.service.port.ItemRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Item save(Item item) {
        return itemJpaRepository.save(ItemEntity.fromDomain(item)).toDomain();
    }

    @Override
    public List<Item> findAll() {
        return itemJpaRepository.findAll().stream().map(ItemEntity::toDomain).toList();
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemJpaRepository.findById(id).map(ItemEntity::toDomain);
    }

    @Override
    public void deleteById(Long id) {
        itemJpaRepository.deleteById(id);
    }
}
