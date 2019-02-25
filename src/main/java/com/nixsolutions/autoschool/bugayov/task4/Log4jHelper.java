package com.nixsolutions.autoschool.bugayov.task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jHelper {

    static Logger logObj = LogManager.getLogger();

    private void innerMeth() {
        logObj.debug("Private method was called.");
    }

    public void outerMeth() {

        logObj.debug("Public method was called.");
        innerMeth();
    }
}