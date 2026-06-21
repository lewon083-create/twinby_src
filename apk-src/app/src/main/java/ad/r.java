package ad;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f860h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, int i) {
        super(vVar);
        this.f859g = i;
        this.f860h = vVar;
    }

    @Override // ad.t
    public final Object a(int i) {
        switch (this.f859g) {
            case 0:
                return this.f860h.j()[i];
            case 1:
                return new u(this.f860h, i);
            default:
                return this.f860h.k()[i];
        }
    }
}
