package j1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {
    public final /* synthetic */ k i;

    public j(k kVar) {
        this.i = kVar;
    }

    @Override // j1.g
    public final String i() {
        h hVar = (h) this.i.f26172b.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f26168a + "]";
    }
}
