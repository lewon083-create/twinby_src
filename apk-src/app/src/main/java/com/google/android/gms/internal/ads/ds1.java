package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ds1 implements kb {
    public static final fs1 i = fs1.w(ds1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4635b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f4638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4639f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ly f4641h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4640g = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4637d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4636c = true;

    public ds1(String str) {
        this.f4635b = str;
    }

    @Override // com.google.android.gms.internal.ads.kb
    public final void a(ly lyVar, ByteBuffer byteBuffer, long j10, hb hbVar) {
        this.f4639f = lyVar.b();
        byteBuffer.remaining();
        this.f4640g = j10;
        this.f4641h = lyVar;
        lyVar.f7674b.position((int) (lyVar.b() + j10));
        this.f4637d = false;
        this.f4636c = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f4637d) {
                return;
            }
            try {
                fs1 fs1Var = i;
                String str = this.f4635b;
                fs1Var.k(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                ly lyVar = this.f4641h;
                long j10 = this.f4639f;
                long j11 = this.f4640g;
                ByteBuffer byteBuffer = lyVar.f7674b;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j10);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j11);
                byteBuffer.position(iPosition);
                this.f4638e = byteBufferSlice;
                this.f4637d = true;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            fs1 fs1Var = i;
            String str = this.f4635b;
            fs1Var.k(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f4638e;
            if (byteBuffer != null) {
                this.f4636c = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f4638e = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
