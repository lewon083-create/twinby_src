package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8[] f5274a;

    public f9(k8... k8VarArr) {
        this.f5274a = k8VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r51 a(java.lang.Class r10, com.google.android.gms.internal.ads.g31 r11) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.v41 r0 = com.google.android.gms.internal.ads.x41.f12018c
            java.lang.String r0 = "initialCapacity"
            r1 = 4
            com.google.android.gms.internal.ads.fs1.y(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.k8[] r1 = r9.f5274a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L41
            r5 = r1[r3]
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r10.isAssignableFrom(r6)
            if (r6 == 0) goto L2a
            java.lang.Object r5 = r10.cast(r5)
            com.google.android.gms.internal.ads.k8 r5 = (com.google.android.gms.internal.ads.k8) r5
            boolean r6 = r11.a(r5)
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L3e
            int r6 = r0.length
            int r7 = r4 + 1
            int r8 = com.google.android.gms.internal.ads.s41.d(r6, r7)
            if (r8 > r6) goto L37
            goto L3b
        L37:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
        L3b:
            r0[r4] = r5
            r4 = r7
        L3e:
            int r3 = r3 + 1
            goto Lf
        L41:
            com.google.android.gms.internal.ads.r51 r10 = com.google.android.gms.internal.ads.x41.x(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.a(java.lang.Class, com.google.android.gms.internal.ads.g31):com.google.android.gms.internal.ads.r51");
    }

    public final f9 b(f9 f9Var) {
        return f9Var == null ? this : c(f9Var.f5274a);
    }

    public final f9 c(k8... k8VarArr) {
        int length = k8VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = cq0.f4293a;
        k8[] k8VarArr2 = this.f5274a;
        int length2 = k8VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(k8VarArr2, length2 + length);
        System.arraycopy(k8VarArr, 0, objArrCopyOf, length2, length);
        return new f9((k8[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f9.class == obj.getClass() && Arrays.equals(this.f5274a, ((f9) obj).f5274a);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.f5274a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f5274a);
        return t.z.g(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public f9(List list) {
        this.f5274a = (k8[]) list.toArray(new k8[0]);
    }
}
