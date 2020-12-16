package com.example.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Random;

public class MyService extends Service {

    // Binder given to clients
    //private final IBinder binder = new LocalBinder();
    // Random number generator
  //  private final Random mGenerator = new Random();

    /**
     * Class used for the client Binder.  Because we know this service always
     * runs in the same process as its clients, we don't need to deal with IPC.
     */
    //public class LocalBinder extends Binder {
    //    MyService getService() {
            // Return this instance of LocalService so clients can call public methods
       //     return MyService.this;



    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {

        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
