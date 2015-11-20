package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 11/21/2015.
 */
class Engine08{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel08{
    public void inflate(int psi){}
}
class Window08{
    public void rollup(){}
    public void rolldown(){}
}
class Door08{
    public Window08 window08 = new Window08();
    public void open(){}
    public void close(){}
}
public class Car08 {
    public Engine08 engine08 = new Engine08();
    public Wheel08[] wheel08 = new Wheel08[4];
    public Door08
    left = new Door08(),
    right = new Door08();
    public Car08(){
        for(int i = 0; i < 4; i++){
            wheel08[i] = new Wheel08();
        }
    }
    public static void main(String[] args){
        Car08 car08 = new Car08();
        car08.left.window08.rollup();
        car08.wheel08[0].inflate(72);
    }
}
