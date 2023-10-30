package com.example.fragmentsapp_androidjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new BlankFragment());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new BlankFragment2());
            }
        });
    }

    public void loadFragment(Fragment fragment) {
        // FragmentManagerを取得し、このアクティビティに関連付けられているフラグメントを操作するためのAPI
        // SwiftのUIKitで言うところの `UINavigationController` に似ています
        FragmentManager manager = getSupportFragmentManager();

        // 新しいトランザクションを開始。これにより、フラグメントの追加、削除、置換などの一連の変更
        // SwiftのUIKitで言うところの `UINavigationController` の `pushViewController` や `popViewController` に似ている
        FragmentTransaction transaction = manager.beginTransaction();

        // 既存のフラグメントを新しいフラグメントで置き換え、この場合、R.id.FrameLayoutの位置に新しいフラグメントが置かれる
        // SwiftのUIKitでの `UINavigationController` での画面遷移のようなもの
        transaction.replace(R.id.FrameLayout, fragment);

        // これまでのトランザクションの変更を確定し、変更を画面に反映
        // SwiftのUIKitで言うところの遷移や変更を確定する `pushViewController` などのメソッドの実行後のようなもの
        transaction.commit();
    }
}
