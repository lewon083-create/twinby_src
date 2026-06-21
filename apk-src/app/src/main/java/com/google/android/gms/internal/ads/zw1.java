package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 extends zq1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13139m;

    @Override // com.google.android.gms.internal.ads.zq1
    public final void r() {
        super.r();
        this.f13138l = 0;
    }

    public final int w() {
        return this.f13138l;
    }

    public final boolean x() {
        return this.f13138l > 0;
    }

    public final boolean y(zq1 zq1Var) {
        ByteBuffer byteBuffer;
        ix.o(!zq1Var.q(1073741824));
        ix.o(!zq1Var.q(268435456));
        ix.o(!zq1Var.q(4));
        if (x()) {
            if (this.f13138l >= this.f13139m) {
                return false;
            }
            ByteBuffer byteBuffer2 = zq1Var.f13079f;
            if (byteBuffer2 != null && (byteBuffer = this.f13079f) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f13138l;
        this.f13138l = i + 1;
        if (i == 0) {
            this.f13081h = zq1Var.f13081h;
            if (zq1Var.q(1)) {
                this.f7316c = 1;
            }
        }
        ByteBuffer byteBuffer3 = zq1Var.f13079f;
        if (byteBuffer3 != null) {
            s(byteBuffer3.remaining());
            this.f13079f.put(byteBuffer3);
        }
        this.f13137k = zq1Var.f13081h;
        return true;
    }
}
