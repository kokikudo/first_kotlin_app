package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// Activityクラス：画面制御に関する基本的な機能を持ったクラス
// これのおかげで初期化や修了などの当たり前な処理を書く必要がない
// AppCompatActivity:アクションバー（FlutterでいうAppBar）がついてるActivityクラス
class MainActivity : AppCompatActivity() {

    // アプリ起動時に最初に実行される
    // 親のActivityクラスのonCreateをoverrideで上書きして実行
    // savedInstanceState: Activityの状態を管理するオブジェクト
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContentView(ViewのResID)でViewを設定する
        // Activityはあくまで画面の入出力の管理が役割で、実際のコンテンツの表示はViewが行う
        // ResIdは自動生成されたRクラスで定義されたリソースID
        setContentView(R.layout.activity_main)
    }
}