package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hv1 f6270c = new hv1(x41.q(gv1.f5915d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r51 f6271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w51 f6272e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f6273a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6274b;

    static {
        Object[] objArr = {2, 5, 6};
        vv.j(3, objArr);
        f6271d = x41.x(3, objArr);
        ya yaVar = new ya(4);
        yaVar.g(5, 6);
        yaVar.g(17, 6);
        yaVar.g(7, 6);
        yaVar.g(30, 10);
        yaVar.g(18, 6);
        yaVar.g(6, 8);
        yaVar.g(8, 8);
        yaVar.g(14, 8);
        f6272e = yaVar.s(true);
    }

    public hv1(r51 r51Var) {
        for (int i = 0; i < r51Var.f9715e; i++) {
            gv1 gv1Var = (gv1) r51Var.get(i);
            this.f6273a.put(gv1Var.f5916a, gv1Var);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f6273a.size(); i10++) {
            iMax = Math.max(iMax, ((gv1) this.f6273a.valueAt(i10)).f5917b);
        }
        this.f6274b = iMax;
    }

    public static hv1 a(Context context, s50 s50Var, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), s50Var, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.hv1 b(android.content.Context r16, android.content.Intent r17, com.google.android.gms.internal.ads.s50 r18, android.media.AudioDeviceInfo r19) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hv1.b(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.s50, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.hv1");
    }

    public static r51 d(int i, int[] iArr) {
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i11 = 0;
        while (i10 < iArr.length) {
            gv1 gv1Var = new gv1(iArr[i10], i);
            int length = objArrCopyOf.length;
            int i12 = i11 + 1;
            int iD = s41.d(length, i12);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = gv1Var;
            i10++;
            i11 = i12;
        }
        return x41.x(i11, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r2
      0x003f: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:11:0x0033, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(com.google.android.gms.internal.ads.jx1 r17, com.google.android.gms.internal.ads.s50 r18) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hv1.c(com.google.android.gms.internal.ads.jx1, com.google.android.gms.internal.ads.s50):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L3
            goto L46
        L3:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.hv1
            r1 = 0
            if (r0 != 0) goto L9
            goto L48
        L9:
            com.google.android.gms.internal.ads.hv1 r8 = (com.google.android.gms.internal.ads.hv1) r8
            android.util.SparseArray r0 = r8.f6273a
            java.lang.String r2 = com.google.android.gms.internal.ads.cq0.f4293a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            android.util.SparseArray r4 = r7.f6273a
            if (r2 < r3) goto L1e
            boolean r0 = g8.j.x(r4, r0)
            if (r0 == 0) goto L48
            goto L40
        L1e:
            int r2 = r4.size()
            int r3 = r0.size()
            if (r2 != r3) goto L48
            r3 = r1
        L29:
            if (r3 >= r2) goto L40
            int r5 = r4.keyAt(r3)
            java.lang.Object r6 = r4.valueAt(r3)
            java.lang.Object r5 = r0.get(r5)
            boolean r5 = java.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L48
            int r3 = r3 + 1
            goto L29
        L40:
            int r0 = r7.f6274b
            int r8 = r8.f6274b
            if (r0 != r8) goto L48
        L46:
            r8 = 1
            return r8
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hv1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = cq0.f4293a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f6273a;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f6274b;
    }

    public final String toString() {
        String string = this.f6273a.toString();
        int i = this.f6274b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
