package Chapter07.lesson08.part1.task02;

/**
 * Created by Alexey on 11/20/2015.
 */
class Shape02{
    Shape02(int i){
        System.out.println("Shape02 constructor");
    }
    void dispose(){
        System.out.println("Shape02 dispose");
    }
}
class Circle02 extends Shape02{
    Circle02(int i){
        super(i);
        System.out.println("Drawing Circle02");
    }
    void dispose(){
        System.out.println("Erasing Circle02");
        super.dispose();
    }
}
class Triangle02 extends Shape02{
    Triangle02(int i){
        super(i);
        System.out.println("Drawing Triangle02");
    }
    void dispose(){
        System.out.println("Erasing Triangle02");
        super.dispose();
    }
}
class Line02 extends Shape02{
    private int start, end;
    Line02(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line02: "
                + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing Line: "
                + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem02 extends Shape02{
    private Circle02 c02;
    private Triangle02 t02;
    private Line02[] lines = new Line02[3];
    public CADSystem02(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++){
            lines[j] = new Line02(j, j * j);
        }
        c02 = new Circle02(1);
        t02 = new Triangle02(1);
        System.out.println("Combined constructor");
    }
    public void dispose(){
        System.out.println("CADSystem02.dispose()");
        t02.dispose();
        c02.dispose();
        for(int i = lines.length - 1; i >= 0; i--){
            lines[i].dispose();
        }
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem02 x = new CADSystem02(47);
        try{

        } finally{
            x.dispose();
        }
    }
}
