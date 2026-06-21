package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gb f4919a = new gb(2);

    public static qb1 b(pa1 pa1Var) throws GeneralSecurityException {
        byte[] bArr = qb1.f9433d;
        try {
            Cipher cipher = (Cipher) f4919a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (qb1.b(cipher)) {
                return new qb1(((sl1) pa1Var.f9000e.f12221c).b(), pa1Var.f9001f.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e3) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e3);
        }
    }
}
