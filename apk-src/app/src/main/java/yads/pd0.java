package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pd0 implements o30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41896b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u11 f41895a = new u11();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41897c = 8000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41898d = 8000;

    @Override // yads.o30
    public final p30 createDataSource() {
        return new td0(this.f41896b, this.f41897c, this.f41898d, false, this.f41895a);
    }
}
