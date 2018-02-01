package devstrongzhao.activitylaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ActivitySingleTop extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.standard_btn)
    Button mStandardBtn;
    @BindView(R.id.single_top_btn)
    Button mSingleTopBtn;
    @BindView(R.id.single_task_btn)
    Button mSingleTaskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletop);
        ButterKnife.bind(this);
        Log.i(this.getClass().getName(), "onCreate()");
        mSingleTaskBtn.setOnClickListener(this);
        mSingleTopBtn.setOnClickListener(this);
        mStandardBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(this.getClass().getName(), "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(this.getClass().getName(), "onResume()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(this.getClass().getName(), "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(this.getClass().getName(), "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(this.getClass().getName(), "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(this.getClass().getName(), "onDestroy()");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(this.getClass().getName(), "onNewIntent()");
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.standard_btn:
                Intent standardIntent = new Intent(this, MainActivity.class);
                this.startActivity(standardIntent);
                break;
            case R.id.single_top_btn:
                Intent singleTopIntent = new Intent(this, ActivitySingleTop.class);
                this.startActivity(singleTopIntent);
                break;
            case R.id.single_task_btn:
                Intent singleTaskIntent = new Intent(this, ActivitySingleTask.class);
                this.startActivity(singleTaskIntent);
                break;
        }
    }


}
