package com.logback.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by qiang on 2017/11/6.
 */
public class LogbackFileTest {
    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger log = LoggerFactory.getLogger(LogbackFileTest.class);

    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            log.trace("======trace");
            log.debug("======debug");
            log.info("======info");
            log.warn("======warn");
            log.error("======error");
        }
    }
}
