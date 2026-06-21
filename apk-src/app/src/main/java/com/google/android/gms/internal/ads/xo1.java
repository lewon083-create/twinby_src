package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xo1 extends bn1 {
    public static final int[] i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bn1 f12223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f12224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12226h;

    public xo1(bn1 bn1Var, bn1 bn1Var2) {
        this.f12223e = bn1Var;
        this.f12224f = bn1Var2;
        int iN = bn1Var.n();
        this.f12225g = iN;
        this.f12222d = bn1Var2.n() + iN;
        this.f12226h = Math.max(bn1Var.x(), bn1Var2.x()) + 1;
    }

    public static int E(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return i[i10];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i10) {
        bn1.a(i10, this.f12222d);
        return g(i10);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i10) {
        int i11 = this.f12225g;
        return i10 < i11 ? this.f12223e.g(i10) : this.f12224f.g(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vo1(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int n() {
        return this.f12222d;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 o(int i10, int i11) {
        int i12 = this.f12222d;
        int iC = bn1.c(i10, i11, i12);
        if (iC == 0) {
            return bn1.f3837c;
        }
        if (iC == i12) {
            return this;
        }
        bn1 bn1Var = this.f12223e;
        int i13 = this.f12225g;
        if (i11 <= i13) {
            return bn1Var.o(i10, i11);
        }
        int i14 = i11 - i13;
        bn1 bn1Var2 = this.f12224f;
        return i10 >= i13 ? bn1Var2.o(i10 - i13, i14) : new xo1(bn1Var.o(i10, bn1Var.n()), bn1Var2.o(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void p(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        bn1 bn1Var = this.f12223e;
        int i14 = this.f12225g;
        if (i13 <= i14) {
            bn1Var.p(i10, i11, i12, bArr);
            return;
        }
        bn1 bn1Var2 = this.f12224f;
        if (i10 >= i14) {
            bn1Var2.p(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        bn1Var.p(i10, i11, i15, bArr);
        bn1Var2.p(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void r(hn1 hn1Var) {
        this.f12223e.r(hn1Var);
        this.f12224f.r(hn1Var);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean t(bn1 bn1Var) {
        wo1 wo1Var = new wo1(this);
        ym1 ym1VarA = wo1Var.next();
        wo1 wo1Var2 = new wo1(bn1Var);
        ym1 ym1VarA2 = wo1Var2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iN = ym1VarA.n() - i10;
            int iN2 = ym1VarA2.n() - i11;
            int iMin = Math.min(iN, iN2);
            if (!(i10 == 0 ? ym1VarA.E(ym1VarA2, i11, iMin) : ym1VarA2.E(ym1VarA, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f12222d;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iN) {
                i10 = 0;
                ym1VarA = wo1Var.next();
            } else {
                i10 += iMin;
                ym1VarA = ym1VarA;
            }
            if (iMin == iN2) {
                ym1VarA2 = wo1Var2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        bn1 bn1Var = this.f12223e;
        int i14 = this.f12225g;
        if (i13 <= i14) {
            return bn1Var.v(i10, i11, i12);
        }
        bn1 bn1Var2 = this.f12224f;
        if (i11 >= i14) {
            return bn1Var2.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return bn1Var2.v(bn1Var.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 w() {
        ym1 ym1Var;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f12226h);
        arrayDeque.push(this);
        bn1 bn1Var = this.f12223e;
        while (bn1Var instanceof xo1) {
            xo1 xo1Var = (xo1) bn1Var;
            arrayDeque.push(xo1Var);
            bn1Var = xo1Var.f12223e;
        }
        ym1 ym1Var2 = (ym1) bn1Var;
        while (true) {
            if (!(ym1Var2 != null)) {
                do1 do1Var = new do1();
                do1Var.f4621b = arrayList.iterator();
                do1Var.f4623d = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    do1Var.f4623d++;
                }
                do1Var.f4624e = -1;
                if (!do1Var.a()) {
                    do1Var.f4622c = ao1.f3343c;
                    do1Var.f4625f = 0;
                    do1Var.f4628j = 0L;
                }
                return new dn1(do1Var);
            }
            if (ym1Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    ym1Var = null;
                    break;
                }
                bn1 bn1Var2 = ((xo1) arrayDeque.pop()).f12224f;
                while (bn1Var2 instanceof xo1) {
                    xo1 xo1Var2 = (xo1) bn1Var2;
                    arrayDeque.push(xo1Var2);
                    bn1Var2 = xo1Var2.f12223e;
                }
                ym1Var = (ym1) bn1Var2;
                if (ym1Var.n() != 0) {
                    break;
                }
            }
            arrayList.add(ym1Var2.q());
            ym1Var2 = ym1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int x() {
        return this.f12226h;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean y() {
        return this.f12222d >= E(this.f12226h);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    /* JADX INFO: renamed from: z */
    public final d61 iterator() {
        return new vo1(this);
    }
}
