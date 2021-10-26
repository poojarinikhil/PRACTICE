class rectangle{
    int height;
    int breath;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    int area(){
        return this.height*this.breath;
    }
}
class cylinder extends rectangle{
    int lenght;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    int volume(){
        return this.lenght*this.breath*this.height;
    }
}
public class Volume_and_area {
    public static void main(String[] args) {
        rectangle a = new rectangle();
        a.setBreath(5);
        a.setHeight(6);
        System.out.println("Area of rectangle is "+a.area());
        cylinder b = new cylinder();
        b.setLenght(3);
        b.setBreath(5);
        b.setLenght(8);
        System.out.println("The volume of cylinder is "+b.volume());
    }
}
