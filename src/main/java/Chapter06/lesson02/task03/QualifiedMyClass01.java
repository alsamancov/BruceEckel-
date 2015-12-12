package Chapter06.lesson02.task03;

/**
 * Created by Alexey on 12/12/2015.
 */
public class QualifiedMyClass01 {
    public static void main(String[] args){
        Chapter06.lesson02.task03.mypackage.MyClass01 m =
                new Chapter06.lesson02.task03.mypackage.MyClass01();
        System.out.println(m);
    }
}
