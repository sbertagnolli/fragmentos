package progweb3.poa.ifrs.edu.fragmentos_projetomodelo;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Fragment;
import android.widget.ListView;

public class CafesListFragment extends ListFragment {

    public CafesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         //  Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafes_list, container, false);
       /* String nomesBebida[] = new String[Bebida.bebidas.length];
        for (int i = 0; i < nomesBebida.length; i++)
            nomesBebida[i] = Bebida.bebidas[i].getNome();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, nomesBebida);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);*/
    }

}
