package com.app.dependency.quelifier;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class Desktop implements Computer {
    @Override
    public int getScreenSize() {
        return 2560;
    }
}
