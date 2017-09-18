package progweb3.poa.ifrs.edu.fragmentos_projetomodelo;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BebidasDetalheFragment extends Fragment {
    private int idBebida;

    public BebidasDetalheFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bebidas_detalhe, container, false);
    }

    /*@Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
           //carrega informações
        }
    }*/

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            ImageView imagem=(ImageView)view.findViewById(R.id.imageView2);
            imagem.setImageResource(Bebida.bebidas[idBebida].getIdImagem());
            TextView nome=(TextView) view.findViewById(R.id.textViewNome);
            nome.setText(Bebida.bebidas[idBebida].getNome());
            TextView desc=(TextView)
                    view.findViewById(R.id.textViewDescricao);
            desc.setText(Bebida.bebidas[idBebida].getDescricao());
        }
    }
}
