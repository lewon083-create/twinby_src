package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends c20 {
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f5922j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // com.google.android.gms.internal.ads.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final l00 h(l00 l00Var) throws i10 {
        int[] iArr = this.i;
        if (iArr == null) {
            return l00.f7359e;
        }
        int i = l00Var.f7362c;
        if (!cq0.a(i)) {
            throw new i10("Unhandled input format:", l00Var);
        }
        int i10 = l00Var.f7361b;
        boolean z5 = i10 != iArr.length;
        int i11 = 0;
        while (true) {
            int length = iArr.length;
            if (i11 >= length) {
                return z5 ? new l00(l00Var.f7360a, length, i) : l00.f7359e;
            }
            int i12 = iArr[i11];
            if (i12 >= i10) {
                String string = Arrays.toString(iArr);
                throw new i10(t.z.g(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), l00Var);
            }
            z5 |= i12 != i11;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void m() {
        this.f5922j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final void n() {
        this.f5922j = null;
        this.i = null;
    }
}
