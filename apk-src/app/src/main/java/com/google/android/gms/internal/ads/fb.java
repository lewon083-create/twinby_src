package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya f5305b;

    public fb(ya yaVar, int i) {
        this.f5305b = yaVar;
        ((ByteArrayOutputStream) this).buf = yaVar.h(Math.max(i, 256));
    }

    public final void a(int i) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = i10 + i;
        ya yaVar = this.f5305b;
        byte[] bArrH = yaVar.h(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrH, 0, ((ByteArrayOutputStream) this).count);
        yaVar.o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrH;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5305b.o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f5305b.o(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        a(i10);
        super.write(bArr, i, i10);
    }
}
