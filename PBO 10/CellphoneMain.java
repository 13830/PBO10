package Minggu11;

public class CellphoneMain {
    public static void main(String[] args) {
    Cellphone cp = new Cellphone("Xiaomi", "Redmi note 9");
    cp.powerOn();
    cp.volumeUp();
    cp.volumeUp();
    cp.volumeDown();
    cp.powerOff();
    cp.powerOff();
    cp.topUpPulsa(50000);
    int sisaPulsa = cp.getSisaPulsa();
    System.out.println("Sisa pulsa: " + sisaPulsa);
    cp.tambahKontak("Achmad Arif Viansyah", "081325020188");
    cp.tambahKontak("Shany", "08533888912");
    cp.lihatSemuaKontak();
    cp.cariKontak("Riri");
    cp.cariKontak("Arif Viansyah");
  }
}