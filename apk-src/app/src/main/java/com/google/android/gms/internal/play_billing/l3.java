package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f14238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f14239b;

    static {
        Charset.forName("US-ASCII");
        f14238a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14239b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
