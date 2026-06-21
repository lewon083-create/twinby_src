package zk;

import a0.b1;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k6.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Cloneable {
    public static final List B = al.b.j(v.HTTP_2, v.HTTP_1_1);
    public static final List C = al.b.j(g.f46379e, g.f46380f);
    public final b1 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.y f46475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f46476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ag.a f46479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f46481h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f46483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f46484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProxySelector f46485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f46486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f46487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f46488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f46489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f46490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f46491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HostnameVerifier f46492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f46493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final wa.a f46494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f46495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f46496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f46497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f46498z;

    public u(t builder) throws NoSuchAlgorithmException, KeyStoreException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f46475b = builder.f46450a;
        this.f46476c = builder.f46451b;
        this.f46477d = al.b.v(builder.f46452c);
        this.f46478e = al.b.v(builder.f46453d);
        this.f46479f = builder.f46454e;
        this.f46480g = builder.f46455f;
        this.f46481h = builder.f46456g;
        this.i = builder.f46457h;
        this.f46482j = builder.i;
        this.f46483k = builder.f46458j;
        this.f46484l = builder.f46459k;
        ProxySelector proxySelector = builder.f46460l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f46485m = proxySelector == null ? jl.a.f26723a : proxySelector;
        this.f46486n = builder.f46461m;
        this.f46487o = builder.f46462n;
        List list = builder.f46465q;
        this.f46490r = list;
        this.f46491s = builder.f46466r;
        this.f46492t = builder.f46467s;
        this.f46495w = builder.f46470v;
        this.f46496x = builder.f46471w;
        this.f46497y = builder.f46472x;
        this.f46498z = builder.f46473y;
        b1 b1Var = builder.f46474z;
        this.A = b1Var == null ? new b1(8) : b1Var;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f46488p = null;
            this.f46494v = null;
            this.f46489q = null;
            this.f46493u = d.f46343c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f46381a) {
                    SSLSocketFactory sSLSocketFactory = builder.f46463o;
                    if (sSLSocketFactory != null) {
                        this.f46488p = sSLSocketFactory;
                        wa.a certificateChainCleaner = builder.f46469u;
                        Intrinsics.b(certificateChainCleaner);
                        this.f46494v = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f46464p;
                        Intrinsics.b(x509TrustManager);
                        this.f46489q = x509TrustManager;
                        d dVar = builder.f46468t;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                        this.f46493u = Intrinsics.a(dVar.f46345b, certificateChainCleaner) ? dVar : new d(dVar.f46344a, certificateChainCleaner);
                    } else {
                        hl.n nVar = hl.n.f20755a;
                        X509TrustManager trustManager = hl.n.f20755a.m();
                        this.f46489q = trustManager;
                        this.f46488p = hl.n.f20755a.l(trustManager);
                        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                        wa.a certificateChainCleaner2 = hl.n.f20755a.b(trustManager);
                        this.f46494v = certificateChainCleaner2;
                        d dVar2 = builder.f46468t;
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                        this.f46493u = Intrinsics.a(dVar2.f46345b, certificateChainCleaner2) ? dVar2 : new d(dVar2.f46344a, certificateChainCleaner2);
                    }
                }
            }
            this.f46488p = null;
            this.f46494v = null;
            this.f46489q = null;
            this.f46493u = d.f46343c;
        }
        X509TrustManager x509TrustManager2 = this.f46489q;
        wa.a aVar = this.f46494v;
        SSLSocketFactory sSLSocketFactory2 = this.f46488p;
        List list3 = this.f46478e;
        List list4 = this.f46477d;
        Intrinsics.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        Intrinsics.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.f46490r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((g) it2.next()).f46381a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (aVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.a(this.f46493u, d.f46343c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
