package praktek.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import model.Mahasiswa;

public class PraktekList {

    public static void main(String[] args) {
        //System.out.println("testing");
        
        List <Mahasiswa> mhs = new ArrayList();
        
        mhs.add(new Mahasiswa("Si A", "16523001", 3.1));
        mhs.add(new Mahasiswa("Si B", "16523002", 3.2));
        mhs.add(new Mahasiswa("Si C", "16523003", 3.3));
        mhs.add(new Mahasiswa("Si D", "16523004", 3.4));
        mhs.add(new Mahasiswa("Si E", "16523005", 3.5));
        
        for(Mahasiswa m: mhs){
           System.out.println( m.getNama());
           System.out.println( m.getNim());
           System.out.println( m.getIpk());
           System.out.println("--------------");
        }
        
        System.out.println("Panjang list : " + mhs.size());
        System.out.println("--------------");
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Edir list ke : ");
        n = sc.nextInt();
        System.out.print("Data yang diedit: ");
        System.out.println(mhs.get(n).getNama());
        System.out.println(mhs.get(n).getNim());
        System.out.println(mhs.get(n).getIpk());
        
        mhs.set(n, new Mahasiswa("Editan", "16523xxx", 3.6));
        System.out.println("Data telah dirubah");
        System.out.println("--------------");
        
        for(Mahasiswa m: mhs){
           System.out.println( m.getNama());
           System.out.println( m.getNim());
           System.out.println( m.getIpk());
           System.out.println("--------------");
        }
        
        System.out.print("Hapus list ke : ");
        n = sc.nextInt();
        System.out.print("Data yang dihapus: ");
        
        Iterator <Mahasiswa> petunjuk = mhs.iterator();
        
        for(int i=0; i<n; i++){
            petunjuk.next();
        }
        
        Mahasiswa elemen = petunjuk.next();
        System.out.println( elemen.getNama());
        System.out.println( elemen.getNim());
        System.out.println( elemen.getIpk());
        System.out.println("--------------"); 
        
        mhs.remove(n);
        System.out.println("Data telah dihapus");
        System.out.println("--------------"); 
        
        for(Mahasiswa m: mhs){
           System.out.println( m.getNama());
           System.out.println( m.getNim());
           System.out.println( m.getIpk());
           System.out.println("--------------");
        }
        
        
        
    }
    
    
}
