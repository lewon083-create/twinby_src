package u6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.e f34294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f34295b;

    public t(u uVar, h1.e eVar) {
        this.f34295b = uVar;
        this.f34294a = eVar;
    }

    @Override // u6.q
    public final void a(r rVar) {
        ((ArrayList) this.f34294a.get(this.f34295b.f34297c)).remove(rVar);
        rVar.removeListener(this);
    }
}
