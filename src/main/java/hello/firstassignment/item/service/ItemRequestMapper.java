package hello.firstassignment.item.service;

import hello.firstassignment.common.service.LocalDateTimeHolder;
import hello.firstassignment.item.controller.req.ItemCreateReqDto;
import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import hello.firstassignment.item.domain.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ItemRequestMapper {

    private final LocalDateTimeHolder localDateTimeHolder;

    public Item create(ItemCreateReqDto createReqDto) {
        return Item.builder()
                .title(createReqDto.title())
                .content(createReqDto.content())
                .username(createReqDto.username())
                .price(createReqDto.price())
                .createdAt(localDateTimeHolder.now())
                .updatedAt(localDateTimeHolder.now())
                .build();
    }


}
