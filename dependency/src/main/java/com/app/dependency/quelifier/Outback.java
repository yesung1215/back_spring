package com.app.dependency.quelifier;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Data
@Primary
public class Outback implements Restorant {
    @Override
    public boolean isSelfBar() {
        return false;
    }

    public int getStaekPrice() {
        return 49000;
    }
}
