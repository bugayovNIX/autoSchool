package com.nixsolutions.autoschool.bugayov.task4_3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Log4jHelper {

    private static Logger logObj = LogManager.getLogger();

    private void innerMethod() {
        logObj.debug("Private method was called.");
    }

    void outerMethod() {

        logObj.debug("Public method was called.");
        innerMethod();
    }
}