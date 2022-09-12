package com.example.solvativedemo.ui;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solvativedemo.R;
import com.example.solvativedemo.database.DatabaseHelper;
import com.example.solvativedemo.model.Data;
import com.example.solvativedemo.model.MainModel;
import com.example.solvativedemo.retrofit.APIClient;
import com.example.solvativedemo.retrofit.APIInterface;
import com.example.solvativedemo.ui.adapter_holder.CustomAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Data> list = null;
    private APIInterface apiInterface;
    private DatabaseHelper databaseHelper;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        button = findViewById(R.id.button_offline_load);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseCall();
            }
        });
        apiInterface = APIClient.getRetrofitClient().create(APIInterface.class);
        if (!isInternetConnected()) {
            button.setVisibility(View.VISIBLE);
        } else {
            callAPI();
        }
    }

    private boolean isInternetConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    private void setRecyclerView() {
        if (button != null) {
            if (button.getVisibility() == View.VISIBLE) {
                button.setVisibility(View.GONE);
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(new CustomAdapter(list));
    }

    private void callAPI() {
        Call<MainModel> call = apiInterface.requestOtpCall();
        call.enqueue(new Callback<MainModel>() {
            @Override
            public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                if (response.code() == 200) {
                    //list = (ArrayList<Data>) response.body().getData();
                    addDataToDB((ArrayList<Data>) response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<MainModel> call, Throwable t) {
                Log.d("inside", "fail");
            }
        });
    }

    private void addDataToDB(ArrayList<Data> data) {
        databaseHelper = new DatabaseHelper(this);
        for (Data item : data) {
            databaseHelper.addContacts(item);
        }
        databaseCall();
    }

    private void databaseCall() {
        databaseHelper = new DatabaseHelper(this);
        list = databaseHelper.listData();
        if (list != null && list.size() > 0) {
            setRecyclerView();
        } else {
            Toast.makeText(this, "List is empty", Toast.LENGTH_LONG).show();
        }
    }
}
