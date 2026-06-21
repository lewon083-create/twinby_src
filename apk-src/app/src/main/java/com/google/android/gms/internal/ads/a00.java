package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x41 f2669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2670b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f2671c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2672d;

    public a00(x41 x41Var) {
        this.f2669a = x41Var;
        l00 l00Var = l00.f7359e;
        this.f2672d = false;
    }

    public final l00 a(l00 l00Var) {
        if (l00Var.equals(l00.f7359e)) {
            throw new i10("Unhandled input format:", l00Var);
        }
        int i = 0;
        while (true) {
            x41 x41Var = this.f2669a;
            if (i >= x41Var.size()) {
                return l00Var;
            }
            t10 t10Var = (t10) x41Var.get(i);
            l00 l00VarE = t10Var.e(l00Var);
            if (t10Var.l()) {
                ix.k0(!l00VarE.equals(r0));
                l00Var = l00VarE;
            }
            i++;
        }
    }

    public final void b(y00 y00Var) {
        ArrayList arrayList = this.f2670b;
        arrayList.clear();
        this.f2672d = false;
        long jB = y00Var.f12434a;
        int i = 0;
        while (true) {
            x41 x41Var = this.f2669a;
            if (i >= x41Var.size()) {
                break;
            }
            t10 t10Var = (t10) x41Var.get(i);
            new y00(jB);
            t10Var.f();
            if (t10Var.l()) {
                jB = t10Var.b(jB);
                ix.k0(jB >= 0);
                arrayList.add(t10Var);
            }
            i++;
        }
        this.f2671c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= f(); i10++) {
            this.f2671c[i10] = ((t10) arrayList.get(i10)).c();
        }
    }

    public final boolean c() {
        return !this.f2670b.isEmpty();
    }

    public final boolean d() {
        return this.f2672d && ((t10) this.f2670b.get(f())).k() && !this.f2671c[f()].hasRemaining();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z5;
        do {
            int i = 0;
            z5 = false;
            while (i <= f()) {
                if (!this.f2671c[i].hasRemaining()) {
                    ArrayList arrayList = this.f2670b;
                    t10 t10Var = (t10) arrayList.get(i);
                    if (!t10Var.k()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f2671c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : t10.f10463a;
                        long jRemaining = byteBuffer2.remaining();
                        t10Var.a(byteBuffer2);
                        this.f2671c[i] = t10Var.c();
                        boolean z10 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f2671c[i].hasRemaining()) {
                            z10 = false;
                        }
                        z5 |= z10;
                    } else if (!this.f2671c[i].hasRemaining() && i < f()) {
                        ((t10) arrayList.get(i + 1)).i();
                    }
                }
                i++;
            }
        } while (z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        x41 x41Var = this.f2669a;
        int size = x41Var.size();
        x41 x41Var2 = ((a00) obj).f2669a;
        if (size != x41Var2.size()) {
            return false;
        }
        for (int i = 0; i < x41Var.size(); i++) {
            if (x41Var.get(i) != x41Var2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.f2671c.length - 1;
    }

    public final int hashCode() {
        return this.f2669a.hashCode();
    }
}
