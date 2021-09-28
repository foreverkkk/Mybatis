package com.zk.log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class log4jTest {
    static Logger logger = Logger.getLogger(log4jTest.class);

    @Test
    public void test(){
        logger.info("info:进入了log4j");
        logger.debug("info:进入了log4j");
        logger.error("info:进入了log4j");
    }
}
