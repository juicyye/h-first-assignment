package hello.firstassignment.common.controller;

public record ResponseDto<T>(
        Integer code,
        String message,
        T data
) {
}
