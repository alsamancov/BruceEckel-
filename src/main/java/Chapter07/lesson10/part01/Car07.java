package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/21/2015.
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
    public Window07 window07 = new Window07();
    public void open(){}
    public void close(){}
}
public class Car07 {
    public Engine07 engine07 = new Engine07();
    public Wheel07[] wheel07 = new Wheel07[4];
    public Door07
    left = new Door07(),
    right = new Door07();
    public Car07(){
        for(int i = 0; i < 4; i++){
            wheel07[i] = new Wheel07();
        }
    }
    public static void main(String[] args){
        Car07 car07 = new Car07();
        car07.left.window07.rollup();
        car07.wheel07[0].inflate(72);
    }
}
