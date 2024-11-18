package hello.firstassignment.item.controller;

import hello.firstassignment.item.controller.req.ItemCreateReqDto;
import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import hello.firstassignment.item.controller.resp.ItemCreateRespDto;
import hello.firstassignment.item.controller.resp.ItemDeleteRespDto;
import hello.firstassignment.item.domain.Item;
import hello.firstassignment.item.service.ItemService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/post")
    public ResponseEntity<?> createItem(@Valid @RequestBody ItemCreateReqDto createReqDto) {
        Item savedItem = itemService.create(createReqDto);
        return new ResponseEntity<>(ItemCreateRespDto.from(savedItem), HttpStatus.CREATED);
    }

    @GetMapping("/post")
    public ResponseEntity<?> getItems() {
        List<ItemCreateRespDto> respDtos = itemService.getAllItems().stream().map(ItemCreateRespDto::from).toList();
        return ResponseEntity.ok(respDtos);
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<?> updateItem(@PathVariable("id") Long id,
                                        @Valid @RequestBody ItemUpdateReqDto updateReqDto) {

        Item updatedItem = itemService.updateItemById(id, updateReqDto);
        return ResponseEntity.ok(ItemCreateRespDto.from(updatedItem));
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable("id") Long id) {
        itemService.deleteItemById(id);
        return ResponseEntity.ok().body(new ItemDeleteRespDto("삭제 완료"));
    }

}
