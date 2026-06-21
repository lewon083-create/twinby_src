package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1365d;

    public b1(z zVar, String str, Object[] objArr) {
        this.f1362a = zVar;
        this.f1363b = str;
        this.f1364c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1365d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f1365d = i | (cCharAt2 << i10);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i = this.f1365d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
