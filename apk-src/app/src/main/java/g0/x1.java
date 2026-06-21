package g0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f19795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f19796c;

    public x1(boolean z5, HashSet hashSet, HashSet hashSet2) {
        this.f19794a = z5;
        this.f19795b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.f19796c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z5) {
        if (this.f19795b.contains(cls)) {
            return true;
        }
        return !this.f19796c.contains(cls) && this.f19794a && z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        x1 x1Var = (x1) obj;
        return this.f19794a == x1Var.f19794a && Objects.equals(this.f19795b, x1Var.f19795b) && Objects.equals(this.f19796c, x1Var.f19796c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f19794a), this.f19795b, this.f19796c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f19794a + ", forceEnabledQuirks=" + this.f19795b + ", forceDisabledQuirks=" + this.f19796c + '}';
    }
}
