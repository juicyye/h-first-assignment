package hello.firstassignment.item.infrastrcuture;

import hello.firstassignment.item.domain.Item;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static ItemEntity fromDomain(Item item) {
        return ItemEntity.builder()
                .id(item.getId())
                .title(item.getTitle())
                .content(item.getContent())
                .price(item.getPrice())
                .username(item.getUsername())
                .createdAt(item.getCreatedAt())
                .updatedAt(item.getUpdatedAt())
                .build();
    }


    public Item toDomain(){
        return Item.builder()
                .id(id)
                .title(title)
                .content(content)
                .price(price)
                .username(username)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
