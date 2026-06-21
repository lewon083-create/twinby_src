package q3;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p3.d0;
import p3.e0;
import p3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p3.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.h f31635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f31636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.h f31637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31638f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31639g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31640h = false;
    public Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p3.l f31641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p3.l f31642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p3.h f31643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f31644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f31645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f31646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f31647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f31650s;

    public e(b bVar, p3.h hVar, p3.h hVar2, d dVar) {
        this.f31634b = bVar;
        this.f31635c = hVar2;
        if (hVar != null) {
            this.f31637e = hVar;
            this.f31636d = dVar != null ? new d0(hVar, dVar) : null;
        } else {
            this.f31637e = z.f31211b;
            this.f31636d = null;
        }
    }

    public final void a() {
        b bVar = this.f31634b;
        p3.h hVar = this.f31643l;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
        } finally {
            this.f31642k = null;
            this.f31643l = null;
            t tVar = this.f31647p;
            if (tVar != null) {
                ((s) bVar).j(tVar);
                this.f31647p = null;
            }
        }
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        this.f31635c.addTransferListener(e0Var);
        this.f31637e.addTransferListener(e0Var);
    }

    public final void b(p3.l lVar, boolean z5) throws InterruptedIOException {
        t tVarM;
        p3.l lVarA;
        p3.h hVar;
        String str = lVar.f31179h;
        String str2 = m3.z.f28608a;
        if (this.f31649r) {
            tVarM = null;
        } else if (this.f31638f) {
            try {
                b bVar = this.f31634b;
                long j10 = this.f31645n;
                long j11 = this.f31646o;
                s sVar = (s) bVar;
                synchronized (sVar) {
                    sVar.d();
                    while (true) {
                        tVarM = sVar.m(j10, j11, str);
                        if (tVarM != null) {
                            break;
                        } else {
                            sVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            tVarM = ((s) this.f31634b).m(this.f31645n, this.f31646o, str);
        }
        if (tVarM == null) {
            hVar = this.f31637e;
            p3.k kVarA = lVar.a();
            kVarA.f31169f = this.f31645n;
            kVarA.f31170g = this.f31646o;
            lVarA = kVarA.a();
        } else if (tVarM.f31660e) {
            Uri uriFromFile = Uri.fromFile(tVarM.f31661f);
            long j12 = tVarM.f31658c;
            long j13 = this.f31645n - j12;
            long jMin = tVarM.f31659d - j13;
            long j14 = this.f31646o;
            if (j14 != -1) {
                jMin = Math.min(jMin, j14);
            }
            p3.k kVarA2 = lVar.a();
            kVarA2.f31164a = uriFromFile;
            kVarA2.f31165b = j12;
            kVarA2.f31169f = j13;
            kVarA2.f31170g = jMin;
            lVarA = kVarA2.a();
            hVar = this.f31635c;
        } else {
            long jMin2 = tVarM.f31659d;
            if (jMin2 == -1) {
                jMin2 = this.f31646o;
            } else {
                long j15 = this.f31646o;
                if (j15 != -1) {
                    jMin2 = Math.min(jMin2, j15);
                }
            }
            p3.k kVarA3 = lVar.a();
            kVarA3.f31169f = this.f31645n;
            kVarA3.f31170g = jMin2;
            lVarA = kVarA3.a();
            hVar = this.f31636d;
            if (hVar == null) {
                hVar = this.f31637e;
                ((s) this.f31634b).j(tVarM);
                tVarM = null;
            }
        }
        this.f31650s = (this.f31649r || hVar != this.f31637e) ? Long.MAX_VALUE : this.f31645n + 102400;
        if (z5) {
            h5.r(this.f31643l == this.f31637e);
            if (hVar == this.f31637e) {
                return;
            }
            try {
                a();
            } catch (Throwable th2) {
                if (!tVarM.f31660e) {
                    ((s) this.f31634b).j(tVarM);
                }
                throw th2;
            }
        }
        if (tVarM != null && !tVarM.f31660e) {
            this.f31647p = tVarM;
        }
        this.f31643l = hVar;
        this.f31642k = lVarA;
        this.f31644m = 0L;
        long jOpen = hVar.open(lVarA);
        g gVar = new g();
        if (lVarA.f31178g == -1 && jOpen != -1) {
            this.f31646o = jOpen;
            gVar.a(Long.valueOf(this.f31645n + jOpen), "exo_len");
        }
        if (!(this.f31643l == this.f31635c)) {
            Uri uri = hVar.getUri();
            this.i = uri;
            Uri uri2 = lVar.f31172a.equals(uri) ? null : this.i;
            if (uri2 == null) {
                ((ArrayList) gVar.f31655b).add("exo_redir");
                ((HashMap) gVar.f31654a).remove("exo_redir");
            } else {
                gVar.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.f31643l == this.f31636d) {
            ((s) this.f31634b).c(str, gVar);
        }
    }

    @Override // p3.h
    public final void close() {
        this.f31641j = null;
        this.i = null;
        this.f31645n = 0L;
        try {
            a();
        } catch (Throwable th2) {
            if (this.f31643l == this.f31635c || (th2 instanceof a)) {
                this.f31648q = true;
            }
            throw th2;
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        return !(this.f31643l == this.f31635c) ? this.f31637e.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.i;
    }

    @Override // p3.h
    public final long open(p3.l lVar) {
        long j10;
        b bVar = this.f31634b;
        try {
            String string = lVar.f31179h;
            long j11 = lVar.f31177f;
            long j12 = lVar.f31178g;
            if (string == null) {
                string = lVar.f31172a.toString();
            }
            p3.k kVarA = lVar.a();
            kVarA.f31171h = string;
            p3.l lVarA = kVarA.a();
            this.f31641j = lVarA;
            Uri uri = lVarA.f31172a;
            byte[] bArr = (byte[]) ((s) bVar).g(string).f31677b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.f31645n = j11;
            boolean z5 = (this.f31639g && this.f31648q) || (this.f31640h && j12 == -1);
            this.f31649r = z5;
            if (z5) {
                this.f31646o = -1L;
                j10 = -1;
            } else {
                j10 = -1;
                long jA = n.a(((s) bVar).g(string));
                this.f31646o = jA;
                if (jA != -1) {
                    long j13 = jA - j11;
                    this.f31646o = j13;
                    if (j13 < 0) {
                        throw new p3.i(2008);
                    }
                }
            }
            if (j12 != j10) {
                long j14 = this.f31646o;
                this.f31646o = j14 == j10 ? j12 : Math.min(j14, j12);
            }
            long j15 = this.f31646o;
            if (j15 > 0 || j15 == j10) {
                b(lVarA, false);
            }
            return j12 != j10 ? j12 : this.f31646o;
        } catch (Throwable th2) {
            if (this.f31643l == this.f31635c || (th2 instanceof a)) {
                this.f31648q = true;
            }
            throw th2;
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        int i11;
        long j10;
        p3.h hVar = this.f31635c;
        if (i10 == 0) {
            return 0;
        }
        if (this.f31646o == 0) {
            return -1;
        }
        p3.l lVar = this.f31641j;
        lVar.getClass();
        p3.l lVar2 = this.f31642k;
        lVar2.getClass();
        try {
            if (this.f31645n >= this.f31650s) {
                b(lVar, true);
            }
            p3.h hVar2 = this.f31643l;
            hVar2.getClass();
            int i12 = hVar2.read(bArr, i, i10);
            if (i12 != -1) {
                long j11 = i12;
                this.f31645n += j11;
                this.f31644m += j11;
                long j12 = this.f31646o;
                if (j12 == -1) {
                    return i12;
                }
                this.f31646o = j12 - j11;
                return i12;
            }
            p3.h hVar3 = this.f31643l;
            if (!(hVar3 == hVar)) {
                j10 = -1;
                long j13 = lVar2.f31178g;
                if (j13 != -1) {
                    i11 = i12;
                    if (this.f31644m < j13) {
                    }
                } else {
                    i11 = i12;
                }
                String str = lVar.f31179h;
                String str2 = m3.z.f28608a;
                this.f31646o = 0L;
                if (!(hVar3 == this.f31636d)) {
                    return i11;
                }
                g gVar = new g();
                gVar.a(Long.valueOf(this.f31645n), "exo_len");
                ((s) this.f31634b).c(str, gVar);
                return i11;
            }
            i11 = i12;
            j10 = -1;
            long j14 = this.f31646o;
            if (j14 <= 0 && j14 != j10) {
                return i11;
            }
            a();
            b(lVar, false);
            return read(bArr, i, i10);
        } catch (Throwable th2) {
            if (this.f31643l == hVar || (th2 instanceof a)) {
                this.f31648q = true;
            }
            throw th2;
        }
    }
}
