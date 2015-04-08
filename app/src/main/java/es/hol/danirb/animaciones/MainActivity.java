package es.hol.danirb.animaciones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Animation td,td2,td3;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.textView);
        AnimationSet animacion= new AnimationSet(true);


    }
//onclick
    public void lanzarAnimacion(View view) {
        //crear animacion
        td = AnimationUtils.loadAnimation(this, R.anim.movimiento);
        td.setFillAfter(true);
        texto.setText("Desplazando");
        texto.startAnimation(td);

    }
    public void rotarTexto(View view){
       //if(td.isInitialized()) td.cancel();//en caso de que la otra animacion se haya lanzado
        texto.setText("Rotando");
        td2 = AnimationUtils.loadAnimation(this, R.anim.rotacion);
        td2.setFillAfter(true);
        texto.startAnimation(td2);

    }
    public void dilatarTexto(View view){

        int rs= ScaleAnimation.RELATIVE_TO_SELF;
        ScaleAnimation escala= new ScaleAnimation(1,2,1,5,rs,0.5f,rs,0.5f);
        escala.setDuration(3000);
        escala.setStartOffset(3000);
        texto.startAnimation(animacion);
    }
}
