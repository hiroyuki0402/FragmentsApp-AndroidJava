package com.example.fragmentsapp_androidjava;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*
フラグメントとは、AndroidアプリケーションのUIの一部を表すもので、アクティビティ内の再利用可能な部分です。フラグメントは独自のライフサイクル、レイアウト、インフレーションの方法を持っており、アクティビティとは異なる方法で動作します。

### フラグメントの役割:
1. **再利用性**: 同じフラグメントを複数のアクティビティで再利用ができる
2. **アダプタビリティ**: タブレットや大画面のデバイスでは複数のフラグメントを1つのアクティビティ内に表示でき、スマートフォンなどの小さな画面のデバイスでは1つのフラグメントだけを表示するなど、画面のサイズや向きに応じてフレキシブルにUIを変更することが可能
3. **モジュラリティ**: アクティビティ内の特定のUI部分をフラグメントとして分離し、それをモジュールとして扱うことができる

### フラグメントのライフサイクル:
1. **onAttach()**: フラグメントがアクティビティに関連付けられるときに呼び出される
2. **onCreate()**: フラグメントが作成されるときに呼び出される
3. **onCreateView()**: フラグメントのUIが初めて描画されるときに呼び出される
4. **onActivityCreated()**: アクティビティの `onCreate()` が完了し、フラグメントのUIが描画されるときに呼び出される
5. **onStart()**: フラグメントがユーザーに見えるようになるときに呼び出される
6. **onResume()**: フラグメントがアクティブになり、ユーザーとの対話を開始するときに呼び出される
7. **onPause()**: 他のアクティビティが前面に来るなどしてフラグメントが一時停止するときに呼び出される
8. **onStop()**: フラグメントがもう見えなくなるときに呼び出される
9. **onDestroyView()**: フラグメントのUIが破棄されるときに呼び出される
10. **onDestroy()**: フラグメント自体が破棄されるときに呼び出される
11. **onDetach()**: フラグメントがアクティビティから切り離されるときに呼び出される
 */

public class BlankFragment2 extends Fragment {

    // Fragmentがアクティビティに関連付けられた時に呼ばれるメソッド
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // SwiftのUIKitには直接的な相当するものはないが、ViewControllerの `loadView()` あたりが似た役割を持つ
        Toast.makeText(getActivity(), "ライフサイクルチェック: &#8203;``【oaicite:3】``&#8203; が呼ばれた", Toast.LENGTH_SHORT).show();
    }

    // Fragmentのインスタンスが生成される時に呼ばれるメソッド
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // SwiftのUIKitでの `UIViewController` の `init(nibName:bundle:)` や `init(coder:)` が似た役割を持つ
        Toast.makeText(getActivity(), "ライフサイクルチェック: &#8203;``【oaicite:2】``&#8203;  が呼ばれた", Toast.LENGTH_SHORT).show();
    }

    // Fragmentがフォアグラウンドに来た時に呼ばれるメソッド
    @Override
    public void onResume() {
        super.onResume();
        // SwiftのUIKitでの `UIViewController` の `viewDidAppear(_:)` が似た役割を持つ
        Toast.makeText(getActivity(), "ライフサイクルチェック: &#8203;``【oaicite:1】``&#8203;  が呼ばれた", Toast.LENGTH_SHORT).show();
    }

    // Fragmentが可視状態になる前に呼ばれるメソッド
    @Override
    public void onStart() {
        super.onStart();
        // SwiftのUIKitでの `UIViewController` の `viewWillAppear(_:)` が似た役割を持つ
        Toast.makeText(getActivity(), "ライフサイクルチェック: &#8203;``【oaicite:0】``&#8203;  が呼ばれた", Toast.LENGTH_SHORT).show();
    }

    // FragmentのUIが初めて描画される時に呼ばれるメソッド
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        Button button2 = view.findViewById(R.id.TESTBUTTON2);
        TextView textView2 = view.findViewById(R.id.TEXTVIEW2);
        // SwiftのUIKitでの `UIViewController` の `loadView()` や `viewDidLoad()` が似た役割を持つ
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "テスト2", Toast.LENGTH_SHORT).show();
            }
        });
        return  view;
    }
}
