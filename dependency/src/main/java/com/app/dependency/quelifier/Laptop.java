package com.app.dependency.quelifier;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class Laptop implements Computer {
    @Override
    public int getScreenSize() {
        return 1920;
    }
}
