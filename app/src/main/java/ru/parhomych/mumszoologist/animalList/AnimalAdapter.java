package ru.parhomych.mumszoologist.animalList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.parhomych.mumszoologist.GalleryImageActivity;
import ru.parhomych.mumszoologist.R;

public class AnimalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<AnimalItem> itemList = new ArrayList<>();
    private Context context;

    public void setItemList(List<AnimalItem> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    public AnimalAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_item_layout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final AnimalItem item = itemList.get(position);

        AnimalViewHolder animalViewHolder = (AnimalViewHolder) holder;
        animalViewHolder.animalDescriptionTextView.setText(item.getDescription());
        animalViewHolder.animalNameTextView.setText(item.getAnimalName());
        animalViewHolder.animalImageImageView.setImageDrawable(ResourcesCompat.getDrawable(
                context.getResources(), item.getAnimalImageId(), null)
        );

        animalViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, GalleryImageActivity.class);
                intent.putExtra("image_id", item.getAnimalImageId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class AnimalViewHolder extends RecyclerView.ViewHolder {

        public ImageView animalImageImageView;
        public TextView animalNameTextView;
        public TextView animalDescriptionTextView;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            animalImageImageView = itemView.findViewById(R.id.animal_image);
            animalNameTextView = itemView.findViewById(R.id.animal_name);
            animalDescriptionTextView = itemView.findViewById(R.id.animal_description);
        }
    }

}
