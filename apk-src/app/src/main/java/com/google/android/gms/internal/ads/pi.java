package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jx1[] f9073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9074e;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public pi(String str, jx1... jx1VarArr) {
        int length = jx1VarArr.length;
        int i = 1;
        ix.o(length > 0);
        this.f9071b = str;
        this.f9073d = jx1VarArr;
        this.f9070a = length;
        int iF = ra.f(jx1VarArr[0].f6975m);
        this.f9072c = iF == -1 ? ra.f(jx1VarArr[0].f6974l) : iF;
        jx1 jx1Var = jx1VarArr[0];
        String str2 = jx1Var.f6967d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = jx1Var.f6969f | 16384;
        while (true) {
            jx1[] jx1VarArr2 = this.f9073d;
            if (i >= jx1VarArr2.length) {
                return;
            }
            jx1 jx1Var2 = jx1VarArr2[i];
            String str3 = jx1Var2.f6967d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a("languages", jx1VarArr2[0].f6967d, str3, i);
                return;
            } else {
                if (i10 != (jx1Var2.f6969f | 16384)) {
                    a("role flags", Integer.toBinaryString(jx1VarArr2[0].f6969f), Integer.toBinaryString(this.f9073d[i].f6969f), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        l7.o.t(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i);
        sb2.append(")");
        rs.H("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pi.class == obj.getClass()) {
            pi piVar = (pi) obj;
            if (this.f9071b.equals(piVar.f9071b) && Arrays.equals(this.f9073d, piVar.f9073d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9074e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f9073d) + ((this.f9071b.hashCode() + 527) * 31);
        this.f9074e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f9073d);
        String str = this.f9071b;
        return t.z.g(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}
