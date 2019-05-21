package muhammadrizki.utsakb10116094.view;
/**
 * tanggal 19/05/209 dan 21/05/2019
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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_profil:
                        Intent intent = new Intent(MainActivity.this, Profil.class);
                        startActivity(intent);
                        break;
                    case R.id.action_kontak:
                        Intent intent1 = new Intent(MainActivity.this, Kontak_Main.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_teman:
                        Toast.makeText(MainActivity.this, "Teman Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
