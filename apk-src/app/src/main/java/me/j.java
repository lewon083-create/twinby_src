package me;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f28877a;

    @Override // me.w
    public final Object a(re.b bVar) {
        w wVar = this.f28877a;
        if (wVar != null) {
            return wVar.a(bVar);
        }
        throw new IllegalStateException();
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) {
        w wVar = this.f28877a;
        if (wVar == null) {
            throw new IllegalStateException();
        }
        wVar.b(cVar, obj);
    }
}
