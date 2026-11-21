public class MiHilo extends Thread {
    private int id;

    public MiHilo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + id + ": " + i);
           
        }
    }
}
