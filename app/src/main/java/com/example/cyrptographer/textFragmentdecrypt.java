package com.example.cyrptographer;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link textFragmentdecrypt#newInstance} factory method to
 * create an instance of this fragment.
 */
public class textFragmentdecrypt extends Fragment {
    EditText etenc;
    TextView enctv;
    ClipboardManager cpb;
    Button decryptt;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public textFragmentdecrypt() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment textFragmentdecrypt.
     */
    // TODO: Rename and change types and number of parameters
    public static textFragmentdecrypt newInstance(String param1, String param2) {
        textFragmentdecrypt fragment = new textFragmentdecrypt();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_text_fragmentdecrypt,container,false);

        etenc = v.findViewById(R.id.edittextD);
        enctv = v.findViewById(R.id.encryptedD);
        decryptt = v.findViewById(R.id.encryptbtnDD);
        decryptt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dec(view);
            }
        });


        // Inflate the layout for this fragment
        return v;
    }
    public void dec(View view) {
        // get code from edittext
        String temp = etenc.getText().toString();
        Log.e("dec", "text - " + temp);

        // pass the string to the decryption algorithm
        // and get the decrypted text
        String rv = Decode.decode(temp);

        // set the text to the edit text for display
        enctv.setText(rv);
        Log.e("dec", "text - " + rv);
    }
}