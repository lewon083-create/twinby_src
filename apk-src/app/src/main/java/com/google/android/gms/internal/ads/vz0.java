package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Cipher f11544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11545b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11546c = new Object();

    public static byte[] a(String str, byte[] bArr) throws uz0 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrX = vv.x(str, false);
            int length2 = bArrX.length;
            if (length2 <= 16) {
                throw new uz0();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrX);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11545b) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e3) {
            throw new uz0(e3);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f11546c) {
            try {
                if (f11544a == null) {
                    f11544a = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                }
                cipher = f11544a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }
}
