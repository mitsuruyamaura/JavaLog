package jp.techacademy.mitsuru.yamaura.javalog;

import android.util.Log;

//  Animalの継承(name,age)とThinkbleインターフェースの実装
class Human extends Animal implements Thinkable{

    //  コンストラクタ（変数の初期化）
    public Human(String name,int age) {

        //  Animalメンバ変数のHuman引数から取得
        //  インスタンスに合わせて取得できる
        this.name = name;
        this.age = age;
    }
    //  メンバ変数
    String hobby = "夢";

    //  メンバ関数。アノテーションをつける
    @Override
    public void say(){
        Log.d("javatest","私の名前は"+ this.name + "です。年は" + this.age + "歳です。」" );
    }

    //  メンバ関数。MainActivityから呼び出し
    public void think(){
        Log.d("javatest","「私は" + hobby + "について考える」");

    }
}
