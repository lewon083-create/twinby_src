package yads;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw2 f38545a;

    public fs2(gw2 gw2Var) {
        this.f38545a = gw2Var;
    }

    public final SSLSocketFactory a(Context context) {
        pt2 pt2VarA = this.f38545a.a(context);
        nt2 nt2Var = new nt2(context);
        if (pt2VarA == null || !pt2VarA.f42063y) {
            if (!ub.a(21)) {
                return null;
            }
            int i = tg2.f43321b;
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException unused) {
                }
                return new tg2(sSLContext.getSocketFactory());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            }
        }
        kw2 kw2VarA = ef1.a(nt2Var);
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            sSLContext2.init(null, new X509TrustManager[]{kw2VarA}, null);
            return sSLContext2.getSocketFactory();
        } catch (KeyManagementException e3) {
            throw new IllegalStateException("Failed to initialize SSLContext", e3);
        } catch (NoSuchAlgorithmException e7) {
            throw new IllegalStateException("No system TLS", e7);
        }
    }
}
