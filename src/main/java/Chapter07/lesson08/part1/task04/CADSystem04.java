package Chapter07.lesson08.part1.task04;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape04{
    Shape04(int i){
        System.out.println("Shape04 constructor");
    }
    void dispose(){
        System.out.println("Shape04 constructor");
    }
}
class Circle04 extends Shape04{
    Circle04(int i){
        super(i);
        System.out.println("Drawing Circle04");
    }
    void dispose(){
        System.out.println("Erasing Cirlce04");
        super.dispose();
    }
}
class Triangle04 extends Shape04{
    Triangle04(int i){
        super(i);
        System.out.println("Drawing Triangle04");
    }
    void dispose(){
        System.out.println("Erasing Triangle04");
        super.dispose();
    }
}
class Line04 extends Shape04{
    private int start, end;
    Line04(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line04: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line04: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem04 extends Shape04 {
    private Circle04 c;
    private Triangle04 t;
    private Line04[] lines = new Line04[3];
    public CADSystem04(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line04(j, j * j);
        c = new Circle04(1);
        t = new Triangle04(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem04 x = new CADSystem04(47);
        try{

        } finally{
            x.dispose();
        }
    }
}
