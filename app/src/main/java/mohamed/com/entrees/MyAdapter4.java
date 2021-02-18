package mohamed.com.entrees;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter4 extends RecyclerView.Adapter<MyAdapter4.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;


    public MyAdapter4(Context ct, String s1[], String s2[], int img[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyAdapter4.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_screen_entrees, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter4.MyViewHolder holder, int position) {
        holder.img_Entrees.setImageResource(images[position]);
        holder.N_Entrees.setText(data1[position]);
        holder.E_Price.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img_Entrees;
        TextView N_Entrees, E_Price;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Entrees = itemView.findViewById(R.id.img_Entrees);
            N_Entrees = itemView.findViewById(R.id.N_Entrees);
            E_Price = itemView.findViewById(R.id.E_Price);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
