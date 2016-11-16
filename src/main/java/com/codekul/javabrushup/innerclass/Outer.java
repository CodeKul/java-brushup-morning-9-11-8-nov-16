package com.codekul.javabrushup.innerclass;

/**
 * Created by aniruddha on 16/11/16.
 */
public class Outer {

    private /*static*/ int outerInt;
    public class SimpleInner {

        public void simpleInnerMethod(){
            outerInt = 10;
        }
    }

    public static class StaticInner  {

        public static void staticInner(){

            //SimpleInner inner = new SimpleInner();
            outerMethod();
        }
    }

    public static void outerMethod(){

        final class LocalInner {

            public void localInnerMethod(){
                System.out.println("Local Inner Method");
            }
        }

        LocalInner inner = new LocalInner();
        inner.localInnerMethod();
    }
}
