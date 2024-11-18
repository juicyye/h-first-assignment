/*
package hello.firstassignment.item.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import hello.firstassignment.item.controller.req.ItemCreateReqDto;
import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import hello.firstassignment.item.domain.Item;
import hello.firstassignment.mock.FakeItemRepository;
import hello.firstassignment.mock.FakeLocalDateTimeHolder;
import java.time.LocalDateTime;
import java.util.List;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemServiceTest {

    private ItemService itemService;
    private LocalDateTime localDateTime = LocalDateTime.of(2024, 11, 18, 10, 51);

    @BeforeEach
    void setUp() {
        FakeItemRepository repository = new FakeItemRepository();
        FakeLocalDateTimeHolder localDateTimeHolder = new FakeLocalDateTimeHolder(localDateTime);
        ItemRequestMapper itemRequestMapper = new ItemRequestMapper(localDateTimeHolder);
        itemService = new ItemService(repository, itemRequestMapper);
    }

    @Test
    @DisplayName("올바르게 값을 입력하면 아이템을 저장할 수 있다")
    void createItem() throws Exception {
        // given
        String username = "한효승";
        String title = "노트북 팝니다~!";
        String content = "이제 안쓰는 노트북을 처분하려고 해요.";
        int price = 150000;
        ItemCreateReqDto request = new ItemCreateReqDto(username, title, content, price);

        // when
        Item result = itemService.create(request);

        // then
        assertThat(result).isNotNull()
                .extracting(Item::getTitle,Item::getUsername,Item::getContent,Item::getPrice, Item::getCreatedAt)
                .containsExactlyInAnyOrder(username,title,content,price,localDateTime);
    }

    @Test
    @DisplayName("올바르게 값을 입력하면 아이템을 조회할 수 있다")
    void getItem() throws Exception {
        // given
        String username = "한효승";
        String title = "노트북 팝니다~!";
        String content = "이제 안쓰는 노트북을 처분하려고 해요.";
        int price = 150000;
        ItemCreateReqDto request = new ItemCreateReqDto(username, title, content, price);
        itemService.create(request);

        // when
        List<Item> results = itemService.getAllItems();

        // then
        assertThat(results).hasSize(1)
                .extracting(Item::getTitle,Item::getUsername,Item::getContent,Item::getPrice)
                .containsExactlyInAnyOrder(Tuple.tuple(title,username,content,price));
    }

    @Test
    @DisplayName("올바르게 값을 입력하면 아이템을 수정할 수 있다")
    void updateItem() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("hi", "title", "content", 1000);
        itemService.create(createReqDto);
        String username = "항해";
        String title = "수정된 노트북";
        String content = "수정된 내용";
        int price = 150000;
        ItemUpdateReqDto request = new ItemUpdateReqDto(username, title, content, price);

        // when
        Item result = itemService.updateItemById(1L, request);

        // then
        assertThat(result).isNotNull()
                .extracting(Item::getTitle,Item::getUsername,Item::getContent,Item::getPrice)
                .containsExactlyInAnyOrder(title,username,content,price);
    }

    @Test
    @DisplayName("아이템을 삭제할 수 있다")
    void deleteItem() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("hi", "title", "content", 1000);
        itemService.create(createReqDto);
        itemService.deleteItemById(1L);

        // when
        List<Item> results = itemService.getAllItems();

        // then
        assertThat(results).hasSize(0);
    }
}*/
