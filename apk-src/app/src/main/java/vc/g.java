package vc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.g f34838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.e f34839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f34840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, sb.g gVar, sb.g gVar2, uc.e eVar) {
        super(gVar);
        this.f34838c = gVar2;
        this.f34839d = eVar;
        this.f34840e = iVar;
    }

    @Override // vc.e
    public final void a() {
        synchronized (this.f34840e.f34849f) {
            try {
                i iVar = this.f34840e;
                sb.g gVar = this.f34838c;
                iVar.f34848e.add(gVar);
                gVar.f32858a.addOnCompleteListener(new r3.b(23, iVar, gVar));
                if (this.f34840e.f34853k.getAndIncrement() > 0) {
                    this.f34840e.f34845b.c("Already connected to the service.", new Object[0]);
                }
                i.b(this.f34840e, this.f34839d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
