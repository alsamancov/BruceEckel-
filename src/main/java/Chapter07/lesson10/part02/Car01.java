package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine01{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel01{
    public void inflate(int psi){}
}
class Window01{
    public void rollup(){}
    public void rolldown(){}
}
class Door01{
    public Window01 window = new Window01();
    public void open(){}
    public void close(){}
}
public class Car01 {
    public Engine01 engine = new Engine01();
    public Wheel01[] wheel = new Wheel01[4];
    public Door01
    left = new Door01(),
    right = new Door01();
    public Car01(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel01();
        }
    }
    public static void main(String[] args){
        Car01 car = new Car01();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
