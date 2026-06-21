package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v63 f45028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final an1 f45030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v63 f45032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final an1 f45034h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f45035j;

    public ye(long j10, v63 v63Var, int i, an1 an1Var, long j11, v63 v63Var2, int i10, an1 an1Var2, long j12, long j13) {
        this.f45027a = j10;
        this.f45028b = v63Var;
        this.f45029c = i;
        this.f45030d = an1Var;
        this.f45031e = j11;
        this.f45032f = v63Var2;
        this.f45033g = i10;
        this.f45034h = an1Var2;
        this.i = j12;
        this.f45035j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye.class == obj.getClass()) {
            ye yeVar = (ye) obj;
            if (this.f45027a == yeVar.f45027a && this.f45029c == yeVar.f45029c && this.f45031e == yeVar.f45031e && this.f45033g == yeVar.f45033g && this.i == yeVar.i && this.f45035j == yeVar.f45035j && n92.a(this.f45028b, yeVar.f45028b) && n92.a(this.f45030d, yeVar.f45030d) && n92.a(this.f45032f, yeVar.f45032f) && n92.a(this.f45034h, yeVar.f45034h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f45027a), this.f45028b, Integer.valueOf(this.f45029c), this.f45030d, Long.valueOf(this.f45031e), this.f45032f, Integer.valueOf(this.f45033g), this.f45034h, Long.valueOf(this.i), Long.valueOf(this.f45035j)});
    }
}
