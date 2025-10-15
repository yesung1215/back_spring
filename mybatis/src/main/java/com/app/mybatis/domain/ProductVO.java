package com.app.mybatis.domain;

import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor

public class ProductVO {
    private Long id;
    private String productName;
    private Integer productPrice;
    private Integer productStock;
}
