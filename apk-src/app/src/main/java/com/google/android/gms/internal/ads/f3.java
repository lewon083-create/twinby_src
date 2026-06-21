package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5206f;

    public f3(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f5201a = i;
        this.f5202b = i10;
        this.f5203c = i11;
        this.f5204d = i12;
        this.f5205e = i13;
        this.f5206f = i14;
    }

    public final int a() {
        int i = this.f5201a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        rs.r("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final int h() {
        return 1752331379;
    }
}
