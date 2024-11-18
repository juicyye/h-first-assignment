package hello.firstassignment.item.controller.req;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemCreateReqDto {
    private String username;
    private String title;
    private String content;
    private int price;
}
