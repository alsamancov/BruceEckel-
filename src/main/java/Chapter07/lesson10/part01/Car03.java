package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/20/2015.
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
    public Window03 window03 = new Window03();
    public void open(){}
    public void close(){}
}
public class Car03 {
    public Engine03 engine03 = new Engine03();
    public Wheel03[] wheel03 = new Wheel03[4];
    public Door03
    left = new Door03(),
    right = new Door03();
    public Car03(){
        for(int i = 0; i < 4; i++)
            wheel03[i] = new Wheel03();
    }
    public static void main(String[] args){
        Car03 car03 = new Car03();
        car03.left.window03.rollup();
        car03.wheel03[0].inflate(72);
    }
}
