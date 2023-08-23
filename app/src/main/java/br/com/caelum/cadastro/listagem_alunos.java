package br.com.caelum.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.AdapterView;


public class listagem_alunos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem_alunos);

        String[] nomes = {"auri","alves","mesquita"};

        int layout = android.R.layout.simple_list_item_1;
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, layout,nomes);

        ListView lista = (ListView)  findViewById(R.id.lista);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int posicao, long id){
                Toast.makeText(listagem_alunos.this, "Clique na posição "+ posicao,Toast.LENGTH_LONG).show();

            }
        });



    }
}