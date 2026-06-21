package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bn1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zm1 f3837c = new zm1(ao1.f3342b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3838b = 0;

    static {
        int i = tm1.f10663a;
    }

    public static zm1 A(byte[] bArr, int i, int i10) {
        try {
            return B(bArr, i, i10);
        } catch (co1 e3) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
        }
    }

    public static zm1 B(byte[] bArr, int i, int i10) {
        c(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new zm1(bArr2);
    }

    public static bn1 C(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f3837c : u(arrayList.iterator(), size);
    }

    public static void a(int i, int i10) {
        if (((i10 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(l7.o.j(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
            }
            throw new ArrayIndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i10).length()), i, "Index > length: ", i10, ", "));
        }
    }

    public static int c(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(l7.o.l(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i10).length()), i, "Beginning index larger than ending index: ", i10, ", "));
        }
        throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length()), i10, "End index: ", i11, " >= "));
    }

    public static /* synthetic */ boolean e(int i, int i10, int i11, byte[] bArr, byte[] bArr2) {
        int i12 = i + i11;
        c(i, i12, bArr.length);
        c(i10, i11 + i10, bArr2.length);
        while (i < i12) {
            if (bArr[i] != bArr2[i10]) {
                return false;
            }
            i++;
            i10++;
        }
        return true;
    }

    public static bn1 u(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a0.u.k(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (bn1) it.next();
        }
        int i10 = i >>> 1;
        bn1 bn1VarU = u(it, i10);
        bn1 bn1VarU2 = u(it, i - i10);
        if (Integer.MAX_VALUE - bn1VarU.n() < bn1VarU2.n()) {
            int iN = bn1VarU.n();
            int iN2 = bn1VarU2.n();
            throw new IllegalArgumentException(pe.a.g(new StringBuilder(String.valueOf(iN).length() + 31 + String.valueOf(iN2).length()), iN, "ByteString would be too long: ", iN2, "+"));
        }
        if (bn1VarU2.n() == 0) {
            return bn1VarU;
        }
        if (bn1VarU.n() == 0) {
            return bn1VarU2;
        }
        int iN3 = bn1VarU2.n() + bn1VarU.n();
        if (iN3 < 128) {
            int iN4 = bn1VarU.n();
            int iN5 = bn1VarU2.n();
            int i11 = iN4 + iN5;
            byte[] bArr = new byte[i11];
            c(0, iN4, bn1VarU.n());
            c(0, iN4, i11);
            if (iN4 > 0) {
                bn1VarU.p(0, 0, iN4, bArr);
            }
            c(0, iN5, bn1VarU2.n());
            c(iN4, i11, i11);
            if (iN5 > 0) {
                bn1VarU2.p(0, iN4, iN5, bArr);
            }
            try {
                return new zm1(bArr);
            } catch (co1 e3) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
            }
        }
        if (bn1VarU instanceof xo1) {
            xo1 xo1Var = (xo1) bn1VarU;
            bn1 bn1Var = xo1Var.f12223e;
            bn1 bn1Var2 = xo1Var.f12224f;
            if (bn1VarU2.n() + bn1Var2.n() < 128) {
                int iN6 = bn1Var2.n();
                int iN7 = bn1VarU2.n();
                int i12 = iN6 + iN7;
                byte[] bArr2 = new byte[i12];
                c(0, iN6, bn1Var2.n());
                c(0, iN6, i12);
                if (iN6 > 0) {
                    bn1Var2.p(0, 0, iN6, bArr2);
                }
                c(0, iN7, bn1VarU2.n());
                c(iN6, i12, i12);
                if (iN7 > 0) {
                    bn1VarU2.p(0, iN6, iN7, bArr2);
                }
                try {
                    return new xo1(bn1Var, new zm1(bArr2));
                } catch (co1 e7) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e7);
                }
            }
            if (bn1Var.x() > bn1Var2.x() && xo1Var.f12226h > bn1VarU2.x()) {
                return new xo1(bn1Var, new xo1(bn1Var2, bn1VarU2));
            }
        }
        if (iN3 >= xo1.E(Math.max(bn1VarU.x(), bn1VarU2.x()) + 1)) {
            return new xo1(bn1VarU, bn1VarU2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        fs1.A(bn1VarU, arrayDeque);
        fs1.A(bn1VarU2, arrayDeque);
        bn1 xo1Var2 = (bn1) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            xo1Var2 = new xo1((bn1) arrayDeque.pop(), xo1Var2);
        }
        return xo1Var2;
    }

    public final byte[] D() {
        int iN = n();
        if (iN == 0) {
            return ao1.f3342b;
        }
        byte[] bArr = new byte[iN];
        p(0, 0, iN, bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1Var = (bn1) obj;
        int iN = n();
        if (iN != bn1Var.n()) {
            return false;
        }
        if (iN == 0) {
            return true;
        }
        int i = this.f3838b;
        int i10 = bn1Var.f3838b;
        if (i == 0 || i10 == 0 || i == i10) {
            return t(bn1Var);
        }
        return false;
    }

    public abstract byte f(int i);

    public abstract byte g(int i);

    public final int hashCode() {
        int iV = this.f3838b;
        if (iV == 0) {
            int iN = n();
            iV = v(iN, 0, iN);
            if (iV == 0) {
                iV = 1;
            }
            this.f3838b = iV;
        }
        return iV;
    }

    public abstract int n();

    public abstract bn1 o(int i, int i10);

    public abstract void p(int i, int i10, int i11, byte[] bArr);

    public abstract ByteBuffer q();

    public abstract void r(hn1 hn1Var);

    public abstract boolean t(bn1 bn1Var);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iN = n();
        String strG = n() <= 50 ? ix.g(this) : ix.g(o(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iN);
        sb2.append(" contents=\"");
        return a0.u.o(sb2, strG, "\">");
    }

    public abstract int v(int i, int i10, int i11);

    public abstract en1 w();

    public abstract int x();

    public abstract boolean y();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d61 iterator() {
        return new wm1(this);
    }
}
