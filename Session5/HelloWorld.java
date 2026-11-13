package Session5;
class Threadsi extends Thread {
    @Override 
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Threadsi T1 = new Threadsi();
        T1.start();
    }
}