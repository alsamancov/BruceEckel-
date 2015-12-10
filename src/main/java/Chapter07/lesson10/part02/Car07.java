package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine07{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel07{
    public void inflate(int psi){}
}
class Window07{
    public void rollup(){}
    public void rolldown(){}
}
class Door07{
    public Window07 window = new Window07();
    public void open(){}
    public void close(){}
}
public class Car07 {
    public Engine07 engine = new Engine07();
    public Wheel07[] wheel = new Wheel07[4];
    public Door07
    left = new Door07(),
    right = new Door07();
    public Car07(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel07();
        }
    }
    public static void main(String[] args){
        Car07 car = new Car07();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
