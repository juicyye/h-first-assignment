/*
package hello.firstassignment.item.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.firstassignment.item.controller.req.ItemCreateReqDto;
import hello.firstassignment.item.controller.req.ItemUpdateReqDto;
import hello.firstassignment.item.service.ItemRequestMapper;
import hello.firstassignment.item.service.ItemService;
import hello.firstassignment.item.service.port.ItemRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ItemControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("createDto을 활용하여 item을 생성할 수 있다")
    void createItem() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("username", "title", "content", 100);

        // when
        ResultActions resultActions = mvc.perform(post("/post").content(objectMapper.writeValueAsString(createReqDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print());

        // then
        resultActions.andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("title"))
                .andExpect(jsonPath("$.content").value("content"))
                .andExpect(jsonPath("$.price").value(100))
                .andExpect(jsonPath("$.username").value("username"));

    }

   */
/* @Test
    @DisplayName("createDto에 데이터가 없으면 valid에 걸린다")
    void createItemWithEmpty() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("", "123", "123", 0);

        // when
        ResultActions resultActions = mvc.perform(post("/post").content(objectMapper.writeValueAsString(createReqDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print());

        // then
        resultActions.andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.code").value(-1));

    }*//*


    @Test
    @DisplayName("updateDto로 데이터를 수정할 수 있다")
    void updateItem() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("", "123", "123", 0);
        itemService.create(createReqDto);

        ItemUpdateReqDto request = new ItemUpdateReqDto("수정", "수정된 제목", "수정된 내용", 999);

        // when
        mvc.perform(put("/post/1")
                        .content(objectMapper.writeValueAsString(request)).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("수정된 제목"));

        // then
    }

    @Test
    @DisplayName("아이템을 삭제할 수 있다")
    void deleteItem() throws Exception {
        // given
        ItemCreateReqDto createReqDto = new ItemCreateReqDto("", "123", "123", 0);
        itemService.create(createReqDto);

        // when

        // then
        mvc.perform(delete("/post/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.msg").value("삭제 완료"));

    }

}*/
