
package Syahrul07185_Controller;
import Syahrul07185_Entity.*;

public class syahrul07185_UserController implements syahrul07185_ControllerInterface  {
public syahrul07185_AllObjectController syahrul07185_allObject =new syahrul07185_AllObjectController();
    public syahrul07185_UserController() {
    }
        public int syahrul07185_GetArrayListDataPenggunaSize(){
            return syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_GetArrayListDataPenggunaSize();
        }
        public boolean syahrul07185_GetArrayListDataPenggunaIsEmpty(){
            return syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_GetArrayListDataPenggunaIsEmpty();
        }
   
    public int syahrul07185_update(String syahrul07185_nama,String syahrul07185_email){
       return  syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_update(syahrul07185_nama, syahrul07185_email);
        
    }
    public syahrul07185_DataPenggunaEntity syahrul07185_Costumer(int syahrul07185_index){
        return syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_Costumer(syahrul07185_index);
    }
    public int syahrul07185_hapus(String syahrul07185_nama){
      return  syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_hapusnama(syahrul07185_nama);
    }
    @Override
   public int syahrul07185_loginUser(String syahrul07185_email,String syahrul07185_password){
     
      return syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_CekData(syahrul07185_email, syahrul07185_password);
   }
   public void syahrul07185_InsertDataPengguna(String Syahrul07185_email, String Syahrul07185_nama, String Syahrul07185_password, String Syahrul07185_jeniskelamin){
       syahrul07185_allObject.syahrul07185_UserModel.syahrul07185_InsertDataPengguna(new  syahrul07185_DataPenggunaEntity(Syahrul07185_email,Syahrul07185_nama,Syahrul07185_password,Syahrul07185_jeniskelamin));
   }
   public void syahrul07185_InsertDataTabunganPintar(int syahrul07185_jangkawaktuterkumpul1, int syahrul07185_target, int syahrul07185_menabung, int syahrul07185_sekalamenabung){
       syahrul07185_allObject.syahrul07185_TabunganPintar.syahrul07185_InsertDataTabunganPintar(new syahrul07185_DataTabunganPintarEntity(syahrul07185_jangkawaktuterkumpul1,syahrul07185_target,syahrul07185_menabung,syahrul07185_sekalamenabung));
   }
}
