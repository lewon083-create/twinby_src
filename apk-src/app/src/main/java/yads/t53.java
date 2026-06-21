package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t53 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f43187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30 f43188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43190d;

    public t53(p30 p30Var, pr prVar) {
        this.f43187a = (p30) ni.a(p30Var);
        this.f43188b = (n30) ni.a(prVar);
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        this.f43187a.a(u83Var);
    }

    @Override // yads.p30
    public final void close() throws or {
        try {
            this.f43187a.close();
            if (this.f43189c) {
                this.f43189c = false;
                pr prVar = (pr) this.f43188b;
                if (prVar.f41990d == null) {
                    return;
                }
                try {
                    prVar.a();
                } catch (IOException e3) {
                    throw new or(e3);
                }
            }
        } catch (Throwable th2) {
            if (this.f43189c) {
                this.f43189c = false;
                pr prVar2 = (pr) this.f43188b;
                if (prVar2.f41990d != null) {
                    try {
                        prVar2.a();
                    } catch (IOException e7) {
                        throw new or(e7);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f43187a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f43187a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws or {
        if (this.f43190d == 0) {
            return -1;
        }
        int i11 = this.f43187a.read(bArr, i, i10);
        if (i11 > 0) {
            pr prVar = (pr) this.f43188b;
            u30 u30Var = prVar.f41990d;
            if (u30Var != null) {
                int i12 = 0;
                while (i12 < i11) {
                    try {
                        if (prVar.f41994h == prVar.f41991e) {
                            prVar.a();
                            prVar.a(u30Var);
                        }
                        int iMin = (int) Math.min(i11 - i12, prVar.f41991e - prVar.f41994h);
                        OutputStream outputStream = prVar.f41993g;
                        int i13 = lb3.f40466a;
                        outputStream.write(bArr, i + i12, iMin);
                        i12 += iMin;
                        long j10 = iMin;
                        prVar.f41994h += j10;
                        prVar.i += j10;
                    } catch (IOException e3) {
                        throw new or(e3);
                    }
                }
            }
            long j11 = this.f43190d;
            if (j11 != -1) {
                this.f43190d = j11 - ((long) i11);
            }
        }
        return i11;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws or {
        long jA = this.f43187a.a(u30Var);
        this.f43190d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (u30Var.f43539g == -1 && jA != -1) {
            u30Var = u30Var.a(0L, jA);
        }
        this.f43189c = true;
        pr prVar = (pr) this.f43188b;
        prVar.getClass();
        u30Var.f43540h.getClass();
        if (u30Var.f43539g == -1 && (u30Var.i & 2) == 2) {
            prVar.f41990d = null;
        } else {
            prVar.f41990d = u30Var;
            prVar.f41991e = (u30Var.i & 4) == 4 ? prVar.f41988b : Long.MAX_VALUE;
            prVar.i = 0L;
            try {
                prVar.a(u30Var);
            } catch (IOException e3) {
                throw new or(e3);
            }
        }
        return this.f43190d;
    }
}
