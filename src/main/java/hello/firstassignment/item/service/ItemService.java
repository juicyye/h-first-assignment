package hello.firstassignment.item.service;

import hello.firstassignment.global.util.ErrorMessage;
import hello.firstassignment.item.controller.req.ItemCreateReqDto;
import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import hello.firstassignment.item.domain.Item;
import hello.firstassignment.item.service.port.ItemRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemRequestMapper mapper;

    public Item create(ItemCreateReqDto createReqDto) {
        Item item = mapper.create(createReqDto);
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item updateItemById(Long id, ItemUpdateReqDto updateReqDto) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.NOT_FOUND_ITEM.getMessage()));
        return itemRepository.save(mapper.update(updateReqDto, item));
    }

    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }


}
