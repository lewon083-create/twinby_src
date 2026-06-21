package v;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f34628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34629b = 1;

    public m(OutputConfiguration outputConfiguration) {
        this.f34628a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f34628a, mVar.f34628a) && this.f34629b == mVar.f34629b;
    }

    public final int hashCode() {
        int iHashCode = this.f34628a.hashCode() ^ 31;
        return Long.hashCode(this.f34629b) ^ ((iHashCode << 5) - iHashCode);
    }
}
