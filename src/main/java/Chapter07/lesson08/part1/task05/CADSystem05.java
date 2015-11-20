package Chapter07.lesson08.part1.task05;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape05{
    Shape05(int i){
        System.out.println("Shape05 constructor");
    }
    void dispose(){
        System.out.println("Shape05 dispose");
    }
}
class Circle05 extends Shape05{
    Circle05(int i){
        super(i);
        System.out.println("Drawing Circle05");
    }
    void dispose(){
        System.out.println("Erasing Circle05");
        super.dispose();
    }
}
class Triangle05 extends Shape05{
    Triangle05(int i){
        super(i);
        System.out.println("Drawing Triangle05");
    }
    void dispose(){
        System.out.println("Erasing Triangle05");
        super.dispose();
    }
}
class Line05 extends Shape05{
    private int start, end;
    Line05(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing05 Line: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line05: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem05 extends Shape05{
    private Circle05 c;
    private Triangle05 t;
    private Line05[] lines = new Line05[3];
    public CADSystem05(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line05(j, j * j);
        c = new Circle05(1);
        t = new Triangle05(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem05.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem05 x = new CADSystem05(47);
        try{

        } finally{
            x.dispose();
        }
    }
}
