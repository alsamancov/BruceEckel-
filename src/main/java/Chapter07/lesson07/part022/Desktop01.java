package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/05/2015.
 */
class Paper01{
    Paper01(int i){
        System.out.println("Paper01 constructor");
    }
}
class Document01 extends Paper01{
    Document01(int i){
        super(i);
        System.out.println("Document01 constructor");
    }
}
class WritingUtensil01{
    WritingUtensil01(int i){
        System.out.println("Utensil01 constructor");
    }
}
class Pen01 extends WritingUtensil01{
    Pen01(int i){
        super(i);
        System.out.println("Pen01 constructor");
    }
}
class Pencil01 extends WritingUtensil01{
    Pencil01(int i){
        super(i);
        System.out.println("Pencil01 constructor");
    }
}
class Scissors01 extends WritingUtensil01{
    Scissors01(int i){
        super(i);
        System.out.println("Scissors01 constructor");
    }
}
class Writer01{
    Writer01(int i){
        System.out.println("Writer01 constructor");
    }
}
public class Desktop01 extends Writer01{
    private Pen01 pn;
    private Pencil01 pncl;
    private Scissors01 scr;
    private Document01 doc;
    public Desktop01(int i){
        super(i + 1);
        pn = new Pen01(i + 2);
        pncl = new Pencil01(i + 3);
        scr = new Scissors01(i + 4);
        doc = new Document01(i + 5);
        System.out.println("Desktop01 constructor");
    }
    public static void main(String[] args){
        Desktop01 x = new Desktop01(9);
    }
}
