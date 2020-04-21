package au.edu.jcu.sp3406.reflexchecker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setupDescription(R.id.task1, R.array.task1_descriptions);
        setupDescription(R.id.task2, R.array.task2_descriptions);
    }
    private void setupDescription(int taskID, int arrayID) {
        TextView task = findViewById(taskID);
        String[] descriptions = getResources().getStringArray(arrayID);

        int i = random.nextInt(descriptions.length);
        task.setText(descriptions[i]);
    }
}
