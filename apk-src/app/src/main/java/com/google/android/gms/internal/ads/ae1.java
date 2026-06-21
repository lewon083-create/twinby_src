package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ae1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gb f2876a = new gb(3);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f2876a.get()).nextBytes(bArr);
        return bArr;
    }
}
