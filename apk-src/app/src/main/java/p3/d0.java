package p3;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f31135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.d f31136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31138e;

    public d0(h hVar, q3.d dVar) {
        hVar.getClass();
        this.f31135b = hVar;
        dVar.getClass();
        this.f31136c = dVar;
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        this.f31135b.addTransferListener(e0Var);
    }

    @Override // p3.h
    public final void close() throws q3.c {
        q3.d dVar = this.f31136c;
        try {
            this.f31135b.close();
            if (this.f31137d) {
                this.f31137d = false;
                if (dVar.f31628d == null) {
                    return;
                }
                try {
                    dVar.a();
                } catch (IOException e3) {
                    throw new q3.c(e3);
                }
            }
        } catch (Throwable th2) {
            if (this.f31137d) {
                this.f31137d = false;
                if (dVar.f31628d != null) {
                    try {
                        dVar.a();
                    } catch (IOException e7) {
                        throw new q3.c(e7);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        return this.f31135b.getResponseHeaders();
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31135b.getUri();
    }

    @Override // p3.h
    public final long open(l lVar) throws q3.c {
        long jOpen = this.f31135b.open(lVar);
        this.f31138e = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (lVar.f31178g == -1 && jOpen != -1) {
            lVar = lVar.d(0L, jOpen);
        }
        int i = lVar.i;
        this.f31137d = true;
        q3.d dVar = this.f31136c;
        dVar.getClass();
        lVar.f31179h.getClass();
        if (lVar.f31178g == -1 && (i & 2) == 2) {
            dVar.f31628d = null;
        } else {
            dVar.f31628d = lVar;
            dVar.f31629e = (i & 4) == 4 ? dVar.f31626b : Long.MAX_VALUE;
            dVar.i = 0L;
            try {
                dVar.b(lVar);
            } catch (IOException e3) {
                throw new q3.c(e3);
            }
        }
        return this.f31138e;
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws q3.c {
        if (this.f31138e == 0) {
            return -1;
        }
        int i11 = this.f31135b.read(bArr, i, i10);
        if (i11 > 0) {
            q3.d dVar = this.f31136c;
            l lVar = dVar.f31628d;
            if (lVar != null) {
                int i12 = 0;
                while (i12 < i11) {
                    try {
                        if (dVar.f31632h == dVar.f31629e) {
                            dVar.a();
                            dVar.b(lVar);
                        }
                        int iMin = (int) Math.min(i11 - i12, dVar.f31629e - dVar.f31632h);
                        OutputStream outputStream = dVar.f31631g;
                        String str = m3.z.f28608a;
                        outputStream.write(bArr, i + i12, iMin);
                        i12 += iMin;
                        long j10 = iMin;
                        dVar.f31632h += j10;
                        dVar.i += j10;
                    } catch (IOException e3) {
                        throw new q3.c(e3);
                    }
                }
            }
            long j11 = this.f31138e;
            if (j11 != -1) {
                this.f31138e = j11 - ((long) i11);
            }
        }
        return i11;
    }
}
