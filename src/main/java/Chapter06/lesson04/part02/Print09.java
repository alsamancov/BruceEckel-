package Chapter06.lesson04.part02;

import java.io.PrintStream;

/**
 * Created by Alexey on 12/12/2015.
 */
public class Print09 {
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
