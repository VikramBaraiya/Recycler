package yadunandan.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String charAlphabet[],charDesc[];
int charImage[];
MyClass mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.r1);
        charAlphabet=getResources().getStringArray(R.array.abc);
        charDesc=getResources().getStringArray(R.array.images);
        charImage= new int[]{R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.dog,R.drawable.fox,R.drawable.goat,R.drawable.hand,R.drawable.icecream,R.drawable.joker,R.drawable.kite,R.drawable.lion,R.drawable.mouse,R.drawable.nest,R.drawable.orange,R.drawable.parrot,R.drawable.queen,R.drawable.rabbit,R.drawable.sun,R.drawable.tiger,R.drawable.umbrella,R.drawable.van,R.drawable.watch,R.drawable.xmas,R.drawable.yak,R.drawable.zebra};
        mc=new MyClass(this,charAlphabet,charDesc,charImage);
        rv.setAdapter(mc);
        rv.setLayoutManager(new LinearLayoutManager(this));


    }
}
