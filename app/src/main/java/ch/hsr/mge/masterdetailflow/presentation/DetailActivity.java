package ch.hsr.mge.masterdetailflow.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ch.hsr.mge.masterdetailflow.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Wir wollen eine Up-Navigation in der Toolbar haben
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Wir muessen den Parameter der angibt welches Element wir anzeigen sollen
        // aus dem Intent auspacken und dann für das Fragment wieder in ein Bundle
        // einpacken.
        Bundle arguments = new Bundle();
        int positionToShow = getIntent().getIntExtra(NoteDetailFragment.ARG_ITEM, -1);
        arguments.putInt(NoteDetailFragment.ARG_ITEM, positionToShow);

        NoteDetailFragment fragment = new NoteDetailFragment();
        fragment.setArguments(arguments);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.noteDetailContainer, fragment)
                .commit();
    }
}
