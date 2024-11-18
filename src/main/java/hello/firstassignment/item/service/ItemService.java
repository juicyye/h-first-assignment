package hello.firstassignment.item.service;

import hello.firstassignment.common.service.LocalDateTimeHolder;
import hello.firstassignment.item.domain.Item;
import hello.firstassignment.item.service.port.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item create(Item item) {

    }
}
