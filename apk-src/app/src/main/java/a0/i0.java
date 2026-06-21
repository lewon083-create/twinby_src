package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f111c = new i0(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f112d = new i0(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f113e = new i0(3, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i0 f114f = new i0(4, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f115g = new i0(5, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i0 f116h = new i0(6, 10);
    public static final i0 i = new i0(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118b;

    public i0(int i10, int i11) {
        this.f117a = i10;
        this.f118b = i11;
    }

    public final boolean a() {
        return b() && this.f117a != 1 && this.f118b == 10;
    }

    public final boolean b() {
        int i10 = this.f117a;
        return (i10 == 0 || i10 == 2 || this.f118b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f117a == i0Var.f117a && this.f118b == i0Var.f118b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f117a ^ 1000003) * 1000003) ^ this.f118b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f117a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return t.z.d(this.f118b, "}", sb2);
    }
}
