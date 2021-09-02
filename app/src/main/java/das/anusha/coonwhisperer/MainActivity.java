package das.anusha.coonwhisperer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton switchButton;
    TextView message;
    EditText inp;
    int msgCounter = 0;
    String[] strArr;
    RadioGroup pickLangOpts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.message);
        inp = findViewById(R.id.inputBlank);
        switchButton = findViewById(R.id.switchButton);
        pickLangOpts = findViewById(R.id.pickLangGroup);

        strArr = getResources().getStringArray(R.array.messagesArray);
        int numArrs = strArr.length-1;

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setText(strArr[msgCounter]);
                if (msgCounter==numArrs) msgCounter=0;
                else msgCounter++;
            }
        });
        inp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
            @Override
            public void onTextChanged(CharSequence newText, int i, int i1, int i2) {

            }
        });
        pickLangOpts.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int comp = radioGroup.getCheckedRadioButtonId();
                switch(comp){
                    case R.id.btnCoon:
                        break;
                    case R.id.btnOneUp:
                        break;
                    case R.id.btnCat:
                        break;
                }
            }
        });
        //https://developer.android.com/reference/java/util/Formatter

    }
}