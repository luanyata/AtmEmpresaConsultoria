package br.com.luanyata.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView empresaMenu;
    private ImageView servicosMenu;
    private ImageView clietentesMenu;
    private ImageView contatoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresaMenu = (ImageView) findViewById(R.id.idMenuEmpresa);
        servicosMenu = (ImageView) findViewById(R.id.idMenuServicos);
        clietentesMenu = (ImageView) findViewById(R.id.idMenuClientes);
        contatoMenu = (ImageView) findViewById(R.id.idMenuContato);

        empresaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), EmpresaActivity.class));
            }
        });

        servicosMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ServicoActivity.class));
            }
        });

        clietentesMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ClienteActivity.class));
            }
        });

        contatoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ContatoActivity.class));
            }
        });
    }
}
