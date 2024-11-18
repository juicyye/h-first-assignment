package hello.firstassignment.item.controller.resp;

import hello.firstassignment.item.domain.Item;

public record ItemCreateRespDto(
        Long id,
        String username,
        String title,
        String content,
        int price
) {

    public static ItemCreateRespDto from(Item item) {
        return new ItemCreateRespDto(item.getId(), item.getUsername(),
                item.getTitle(), item.getContent(),
                item.getPrice());
    }
}
