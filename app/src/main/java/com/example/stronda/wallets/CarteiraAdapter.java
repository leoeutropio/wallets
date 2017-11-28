package com.example.stronda.wallets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Stronda on 27/11/2017.
 */

public class CarteiraAdapter extends ArrayAdapter<Carteira> {

    private final Context context;
    private final ArrayList<Carteira> elementos;

    public CarteiraAdapter(Context context, ArrayList<Carteira> elementos){
        super(context,R.layout.linha,elementos);
        this.elementos= elementos;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha,parent,false);

        TextView nome = (TextView) rowView.findViewById(R.id.nomeCt);
        CircleImageView imagem = (CircleImageView) rowView.findViewById(R.id.circleIv);
        TextView saldo = (TextView) rowView.findViewById(R.id.saldoCt);


        nome.setText(elementos.get(position).getNome());
        imagem.setImageResource(elementos.get(position).getImagem());
        saldo.setText(elementos.get(position).getSaldo());


        return rowView;
    }
}
