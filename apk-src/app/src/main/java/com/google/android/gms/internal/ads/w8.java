package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f11689f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f11694e;

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f11690a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f11694e;
            int length = bArr2.length;
            int i12 = this.f11692c + i11;
            if (length < i12) {
                this.f11694e = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.f11694e, this.f11692c, i11);
            this.f11692c += i11;
        }
    }
}
