package s3;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f32620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f32621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i4.u f32622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f4.g f32623f;

    public /* synthetic */ o0(r0 r0Var, Pair pair, i4.u uVar, f4.g gVar, int i) {
        this.f32619b = i;
        this.f32620c = r0Var;
        this.f32621d = pair;
        this.f32622e = uVar;
        this.f32623f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32619b) {
            case 0:
                t3.d dVar = (t3.d) this.f32620c.f32642b.f12166j;
                Pair pair = this.f32621d;
                dVar.s(((Integer) pair.first).intValue(), (i4.c0) pair.second, this.f32622e, this.f32623f);
                break;
            default:
                t3.d dVar2 = (t3.d) this.f32620c.f32642b.f12166j;
                Pair pair2 = this.f32621d;
                dVar2.c(((Integer) pair2.first).intValue(), (i4.c0) pair2.second, this.f32622e, this.f32623f);
                break;
        }
    }
}
