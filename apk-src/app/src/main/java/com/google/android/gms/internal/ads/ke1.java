package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 {
    public static ke1 a(he1 he1Var, Provider provider) throws GeneralSecurityException {
        ke1 ke1Var = new ke1();
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            he1Var.f6109f.b();
            new SecretKeySpec(((sl1) he1Var.f6108e.f12221c).b(), "AES");
            return ke1Var;
        } catch (NoSuchAlgorithmException e3) {
            throw new GeneralSecurityException("AES-CMAC not available.", e3);
        }
    }
}
