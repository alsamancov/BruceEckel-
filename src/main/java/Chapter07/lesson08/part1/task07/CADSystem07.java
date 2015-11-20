package Chapter07.lesson08.part1.task07;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape07{
    Shape07(int i){
        System.out.println("Shape07 constructor");
    }
    void dispose(){
        System.out.println("Shape07 dispose");
    }
}
class Circle07 extends Shape07{
    Circle07(int i){
        super(i);
        System.out.println("Drawing Circle07");
    }
    void dispose(){
        System.out.println("Erasing Circle07");
        super.dispose();
    }
}
class Triangle07 extends Shape07{
    Triangle07(int i){
        super(i);
        System.out.println("Drawing Triangle07");
    }
    void dispose(){
        System.out.println("Erasing Triangle07");
        super.dispose();
    }
}
class Line07 extends Shape07{
    private int start, end;
    Line07(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line07: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line07:"
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem07 extends Shape07 {
    private Circle07 c;
    private Triangle07 t;
    private Line07[] lines = new Line07[3];
    public CADSystem07(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line07(j, j * j);
        c = new Circle07(1);
        t = new Triangle07(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem07.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem07 x = new CADSystem07(47);
        try{

        } finally{
            x.dispose();
        }
    }
}
