package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/21/2015.
 */
class Engine05{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel05{
    public void inflate(int psi){}
}
class Window05{
    public void rollup(){}
    public void rolldown(){}
}
class Door05{
    public Window05 window05 = new Window05();
    public void open(){}
    public void close(){}
}
public class Car05 {
    public Engine05 engine05 = new Engine05();
    public Wheel05[] wheel05 = new Wheel05[4];
    public Door05
    left = new Door05(),
    right = new Door05();
    public Car05(){
        for(int i = 0; i < 4; i++){
            wheel05[i] = new Wheel05();
        }
    }
    public static void main(String[] args){
        Car05 car05 = new Car05();
        car05.left.window05.rollup();
        car05.wheel05[0].inflate(72);
    }
}
