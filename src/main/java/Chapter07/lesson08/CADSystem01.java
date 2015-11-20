package Chapter07.lesson08;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape01{
    Shape01(int i){
        System.out.println("Shape01 constructor");
    }
    void dispose(){
        System.out.println("Shape01 constructor");
    }
}
class Circle01 extends Shape01{
    Circle01(int i){
        super(i);
        System.out.println("Drawing Circle01");
    }
    void dispose(){
        System.out.println("Erasing Circle01");
        super.dispose();
    }
}
class Triangle01 extends Shape01{
    Triangle01(int i){
        super(i);
        System.out.println("Drawing Triangle01");
    }
    void dispose(){
        System.out.println("Erasing Triangle01");
        super.dispose();
    }
}
class Line01 extends Shape01{
    private int start, end;
    Line01(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line01: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line01: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem01 extends Shape01{
    private Circle01 c;
    private Triangle01 t;
    private Line01[] lines = new Line01[3];
    public CADSystem01(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++){
            lines[j] = new Line01(j, j*j);
        }
        c = new Circle01(1);
        t = new Triangle01(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--){
            lines[i].dispose();
        }
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem01 x = new CADSystem01(47);
        try{

        }finally{
            x.dispose();
        }
    }
}
