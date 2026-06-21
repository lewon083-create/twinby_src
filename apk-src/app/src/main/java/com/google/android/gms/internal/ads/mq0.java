package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, qd0 qd0Var) {
        l91 l91VarA;
        ByteArrayInputStream byteArrayInputStream;
        if (str != null) {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e3) {
                t9.c0.m("Failed to get keysethandle".concat(e3.toString()));
                p9.k.C.f31302h.d("CryptoUtils.getHandle", e3);
                l91VarA = null;
            }
            try {
                kn1 kn1Var = kn1.f7271a;
                int i = tm1.f10663a;
                rh1 rh1VarE = rh1.E(byteArrayInputStream, kn1.f7272b);
                byteArrayInputStream.close();
                l91VarA = l91.a(rh1VarE);
                if (l91VarA != null) {
                    try {
                        byte[] bArrA = ((e91) l91VarA.A(vv.f(), e91.class)).a(bArr, bArr2);
                        qd0Var.f9459a.put("ds", "1");
                        return new String(bArrA, "UTF-8");
                    } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e7) {
                        t9.c0.m("Failed to decrypt ".concat(e7.toString()));
                        p9.k.C.f31302h.d("CryptoUtils.decrypt", e7);
                        qd0Var.f9459a.put("dsf", e7.toString());
                    }
                }
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        }
        return null;
    }
}
