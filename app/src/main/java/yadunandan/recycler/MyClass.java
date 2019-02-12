package yadunandan.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyClass extends RecyclerView.Adapter<MyClass.myViewHolder> {


    String charAlphabet[];
    String charDesc[];
    int charImage[];
    Context ctx;
    MyClass(Context cx, String[] s1, String[]s2, int[] i1){
        charAlphabet=s1;
        charDesc=s2;
        charImage=i1;
        ctx=cx;
    }
    @NonNull
    @Override
    public MyClass.myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater1=LayoutInflater.from(ctx);
        View v1=inflater1.inflate(R.layout.layout_for_abc,viewGroup,false);
        return new myViewHolder(v1);
    }

    @Override
    public void onBindViewHolder(@NonNull MyClass.myViewHolder myViewHolder, int i) {
        myViewHolder.t1.setText(charAlphabet[i]);
        myViewHolder.t2.setText(charDesc[i]);
        myViewHolder.img1.setImageResource(charImage[i]);
    }

    @Override
    public int getItemCount() {
        return charAlphabet.length;
    }
    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2;
        ImageView img1;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.A);
            t2=(TextView)itemView.findViewById(R.id.alphabet);
            img1=(ImageView)itemView.findViewById(R.id.imageView2);

        }
    }

}
