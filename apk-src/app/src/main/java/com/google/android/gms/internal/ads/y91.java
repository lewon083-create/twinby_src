package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1 f12553a;

    @Override // com.google.android.gms.internal.ads.e91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f12553a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((x91) it.next()).f12089a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
