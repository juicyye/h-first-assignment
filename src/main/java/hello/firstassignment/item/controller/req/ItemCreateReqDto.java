package hello.firstassignment.item.controller.req;

public record ItemCreateReqDto(
        String username,
        String title,
        String content,
        int price
) {

}
