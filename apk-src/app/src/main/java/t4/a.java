package t4;

import com.google.android.gms.internal.ads.e2;
import m3.p;
import q4.h;
import q4.k;
import q4.l;
import q4.m;
import q4.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f33469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f33470c;

    public a(int i) {
        this.f33468a = i;
        switch (i) {
            case 1:
                this.f33469b = new p(4);
                this.f33470c = new v(-1, -1, "image/webp");
                break;
            default:
                this.f33469b = new p(4);
                this.f33470c = new v(-1, -1, "image/avif");
                break;
        }
    }

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) {
        switch (this.f33468a) {
        }
        return this.f33470c.a(lVar, e2Var);
    }

    @Override // q4.k
    public final void b(m mVar) {
        switch (this.f33468a) {
            case 0:
                this.f33470c.b(mVar);
                break;
            default:
                this.f33470c.b(mVar);
                break;
        }
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        switch (this.f33468a) {
            case 0:
                h hVar = (h) lVar;
                hVar.a(4, false);
                p pVar = this.f33469b;
                pVar.J(4);
                hVar.y(pVar.f28589a, 0, 4, false);
                if (pVar.B() == 1718909296) {
                    pVar.J(4);
                    hVar.y(pVar.f28589a, 0, 4, false);
                    if (pVar.B() == 1635150182) {
                    }
                }
                break;
            default:
                p pVar2 = this.f33469b;
                pVar2.J(4);
                h hVar2 = (h) lVar;
                hVar2.y(pVar2.f28589a, 0, 4, false);
                if (pVar2.B() == 1380533830) {
                    hVar2.a(4, false);
                    pVar2.J(4);
                    hVar2.y(pVar2.f28589a, 0, 4, false);
                    if (pVar2.B() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // q4.k
    public final void release() {
        int i = this.f33468a;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        switch (this.f33468a) {
            case 0:
                this.f33470c.seek(j10, j11);
                break;
            default:
                this.f33470c.seek(j10, j11);
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }
}
