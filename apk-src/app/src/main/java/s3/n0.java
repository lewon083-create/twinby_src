package s3;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f32613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f32614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f4.g f32615e;

    public /* synthetic */ n0(r0 r0Var, Pair pair, f4.g gVar, int i) {
        this.f32612b = i;
        this.f32613c = r0Var;
        this.f32614d = pair;
        this.f32615e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32612b) {
            case 0:
                t3.d dVar = (t3.d) this.f32613c.f32642b.f12166j;
                Pair pair = this.f32614d;
                int iIntValue = ((Integer) pair.first).intValue();
                i4.c0 c0Var = (i4.c0) pair.second;
                c0Var.getClass();
                dVar.g(iIntValue, c0Var, this.f32615e);
                break;
            default:
                t3.d dVar2 = (t3.d) this.f32613c.f32642b.f12166j;
                Pair pair2 = this.f32614d;
                dVar2.t(((Integer) pair2.first).intValue(), (i4.c0) pair2.second, this.f32615e);
                break;
        }
    }
}
