
package Syahrul07185_Main;
import Syahrul07185_Controller.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class syahrul07185_Main {
    private syahrul07185_UserController syahrul07185_User = new syahrul07185_UserController();
     private SimpleDateFormat syahrul07185_sdf= new SimpleDateFormat("dd-MM-yyyy");
       private Calendar syahrul07185_tgl = Calendar.getInstance();
    private  Scanner syahrul07185_input=new Scanner(System.in);
    private syahrul07185_AllObjectController syahrul07185_allObject = new syahrul07185_AllObjectController();
    public static void main(String[] args) {
         syahrul07185_Main syahrul07185_Data= new syahrul07185_Main();
           int syahrul07185_pil;
     
           do{
                 System.out.println("1.Daftar Akun");
        System.out.println("2.Login");
        System.out.println("3.hapus Data");
        System.out.println("4.Update Data");
        System.out.println("5.View");
        System.out.println("6.Exit");
        System.out.print("Pilih = ");
         syahrul07185_pil=syahrul07185_Data.syahrul07185_input.nextInt();
         switch(syahrul07185_pil){
               case 1:
                 syahrul07185_Data.syahrul07185_daftar();
                break;
                case 2:
                System.out.print("Email = ");
                String syahrul07185_Email=syahrul07185_Data.syahrul07185_input.next();
                System.out.print("Password = ");
                String syahrul07185_Password=syahrul07185_Data.syahrul07185_input.next();
                syahrul07185_Data.syahrul07185_login(syahrul07185_Email,syahrul07185_Password);
                break;
                case 3:
                   System.out.print("Nama Yang Dihapus = ");
                String syahrul07185_nama1=syahrul07185_Data.syahrul07185_input.next();
              int  syahrul07185_Status1=syahrul07185_Data.syahrul07185_User.syahrul07185_hapus(syahrul07185_nama1);
              syahrul07185_Data.syahrul07185_cekStatus(syahrul07185_Status1);
                
                break;
                    case 4:
                System.out.print("Nama = ");
                String syahrul07185_Nama=syahrul07185_Data.syahrul07185_input.next();
                System.out.print("Email = ");
                String syahrul07185_Email1=syahrul07185_Data.syahrul07185_input.next();
               int syahrul07185_Status=syahrul07185_Data.syahrul07185_User.syahrul07185_update(syahrul07185_Nama, syahrul07185_Email1);
                syahrul07185_Data.syahrul07185_cekStatus( syahrul07185_Status);
               break;
                    case 5:
                       syahrul07185_Data.syahrul07185_view();
         }  
           }while(syahrul07185_pil!=6);
    }
     void syahrul07185_daftar(){
         try{
        System.out.print("Nama = ");
        String syahrul07185_nama=syahrul07185_input.next();
        System.out.print("Jenis Kelamin = ");
        String syahrul07185_jeniskelamin=syahrul07185_input.next();
        System.out.print("Masukan Email = ");
        String syahrul07185_Email=syahrul07185_input.next();
        System.out.print("Masukan Password = ");
        String syahrul07185_Password=syahrul07185_input.next();
        syahrul07185_User.syahrul07185_InsertDataPengguna(syahrul07185_Email, syahrul07185_nama, syahrul07185_Password, syahrul07185_jeniskelamin);
         }catch(Exception exception){
             System.out.println("Inputan Salah");
         }
    }
     
      void syahrul07185_login(String syahrul07185_Email,String syahrul07185_Password){
        int syahrul07185_jangkawaktuterkumpul1;
        int syahrul07185_CekDataPengguna=syahrul07185_User.syahrul07185_loginUser(syahrul07185_Email, syahrul07185_Password);
            if(syahrul07185_CekDataPengguna==-1||syahrul07185_CekDataPengguna==-2){
                System.out.println("Password atau Email Salah");
               }else{
                try{
                System.out.print("Target Menabung = ");
                int syahrul07185_target=syahrul07185_input.nextInt();
      
                      System.out.print("Nominal menabung = ");
                int syahrul07185_menabung=syahrul07185_input.nextInt();
                
                if(syahrul07185_target<=500000&&syahrul07185_menabung<500000){
                     System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+syahrul07185_target);  
                }else if(syahrul07185_target>500000&&syahrul07185_menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+syahrul07185_target);   
                }else{
                     System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar "+syahrul07185_target);  
                }
                System.out.println("Menabung (perhari/perbulan)");
                System.out.println("1)perhari");
                System.out.println("2)perbulan");
                System.out.print("Pilih = ");
                int syahrul07185_sekalamenabung=syahrul07185_input.nextInt();
                syahrul07185_jangkawaktuterkumpul1=syahrul07185_target/syahrul07185_menabung;
                switch(syahrul07185_sekalamenabung){
                    case 1:
                         if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung){
                        System.out.println("Tanggal Menabung = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                        syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1);
                        System.out.println("Tabungan Terkumpul = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                    
                        syahrul07185_User.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung);
                        
                    }else {
                         System.out.println("Tanggal Menabung = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                        syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1);
                        System.out.println("Tabungan Terkumpul = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime())); 
                         syahrul07185_User.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung);
                         }
                         break;
                    case 2:
                    if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung){
                         System.out.println("Tanggal Menabung = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                        syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1*30);
                        System.out.println("Tabungan Terkumpul = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime())); 
                        syahrul07185_User.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung);
                    }else{
                       System.out.println("Tanggal Menabung = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime()));
                        syahrul07185_tgl.add(Calendar.DATE, syahrul07185_jangkawaktuterkumpul1*30);
                        System.out.println("Tabungan Terkumpul = "+syahrul07185_sdf.format(syahrul07185_tgl.getTime())); 
                         syahrul07185_User.syahrul07185_InsertDataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung);
                    }
                
                        
                }
            
      }catch(Exception exception){
    System.out.println("Inputan Salah");
}
}
      }
      
    public void syahrul07185_view(){
        if(syahrul07185_User.syahrul07185_GetArrayListDataPenggunaIsEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int syahrul07185_a=0;syahrul07185_a<syahrul07185_User.syahrul07185_GetArrayListDataPenggunaSize();syahrul07185_a++){
                    System.out.println("Nama = "+ syahrul07185_User.syahrul07185_Costumer(syahrul07185_a).getSyahrul07185_nama());
                    System.out.println("Jenis Kelamin = "+syahrul07185_User.syahrul07185_Costumer(syahrul07185_a).getSyahrul07185_jeniskelamin());
                    System.out.println("Email = "+syahrul07185_User.syahrul07185_Costumer(syahrul07185_a).getSyahrul07185_email());
                    System.out.println("");
                    
                    
                    
                    
                }
        }
    }
    public void syahrul07185_cekStatus(int syahrul07185_Cek){
        if(syahrul07185_Cek==1){
                    System.out.println("Berhasil");
                }else{
                    System.out.println("Nama Tidak Ditemukan");
                }
    }
      
}
