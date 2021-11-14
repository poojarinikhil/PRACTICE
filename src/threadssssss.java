class mythread extends Thread{
    public void run(){
//        while(true){
            System.out.println("good morning");
//        }
    }
}
class mythread1 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("welcome");
        }
    }
}
public class threadssssss {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.setPriority(6);
        t1.start();
        mythread1 t2 = new mythread1();
        System.out.println(Thread.currentThread().getState());
        System.out.println(t2.getState());
        t2.setPriority(4);
        t2.start();
        System.out.println(t2.getState());
    }
}
