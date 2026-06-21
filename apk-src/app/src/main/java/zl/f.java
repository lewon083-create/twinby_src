package zl;

import yads.cl;
import yads.fj3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f46565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f46566f;

    public /* synthetic */ f(Object obj, String str, long j10, long j11, int i) {
        this.f46562b = i;
        this.f46566f = obj;
        this.f46563c = str;
        this.f46564d = j10;
        this.f46565e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46562b) {
            case 0:
                ((cl) this.f46566f).b(this.f46563c, this.f46564d, this.f46565e);
                break;
            default:
                ((fj3) this.f46566f).b(this.f46563c, this.f46564d, this.f46565e);
                break;
        }
    }
}
