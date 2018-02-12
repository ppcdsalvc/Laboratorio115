package mx.edu.ittepic.laboratorio1_1_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    String[] arreglo = {"Resumed:cuando ha perdido el foco pero todavía es parcialmente visible.","Started:cuando ocupa el primer plano. La pantalla está visible y tiene el foco de la interacción del usuario.","Stopped:cuando nada de ella es visible","Resumed:Este método se llama cuando la Actividad va a empezar a interactuar con el usuario después de estar en un estado de pausa.","Created:Este método se llama al crear una Actividad.","Restart:Este método se llama después de que una Actividad se haya detenido, antes de que se inicie de nuevo","Destroy:Este es el último método que se llama en una Actividad antes de que sea destruido"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lst);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        lista.setAdapter(adapter);

    }
}
