public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        while (true){
            System.out.println("Pedik");
        }
        
    }
}

class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Hello World" + i);
            i++;
        }
    }
}