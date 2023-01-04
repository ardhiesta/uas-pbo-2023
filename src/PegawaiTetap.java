public class PegawaiTetap implements Pegawai {
    String idPegawai, namaPegawai, alamatPegawai;
    int gajiPokok, tunjangan;

    // constructor
    public PegawaiTetap(
        String idPegawai, 
        String namaPegawai, 
        String alamatPegawai,
        int gajiPokok, 
        int tunjangan
    ){
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public int hitungGaji() {
        int gajiTotal = 0;
        gajiTotal = this.gajiPokok + this.tunjangan;
        return gajiTotal;
    }
}
