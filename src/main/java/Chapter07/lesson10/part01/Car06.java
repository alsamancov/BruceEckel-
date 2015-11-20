package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/21/2015.
 */
class Engine06{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel06{
    public void inflate(int psi){}
}
class Window06{
    public void rollup(){}
    public void rolldown(){}
}
class Door06{
    public Window06 window06 = new Window06();
    public void open(){}
    public void close(){}
}
public class Car06 {
    public Engine06 engine06 = new Engine06();
    public Wheel06[] wheel06 = new Wheel06[4];
    public Door06
    left = new Door06(),
    right = new Door06();
    public Car06(){
        for(int i = 0; i < 4; i++){
            wheel06[i] = new Wheel06();
        }
    }
    public static void main(String[] args){
        Car06 car06 = new Car06();
        car06.left.window06.rolldown();
        car06.wheel06[0].inflate(72);
    }
 }
