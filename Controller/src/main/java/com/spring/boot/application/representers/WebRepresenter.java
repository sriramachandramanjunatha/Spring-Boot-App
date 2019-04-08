package com.spring.boot.application.representers;


import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.spring.boot.application.domain.DataModel;


/* DataModel representer to convert string to json object
*/
public class WebRepresenter {

    public static DataModel toBuildingModel(String json) throws JsonParseException{
        return new Gson().fromJson(json, DataModel.class);
    }

    public static boolean isNull(Object object) {
        if(object instanceof Object){
            if(object==null || object.equals("")){
                return true;
            }else
                return false;
        }else return true;
    }
}
