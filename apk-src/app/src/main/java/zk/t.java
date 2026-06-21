package zk;

import a0.b1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k6.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.firebase.messaging.y f46450a = new com.google.firebase.messaging.y(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f46451b = new t0(27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46452c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46453d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ag.a f46454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f46456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46457h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f46458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f46459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProxySelector f46460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f46461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SocketFactory f46462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f46463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X509TrustManager f46464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f46465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f46466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HostnameVerifier f46467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f46468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public wa.a f46469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f46470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f46471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f46472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f46473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b1 f46474z;

    public t() {
        Intrinsics.checkNotNullParameter(i.f46409d, "<this>");
        this.f46454e = new ag.a(18);
        this.f46455f = true;
        i iVar = b.f46317a;
        this.f46456g = iVar;
        this.f46457h = true;
        this.i = true;
        this.f46458j = i.f46407b;
        this.f46459k = i.f46408c;
        this.f46461m = iVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f46462n = socketFactory;
        this.f46465q = u.C;
        this.f46466r = u.B;
        this.f46467s = ll.c.f28154a;
        this.f46468t = d.f46343c;
        this.f46470v = 10000;
        this.f46471w = 10000;
        this.f46472x = 10000;
        this.f46473y = 1024L;
    }
}
