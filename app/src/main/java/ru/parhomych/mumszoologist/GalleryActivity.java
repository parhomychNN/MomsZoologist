package ru.parhomych.mumszoologist;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import ru.parhomych.mumszoologist.animalList.AnimalAdapter;
import ru.parhomych.mumszoologist.animalList.DataUtils;

public class GalleryActivity extends AppCompatActivity {

    private AnimalAdapter animalAdapter = new AnimalAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.animals_gallery);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, RecyclerView.VERTICAL, false
        );

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                this, linearLayoutManager.getOrientation()
        );
        recyclerView.addItemDecoration(dividerItemDecoration);

        animalAdapter.setItemList(DataUtils.getAnimalItems());

        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.gallery_swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                animalAdapter.setItemList(DataUtils.getAnimalItems());
                swipeRefreshLayout.setRefreshing(false);
            }
        });

    }

    private int getDrawableId(ImageView iv) {
        return (Integer) iv.getTag();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}