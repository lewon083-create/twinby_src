package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0040b implements H8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEncrypter f23465a;

    public C0040b() {
        this(new C0014a(C0382oa.k().g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.H8
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.A8 a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.Q5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r1 = r2.f23465a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.setValue(r0)
            io.appmetrica.analytics.impl.A8 r0 = new io.appmetrica.analytics.impl.A8
            io.appmetrica.analytics.impl.J8 r1 = io.appmetrica.analytics.impl.J8.AES_VALUE_ENCRYPTION
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0040b.a(io.appmetrica.analytics.impl.Q5):io.appmetrica.analytics.impl.A8");
    }

    public C0040b(C0014a c0014a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0014a.b(), c0014a.a()));
    }

    public C0040b(AESEncrypter aESEncrypter) {
        this.f23465a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.H8
    @NonNull
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f23465a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final J8 a() {
        return J8.AES_VALUE_ENCRYPTION;
    }
}
