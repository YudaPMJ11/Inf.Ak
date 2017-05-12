package model;

public class Mahasiswa {
   String nama;
   String nim;
   Double ipk;
   
   public Mahasiswa(String na, String ni, Double i){
       this.nama = na;
       this.nim = ni;
       this.ipk = i;
   }
   
   public String getNama(){
       return this.nama;
   }
   
   public String getNim(){
       return this.nim;
   }
   
   public Double getIpk(){
       return this.ipk;
   }
 
    
}
