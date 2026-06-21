package hl;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fh.zf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20732d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20733c;

    static {
        f20732d = zf.r() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        il.n[] elements = {(!zf.r() || Build.VERSION.SDK_INT < 29) ? null : new il.a(), new il.m(il.f.f21374f), new il.m(il.k.f21384a), new il.m(il.h.f21380a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListL = p.l(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            if (((il.n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f20733c = arrayList;
    }

    @Override // hl.n
    public final wa.a b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        il.b bVar = x509TrustManagerExtensions != null ? new il.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // hl.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f20733c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((il.n) next).a(sslSocket)) {
                    break;
                }
            }
        }
        il.n nVar = (il.n) next;
        if (nVar != null) {
            nVar.d(sslSocket, str, protocols);
        }
    }

    @Override // hl.n
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f20733c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((il.n) next).a(sslSocket)) {
                break;
            }
        }
        il.n nVar = (il.n) next;
        if (nVar != null) {
            return nVar.c(sslSocket);
        }
        return null;
    }

    @Override // hl.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
