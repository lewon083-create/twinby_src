package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12014g;

    public x4(int i) {
        switch (i) {
            case 1:
                this.f12008a = new byte[8];
                this.f12009b = new ArrayDeque();
                this.f12013f = new i5.f();
                break;
            default:
                this.f12008a = new byte[8];
                this.f12009b = new ArrayDeque();
                this.f12013f = new c5(0);
                break;
        }
    }

    public long a(q4.l lVar, int i) {
        byte[] bArr = this.f12008a;
        lVar.readFully(bArr, 0, i);
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return j10;
    }

    public long b(a2 a2Var, int i) {
        byte[] bArr = this.f12008a;
        a2Var.w(bArr, 0, i);
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return j10;
    }
}
