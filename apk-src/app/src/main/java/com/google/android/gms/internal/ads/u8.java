package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10868e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f10872d;

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f10869a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f10872d;
            int length = bArr2.length;
            int i12 = this.f10870b + i11;
            if (length < i12) {
                this.f10872d = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.f10872d, this.f10870b, i11);
            this.f10870b += i11;
        }
    }
}
