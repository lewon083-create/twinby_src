package com.google.android.gms.internal.consent_sdk;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k5 implements Iterable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k5 f13446d = new k5(x5.f13607b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13447b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13448c;

    static {
        int i = h5.f13404a;
    }

    public k5(byte[] bArr) {
        bArr.getClass();
        this.f13448c = bArr;
    }

    public static void g(int i) {
        if (((i - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(l7.o.i(i, "End index: 47 >= "));
        }
    }

    public byte a(int i) {
        return this.f13448c[i];
    }

    public byte c(int i) {
        return this.f13448c[i];
    }

    public int e() {
        return this.f13448c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        int iE = e();
        if (iE != k5Var.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i = this.f13447b;
        int i10 = k5Var.f13447b;
        if (i == 0 || i10 == 0 || i == i10) {
            return f(k5Var);
        }
        return false;
    }

    public final boolean f(k5 k5Var) {
        if (!(k5Var instanceof k5)) {
            return k5Var.f(this);
        }
        int iE = e();
        if (iE > k5Var.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > k5Var.e()) {
            throw new IllegalArgumentException(a0.u.j(iE, k5Var.e(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = k5Var.f13448c;
        int i = 0;
        int i10 = 0;
        while (i < iE) {
            if (this.f13448c[i] != bArr[i10]) {
                return false;
            }
            i++;
            i10++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f13447b;
        if (i != 0) {
            return i;
        }
        int iE = e();
        int i10 = iE;
        for (int i11 = 0; i11 < iE; i11++) {
            i10 = (i10 * 31) + this.f13448c[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f13447b = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        if (e() <= 50) {
            strConcat = b0.b(this);
        } else {
            g(e());
            byte[] bArr = this.f13448c;
            j5 j5Var = new j5(bArr);
            g(bArr.length);
            strConcat = b0.b(j5Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iE);
        sb2.append(" contents=\"");
        return a0.u.o(sb2, strConcat, "\">");
    }
}
