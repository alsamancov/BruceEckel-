package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
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
    public Window06 window = new Window06();
    public void open(){}
    public void close(){}
}
public class Car06 {
    public Engine06 engine = new Engine06();
    public Wheel06[] wheel = new Wheel06[4];
    public Door06
    left = new Door06(),
    right = new Door06();
    public Car06(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel06();
        }
    }
    public static void main(String[] args){
        Car06 car = new Car06();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
