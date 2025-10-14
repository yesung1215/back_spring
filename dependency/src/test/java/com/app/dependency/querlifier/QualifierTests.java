package com.app.dependency.querlifier;

import com.app.dependency.quelifier.Computer;
import com.app.dependency.quelifier.Restorant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTests {

    @Autowired
    @Qualifier("desktop")
    private Computer computer;

    @Test
    public void computerTest() {
        log.info("{}" ,computer.getScreenSize());
    }

    @Autowired
//    @Qualifier("vips")
    private Restorant restorant;

    @Test
    public void restorantTest() {
        log.info("{}" ,restorant.isSelfBar());
    }

    @Test
    public void restorantTest2() {
        log.info("{}" ,restorant.getStaekPrice());
    }
}
