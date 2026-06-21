package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19594d;

    public i(int i, int i10, List list, List list2) {
        this.f19591a = i;
        this.f19592b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f19593c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f19594d = list2;
    }

    public static i e(int i, int i10, List list, List list2) {
        return new i(i, i10, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // g0.c1
    public final int a() {
        return this.f19591a;
    }

    @Override // g0.c1
    public final int b() {
        return this.f19592b;
    }

    @Override // g0.c1
    public final List c() {
        return this.f19593c;
    }

    @Override // g0.c1
    public final List d() {
        return this.f19594d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f19591a == iVar.f19591a && this.f19592b == iVar.f19592b && this.f19593c.equals(iVar.f19593c) && this.f19594d.equals(iVar.f19594d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f19591a ^ 1000003) * 1000003) ^ this.f19592b) * 1000003) ^ this.f19593c.hashCode()) * 1000003) ^ this.f19594d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb2.append(this.f19591a);
        sb2.append(", recommendedFileFormat=");
        sb2.append(this.f19592b);
        sb2.append(", audioProfiles=");
        sb2.append(this.f19593c);
        sb2.append(", videoProfiles=");
        return t.z.h(sb2, this.f19594d, "}");
    }
}
