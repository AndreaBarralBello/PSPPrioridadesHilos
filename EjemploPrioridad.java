public class EjemploPrioridad {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo(1);
        MiHilo hilo2 = new MiHilo(2);

        // 1. Establecer prioridades ANTES de llamar a start()
        hilo1.setPriority(Thread.MAX_PRIORITY);  
        hilo2.setPriority(Thread.MIN_PRIORITY);  

        // 2. Iniciar los hilos
        hilo1.start();
        hilo2.start();
    }
}
