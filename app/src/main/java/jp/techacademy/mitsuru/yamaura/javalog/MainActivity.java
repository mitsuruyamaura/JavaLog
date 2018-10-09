package jp.techacademy.mitsuru.yamaura.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  名前をポチ、年齢を３歳のDogのインスタンスを作る
        Dog dog = new Dog("ポチ",3);

        //  名前をアンドロイド、年齢を20歳のHumanのインスタンスを作る
        Human human = new Human("アンドロイド",20);

        //  moveメソッドの呼び出し
        dog.move();

        //  thinkメソッドの呼び出し
        human.think();
    }
}
