package hk;

import com.google.android.gms.internal.ads.om1;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 implements Runnable, Comparable, m0 {

    @Nullable
    private volatile Object _heap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20703c = -1;

    public r0(long j10) {
        this.f20702b = j10;
    }

    @Override // hk.m0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d8.k kVar = c0.f20642b;
                if (obj == kVar) {
                    return;
                }
                s0 s0Var = obj instanceof s0 ? (s0) obj : null;
                if (s0Var != null) {
                    synchronized (s0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof mk.v ? (mk.v) obj2 : null) != null) {
                            s0Var.b(this.f20703c);
                        }
                    }
                }
                this._heap = kVar;
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int c(long j10, s0 s0Var, t0 t0Var) {
        synchronized (this) {
            if (this._heap == c0.f20642b) {
                return 2;
            }
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.f28946a;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (t0.f20713j.get(t0Var) != 0) {
                        return 1;
                    }
                    if (r0Var == null) {
                        s0Var.f20709c = j10;
                    } else {
                        long j11 = r0Var.f20702b;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - s0Var.f20709c > 0) {
                            s0Var.f20709c = j10;
                        }
                    }
                    long j12 = this.f20702b;
                    long j13 = s0Var.f20709c;
                    if (j12 - j13 < 0) {
                        this.f20702b = j13;
                    }
                    s0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f20702b - ((r0) obj).f20702b;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    public final void d(s0 s0Var) {
        if (this._heap == c0.f20642b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = s0Var;
    }

    public String toString() {
        return om1.m(new StringBuilder("Delayed[nanos="), this.f20702b, ']');
    }
}
