import java.util.Scanner;

public class MedicalHistoryStackDemo {
    public static void main(String[] args)
    {
        MedicalHistoryStack history = new MedicalHistoryStack();
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\n==MENU RIWAYAT MEDIS ===");
            System.out.println("1. Tambah Riwayat");
            System.out.println("2. Hapus Riwayat Terakhir");
            System.out.println("3. Lihat Riwayat Terbaru ");
            System.out.println("4. Tampilkan Semua Riwyat");
            System.out.println("5. Keluar");
            System.out.println("Pilih ");

            int pilih =sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:

                System.out.print  ("Masukan Riwayat: ");
                    String data = sc.nextLine();
                    history.push(data);
                    break;

                case 2:

                System.out.println("Dihapus: " + history.pop());
                    break;
                    
                case 3:

                System.out.println("Terbaru: " + history.peek());
                    break;
                case 4:
                    
                history.displayHistory();  
                    break;
                    
                case 5:
                    
                System.out.println("Keluar...");
                    sc.close();
                    return;
                    
                default:
                    
                System.out.println("Pilihan tidak valid!");
           
            }
        }
    }
}                                       
                                   
                                   

