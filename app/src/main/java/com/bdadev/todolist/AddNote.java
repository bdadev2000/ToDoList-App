package com.bdadev.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNote extends AppCompatActivity {
    EditText eTitle, eContent;
    Button addNoteBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        eTitle = findViewById(R.id.idInputTitle);
        eContent = findViewById(R.id.idInputContent);
        addNoteBtn = findViewById(R.id.idAddnewnotebtn);

        addNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddNote.this);
                myDB.addNote(eTitle.getText().toString().trim(),
                        eContent.getText().toString().trim());
            }
        });
    }
}