package t3;

import i4.c0;
import j3.o0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f33407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f33409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f33410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f33411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f33413h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f33414j;

    public a(long j10, o0 o0Var, int i, c0 c0Var, long j11, o0 o0Var2, int i10, c0 c0Var2, long j12, long j13) {
        this.f33406a = j10;
        this.f33407b = o0Var;
        this.f33408c = i;
        this.f33409d = c0Var;
        this.f33410e = j11;
        this.f33411f = o0Var2;
        this.f33412g = i10;
        this.f33413h = c0Var2;
        this.i = j12;
        this.f33414j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f33406a == aVar.f33406a && this.f33408c == aVar.f33408c && this.f33410e == aVar.f33410e && this.f33412g == aVar.f33412g && this.i == aVar.i && this.f33414j == aVar.f33414j && Objects.equals(this.f33407b, aVar.f33407b) && Objects.equals(this.f33409d, aVar.f33409d) && Objects.equals(this.f33411f, aVar.f33411f) && Objects.equals(this.f33413h, aVar.f33413h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f33406a), this.f33407b, Integer.valueOf(this.f33408c), this.f33409d, Long.valueOf(this.f33410e), this.f33411f, Integer.valueOf(this.f33412g), this.f33413h, Long.valueOf(this.i), Long.valueOf(this.f33414j));
    }
}
