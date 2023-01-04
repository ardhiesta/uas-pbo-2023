import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPrint extends Thread {
    PegawaiTetap[] arPegawaiTetap;
    PegawaiHonorer[] arPegawaiHonorer;

    public ThreadPrint(PegawaiTetap[] arPegawaiTetap) {
        this.arPegawaiTetap = arPegawaiTetap;
    }

    public ThreadPrint(PegawaiHonorer[] arPegawaiHonorer) {
        this.arPegawaiHonorer = arPegawaiHonorer;
    }

    public void run() {
        // ambil nama main thread
        String namaThread = Thread.currentThread().getName();
        System.out.println("Nama thread utama : " + namaThread);

        // format tanggal dan waktu, sampai detik
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        if (arPegawaiTetap != null) {
            for (int i = 0; i < arPegawaiTetap.length; i++) {
                try {
                    // pause main thread
                    // memberi jeda waktu 1000 ms
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
                // print
                // main thread melakukan print 10x + info waktu
                System.out.println(
                    "thread " + namaThread + ", print id : " +  
                    arPegawaiTetap[i].idPegawai
					+ ", pada " + formatter.format(new Date())
                );
            }
        }

        if (arPegawaiHonorer != null) {
            for (int i = 0; i < arPegawaiHonorer.length; i++) {
                try {
                    // pause main thread
                    // memberi jeda waktu 1000 ms
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
                // print
                // main thread melakukan print 10x + info waktu
                System.out.println(
                    "thread " + namaThread + ", print id : " +  
                    arPegawaiHonorer[i].idPegawai
					+ ", pada " + formatter.format(new Date())
                );
            }
        }
    }
}
