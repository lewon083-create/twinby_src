package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f13222d = new g0(o0.f13270b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13223b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13224c;

    static {
        int i = d0.f13189a;
    }

    public g0(byte[] bArr) {
        bArr.getClass();
        this.f13224c = bArr;
    }

    public static int f(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a0.u.k(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(a0.u.j(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a0.u.j(i10, i11, "End index: ", " >= "));
    }

    public static g0 g(byte[] bArr, int i, int i10) {
        f(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new g0(bArr2);
    }

    public byte a(int i) {
        return this.f13224c[i];
    }

    public byte c(int i) {
        return this.f13224c[i];
    }

    public int e() {
        return this.f13224c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g0) && e() == ((g0) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof g0)) {
                return obj.equals(this);
            }
            g0 g0Var = (g0) obj;
            int i = this.f13223b;
            int i10 = g0Var.f13223b;
            if (i == 0 || i10 == 0 || i == i10) {
                int iE = e();
                if (iE > g0Var.e()) {
                    throw new IllegalArgumentException("Length too large: " + iE + e());
                }
                if (iE > g0Var.e()) {
                    throw new IllegalArgumentException(a0.u.j(iE, g0Var.e(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = g0Var.f13224c;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iE) {
                    if (this.f13224c[i11] == bArr[i12]) {
                        i11++;
                        i12++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f13223b;
        if (i != 0) {
            return i;
        }
        int iE = e();
        int i10 = iE;
        for (int i11 = 0; i11 < iE; i11++) {
            i10 = (i10 * 31) + this.f13224c[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f13223b = i10;
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
            strConcat = hl.l.u(this);
        } else {
            int iF = f(0, 47, e());
            strConcat = hl.l.u(iF == 0 ? f13222d : new e0(iF, this.f13224c)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iE);
        sb2.append(" contents=\"");
        return a0.u.o(sb2, strConcat, "\">");
    }
}
