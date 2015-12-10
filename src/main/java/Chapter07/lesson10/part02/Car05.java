package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine05{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel05{
    public void inflate(int psi){}
}
class Window05{
    public void rollup(){}
    public void rolldown(){}
}
class Door05{
    public Window05 window = new Window05();
    public void open(){}
    public void close(){}
}
public class Car05 {
    public Engine05 engine = new Engine05();
    public Wheel05[] wheel = new Wheel05[4];
    public Door05
    left = new Door05(),
    right = new Door05();
    public Car05(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel05();
        }
    }
    public static void main(String[] args){
        Car05 car = new Car05();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
