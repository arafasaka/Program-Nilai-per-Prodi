package tugas.bab.pkg5.kelompok43;
class TugasBab5Kelompok43 extends Prodi {
    String prodi3;
    TugasBab5Kelompok43 (String k, String p, String l){
        super(k, p, l);
            prodi3 = l;
    }

    public static void perkenalan() {
        fungsi objek = new fungsi();
        objek.pembatasa();
        System.out.println("            Selamat datang di Program Kelompok 43");
    }
    
    String getProdi (String k, String p, String l){
        return super.getProdi() + Ün3. "+ prodi3;
    }

    public static void main(String[] args) {
        perkenalan();
        InputOutput java = new InputOutput();            
        TugasBab5Kelompok43 a1 = new TugasBab5Kelompok43("Teknik Komputer", "Teknik Perkapalan, "Teknik Lingkungan");
        System.out.println(a1.getProdi());
        java.jurusan();
    }
}
