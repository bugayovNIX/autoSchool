package com.nixsolutions.autoschool.bugayov.task4_4;

class ExceptionTryCatchHelper {
    void tryCatchSleep() {
        try {
            System.out.println("Timeout 3 sec...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
