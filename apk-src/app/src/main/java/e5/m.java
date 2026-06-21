package e5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f16260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f16261f;

    public m(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f16257b = i;
        this.f16258c = i10;
        this.f16259d = i11;
        this.f16260e = iArr;
        this.f16261f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f16257b == mVar.f16257b && this.f16258c == mVar.f16258c && this.f16259d == mVar.f16259d && Arrays.equals(this.f16260e, mVar.f16260e) && Arrays.equals(this.f16261f, mVar.f16261f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16261f) + ((Arrays.hashCode(this.f16260e) + ((((((527 + this.f16257b) * 31) + this.f16258c) * 31) + this.f16259d) * 31)) * 31);
    }
}
