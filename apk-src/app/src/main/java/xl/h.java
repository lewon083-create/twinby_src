package xl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36276b;

    public h(int i, int i10) {
        this.f36276b = i10;
        this.f36275a = i;
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        switch (this.f36276b) {
            case 0:
                if (kVar2.y() == this.f36275a) {
                }
                break;
            case 1:
                if (kVar2.y() > this.f36275a) {
                }
                break;
            default:
                if (kVar == kVar2 || kVar2.y() >= this.f36275a) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.f36276b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(this.f36275a));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(this.f36275a));
            default:
                return String.format(":lt(%d)", Integer.valueOf(this.f36275a));
        }
    }
}
