package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3341a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f3343c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3342b = bArr;
        f3343c = ByteBuffer.wrap(bArr);
        en1.d(bArr, 0, 0);
    }

    public static int a(int i, int i10, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i = (i * 31) + bArr[i12];
        }
        return i;
    }
}
