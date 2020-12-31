/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syahrul07185_Model;
import Syahrul07185_Entity.syahrul07185_DataPenggunaEntity;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class syahrul07185_DataPenggunaModel implements syahrul07185_ModelInterfaces {
     private ArrayList<syahrul07185_DataPenggunaEntity> syahrul07185_datapenggunaEntityArrayList;

     
      public syahrul07185_DataPenggunaModel() {
        syahrul07185_datapenggunaEntityArrayList= new ArrayList<syahrul07185_DataPenggunaEntity>();
    }
     
      

           @Override
    public int syahrul07185_CekData(String syahrul07185_Email,String syahrul07185_Password){
        int syahrul07185_loop=0;
        if(syahrul07185_datapenggunaEntityArrayList.size()==0){
            syahrul07185_loop=-1;
        }else{
            for(int syahrul07185_a=0;syahrul07185_a<syahrul07185_datapenggunaEntityArrayList.size();syahrul07185_a++){
                if(syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_email().equals(syahrul07185_Email)&&syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_password().equals(syahrul07185_Password)){
                    syahrul07185_loop=syahrul07185_a;
                    break;
                }else{
                    syahrul07185_loop=-2;
                }
            }
        }
        return syahrul07185_loop;
    }
     
     public int syahrul07185_hapusnama(String syahrul07185_nama){
          int syahrul07185_Status;
      if(syahrul07185_carinama(syahrul07185_nama)!=-1){
           syahrul07185_datapenggunaEntityArrayList.remove(syahrul07185_carinama(syahrul07185_nama));
            syahrul07185_Status=1;
      }else{
          syahrul07185_Status =0;
          
      }
      return syahrul07185_Status;
   }
     
     public int syahrul07185_update(String syahrul07185_nama,String syahrul07185_email){
          int syahrul07185_Status;
       if(syahrul07185_carinama(syahrul07185_nama)!=-1){     
           syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_carinama(syahrul07185_nama)).setSyahrul07185_email(syahrul07185_email);
               syahrul07185_Status=1;
       }else{
           syahrul07185_Status=0;
       }
       return syahrul07185_Status;
   }
     
      private int syahrul07185_carinama(String syahrul07185_nama){
       int indeks=-1;
       
       for(int a=0;a<syahrul07185_datapenggunaEntityArrayList.size();a++){
           if(syahrul07185_nama.equals(syahrul07185_datapenggunaEntityArrayList.get(a).getSyahrul07185_nama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void syahrul07185_InsertDataPengguna(syahrul07185_DataPenggunaEntity syahrul07185_dataPenggunaEntity){
          
          syahrul07185_datapenggunaEntityArrayList.add(syahrul07185_dataPenggunaEntity);
      }
      
      public int syahrul07185_GetArrayListDataPenggunaSize(){
          
          return  syahrul07185_datapenggunaEntityArrayList.size();
      }
      public syahrul07185_DataPenggunaEntity syahrul07185_Costumer(int syahrul07185_index){
        return syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_index);
    }
      public boolean syahrul07185_GetArrayListDataPenggunaIsEmpty(){
          return syahrul07185_datapenggunaEntityArrayList.isEmpty();
      }
    
    
}
