package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine03{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel03{
    public void inflate(int psi){}
}
class Window03{
    public void rollup(){}
    public void rolldown(){}
}
class Door03{
    public Window03 window = new Window03();
    public void open(){}
    public void close(){}
}
public class Car03 {
    public Engine03 engine = new Engine03();
    public Wheel03[] wheel = new Wheel03[4];
    public Door03
    left = new Door03(),
    right = new Door03();
    public Car03(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel03();
        }
    }
    public static void main(String[] args){
        Car03 car = new Car03();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
