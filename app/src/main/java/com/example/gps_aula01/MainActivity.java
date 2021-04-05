package com.example.gps_aula01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    Ponto p1, p2;
    String PROVIDER;
    private Object permission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocationManager locationManager;
        PROVIDER = LocationManager.GPS_PROVIDER;
    }

    public void reset(View v){
        p1= new Ponto();
        p2= new Ponto();
        EditText edtPto = findViewById(R.id.edtPtoA);
        edtPto.setText("");
        EditText edtPto = findViewById(R.id.edtPtoB);
        edtPto.setText("");


    }


    private void mostrarGoogleMaps(double latitude, double longitude) {
        WebView wv = findViewById(R.id.webv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude);
    }

    public void verPontoA(View v) {mostrarGoogleMaps(p1.getLatitude(), p1.getLongitude()); }

    public void verPontoB(View v) {mostrarGoogleMaps(p2.getLatitude(), p2.getLongitude());}

    public void  lerpontoA(View v){
        p1 = this.getPonto();
        EditText edtPto = findViewById(R.id.edtPtoA);
        edtPto.setText(p1.imprimir2());
    }
    public void  lerpontoB(View v){
        p1 = this.getPonto()
        EditText edtPto = findViewById(R.id.edtPtoA);
        edtPto.setText(p2.imprimir2());
    }

    public Ponto getPonto() {
        LocationManager mLocManager = (LocationManager) getSystemService(MainActivity.this.LOCATION_SERVICE);
        LocationListener mLocListener = new MinhaLocalizacaoListener();

        if (ActivityCompat.checkSelfPermission(this.permission.ACESS_FINE_LOCATION)) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission();
            ActivityCompat.requestPermissions(activity:Object requestCode;
        MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, requestCode: 1);
        ActivityCompat.requestPermissions(activity: MainActivity.this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, requestCode: 1);
        return null;
    }
        mLocManager.requestLocationUpdates(PROVIDER, minTimeMs: 0, minDistanceM: 0, mLocListener);
        Location localAtual = mLocManager.getLastKnownLocation(PROVIDER);

        if (!mLocManager.isProviderEnable(PROVIDER)) {
        Toast.makeText(this, "GPS DESABILITADO", Toast.LENGTH_LONG).show();
    }
        return new Ponto(localAtual.getLatitude(),localAtual.getLogintude(), localAtual.getAltitude());
}

        public void calcularDistancia(View v) {
            LocationManager mLocManager =  (LocationManager) getSystemService(MainActivity,this.LOCATION_SERVICE);
            float [] resultado = new float[1];
            Location.distanceBetween(p1.getLatitude(), p1.getLongitude(), p2.getLatitude(), p2.getLongitude(), resultado);

            if (!mLocManager.isProviderEnabled(PROVIDER)) {
                String texto = "*** Distância: " + resultado[0] + "\n";
                Toast.makeText(MainActivity, this, texto, Toast.LENGTH_LONG).show();
    }else{
                Toast.makeText(this, "GPS DESABILITADO", Toast.LENGTH_LONG).show();
            }
}

}
