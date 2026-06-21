package e5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f16240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j[] f16241f;

    public d(String str, boolean z5, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f16237b = str;
        this.f16238c = z5;
        this.f16239d = z10;
        this.f16240e = strArr;
        this.f16241f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f16238c == dVar.f16238c && this.f16239d == dVar.f16239d && Objects.equals(this.f16237b, dVar.f16237b) && Arrays.equals(this.f16240e, dVar.f16240e) && Arrays.equals(this.f16241f, dVar.f16241f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f16238c ? 1 : 0)) * 31) + (this.f16239d ? 1 : 0)) * 31;
        String str = this.f16237b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
