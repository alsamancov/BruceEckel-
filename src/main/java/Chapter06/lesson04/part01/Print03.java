package Chapter06.lesson04.part01;

import java.io.PrintStream;

/**
 * Created by Алексей on 11/13/2015.
 */
public class Print03 {
    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void print(){
        System.out.println();
    }

    public static void printnb(Object obj){
        System.out.print(obj);
    }

    public static PrintStream
    printf(String format, Object... args){
        return System.out.printf(format, args);
    }
}
