package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f40 extends c20 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f40.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final l00 h(l00 l00Var) throws i10 {
        int i = l00Var.f7362c;
        if (i != 3) {
            if (i == 2) {
                return l00.f7359e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new i10("Unhandled input format:", l00Var);
            }
        }
        return new l00(l00Var.f7360a, l00Var.f7361b, 2);
    }
}
