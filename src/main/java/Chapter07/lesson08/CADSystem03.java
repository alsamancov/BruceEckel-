package Chapter07.lesson08;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape03{
    Shape03(int i){
        System.out.println("Shape03 constructor");
    }
    void dispose(){
        System.out.println("Shape03 dispose");
    }
}
class Circle03 extends Shape03{
    Circle03(int i){
        super(i);
        System.out.println("Drawing Circle03");
    }
    void dispose(){
        System.out.println("Erasing Circle03");
        super.dispose();
    }
}
class Triangle03 extends Shape03{
    Triangle03(int i){
        super(i);
        System.out.println("Drawing Triangle03");
    }
    void dispose(){
        System.out.println("Erasing Triangle03");
        super.dispose();
    }
}
class Line03 extends Shape03{
    private int start, end;
    Line03(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line03: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line03: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem03 extends Shape03{
    private Circle03 c;
    private Triangle03 t;
    private Line03[] lines = new Line03[3];
    public CADSystem03(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line03(j, j * j);
        c = new Circle03(1);
        t = new Triangle03(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem03.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem03 x = new CADSystem03(47);
        try{

        } finally{
            x.dispose();
        }
    }
}
