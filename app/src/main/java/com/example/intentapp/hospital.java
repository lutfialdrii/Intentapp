package com.example.intentapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Awal Bros", "RSUD Arifin Ahmad", "RSJ Tampan", "RS Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        showPilihan(pilihan);
    }

    private void showPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Awal Bros")){
                a = new Intent(this,awalBross.class);
            } else if (pilihan.equals("RSUD Arifin Ahmad")){

            } else if (pilihan.equals("RSJ Tampan")){

            } else if (pilihan.equals("RS Tabrani")){

            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
