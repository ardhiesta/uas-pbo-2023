public class PegawaiHonorer implements Pegawai {
    String idPegawai, namaPegawai, alamatPegawai; 
    int gajiPokok;

    // constuctor
    public PegawaiHonorer(
        String idPegawai, 
        String namaPegawai, 
        String alamatPegawai,
        int gajiPokok
    ){
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public int hitungGaji() {
        int gajiTotal = gajiPokok;
        return gajiTotal;
    }
}
