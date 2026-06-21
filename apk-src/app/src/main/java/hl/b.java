package hl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ll.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f20734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f20735b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f20734a = trustManager;
        this.f20735b = findByIssuerAndSignatureMethod;
    }

    @Override // ll.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object objInvoke = this.f20735b.invoke(this.f20734a, cert);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f20734a, bVar.f20734a) && Intrinsics.a(this.f20735b, bVar.f20735b);
    }

    public final int hashCode() {
        return this.f20735b.hashCode() + (this.f20734a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f20734a + ", findByIssuerAndSignatureMethod=" + this.f20735b + ')';
    }
}
