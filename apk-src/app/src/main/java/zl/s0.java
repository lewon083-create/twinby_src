package zl;

import yads.pk0;
import yads.qk0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pk0 f46636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk0 f46637d;

    public /* synthetic */ s0(pk0 pk0Var, qk0 qk0Var, int i) {
        this.f46635b = i;
        this.f46636c = pk0Var;
        this.f46637d = qk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46635b) {
            case 0:
                this.f46636c.d(this.f46637d);
                break;
            case 1:
                this.f46636c.c(this.f46637d);
                break;
            case 2:
                this.f46636c.a(this.f46637d);
                break;
            default:
                this.f46636c.b(this.f46637d);
                break;
        }
    }
}
