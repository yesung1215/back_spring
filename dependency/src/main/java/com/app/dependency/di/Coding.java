package com.app.dependency.di;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class Coding {
    final private Computer computer = new Computer(); // 컴파일러 들어간 시점 생성자가 들어갈때 주입 final 그 후 객체화 되면 막음

//  생성자 주입을 받자
//    @Autowired
//    public Coding(Computer computer) {
//        this.computer = computer;
//    }

}
