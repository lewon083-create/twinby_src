package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class zq1 extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jx1 f13077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cp1 f13078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f13079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13081h;
    public ByteBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13082j;

    static {
        e6.a("media3.decoder");
    }

    public zq1(int i) {
        super(1);
        this.f13078e = new cp1(0);
        this.f13082j = i;
    }

    public void r() {
        this.f7316c = 0;
        ByteBuffer byteBuffer = this.f13079f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13080g = false;
    }

    public final void s(int i) {
        ByteBuffer byteBuffer = this.f13079f;
        if (byteBuffer == null) {
            this.f13079f = v(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i + iPosition;
        if (iCapacity >= i10) {
            this.f13079f = byteBuffer;
            return;
        }
        ByteBuffer byteBufferV = v(i10);
        byteBufferV.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferV.put(byteBuffer);
        }
        this.f13079f = byteBufferV;
    }

    public final boolean t() {
        return q(1073741824);
    }

    public final void u() {
        ByteBuffer byteBuffer = this.f13079f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer v(int i) {
        int i10 = this.f13082j;
        if (i10 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f13079f;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iCapacity).length() + 21 + String.valueOf(i).length() + 1);
        om1.u(sb2, "Buffer too small (", iCapacity, " < ", i);
        sb2.append(")");
        throw new kq1(sb2.toString());
    }
}
