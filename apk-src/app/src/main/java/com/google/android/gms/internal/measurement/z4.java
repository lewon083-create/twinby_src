package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class z4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z4 f14114d = new z4(r5.f13945b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14115b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14116c;

    static {
        int i = v4.f14015a;
    }

    public z4(byte[] bArr) {
        bArr.getClass();
        this.f14116c = bArr;
    }

    public static z4 f(byte[] bArr, int i, int i10) {
        g(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new z4(bArr2);
    }

    public static int g(int i, int i10, int i11) {
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

    public byte a(int i) {
        return this.f14116c[i];
    }

    public byte c(int i) {
        return this.f14116c[i];
    }

    public int e() {
        return this.f14116c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z4) && e() == ((z4) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof z4)) {
                return obj.equals(this);
            }
            z4 z4Var = (z4) obj;
            int i = this.f14115b;
            int i10 = z4Var.f14115b;
            if (i == 0 || i10 == 0 || i == i10) {
                int iE = e();
                if (iE > z4Var.e()) {
                    int iE2 = e();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 18 + String.valueOf(iE2).length());
                    sb2.append("Length too large: ");
                    sb2.append(iE);
                    sb2.append(iE2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (iE > z4Var.e()) {
                    int iE3 = z4Var.e();
                    throw new IllegalArgumentException(pe.a.g(new StringBuilder(String.valueOf(iE).length() + 27 + String.valueOf(iE3).length()), iE, "Ran off end of other: 0, ", iE3, ", "));
                }
                byte[] bArr = z4Var.f14116c;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iE) {
                    if (this.f14116c[i11] == bArr[i12]) {
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
        int i = this.f14115b;
        if (i != 0) {
            return i;
        }
        int iE = e();
        int i10 = iE;
        for (int i11 = 0; i11 < iE; i11++) {
            i10 = (i10 * 31) + this.f14116c[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f14115b = i10;
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
            strConcat = com.google.android.gms.internal.auth.g.Q(this);
        } else {
            int iG = g(0, 47, e());
            strConcat = com.google.android.gms.internal.auth.g.Q(iG == 0 ? f14114d : new y4(iG, this.f14116c)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iE);
        sb2.append(" contents=\"");
        return a0.u.o(sb2, strConcat, "\">");
    }
}
