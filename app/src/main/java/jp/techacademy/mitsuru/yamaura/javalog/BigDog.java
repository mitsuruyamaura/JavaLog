package jp.techacademy.mitsuru.yamaura.javalog;

import android.util.Log;    //  ログを使用する宣言

class BigDog extends Dog{

    //  クラス変数
    static String to_jp ="大型犬";

    public BigDog(String name,int age){

        super(name,age);
    }

    //  クラス関数
    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
