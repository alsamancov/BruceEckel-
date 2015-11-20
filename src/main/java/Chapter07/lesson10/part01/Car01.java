package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/20/2015.
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
    public Window01 window01 = new Window01();
    public void open(){}
    public void close(){}
}
public class Car01 {
    public Engine01 engine01 = new Engine01();
    public Wheel01[] wheel01 = new Wheel01[4];
    public Door01
    left = new Door01(),
    right = new Door01();
    public Car01(){
        for(int i = 0; i < 4; i++)
            wheel01[i] = new Wheel01();
    }
    public static void main(String[] args){
        Car01 car01 = new Car01();
        car01.left.window01.rollup();
        car01.wheel01[0].inflate(72);
    }
 }
