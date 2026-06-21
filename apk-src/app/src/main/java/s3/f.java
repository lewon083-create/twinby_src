package s3;

import ad.g1;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ad.b1 f32525r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.n0 f32526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.m0 f32527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.f f32528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f32531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f32532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f32533h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f32534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f32535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f32536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f32537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f32538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f32539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f32540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f32541q;

    static {
        ad.h0 h0Var = ad.j0.f818c;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        ad.q.b(6, objArr);
        f32525r = ad.j0.p(6, objArr);
    }

    public f() {
        m4.f fVar = new m4.f();
        a(1000, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(1000, 0, "bufferForPlaybackForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f32526a = new j3.n0();
        this.f32527b = new j3.m0();
        this.f32528c = fVar;
        long j10 = 50000;
        this.f32529d = m3.z.M(j10);
        long j11 = 1000;
        this.f32530e = m3.z.M(j11);
        this.f32531f = m3.z.M(j10);
        this.f32532g = m3.z.M(j10);
        this.f32533h = m3.z.M(j11);
        this.i = m3.z.M(j11);
        this.f32534j = m3.z.M(2000);
        this.f32535k = m3.z.M(j11);
        this.f32536l = -1;
        this.f32537m = true;
        this.f32538n = m3.z.M(0);
        this.f32540p = new ConcurrentHashMap();
        this.f32539o = g1.a(g1.f796h);
        this.f32541q = -1L;
    }

    public static void a(int i, int i10, String str, String str2) {
        h5.k(i >= i10, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(s3.f0 r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.b(s3.f0):boolean");
    }

    public final void c() {
        int i = 0;
        if (this.f32540p.isEmpty()) {
            m4.f fVar = this.f32528c;
            synchronized (fVar) {
                if (fVar.f28631a) {
                    fVar.c(0);
                }
            }
            return;
        }
        m4.f fVar2 = this.f32528c;
        Iterator it = this.f32540p.values().iterator();
        while (it.hasNext()) {
            i += ((e) it.next()).f32492c;
        }
        fVar2.c(i);
    }
}
