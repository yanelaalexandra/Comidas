package comidas.com.pachacama07.comidas.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import comidas.com.pachacama07.comidas.R;

import comidas.com.pachacama07.comidas.adapters.FoodAdapter;
import comidas.com.pachacama07.comidas.repository.FoodRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setFoods(FoodRepository.getList());

        recyclerView.setAdapter(foodAdapter);


    }
}
