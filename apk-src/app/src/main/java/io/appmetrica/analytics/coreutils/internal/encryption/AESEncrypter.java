package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f21798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f21799c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f21797a = str;
        this.f21798b = bArr;
        this.f21799c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f21798b, "AES");
            Cipher cipher = Cipher.getInstance(this.f21797a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f21799c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f21797a;
    }

    public byte[] getIV() {
        return this.f21799c;
    }

    public byte[] getPassword() {
        return this.f21798b;
    }

    public byte[] decrypt(@NonNull byte[] bArr, int i, int i10) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f21798b, "AES");
            Cipher cipher = Cipher.getInstance(this.f21797a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f21799c));
            return cipher.doFinal(bArr, i, i10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
