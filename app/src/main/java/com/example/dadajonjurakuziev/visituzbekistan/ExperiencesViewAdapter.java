package com.example.dadajonjurakuziev.visituzbekistan;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ExperiencesViewAdapter extends RecyclerView.Adapter<ExperiencesViewAdapter.ExperiencesViewHolder>{
    private static final String TAG = "ExperiencesViewAdapter";

    //vars
    private Context expContext;
    private List<Experiences> experiencesList;

    ExperiencesViewAdapter(Context expContext, List<Experiences> experiencesList) {
        this.expContext = expContext;
        this.experiencesList = experiencesList;
    }

    @NonNull
    @Override
    public ExperiencesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(expContext).inflate(R.layout.layout_top_experiences, viewGroup, false);
        return new ExperiencesViewAdapter.ExperiencesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExperiencesViewHolder experiencesViewHolder, int i) {
        final Experiences experiences = experiencesList.get(i);

        experiencesViewHolder.expTitle.setText(experiences.getExp_title());
        experiencesViewHolder.expDesc.setText(experiences.getExp_desc());
        experiencesViewHolder.expImageView.setImageResource(experiences.getExp_image());
        experiencesViewHolder.expImageView.setColorFilter(0xffAEAEAE, PorterDuff.Mode.MULTIPLY);

        experiencesViewHolder.expCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on experience " + experiences.getExp_title());

                Toast.makeText(expContext, "Clicked on "+experiences.getExp_title(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(expContext, ExperiencesActivity.class);
                intent.putExtra("exp_bg", experiences.getExp_image());
                intent.putExtra("exp_title", experiences.getExp_title());
                intent.putExtra("exp_desc", experiences.getExp_desc());
                intent.putExtra("exp_full_desc", experiences.getExp_full_desc());
                intent.putExtra("exp_details", experiences.getDetails());
                expContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return experiencesList.size();
    }

    class ExperiencesViewHolder extends RecyclerView.ViewHolder{
        ImageView expImageView;
        TextView expTitle;
        TextView expDesc;
        TextView expFullDesc;
        CardView expCardView;
        TextView expDetails;

        public ExperiencesViewHolder(@NonNull View itemView) {
            super(itemView);
            expImageView = itemView.findViewById(R.id.experience_bg);
            expTitle = itemView.findViewById(R.id.experience_title);
            expDesc = itemView.findViewById(R.id.experience_desc);
            expFullDesc = itemView.findViewById(R.id.expandable_text);
            expCardView = itemView.findViewById(R.id.experience_cardView);
            expDetails = itemView.findViewById(R.id.details_text);
        }
    }
}
