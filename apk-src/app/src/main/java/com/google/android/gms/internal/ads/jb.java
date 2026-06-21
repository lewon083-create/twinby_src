package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jb extends es1 {
    static {
        fs1.w(jb.class);
    }

    public jb(ly lyVar, ib ibVar) {
        ByteBuffer byteBuffer = lyVar.f7674b;
        long jLimit = byteBuffer.limit();
        this.f5061c = lyVar;
        this.f5063e = lyVar.b();
        byteBuffer.position((int) (lyVar.b() + jLimit));
        this.f5064f = lyVar.b();
        this.f5060b = ibVar;
    }

    @Override // com.google.android.gms.internal.ads.es1
    public final String toString() {
        String string = this.f5061c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.es1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
