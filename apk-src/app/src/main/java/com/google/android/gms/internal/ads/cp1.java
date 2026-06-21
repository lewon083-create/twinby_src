package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f4283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4286h;
    public final MediaCodec.CryptoInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f4287j;

    public cp1(int i) {
        switch (i) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.f4287j = new r3.b(cryptoInfo);
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.f4287j = new ut(cryptoInfo2);
                break;
        }
    }

    public void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f4282d == null) {
            int[] iArr = new int[1];
            this.f4282d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f4282d;
        iArr2[0] = iArr2[0] + i;
    }
}
