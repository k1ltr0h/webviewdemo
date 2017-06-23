package cl.usm.telematica.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Para más información , revisar la siguiente documentación:
 *
 * {@link} https://developer.android.com/guide/webapps/webview.html
 * {@link} https://developer.android.com/reference/android/webkit/WebView.html
 *
 */
public class MainActivity extends AppCompatActivity {

    //Definimos la url, como un string
    private final String url = "http://www.google.cl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos con el webview definido en activity_main.xml
        WebView webView = (WebView) findViewById(R.id.webview);

        //Esta sentencia nos permite lanzar el contenido dentro de mi app,
        //si borro la siguiente linea, el contenido se abre en el browser
        webView.setWebViewClient(new WebViewClient());

        //Cargamos la url
        webView.loadUrl(url);
    }
}
