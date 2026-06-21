package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tj1 implements q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1 f10630a;

    public tj1(rd1 rd1Var) {
        this.f10630a = rd1Var;
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f10630a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((sj1) it.next()).f10313a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
