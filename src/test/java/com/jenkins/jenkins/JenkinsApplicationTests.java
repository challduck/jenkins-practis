package com.jenkins.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void throwException(){
        throw new RuntimeException("빌드에 실패한다.");
    }
}
