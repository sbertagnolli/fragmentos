package progweb3.poa.ifrs.edu.fragmentos_projetomodelo;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity {//implements CafesListFragment.CafesListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // BebidasDetalheFragment frag = (BebidasDetalheFragment) getFragmentManager().findFragmentById(R.id.detalhe_fragmento);
          // (BebidasDetalheFragment) getFragmentManager().findFragmentById(R.id.detalhe_fragmento);
      //  frag.setIdBebida(1);
    }

  /*  @Override
    public void itemClicked(long id) {

    }*/
}
