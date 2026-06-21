package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oo2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f41672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro2 f41673d;

    public oo2(ro2 ro2Var, String str, long j10) {
        this.f41673d = ro2Var;
        this.f41671b = str;
        this.f41672c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41673d.f42658b.a(this.f41671b, this.f41672c);
        ro2 ro2Var = this.f41673d;
        nm3 nm3Var = ro2Var.f42658b;
        ro2Var.toString();
        nm3Var.a();
    }
}
