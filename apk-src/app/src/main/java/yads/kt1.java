package yads;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40345a;

    public kt1(int i, String str) {
        this.f40345a = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f40345a).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher2 = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    byteArrayOutputStream.write(cipher2.doFinal(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
