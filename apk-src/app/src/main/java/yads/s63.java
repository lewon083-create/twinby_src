package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s63 implements xq {
    public static final wq i = new zl.g0(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f42824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e6 f42829h = e6.f38020h;

    public static s63 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), 0);
        long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z5 = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        e6 e6Var = bundle2 != null ? (e6) e6.f38021j.fromBundle(bundle2) : e6.f38020h;
        s63 s63Var = new s63();
        s63Var.a(null, null, i10, j10, j11, e6Var, z5);
        return s63Var;
    }

    public final int b(long j10) {
        e6 e6Var = this.f42829h;
        long j11 = this.f42826e;
        int i10 = e6Var.f38023c - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = e6Var.a(i10).f37631b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            d6 d6VarA = e6Var.a(i10);
            if (d6VarA.f37632c != -1) {
                for (int i11 = 0; i11 < d6VarA.f37632c; i11++) {
                    int i12 = d6VarA.f37634e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s63.class.equals(obj.getClass())) {
            s63 s63Var = (s63) obj;
            if (lb3.a(this.f42823b, s63Var.f42823b) && lb3.a(this.f42824c, s63Var.f42824c) && this.f42825d == s63Var.f42825d && this.f42826e == s63Var.f42826e && this.f42827f == s63Var.f42827f && this.f42828g == s63Var.f42828g && lb3.a(this.f42829h, s63Var.f42829h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f42823b;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f42824c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f42825d) * 31;
        long j10 = this.f42826e;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f42827f;
        return this.f42829h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f42828g ? 1 : 0)) * 31);
    }

    public final long a(int i10, int i11) {
        d6 d6VarA = this.f42829h.a(i10);
        if (d6VarA.f37632c != -1) {
            return d6VarA.f37635f[i11];
        }
        return -9223372036854775807L;
    }

    public final int a(long j10) {
        e6 e6Var = this.f42829h;
        long j11 = this.f42826e;
        e6Var.getClass();
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = e6Var.f38026f;
            while (i10 < e6Var.f38023c) {
                if (e6Var.a(i10).f37631b == Long.MIN_VALUE || e6Var.a(i10).f37631b > j10) {
                    d6 d6VarA = e6Var.a(i10);
                    if (d6VarA.f37632c == -1 || d6VarA.a(-1) < d6VarA.f37632c) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 < e6Var.f38023c) {
                return i10;
            }
        }
        return -1;
    }

    public final int a(int i10) {
        return this.f42829h.a(i10).a(-1);
    }

    public final long a() {
        return this.f42827f;
    }

    public final s63 a(Object obj, Object obj2, int i10, long j10, long j11, e6 e6Var, boolean z5) {
        this.f42823b = obj;
        this.f42824c = obj2;
        this.f42825d = i10;
        this.f42826e = j10;
        this.f42827f = j11;
        this.f42829h = e6Var;
        this.f42828g = z5;
        return this;
    }
}
