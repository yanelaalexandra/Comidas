package comidas.com.pachacama07.comidas.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import comidas.com.pachacama07.comidas.R;
import comidas.com.pachacama07.comidas.models.Food;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private List<Food> foods;

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictureImage;
        TextView fullnameText;
        TextView tiempo;
        TextView tipo;
        TextView precio;


        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            tiempo = itemView.findViewById(R.id.tiempo);
            tipo = itemView.findViewById(R.id.tipo);
            precio = itemView.findViewById(R.id.precio);
        }
    }

    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comidas, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Food food = foods.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(food.getPicture(), "drawable", holder.itemView.getContext().getPackageName());
        holder.pictureImage.setImageResource(resId);

        holder.fullnameText.setText(food.getFullname());
        holder.tiempo.setText(food.getTiempo());
        holder.tipo.setText(food.getTipo());
        holder.precio.setText(food.getPrecio());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(holder.itemView.getContext(), "Detalles de Comida: " + food.getFullname(), Toast.LENGTH_SHORT).show();
                        // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }


}






