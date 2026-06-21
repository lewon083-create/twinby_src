package m4;

import com.google.android.gms.internal.ads.m6;
import java.util.Arrays;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28634d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28631a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28632b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28635e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f28636f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i = this.f28634d + 1;
            this.f28634d = i;
            int i10 = this.f28635e;
            if (i10 > 0) {
                a[] aVarArr = this.f28636f;
                int i11 = i10 - 1;
                this.f28635e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f28636f[this.f28635e] = null;
            } else {
                a aVar2 = new a(0, new byte[this.f28632b]);
                a[] aVarArr2 = this.f28636f;
                if (i > aVarArr2.length) {
                    this.f28636f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(m6 m6Var) {
        while (m6Var != null) {
            try {
                a[] aVarArr = this.f28636f;
                int i = this.f28635e;
                this.f28635e = i + 1;
                a aVar = (a) m6Var.f7790d;
                aVar.getClass();
                aVarArr[i] = aVar;
                this.f28634d--;
                m6Var = (m6) m6Var.f7791e;
                if (m6Var == null || ((a) m6Var.f7790d) == null) {
                    m6Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i) {
        boolean z5 = i < this.f28633c;
        this.f28633c = i;
        if (z5) {
            d();
        }
    }

    public final synchronized void d() {
        int iMax = Math.max(0, z.g(this.f28633c, this.f28632b) - this.f28634d);
        int i = this.f28635e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f28636f, iMax, i, (Object) null);
        this.f28635e = iMax;
    }
}
