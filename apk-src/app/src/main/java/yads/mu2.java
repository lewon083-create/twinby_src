package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mu2 extends td0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SSLSocketFactory f41017s;

    public mu2(String str, int i, int i10, boolean z5, u11 u11Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i, i10, z5, u11Var);
        this.f41017s = sSLSocketFactory;
    }

    @Override // yads.td0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f41017s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
