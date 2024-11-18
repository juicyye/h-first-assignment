package hello.firstassignment.item.controller.req;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ItemUpdateReqDto(
        @NotEmpty(message = "유저이름을 입력해주세요")
        String username,
        @NotEmpty(message = "제목을 입력해주세요")
        String title,
        @NotEmpty(message = "내용을 입력해주세요")
        String content,
        @NotNull(message = "가격 입력해주세요")
        int price
) {
}
