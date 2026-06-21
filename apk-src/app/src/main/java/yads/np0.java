package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class np0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k73 f41337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f41338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41339c;

    public np0(int i, k73 k73Var, int[] iArr) {
        if (iArr.length == 0) {
            kh1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f41337a = k73Var;
        this.f41338b = iArr;
        this.f41339c = i;
    }
}
