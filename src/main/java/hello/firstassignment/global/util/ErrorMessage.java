package hello.firstassignment.global.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {

    NOT_FOUND_ITEM("해당 아이템을 찾을 수 없습니다.");

    private String message;


}
