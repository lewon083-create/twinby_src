package p9;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.pl;
import java.util.TreeMap;
import t.x1;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f31287a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j jVar = this.f31287a;
        jVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) pl.f9095d.r());
        x1 x1Var = jVar.f31291e;
        builder.appendQueryParameter("query", (String) x1Var.f33320e);
        builder.appendQueryParameter("pubId", (String) x1Var.f33318c);
        builder.appendQueryParameter("mappver", (String) x1Var.f33322g);
        TreeMap treeMap = (TreeMap) x1Var.f33319d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        String strM4 = jVar.m4();
        String encodedQuery = uriBuild.getEncodedQuery();
        return z.g(new StringBuilder(strM4.length() + 1 + String.valueOf(encodedQuery).length()), strM4, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f31287a.f31292f;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
