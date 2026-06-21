package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pe2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm1 f41913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f41914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f41916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f41917h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41918j;

    public pe2(Object obj, int i, hm1 hm1Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        this.f41911b = obj;
        this.f41912c = i;
        this.f41913d = hm1Var;
        this.f41914e = obj2;
        this.f41915f = i10;
        this.f41916g = j10;
        this.f41917h = j11;
        this.i = i11;
        this.f41918j = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pe2.class == obj.getClass()) {
            pe2 pe2Var = (pe2) obj;
            if (this.f41912c == pe2Var.f41912c && this.f41915f == pe2Var.f41915f && this.f41916g == pe2Var.f41916g && this.f41917h == pe2Var.f41917h && this.i == pe2Var.i && this.f41918j == pe2Var.f41918j && n92.a(this.f41911b, pe2Var.f41911b) && n92.a(this.f41914e, pe2Var.f41914e) && n92.a(this.f41913d, pe2Var.f41913d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41911b, Integer.valueOf(this.f41912c), this.f41913d, this.f41914e, Integer.valueOf(this.f41915f), Long.valueOf(this.f41916g), Long.valueOf(this.f41917h), Integer.valueOf(this.i), Integer.valueOf(this.f41918j)});
    }
}
