package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9185d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pt0(int r5, int r6, java.lang.String r7, byte[] r8) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r7.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1949883051: goto L5e;
                case -269399509: goto L41;
                case 1011693540: goto L28;
                case 1098277265: goto L1f;
                case 2002123038: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L75
        Le:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L75
            if (r6 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            com.google.android.gms.internal.ads.ix.o(r1)
            goto L75
        L1f:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L75
            goto L30
        L28:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L75
        L30:
            r0 = 78
            if (r6 != r0) goto L3c
            int r6 = r8.length
            r3 = 8
            if (r6 != r3) goto L3b
            r6 = r0
            goto L3d
        L3b:
            r6 = r0
        L3c:
            r1 = r2
        L3d:
            com.google.android.gms.internal.ads.ix.o(r1)
            goto L75
        L41:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L75
            r0 = 75
            if (r6 != r0) goto L59
            int r6 = r8.length
            if (r6 != r1) goto L58
            r6 = r8[r2]
            if (r6 == 0) goto L56
            if (r6 != r1) goto L58
        L56:
            r6 = r0
            goto L5a
        L58:
            r6 = r0
        L59:
            r1 = r2
        L5a:
            com.google.android.gms.internal.ads.ix.o(r1)
            goto L75
        L5e:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L75
            r0 = 23
            if (r6 != r0) goto L71
            int r6 = r8.length
            r3 = 4
            if (r6 != r3) goto L70
            r6 = r0
            goto L72
        L70:
            r6 = r0
        L71:
            r1 = r2
        L72:
            com.google.android.gms.internal.ads.ix.o(r1)
        L75:
            r4.f9182a = r7
            r4.f9183b = r8
            r4.f9184c = r5
            r4.f9185d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.<init>(int, int, java.lang.String, byte[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pt0.class == obj.getClass()) {
            pt0 pt0Var = (pt0) obj;
            if (this.f9182a.equals(pt0Var.f9182a) && Arrays.equals(this.f9183b, pt0Var.f9183b) && this.f9184c == pt0Var.f9184c && this.f9185d == pt0Var.f9185d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9183b) + ((this.f9182a.hashCode() + 527) * 31)) * 31) + this.f9184c) * 31) + this.f9185d;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.toString():java.lang.String");
    }
}
