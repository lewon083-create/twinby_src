package q3;

import com.google.android.gms.internal.measurement.h5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3.l f31628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f31630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f31631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f31632h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f31633j;

    public d(b bVar) {
        bVar.getClass();
        this.f31625a = bVar;
        this.f31626b = 5242880L;
        this.f31627c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.f31631g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            z.h(this.f31631g);
            this.f31631g = null;
            File file = this.f31630f;
            this.f31630f = null;
            b bVar = this.f31625a;
            long j10 = this.f31632h;
            s sVar = (s) bVar;
            synchronized (sVar) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    t tVarB = t.b(file, j10, -9223372036854775807L, sVar.f31685c);
                    tVarB.getClass();
                    k kVarF = sVar.f31685c.f(tVarB.f31657b);
                    kVarF.getClass();
                    h5.r(kVarF.a(tVarB.f31658c, tVarB.f31659d));
                    long jA = n.a(kVarF.f31669e);
                    if (jA != -1) {
                        h5.r(tVarB.f31658c + tVarB.f31659d <= jA);
                    }
                    if (sVar.f31686d == null) {
                        sVar.b(tVarB);
                        sVar.f31685c.q();
                        sVar.notifyAll();
                        return;
                    }
                    try {
                        sVar.f31686d.e(tVarB.f31659d, tVarB.f31662g, file.getName());
                        sVar.b(tVarB);
                        try {
                            sVar.f31685c.q();
                            sVar.notifyAll();
                            return;
                        } catch (IOException e3) {
                            throw new a(e3);
                        }
                    } catch (IOException e7) {
                        throw new a(e7);
                    }
                }
            }
        } catch (Throwable th2) {
            z.h(this.f31631g);
            this.f31631g = null;
            File file2 = this.f31630f;
            this.f31630f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b(p3.l lVar) {
        File fileC;
        long j10 = lVar.f31178g;
        long jMin = j10 == -1 ? -1L : Math.min(j10 - this.i, this.f31629e);
        b bVar = this.f31625a;
        String str = lVar.f31179h;
        String str2 = z.f28608a;
        long j11 = lVar.f31177f + this.i;
        s sVar = (s) bVar;
        synchronized (sVar) {
            try {
                sVar.d();
                k kVarF = sVar.f31685c.f(str);
                kVarF.getClass();
                h5.r(kVarF.a(j11, jMin));
                if (!sVar.f31683a.exists()) {
                    s.e(sVar.f31683a);
                    sVar.l();
                }
                q qVar = sVar.f31684b;
                if (jMin != -1) {
                    qVar.a(sVar, jMin);
                } else {
                    qVar.getClass();
                }
                File file = new File(sVar.f31683a, Integer.toString(sVar.f31688f.nextInt(10)));
                if (!file.exists()) {
                    s.e(file);
                }
                fileC = t.c(file, kVarF.f31665a, j11, System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31630f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f31630f);
        if (this.f31627c > 0) {
            r rVar = this.f31633j;
            if (rVar == null) {
                this.f31633j = new r(fileOutputStream, this.f31627c);
            } else {
                rVar.a(fileOutputStream);
            }
            this.f31631g = this.f31633j;
        } else {
            this.f31631g = fileOutputStream;
        }
        this.f31632h = 0L;
    }
}
