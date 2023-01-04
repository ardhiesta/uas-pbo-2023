public class App {
    public static void main(String[] args) throws Exception {
        // input 5 PegawaiTetap
        PegawaiTetap[] arPegawaiTetap = new PegawaiTetap[5];
        arPegawaiTetap[0] = new PegawaiTetap("001", "Cipto Uchiha", 
        "Telogakure", 2500000, 1500000);
        arPegawaiTetap[1] = new PegawaiTetap("002", "Kartono Johnson", 
        "Bucin Village", 4500000, 500000);
        arPegawaiTetap[2] = new PegawaiTetap("003", "Trimo Maxwell", 
        "Telogakure", 2250000, 1500000);
        arPegawaiTetap[3] = new PegawaiTetap("004", "Mizukage Nyoto", 
        "Desa Uhui", 2000000, 1250000);
        arPegawaiTetap[4] = new PegawaiTetap("005", "Suparni Mc Allister", 
        "Telogakure", 1800000, 2500000);

        PegawaiHonorer[] arPegawaiHonorer = new PegawaiHonorer[5];
        arPegawaiHonorer[0] = new PegawaiHonorer("006", "Budi Kalrx", 
        "Nyangkrukgakure", 2000000);
        arPegawaiHonorer[1] = new PegawaiHonorer("007", "Siti Mizukage", 
        "Telogakure", 1000000);
        arPegawaiHonorer[2] = new PegawaiHonorer("008", "Joko Karlheinz Steiger", 
        "Santuygakure", 1200000);
        arPegawaiHonorer[3] = new PegawaiHonorer("009", "Median Spinoza", 
        "Telogakure", 1900000);
        arPegawaiHonorer[4] = new PegawaiHonorer("010", "Rosidi Lagerfeld", 
        "Magergakure", 1400000);

        ThreadPrint tp1 = new ThreadPrint(arPegawaiTetap);
        ThreadPrint tp2 = new ThreadPrint(arPegawaiHonorer);
        tp1.start();
        tp2.start();
    }
}
