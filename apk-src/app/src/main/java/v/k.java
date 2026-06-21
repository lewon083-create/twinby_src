package v;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f34625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34627c = 1;

    public k(OutputConfiguration outputConfiguration) {
        this.f34625a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f34625a, kVar.f34625a) && this.f34627c == kVar.f34627c && Objects.equals(this.f34626b, kVar.f34626b);
    }

    public final int hashCode() {
        int iHashCode = this.f34625a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.f34626b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        return Long.hashCode(this.f34627c) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
