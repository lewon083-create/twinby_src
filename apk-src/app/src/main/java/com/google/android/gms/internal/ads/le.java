package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7492a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f7493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7494c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7495d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f7496e = new CountDownLatch(1);

    public static void a() {
        synchronized (f7495d) {
            try {
                if (!f7492a) {
                    f7492a = true;
                    new Thread(new ke(0)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static fe b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i = length + 254;
            vector = new Vector();
            for (int i10 = 0; i10 < i / KotlinVersion.MAX_COMPONENT_VALUE; i10++) {
                int i11 = i10 * KotlinVersion.MAX_COMPONENT_VALUE;
                try {
                    int length2 = bArr.length;
                    if (length2 - i11 > 255) {
                        length2 = i11 + KotlinVersion.MAX_COMPONENT_VALUE;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i11, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        fe feVarZ = ge.z();
        int size = vector.size();
        for (int i12 = 0; i12 < size; i12++) {
            zm1 zm1VarA = bn1.A(d((byte[]) vector.get(i12), str, false), 0, 256);
            feVarZ.b();
            ((ge) feVarZ.f9560c).A(zm1VarA);
        }
        byte[] bArrC = c(bArr);
        zm1 zm1Var = bn1.f3837c;
        zm1 zm1VarA2 = bn1.A(bArrC, 0, bArrC.length);
        feVarZ.b();
        ((ge) feVarZ.f9560c).B(zm1VarA2);
        return feVarZ;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f7494c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f7496e.await(2L, TimeUnit.SECONDS) && (messageDigest = f7493b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f7493b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z5) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z5 ? 255 : 239;
        if (length > i) {
            jd jdVarB0 = wd.B0();
            jdVarB0.h(4096L);
            bArr = ((wd) jdVarB0.d()).b();
        }
        int i10 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i10).put(b2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i10).put(b2).put(bArr).array();
        }
        if (z5) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        me[] meVarArr = (me[]) new re(0).K2;
        int length3 = meVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            meVarArr[i11].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            ox0 ox0Var = new ox0(str.getBytes("UTF-8"));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                byte[] bArr4 = (byte[]) ox0Var.f8851c;
                i12 = (i12 + 1) & KotlinVersion.MAX_COMPONENT_VALUE;
                byte b10 = bArr4[i12];
                i13 = (i13 + b10) & KotlinVersion.MAX_COMPONENT_VALUE;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b10;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b10) & KotlinVersion.MAX_COMPONENT_VALUE] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }
}
