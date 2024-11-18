package hello.firstassignment.item.controller.req;

public record ItemUpdateReqDto(
        String username,
        String title,
        String content,
        int price
) {
}
