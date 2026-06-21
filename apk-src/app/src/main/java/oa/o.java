package oa;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f29869a;

    public o(e eVar) {
        this.f29869a = eVar;
    }

    @Override // oa.b
    public final void a(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        e eVar = this.f29869a;
        eVar.f29849o.sendMessage(eVar.f29849o.obtainMessage(1, boolValueOf));
    }
}
