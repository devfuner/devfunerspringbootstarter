package com.devfuner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 부트 자동설정 테스트용 객체(Kimhokyun)의 설정 클래스
 */
@Configuration
public class KimhokyunConfiguration {

    @Bean
    public Kimhokyun kimhokyun() {
        Kimhokyun kimhokyun = new Kimhokyun();
        kimhokyun.setName("김호균");
        kimhokyun.setAge(36);

        return kimhokyun;
    }
}
