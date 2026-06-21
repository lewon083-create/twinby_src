package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends s41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f4041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4042e;

    @Override // com.google.android.gms.internal.ads.s41
    public final /* bridge */ /* synthetic */ s41 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f4041d != null) {
            int iQ = d51.q(this.f10175b);
            Object[] objArr = this.f4041d;
            if (iQ <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = vv.a(iHashCode);
                while (true) {
                    int i = iA & length;
                    Object[] objArr2 = this.f4041d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f4042e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i + 1;
                    }
                }
            }
        }
        this.f4041d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f4041d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final d51 h() {
        d51 d51VarW;
        int i = this.f10175b;
        if (i == 0) {
            return x51.f12049k;
        }
        if (i == 1) {
            Object obj = this.f10174a[0];
            Objects.requireNonNull(obj);
            return new e51(obj);
        }
        if (this.f4041d == null || d51.q(i) != this.f4041d.length) {
            d51VarW = d51.w(this.f10175b, this.f10174a);
            this.f10175b = d51VarW.size();
        } else {
            int i10 = this.f10175b;
            Object[] objArrCopyOf = this.f10174a;
            int length = objArrCopyOf.length;
            if (i10 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            d51VarW = new x51(objArrCopyOf, this.f4042e, this.f4041d, r6.length - 1, this.f10175b);
        }
        this.f10176c = true;
        this.f4041d = null;
        return d51VarW;
    }
}
