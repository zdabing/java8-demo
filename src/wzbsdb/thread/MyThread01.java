package wzbsdb.thread;

public class MyThread01 extends Thread{

    @Override
    public void run() {
            System.out.println(getName() +"\t 我真不是大饼");
    }
}
