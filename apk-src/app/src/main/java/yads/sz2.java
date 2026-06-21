package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sz2 extends v63 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f43135h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hm1 f43139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final am1 f43140g;

    static {
        xl1 xl1Var = new xl1();
        List list = Collections.EMPTY_LIST;
        um2 um2Var = um2.f43723f;
        em1 em1Var = em1.f38181d;
        Uri uri = Uri.EMPTY;
        if (xl1Var.f44754b != null && xl1Var.f44753a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            new cm1(uri, null, xl1Var.f44753a != null ? new yl1(xl1Var) : null, list, null, um2Var, null);
        }
        lm1 lm1Var = lm1.H;
    }

    public sz2(long j10, long j11, boolean z5, hm1 hm1Var, am1 am1Var) {
        this.f43136c = j10;
        this.f43137d = j11;
        this.f43138e = z5;
        this.f43139f = (hm1) ni.a(hm1Var);
        this.f43140g = am1Var;
    }

    @Override // yads.v63
    public final int a() {
        return 1;
    }

    @Override // yads.v63
    public final int b() {
        return 1;
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        ni.a(i, 1);
        Object obj = z5 ? f43135h : null;
        long j10 = this.f43136c;
        s63Var.getClass();
        return s63Var.a(null, obj, 0, j10, 0L, e6.f38020h, false);
    }

    @Override // yads.v63
    public final Object a(int i) {
        ni.a(i, 1);
        return f43135h;
    }

    public sz2(long j10, long j11, boolean z5, boolean z10, hm1 hm1Var) {
        this(j10, j11, z5, hm1Var, z10 ? hm1Var.f39246d : null);
    }

    @Override // yads.v63
    public final u63 a(int i, u63 u63Var, long j10) {
        ni.a(i, 1);
        return u63Var.a(u63.f43575s, this.f43139f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f43138e, false, this.f43140g, 0L, this.f43137d, 0, 0, 0L);
    }

    @Override // yads.v63
    public final int a(Object obj) {
        return f43135h.equals(obj) ? 0 : -1;
    }
}
