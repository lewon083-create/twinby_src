package k5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26901e;

    public boolean a() {
        int i = this.f26897a;
        int i10 = 2;
        if ((i & 7) != 0) {
            int i11 = this.f26900d;
            int i12 = this.f26898b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i13 = this.f26900d;
            int i14 = this.f26899c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i15 = this.f26901e;
            int i16 = this.f26898b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i17 = this.f26901e;
            int i18 = this.f26899c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
