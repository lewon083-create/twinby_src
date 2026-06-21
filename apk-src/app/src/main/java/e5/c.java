package e5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j[] f16236g;

    public c(String str, int i, int i10, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f16231b = str;
        this.f16232c = i;
        this.f16233d = i10;
        this.f16234e = j10;
        this.f16235f = j11;
        this.f16236g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f16232c == cVar.f16232c && this.f16233d == cVar.f16233d && this.f16234e == cVar.f16234e && this.f16235f == cVar.f16235f && Objects.equals(this.f16231b, cVar.f16231b) && Arrays.equals(this.f16236g, cVar.f16236g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f16232c) * 31) + this.f16233d) * 31) + ((int) this.f16234e)) * 31) + ((int) this.f16235f)) * 31;
        String str = this.f16231b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
