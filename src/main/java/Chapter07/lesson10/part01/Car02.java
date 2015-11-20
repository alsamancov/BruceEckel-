package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/20/2015.
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
    public Window02 window02 = new Window02();
    public void open(){}
    public void close(){}
}
public class Car02 {
    public Engine02 engine02 = new Engine02();
    public Wheel02[] wheel02 = new Wheel02[4];
    public Door02
    left = new Door02(),
    right = new Door02();
    public Car02(){
        for(int i = 0; i < 4; i++)
            wheel02[i] = new Wheel02();
    }
    public static void main(String[] args){
        Car02 car02 = new Car02();
        car02.left.window02.rollup();
        car02.wheel02[0].inflate(72);
    }
}
