package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mb extends ds1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Date f7834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Date f7835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f7838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public is1 f7840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7841r;

    @Override // com.google.android.gms.internal.ads.ds1
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f7833j = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f4636c) {
            d();
        }
        if (this.f7833j == 1) {
            this.f7834k = vv.h(rs.v(byteBuffer));
            this.f7835l = vv.h(rs.v(byteBuffer));
            this.f7836m = rs.d(byteBuffer);
            this.f7837n = rs.v(byteBuffer);
        } else {
            this.f7834k = vv.h(rs.d(byteBuffer));
            this.f7835l = vv.h(rs.d(byteBuffer));
            this.f7836m = rs.d(byteBuffer);
            this.f7837n = rs.d(byteBuffer);
        }
        this.f7838o = rs.A(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f7839p = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        rs.d(byteBuffer);
        rs.d(byteBuffer);
        this.f7840q = new is1(rs.A(byteBuffer), rs.A(byteBuffer), rs.A(byteBuffer), rs.A(byteBuffer), rs.E(byteBuffer), rs.E(byteBuffer), rs.E(byteBuffer), rs.A(byteBuffer), rs.A(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f7841r = rs.d(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.f7834k);
        sb2.append(";modificationTime=");
        sb2.append(this.f7835l);
        sb2.append(";timescale=");
        sb2.append(this.f7836m);
        sb2.append(";duration=");
        sb2.append(this.f7837n);
        sb2.append(";rate=");
        sb2.append(this.f7838o);
        sb2.append(";volume=");
        sb2.append(this.f7839p);
        sb2.append(";matrix=");
        sb2.append(this.f7840q);
        sb2.append(";nextTrackId=");
        return pe.a.h(sb2, this.f7841r, "]");
    }
}
