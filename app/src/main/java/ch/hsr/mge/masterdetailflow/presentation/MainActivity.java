package ch.hsr.mge.masterdetailflow.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ch.hsr.mge.masterdetailflow.R;

public class MainActivity extends AppCompatActivity implements ItemSelectionListener {

    private boolean isTwoPaneMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (findViewById(R.id.notesDetailContainer) != null) {
            // Wir befinden uns im Tablet-Modus!
            isTwoPaneMode = true;
        }
    }

    @Override
    public void onItemSelected(int position) {
        if (isTwoPaneMode) {
            // TODO Aufgabe 3: Fragment austauschen, Argumente nicht vergessen!

        } else {
            // TODO Aufgabe 2 Activity starten, Parameter nicht vergessen!
        }
    }
}
