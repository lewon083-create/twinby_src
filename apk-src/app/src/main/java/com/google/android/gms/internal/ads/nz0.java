package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageDigest f8521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j21 f8522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8523c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8524d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f8525e;

    public nz0(j21 j21Var) {
        this.f8522b = j21Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.i21) VIRTUAL call: com.google.android.gms.internal.ads.i21.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:25:0x0039 */
    public final void a() {
        boolean z5;
        i21 i21VarC;
        synchronized (this) {
            z5 = this.f8524d;
        }
        if (z5) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                i21 i21VarA = this.f8522b.a(202);
                try {
                    i21VarA.a();
                    this.f8525e = secureRandom;
                    this.f8521a = MessageDigest.getInstance("MD5");
                    this.f8524d = true;
                } catch (NoSuchAlgorithmException e3) {
                    i21VarA.b(e3);
                } catch (Throwable th2) {
                    i21VarA.b(th2);
                    throw th2;
                }
                i21VarA.c();
            } catch (Throwable th3) {
                i21VarC.c();
                throw th3;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z5) {
        int length = bArr.length;
        int i = true != z5 ? 255 : 239;
        ix.o(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i10 = i - length;
            byte[] bArr2 = new byte[i10];
            this.f8525e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i10);
            System.arraycopy(bArr2, 0, bArr, length, i10);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z5) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        pz0[] pz0VarArr = (pz0[]) new re(1).K2;
        int length2 = pz0VarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            pz0VarArr[i11].a(bArrArray, bArr3);
        }
        if (!fs1.n(str)) {
            oz0 oz0Var = new oz0(0, str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                i12 = (i12 + 1) & KotlinVersion.MAX_COMPONENT_VALUE;
                byte[] bArr4 = oz0Var.f8863a;
                byte b2 = bArr4[i12];
                i13 = (i13 + b2) & KotlinVersion.MAX_COMPONENT_VALUE;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b2;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b2) & KotlinVersion.MAX_COMPONENT_VALUE] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f8523c) {
            this.f8521a.reset();
            this.f8521a.update(bArr);
            bArrDigest = this.f8521a.digest();
        }
        return bArrDigest;
    }

    public final fe d(String str, byte[] bArr) {
        fe feVarZ = ge.z();
        byte[] bArrC = c(bArr);
        zm1 zm1Var = bn1.f3837c;
        zm1 zm1VarA = bn1.A(bArrC, 0, bArrC.length);
        feVarZ.b();
        ((ge) feVarZ.f9560c).B(zm1VarA);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / KotlinVersion.MAX_COMPONENT_VALUE) + 1) {
                break;
            }
            int i10 = i * KotlinVersion.MAX_COMPONENT_VALUE;
            int i11 = i10 + KotlinVersion.MAX_COMPONENT_VALUE;
            if (length > i11) {
                length = i11;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i10, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zm1 zm1VarA2 = bn1.A(b((byte[]) it.next(), str, false), 0, 256);
            feVarZ.b();
            ((ge) feVarZ.f9560c).A(zm1VarA2);
        }
        return feVarZ;
    }
}
