package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 12/09/2015.
 */
class Engine11{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel11{
    public void inflate(int psi){}
}
class Window11{
    public void rollup(){}
    public void rolldown(){}
}
class Door11{
    public Window11 window11 = new Window11();
    public void open(){}
    public void close(){}
}
public class Car11 {
    public Engine11 engine = new Engine11();
    public Wheel11[] wheel = new Wheel11[4];
    public Door11
    left = new Door11(),
    right = new Door11();
    public Car11(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel11();
        }
    }
    public static void main(String[] args){
        Car11 car = new Car11();
        car.left.window11.rollup();
        car.wheel[0].inflate(72);
    }
}
