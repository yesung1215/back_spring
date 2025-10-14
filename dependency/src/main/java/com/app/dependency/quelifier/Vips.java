package com.app.dependency.quelifier;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class Vips implements Restorant {
    @Override
    public boolean isSelfBar() {
        return true;
    }

    @Override
    public int getStaekPrice() {
        return 29000;
    }
}
