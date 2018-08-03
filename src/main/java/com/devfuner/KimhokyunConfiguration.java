package com.devfuner;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 부트 자동설정 테스트용 객체(Kimhokyun)의 설정 클래스
 */
@Configuration
@EnableConfigurationProperties(KimhokyunProperties.class)
public class KimhokyunConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Kimhokyun kimhokyun(KimhokyunProperties properties) {
        Kimhokyun kimhokyun = new Kimhokyun();
        kimhokyun.setName(properties.getName());
        kimhokyun.setAge(properties.getAge());

        return kimhokyun;
    }
}
