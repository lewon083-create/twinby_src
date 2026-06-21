package e5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16248e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f16245b = str;
        this.f16246c = str2;
        this.f16247d = str3;
        this.f16248e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16245b, fVar.f16245b) && Objects.equals(this.f16246c, fVar.f16246c) && Objects.equals(this.f16247d, fVar.f16247d) && Arrays.equals(this.f16248e, fVar.f16248e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16245b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16246c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16247d;
        return Arrays.hashCode(this.f16248e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": mimeType=" + this.f16245b + ", filename=" + this.f16246c + ", description=" + this.f16247d;
    }
}
