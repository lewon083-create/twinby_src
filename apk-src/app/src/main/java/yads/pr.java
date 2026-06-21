package yads;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pr implements n30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f41987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41988b = 5242880;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41989c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f41990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f41992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f41993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41994h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kq2 f41995j;

    public pr(nr nrVar) {
        this.f41987a = (nr) ni.a(nrVar);
    }

    public final void a() {
        OutputStream outputStream = this.f41993g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            lb3.a((Closeable) this.f41993g);
            this.f41993g = null;
            File file = this.f41992f;
            this.f41992f = null;
            nr nrVar = this.f41987a;
            long j10 = this.f41994h;
            yy2 yy2Var = (yy2) nrVar;
            synchronized (yy2Var) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    bz2 bz2VarA = bz2.a(file, j10, -9223372036854775807L, yy2Var.f45199c);
                    bz2VarA.getClass();
                    ls lsVar = yy2Var.f45199c;
                    hs hsVar = (hs) lsVar.f40648a.get(bz2VarA.f45517b);
                    hsVar.getClass();
                    if (!hsVar.c(bz2VarA.f45518c, bz2VarA.f45519d)) {
                        throw new IllegalStateException();
                    }
                    long jA = qz.a(hsVar.f39301e);
                    if (jA != -1 && bz2VarA.f45518c + bz2VarA.f45519d > jA) {
                        throw new IllegalStateException();
                    }
                    if (yy2Var.f45200d == null) {
                        yy2Var.a(bz2VarA);
                        yy2Var.f45199c.a();
                        yy2Var.notifyAll();
                        return;
                    }
                    try {
                        yy2Var.f45200d.a(file.getName(), bz2VarA.f45519d, bz2VarA.f45522g);
                        yy2Var.a(bz2VarA);
                        try {
                            yy2Var.f45199c.a();
                            yy2Var.notifyAll();
                            return;
                        } finally {
                            kr krVar = new kr(e);
                        }
                    } catch (IOException e3) {
                        throw new kr(e3);
                    }
                }
            }
        } catch (Throwable th2) {
            lb3.a((Closeable) this.f41993g);
            this.f41993g = null;
            File file2 = this.f41992f;
            this.f41992f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void a(u30 u30Var) {
        File file;
        long j10 = u30Var.f43539g;
        long jMin = j10 == -1 ? -1L : Math.min(j10 - this.i, this.f41991e);
        nr nrVar = this.f41987a;
        String str = u30Var.f43540h;
        int i = lb3.f40466a;
        long j11 = u30Var.f43538f + this.i;
        yy2 yy2Var = (yy2) nrVar;
        synchronized (yy2Var) {
            try {
                yy2Var.a();
                hs hsVar = (hs) yy2Var.f45199c.f40648a.get(str);
                hsVar.getClass();
                if (hsVar.c(j11, jMin)) {
                    if (!yy2Var.f45197a.exists()) {
                        yy2.a(yy2Var.f45197a);
                        yy2Var.c();
                    }
                    df1 df1Var = (df1) yy2Var.f45198b;
                    if (jMin != -1) {
                        df1Var.a(yy2Var, jMin);
                    } else {
                        df1Var.getClass();
                    }
                    File file2 = new File(yy2Var.f45197a, Integer.toString(yy2Var.f45202f.nextInt(10)));
                    if (!file2.exists()) {
                        yy2.a(file2);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i10 = hsVar.f39297a;
                    Pattern pattern = bz2.f37227h;
                    file = new File(file2, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f41992f = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f41992f);
        if (this.f41989c > 0) {
            kq2 kq2Var = this.f41995j;
            if (kq2Var == null) {
                this.f41995j = new kq2(fileOutputStream, this.f41989c);
            } else {
                kq2Var.a(fileOutputStream);
            }
            this.f41993g = this.f41995j;
        } else {
            this.f41993g = fileOutputStream;
        }
        this.f41994h = 0L;
    }
}
