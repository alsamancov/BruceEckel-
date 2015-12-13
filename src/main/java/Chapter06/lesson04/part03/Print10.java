package Chapter06.lesson04.part03;

import java.io.*;

/**
 * Created by Alexey on 12/13/2015.
 */
public class Print10 {
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
