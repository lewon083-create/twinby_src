package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2827b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2829d;

    public ab(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f2828c = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long jMin;
        switch (this.f2827b) {
            case 1:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.f2828c);
                break;
            case 2:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.f2828c);
                break;
            default:
                return super.available();
        }
        return (int) jMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f2827b) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f2829d = this.f2828c;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f2829d = this.f2828c;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2827b) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.f2829d++;
                }
                return i;
            case 1:
                if (this.f2828c == 0) {
                    return -1;
                }
                int i10 = ((FilterInputStream) this).in.read();
                if (i10 != -1) {
                    this.f2828c--;
                }
                return i10;
            default:
                if (this.f2828c == 0) {
                    return -1;
                }
                int i11 = ((FilterInputStream) this).in.read();
                if (i11 != -1) {
                    this.f2828c--;
                }
                return i11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f2827b) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f2829d == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f2828c = this.f2829d;
                }
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f2829d == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f2828c = this.f2829d;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        switch (this.f2827b) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f2828c));
                this.f2828c -= jSkip;
                return jSkip;
            case 2:
                long jSkip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.f2828c));
                this.f2828c -= jSkip2;
                return jSkip2;
            default:
                return super.skip(j10);
        }
    }

    public ab(InputStream inputStream, long j10) {
        super(inputStream);
        this.f2829d = -1L;
        inputStream.getClass();
        ix.A("limit must be non-negative", j10 >= 0);
        this.f2828c = j10;
    }

    public ab(InputStream inputStream) {
        super(inputStream);
        this.f2829d = -1L;
        this.f2828c = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        switch (this.f2827b) {
            case 0:
                int i11 = super.read(bArr, i, i10);
                if (i11 != -1) {
                    this.f2829d += (long) i11;
                }
                return i11;
            case 1:
                long j10 = this.f2828c;
                if (j10 == 0) {
                    return -1;
                }
                int i12 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j10));
                if (i12 != -1) {
                    this.f2828c -= (long) i12;
                }
                return i12;
            default:
                long j11 = this.f2828c;
                if (j11 == 0) {
                    return -1;
                }
                int i13 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j11));
                if (i13 != -1) {
                    this.f2828c -= (long) i13;
                }
                return i13;
        }
    }
}
