package com.example.jibba.carquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class FrontPageActivity extends AppCompatActivity {

    Spinner helpDropDown;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        helpDropDown = findViewById(R.id.helpDropDown);
        adapter = ArrayAdapter.createFromResource(this, R.array.settingSelection, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        helpDropDown.setAdapter(adapter);
        helpDropDown.setOnItemSelectedListener(dropDownListener);



}

    private AdapterView.OnItemSelectedListener dropDownListener = new AdapterView.OnItemSelectedListener()
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String aboutTheGame = "About The Game";
            String rules = "Game Rules";

            if (parent.getItemAtPosition(position).equals(aboutTheGame)) {
                toastMessage(aboutTheGame + " valgt");

            } else if (parent.getItemAtPosition(position).equals(rules)) {
                toastMessage(rules + " valgt");
            }

        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }

    };
    private void toastMessage(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
