package com.cypressf.perceptivist.fragments;

import android.app.Fragment;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cypressf.perceptivist.R;
import com.cypressf.perceptivist.models.Mood;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MoodGridFragment extends Fragment {
    @Bind(R.id.grid_view)
    GridView moodGrid;
    @Bind(R.id.mood_description_text)
    TextView moodDescriptionTextView;
    @Bind(R.id.mood_name_text)
    TextView moodNameTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_mood_grid, container, false);
        ButterKnife.bind(this, layout);

        ArrayAdapter<Mood> adapter = new ArrayAdapter<Mood>(getActivity(),
                                                            R.layout.mood_view,
                                                            Mood.getMoods()) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view;
                if (convertView != null) {
                    view = convertView;
                } else {
                    LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                    view = layoutInflater.inflate(R.layout.mood_view, parent, false);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.image_view);
                GradientDrawable drawable = (GradientDrawable) imageView.getDrawable();
                drawable.setColor(getItem(position).getColor());
                return view;
            }
        };
        moodGrid.setAdapter(adapter);
        moodGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mood mood = (Mood) moodGrid.getItemAtPosition(position);
                moodNameTextView.setText(mood.getName());
                moodDescriptionTextView.setText(mood.getDescription());
            }
        });

        return layout;
    }

    @OnClick(R.id.button)
    public void onMoodSubmitted() {

    }
}
