package com.example.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.whatsapplist.Adapter.AdapterUsuario;
import com.example.whatsapplist.Model.Usuario;
import com.example.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;
import com.example.whatsapplist.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerUsuario.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerUsuario.setHasFixedSize(true);
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        binding.recyclerUsuario.setAdapter(adapterUsuario);

        Usuarios();

        // Evento de Click na RecyclerView
        binding.recyclerUsuario.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                binding.recyclerUsuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Usuario usuario = usuarioList.get(position);

                        Toast.makeText(MainActivity.this, "Item foi clicado " + usuario.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }));

    }

    public void Usuarios() {
        Usuario usuario1 = new Usuario(R.drawable.usuario1, "Marcos", "Olá como vai?");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2, "Melissa", "Boa noite!");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario1, "Diego", "E ai man...");
        usuarioList.add(usuario3);
    }
}