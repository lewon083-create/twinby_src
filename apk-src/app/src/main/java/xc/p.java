package xc;

import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.g f36083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc.d f36084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f36085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar, sb.g gVar, sb.g gVar2, sc.d dVar) {
        super(gVar);
        this.f36085e = cVar;
        this.f36083c = gVar2;
        this.f36084d = dVar;
    }

    @Override // xc.o
    public final void b() {
        synchronized (this.f36085e.f36065f) {
            try {
                c cVar = this.f36085e;
                sb.g gVar = this.f36083c;
                cVar.f36064e.add(gVar);
                gVar.f32858a.addOnCompleteListener(new v(4, cVar, gVar, false));
                if (this.f36085e.f36070l.getAndIncrement() > 0) {
                    this.f36085e.f36061b.a("Already connected to the service.", new Object[0]);
                }
                c.b(this.f36085e, this.f36084d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
