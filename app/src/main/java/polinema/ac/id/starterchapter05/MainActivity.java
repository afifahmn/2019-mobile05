package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.activities.StaticActivity;
import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.TugasPraktikum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickStaticFragment(View view) {
        Intent intent = new Intent( this, StaticActivity.class);
        startActivity(intent);
    }



    public void ClickPraktikumFragment(View view) {
        Intent intent = new Intent( this, TugasPraktikum.class );
        startActivity(intent);
    }

    public void ClickDynamicFragment(View view) {
        Intent intent = new Intent( this, DynamicActivity.class );
        startActivity(intent);
    }
}
