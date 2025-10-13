package com.app.dependency.di;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Coding {
    @Autowired
    private Computer computer;
}
