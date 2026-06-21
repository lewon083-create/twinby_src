package m5;

import com.google.android.gms.internal.ads.e2;
import q4.k;
import q4.l;
import q4.m;
import q4.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28692b;

    public a(int i, byte b2) {
        this.f28691a = i;
        switch (i) {
            case 1:
                this.f28692b = new v(16973, 2, "image/bmp");
                break;
            default:
                this.f28692b = new v(35152, 2, "image/png");
                break;
        }
    }

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) {
        switch (this.f28691a) {
            case 0:
                return ((v) this.f28692b).a(lVar, e2Var);
            case 1:
                return ((v) this.f28692b).a(lVar, e2Var);
            default:
                return this.f28692b.a(lVar, e2Var);
        }
    }

    @Override // q4.k
    public final void b(m mVar) {
        switch (this.f28691a) {
            case 0:
                ((v) this.f28692b).b(mVar);
                break;
            case 1:
                ((v) this.f28692b).b(mVar);
                break;
            default:
                this.f28692b.b(mVar);
                break;
        }
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        switch (this.f28691a) {
            case 0:
                return ((v) this.f28692b).d(lVar);
            case 1:
                return ((v) this.f28692b).d(lVar);
            default:
                return this.f28692b.d(lVar);
        }
    }

    @Override // q4.k
    public final void release() {
        switch (this.f28691a) {
            case 0:
            case 1:
                break;
            default:
                this.f28692b.release();
                break;
        }
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        switch (this.f28691a) {
            case 0:
                ((v) this.f28692b).seek(j10, j11);
                break;
            case 1:
                ((v) this.f28692b).seek(j10, j11);
                break;
            default:
                this.f28692b.seek(j10, j11);
                break;
        }
    }

    public a(int i) {
        this.f28691a = 2;
        if ((i & 1) != 0) {
            this.f28692b = new v(65496, 2, "image/jpeg");
        } else {
            this.f28692b = new y4.a();
        }
    }

    private final void e() {
    }

    private final void f() {
    }
}
