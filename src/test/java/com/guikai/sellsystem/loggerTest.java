package com.guikai.sellsystem;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class loggerTest {
    @Test
    public void test1(){
        log.info("INFO:xxxx");
        log.debug("Debug...");
        log.error("Error...");
    }
}
