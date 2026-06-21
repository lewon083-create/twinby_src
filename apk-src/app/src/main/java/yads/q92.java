package yads;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f42234f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb2 f42235g = new lb2(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean a(ld0 ld0Var, boolean z5) throws qb2, EOFException {
        this.f42229a = 0;
        this.f42230b = 0L;
        this.f42231c = 0;
        this.f42232d = 0;
        this.f42233e = 0;
        this.f42235g.c(27);
        try {
            if (ld0Var.b(this.f42235g.f40463a, 0, 27, z5) && this.f42235g.n() == 1332176723) {
                if (this.f42235g.m() != 0) {
                    if (z5) {
                        return false;
                    }
                    throw qb2.b("unsupported bit stream revision");
                }
                this.f42229a = this.f42235g.m();
                this.f42230b = this.f42235g.e();
                this.f42235g.g();
                this.f42235g.g();
                this.f42235g.g();
                int iM = this.f42235g.m();
                this.f42231c = iM;
                this.f42232d = iM + 27;
                this.f42235g.c(iM);
                try {
                    if (ld0Var.b(this.f42235g.f40463a, 0, this.f42231c, z5)) {
                        for (int i = 0; i < this.f42231c; i++) {
                            this.f42234f[i] = this.f42235g.m();
                            this.f42233e += this.f42234f[i];
                        }
                        return true;
                    }
                } catch (EOFException e3) {
                    if (!z5) {
                        throw e3;
                    }
                }
                return false;
            }
        } catch (EOFException e7) {
            if (!z5) {
                throw e7;
            }
        }
        return false;
    }

    public final boolean a(ld0 ld0Var, long j10) {
        long j11 = ld0Var.f40505d;
        if (j11 == ((long) ld0Var.f40507f) + j11) {
            this.f42235g.c(4);
            while (true) {
                if (j10 != -1 && ld0Var.f40505d + 4 >= j10) {
                    break;
                }
                try {
                    if (!ld0Var.b(this.f42235g.f40463a, 0, 4, true)) {
                        break;
                    }
                    this.f42235g.e(0);
                    if (this.f42235g.n() == 1332176723) {
                        ld0Var.f40507f = 0;
                        return true;
                    }
                    ld0Var.a(1);
                } catch (EOFException unused) {
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        do {
            if (j10 != -1 && ld0Var.f40505d >= j10) {
                break;
            }
        } while (ld0Var.c(1) != -1);
        return false;
    }
}
