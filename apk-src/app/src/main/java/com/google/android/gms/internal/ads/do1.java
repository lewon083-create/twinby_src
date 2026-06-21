package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f4621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f4622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f4627h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4628j;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.f4621b;
        do {
            this.f4624e++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f4622c = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f4625f = this.f4622c.position();
        if (this.f4622c.hasArray()) {
            this.f4626g = true;
            this.f4627h = this.f4622c.array();
            this.i = this.f4622c.arrayOffset();
            return true;
        }
        this.f4626g = false;
        this.f4628j = jp1.n(this.f4622c);
        this.f4627h = null;
        return true;
    }

    public final void b(int i) {
        int i10 = this.f4625f + i;
        this.f4625f = i10;
        if (i10 == this.f4622c.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4624e == this.f4623d) {
            return -1;
        }
        if (this.f4626g) {
            int i = this.f4627h[this.f4625f + this.i] & 255;
            b(1);
            return i;
        }
        int iB0 = jp1.f6923c.b0(((long) this.f4625f) + this.f4628j) & 255;
        b(1);
        return iB0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        if (this.f4624e == this.f4623d) {
            return -1;
        }
        int iLimit = this.f4622c.limit();
        int i11 = this.f4625f;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f4626g) {
            System.arraycopy(this.f4627h, i11 + this.i, bArr, i, i10);
            b(i10);
            return i10;
        }
        int iPosition = this.f4622c.position();
        this.f4622c.position(this.f4625f);
        this.f4622c.get(bArr, i, i10);
        this.f4622c.position(iPosition);
        b(i10);
        return i10;
    }
}
