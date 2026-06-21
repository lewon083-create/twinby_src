package j3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f26280g = c.f26218c;

    static {
        gf.a.o(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i10) {
        a aVarA = this.f26280g.a(i);
        if (aVarA.f26208a != -1) {
            return aVarA.f26213f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        a aVarA;
        int i;
        c cVar = this.f26280g;
        long j11 = this.f26277d;
        int i10 = cVar.f26220a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i11 = 0;
            while (i11 < i10) {
                cVar.a(i11).getClass();
                cVar.a(i11).getClass();
                if (0 > j10 && ((i = (aVarA = cVar.a(i11)).f26208a) == -1 || aVarA.a(-1) < i)) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                if (j11 != -9223372036854775807L) {
                    cVar.a(i11).getClass();
                    if (0 <= j11) {
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        c cVar = this.f26280g;
        int i = cVar.f26220a;
        int i10 = i - 1;
        if (i10 == i - 1) {
            cVar.a(i10).getClass();
        }
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i10).getClass();
            if (j10 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            a aVarA = cVar.a(i10);
            int i11 = aVarA.f26208a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA.f26212e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i) {
        this.f26280g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.f26280g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.class.equals(obj.getClass())) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Objects.equals(this.f26274a, m0Var.f26274a) && Objects.equals(this.f26275b, m0Var.f26275b) && this.f26276c == m0Var.f26276c && this.f26277d == m0Var.f26277d && this.f26278e == m0Var.f26278e && this.f26279f == m0Var.f26279f && Objects.equals(this.f26280g, m0Var.f26280g);
    }

    public final boolean f(int i) {
        c cVar = this.f26280g;
        int i10 = cVar.f26220a;
        if (i != i10 - 1 || i != i10 - 1) {
            return false;
        }
        cVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.f26280g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j10, long j11, c cVar, boolean z5) {
        this.f26274a = obj;
        this.f26275b = obj2;
        this.f26276c = i;
        this.f26277d = j10;
        this.f26278e = j11;
        this.f26280g = cVar;
        this.f26279f = z5;
    }

    public final int hashCode() {
        Object obj = this.f26274a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f26275b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f26276c) * 31;
        long j10 = this.f26277d;
        int i = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f26278e;
        return this.f26280g.hashCode() + ((((i + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f26279f ? 1 : 0)) * 31);
    }
}
