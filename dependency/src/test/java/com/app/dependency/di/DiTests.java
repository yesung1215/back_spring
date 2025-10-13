package com.app.dependency.di;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DiTests {

    @Autowired
    private Coding coding;

    @Test
    public void diTest01() {
        Computer computer = new Computer();
        log.info(computer.toString());
        log.info(coding.getComputer().toString());
    }


}
