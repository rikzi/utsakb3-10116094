package muhammadrizki.utsakb10116094.view;

/**
 * tanggal  21/05/2019
 * 10116094
 * Muhammad Rizki
 * IF3 - AKB3
 */

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import muhammadrizki.utsakb10116094.R;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.action_kontak:
                        Intent intent1 = new Intent(Profil.this, Kontak_Main.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_teman:
                        Toast.makeText(Profil.this, "Teman Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
