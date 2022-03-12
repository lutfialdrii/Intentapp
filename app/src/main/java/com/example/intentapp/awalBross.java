package com.example.intentapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class awalBross extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listMenu = new String[] {"Call Center", "SMS Center", "Driving Direction", "Website","About", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMenu));
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
            if (pilihan.equals("Call Center")){
                String telepon = "tel:(0761) 47333";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(telepon));
            } else if (pilihan.equals("SMS Center")){
                String smsText = "Daftar Antrian a/n Lutfi Aldri Permana";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076147333"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction")){
                String lokasi = "google.navigation:q=0.463823,101.390353";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(lokasi));

            } else if (pilihan.equals("Website")){
                String website ="https://haloawalbros.com/";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            } else if (pilihan.equals("About")){
                a= new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bros Pekanbaru");
            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
