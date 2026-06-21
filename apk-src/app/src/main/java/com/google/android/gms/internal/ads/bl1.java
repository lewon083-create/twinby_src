package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gb f3813d = new gb(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f3814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3816c;

    public bl1(int i, byte[] bArr) throws GeneralSecurityException {
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        gr.t(bArr.length);
        this.f3814a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f3813d.get()).getBlockSize();
        this.f3816c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f3815b = i;
    }
}
