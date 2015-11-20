package Chapter07.lesson08.part1.task08;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape08{
    Shape08(int i){
        System.out.println("Shape08 constructor");
    }
    void dispose(){
        System.out.println("Shape08 dispose");
    }
}
class Circle08 extends Shape08{
    Circle08(int i){
        super(i);
        System.out.println("Drawing Circle08");
    }
    void dispose(){
        System.out.println("Erasing Circle08");
        super.dispose();
    }
}
class Triangle08 extends Shape08{
    Triangle08(int i){
        super(i);
        System.out.println("Drawing Triangle08");
    }
    void dispose(){
        System.out.println("Erasing Triangle08");
        super.dispose();
    }
}
class Line08 extends Shape08{
    private int start, end;
    Line08(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem08 extends Shape08{
    private Circle08 c;
    private Triangle08 t;
    private Line08[] lines = new Line08[3];
    public CADSystem08(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line08(j, j * j);
        c = new Circle08(1);
        t = new Triangle08(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem08.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem08 x = new CADSystem08(47);
        try{

        }finally{
            x.dispose();
        }
    }
}
