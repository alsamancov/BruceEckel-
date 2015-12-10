package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine02{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel02{
    public void inflate(int psi){}
}
class Window02{
    public void rollup(){}
    public void rolldown(){}
}
class Door02{
    public Window02 window = new Window02();
    public void open(){}
    public void close(){}
}
public class Car02 {
    public Engine02 engine = new Engine02();
    public Wheel02[] wheel = new Wheel02[4];
    public Door02
    left = new Door02(),
    right = new Door02();
    public Car02(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel02();
        }
    }
    public static void main(String[] args){
        Car02 car = new Car02();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
