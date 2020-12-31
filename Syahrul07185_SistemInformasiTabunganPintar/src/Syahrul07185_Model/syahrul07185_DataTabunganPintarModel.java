/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syahrul07185_Model;
import Syahrul07185_Entity.syahrul07185_DataTabunganPintarEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class syahrul07185_DataTabunganPintarModel {
      public ArrayList<syahrul07185_DataTabunganPintarEntity> syahrul07185_datatabunganpintarEntityArrayList;
       public syahrul07185_DataTabunganPintarModel() {
        syahrul07185_datatabunganpintarEntityArrayList= new ArrayList<syahrul07185_DataTabunganPintarEntity>();
    }
    public void syahrul07185_InsertDataTabunganPintar(syahrul07185_DataTabunganPintarEntity syahrul07185_dataTabunganPintarEntity){
        syahrul07185_datatabunganpintarEntityArrayList.add(syahrul07185_dataTabunganPintarEntity);
        
    }
    
}
