package com.app.mybatis.mapper;

import com.app.mybatis.domain.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void insertTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("솜이마우스");
        productVO.setProductPrice(18000);
        productVO.setProductStock(45);
        productMapper.insert(productVO);
    }

    @Test
    public void deleteTest(){
        productMapper.delete(5L);
    }

    @Test
    public void selectTest(){
        productMapper.select(1L).map(ProductVO::toString).ifPresent(log::info);
    };

    @Test
    public void selectAllTest(){
        List<ProductVO> products = productMapper.selectAll();
        products.stream().map(ProductVO::toString).forEach(log::info);
    }

    @Test
    public void updateTest(){
        ProductVO productVO = new ProductVO();
        productVO.setId(1L);
        productVO.setProductName("솜이 가방");
        productVO.setProductPrice(21000);
        productVO.setProductStock(35);
        productMapper.update(productVO);
    }

}
