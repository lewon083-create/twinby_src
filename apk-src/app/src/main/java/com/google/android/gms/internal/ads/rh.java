package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rh extends ip1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MessageDigest f9936d;

    public final byte[] F1(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iA = nz.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iA2 = nz.a(strArrSplit[i10]);
                    int i11 = (iA2 >> 16) ^ ((char) iA2);
                    byte b2 = (byte) i11;
                    byte b10 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b2, b10}[0];
                    bArr[i12 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    int iA3 = nz.a(strArrSplit[i13]);
                    bArr[i13] = (byte) ((iA3 >> 24) ^ (((iA3 & KotlinVersion.MAX_COMPONENT_VALUE) ^ ((iA3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) ^ ((iA3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)));
                }
            }
            bArrArray = bArr;
        }
        this.f9936d = Q();
        synchronized (this.f6568b) {
            try {
                MessageDigest messageDigest = this.f9936d;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f9936d.update(bArrArray);
                byte[] bArrDigest = this.f9936d.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
