package carlos.cesar.aancoraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button toQuest;//criação do tipo button para enviar o clique do botão pag. 1 para pag 2





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toQuest= findViewById(R.id.btiniciateste);
        //metodo abaixo enviando primeira tela para a tela de questoes
       toQuest.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent proxima= new Intent(MainActivity.this,QuestoesActivity.class);
               proxima.putExtra("acao","enviar");
               startActivity(proxima);
           }
       });
    }





}