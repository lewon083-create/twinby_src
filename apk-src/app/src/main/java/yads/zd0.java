package yads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zd0 implements uf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib0 f45378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45385h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45387k;

    public zd0() {
        this(new ib0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public static void a(int i, int i10, String str, String str2) {
        ni.a(str + " cannot be less than " + str2, i >= i10);
    }

    public final boolean b() {
        return this.i;
    }

    public zd0(ib0 ib0Var, int i, int i10, int i11, int i12, int i13, boolean z5) {
        a(i11, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(i, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f45378a = ib0Var;
        this.f45379b = lb3.a(i);
        this.f45380c = lb3.a(i10);
        this.f45381d = lb3.a(i11);
        this.f45382e = lb3.a(i12);
        this.f45383f = i13;
        this.f45386j = i13 == -1 ? 13107200 : i13;
        this.f45384g = z5;
        this.f45385h = lb3.a(0);
        this.i = false;
    }

    public final long a() {
        return this.f45385h;
    }

    public final void a(boolean z5) {
        int i = this.f45383f;
        if (i == -1) {
            i = 13107200;
        }
        this.f45386j = i;
        this.f45387k = false;
        if (z5) {
            ib0 ib0Var = this.f45378a;
            synchronized (ib0Var) {
                if (ib0Var.f39480a) {
                    ib0Var.a(0);
                }
            }
        }
    }
}
