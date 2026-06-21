package j4;

import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import p3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f26512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h3.e f26513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f26515n;

    public l(p3.h hVar, p3.l lVar, j3.o oVar, int i, Object obj, e eVar) {
        super(hVar, lVar, 2, oVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f26512k = eVar;
    }

    @Override // m4.k
    public final void d() {
        this.f26515n = true;
    }

    @Override // m4.k
    public final void load() {
        if (this.f26514m == 0) {
            this.f26512k.b(this.f26513l, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p3.l lVarC = this.f26470c.c(this.f26514m);
            c0 c0Var = this.f26476j;
            q4.h hVar = new q4.h(c0Var, lVarC.f31177f, c0Var.open(lVarC));
            while (!this.f26515n) {
                try {
                    int iA = this.f26512k.f26460b.a(hVar, e.f26459l);
                    boolean z5 = false;
                    h5.r(iA != 1);
                    if (iA == 0) {
                        z5 = true;
                    }
                    if (!z5) {
                        break;
                    }
                } finally {
                    this.f26514m = hVar.f31739e - this.f26470c.f31177f;
                    this.f26512k.a();
                }
            }
        } finally {
            j4.g(this.f26476j);
        }
    }
}
