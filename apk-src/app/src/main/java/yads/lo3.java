package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lo3 implements jo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.g f40631a = ij.h.b(ko3.f40299b);

    public final boolean a(Context context, SslError sslError) {
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || !pt2VarA.f42063y) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : ds2.a(sslError.getCertificate(), (CertificateFactory) this.f40631a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        try {
            ef1.a(new nt2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
