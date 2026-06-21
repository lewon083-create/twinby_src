package m4;

import ad.j0;
import i4.c0;
import yads.cl;
import yads.fm;
import yads.kb0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f28624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f28625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28626f;

    public /* synthetic */ b(Object obj, int i, long j10, long j11, int i10) {
        this.f28622b = i10;
        this.f28626f = obj;
        this.f28623c = i;
        this.f28624d = j10;
        this.f28625e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28622b) {
            case 0:
                t3.d dVar = ((c) this.f28626f).f28628b;
                q9.o oVar = dVar.f33420d;
                t3.a aVarV = dVar.v(((j0) oVar.f31947b).isEmpty() ? null : (c0) ad.q.j((j0) oVar.f31947b));
                dVar.z(aVarV, 1006, new n5.n(aVarV, this.f28623c, this.f28624d, this.f28625e));
                break;
            case 1:
                ((cl) this.f28626f).a(this.f28623c, this.f28624d, this.f28625e);
                break;
            default:
                ((kb0) ((fm) this.f28626f).f38480b).b(this.f28623c, this.f28624d, this.f28625e);
                break;
        }
    }
}
