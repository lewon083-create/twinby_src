package x0;

import g0.w0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f35618d = new j(0, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f35619e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f35620f = new w0(new j(0, 1, null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.m f35623c;

    public j(int i, int i10, a0.m mVar) {
        this.f35621a = i;
        if (i10 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.f35622b = i10;
        this.f35623c = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        a0.m mVar = jVar.f35623c;
        if (this.f35621a != jVar.f35621a || !t.z.a(this.f35622b, jVar.f35622b)) {
            return false;
        }
        a0.m mVar2 = this.f35623c;
        return mVar2 == null ? mVar == null : mVar2.equals(mVar);
    }

    public final int hashCode() {
        int iM = (((this.f35621a ^ 1000003) * 1000003) ^ t.z.m(this.f35622b)) * 1000003;
        a0.m mVar = this.f35623c;
        return iM ^ (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamInfo{id=");
        sb2.append(this.f35621a);
        sb2.append(", streamState=");
        int i = this.f35622b;
        sb2.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb2.append(", inProgressTransformationInfo=");
        sb2.append(this.f35623c);
        sb2.append("}");
        return sb2.toString();
    }
}
