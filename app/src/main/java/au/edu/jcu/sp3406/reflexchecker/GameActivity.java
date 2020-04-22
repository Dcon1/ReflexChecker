package au.edu.jcu.sp3406.reflexchecker;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private Random random = new Random();
    private static final int[] drawables = {R.drawable.baseline_close_black_48, R.drawable.baseline_done_black_48, R.drawable.baseline_near_me_black_48, R.drawable.baseline_navigation_black_48};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setupDescription(R.id.task1, R.array.task1_descriptions);
        setupDescription(R.id.task2, R.array.task2_descriptions);
        for(int i = 0; i <4; i++){
            addImage(i + 1);
        }

    }
    private void setupDescription(int taskID, int arrayID) {
        TextView task = findViewById(taskID);
        String[] descriptions = getResources().getStringArray(arrayID);

        int i = random.nextInt(descriptions.length);
        task.setText(descriptions[i]);
    }

    private void addImage(int i){
        ViewGroup gameRows = findViewById(R.id.game_rows);
        getLayoutInflater().inflate(R.layout.image, gameRows);

        View lastChild = gameRows.getChildAt(gameRows.getChildCount() - 1);
        ImageView image = lastChild.findViewById(R.id.image);

        int index = random.nextInt(drawables.length);
        image.setImageDrawable(getResources().getDrawable(drawables[index]));
    }

    private void addCheckboxes(int arrayID){
        addImage(R.id.game_rows);
        for(int i = 0; i <2; i++) {
            //?????

        }

    }

}
