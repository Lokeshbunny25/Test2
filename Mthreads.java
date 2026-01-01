//package project.Test2;

class MulTh extends Thread{
    public void run(){
        System.out.println("thread is executed");
    }
}
public class Mthreads{
    public static void main(String[] args) {
        MulTh th = new MulTh();
        th.start();
    }
    
}

