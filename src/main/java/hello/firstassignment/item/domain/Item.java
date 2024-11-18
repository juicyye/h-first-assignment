package hello.firstassignment.item.domain;

import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private Long id;
    private String title;
    private String content;
    private int price;
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void update(ItemUpdateReqDto updateReqDto) {
        this.title = updateReqDto.title();
        this.content = updateReqDto.content();
        this.price = updateReqDto.price();
        this.username = updateReqDto.username();
        this.updatedAt = LocalDateTime.now();
    }

}
