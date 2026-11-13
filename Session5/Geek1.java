package Session5;
import java.io.*;
import java.util.*;

class MyThread extends Thread {

    // initiated run method for Thread
    public void run() {

        String str = "Thread Started Running...";
        System.out.println(str);
    }
}

public class Geek1 {

    public static void main(String args[]) {

        MyThread t1 = new MyThread();
        t1.start();
    }
}