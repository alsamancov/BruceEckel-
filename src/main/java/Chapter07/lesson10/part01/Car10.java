package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 12/09/2015.
 */
class Engine10{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel10{
    public void inflate(int psi){}
}
class Window10{
    public void rollup(){}
    public void rolldown(){}
}
class Door10{
    public Window10 window = new Window10();
    public void open(){}
    public void close(){}
}
public class Car10 {
    public Engine10 engine10 = new Engine10();
    public Wheel10[] wheel = new Wheel10[4];
    public Door10
    left = new Door10(),
    right = new Door10();
    public Car10(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel10();
        }
    }
    public static void main(String[] args){
        Car10 car = new Car10();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
