package k9;

import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h i = new h(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f27260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f27261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f27262l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27270h;

    static {
        new h(468, 60, "468x60_as");
        new h(320, 100, "320x100_as");
        new h(728, 90, "728x90_as");
        new h(VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED, 250, "300x250_as");
        new h(160, VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION, "160x600_as");
        f27260j = new h(-1, -2, "smart_banner");
        f27261k = new h(-3, -4, "fluid");
        f27262l = new h(0, 0, "invalid");
        new h(50, 50, "50x50_mb");
        new h(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i10, int i11) {
        String strValueOf = i10 == -1 ? "FULL" : String.valueOf(i10);
        String strValueOf2 = i11 == -2 ? "AUTO" : String.valueOf(i11);
        this(i10, i11, om1.n(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f27263a == hVar.f27263a && this.f27264b == hVar.f27264b && this.f27265c.equals(hVar.f27265c);
    }

    public final int hashCode() {
        return this.f27265c.hashCode();
    }

    public final String toString() {
        return this.f27265c;
    }

    public h(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(l7.o.j(i10, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i10).length() + 26)));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(l7.o.j(i11, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i11).length() + 27)));
        }
        this.f27263a = i10;
        this.f27264b = i11;
        this.f27265c = str;
    }
}
