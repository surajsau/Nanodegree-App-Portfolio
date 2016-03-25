package com.halfplatepoha.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSpotifyStreamer;
    private Button btnScoresApp;
    private Button btnLibraryApp;
    private Button btnBuildItBigger;
    private Button btnXyzReader;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initResources();
        setOnClickListeners();
    }

    private void initResources() {
        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnScoresApp = (Button) findViewById(R.id.btnScores);
        btnLibraryApp = (Button) findViewById(R.id.btnLibrary);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnXyzReader = (Button) findViewById(R.id.btnXyzReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
    }

    private void setOnClickListeners() {
        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer: {
                showShortToast(getString(R.string.toast_spotify_streamer));
            }
            break;

            case R.id.btnScores: {
                showShortToast(getString(R.string.toast_scores));
            }
            break;

            case R.id.btnXyzReader: {
                showShortToast(getString(R.string.toast_xyz_reader));
            }
            break;

            case R.id.btnCapstone: {
                showShortToast(getString(R.string.toast_capstone));
            }
            break;

            case R.id.btnLibrary: {
                showShortToast(getString(R.string.toast_library));
            }
            break;

            case R.id.btnBuildItBigger: {
                showShortToast(getString(R.string.toast_build_it_bigger));
            }
            break;
        }
    }

    private void showShortToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
