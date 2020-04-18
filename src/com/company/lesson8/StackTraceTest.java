package com.company.lesson8;

public class StackTraceTest {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        for (StackTraceElement element : stackTrace){
            System.out.println(element.getClassName() + "  " + element.getFileName()
            + "   " + element.getMethodName() + "  "+ element.getLineNumber());
        }
    }
public static void methods(){

}
}
