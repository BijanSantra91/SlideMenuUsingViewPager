package com.example.bijan.slidemenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    ImageView imageView;
    Integer [] myimages = {R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.f};

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_one, container, false);

        imageView = (ImageView) v.findViewById(R.id.imageView);

        // get position

        Bundle bundle = getArguments();
        int pos = bundle.getInt("pos");

        // apply pos
        imageView.setImageResource(myimages[pos]);

        return  v;
    }

}
