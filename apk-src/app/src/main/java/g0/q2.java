package g0;

import com.google.android.gms.internal.ads.om1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19725c;

    public q2(HashMap useCaseStreamSpecs, HashMap attachedSurfaceStreamSpecs, int i) {
        Intrinsics.checkNotNullParameter(useCaseStreamSpecs, "useCaseStreamSpecs");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.f19723a = useCaseStreamSpecs;
        this.f19724b = attachedSurfaceStreamSpecs;
        this.f19725c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f19723a.equals(q2Var.f19723a) && this.f19724b.equals(q2Var.f19724b) && this.f19725c == q2Var.f19725c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19725c) + ((this.f19724b.hashCode() + (this.f19723a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb2.append(this.f19723a);
        sb2.append(", attachedSurfaceStreamSpecs=");
        sb2.append(this.f19724b);
        sb2.append(", maxSupportedFrameRate=");
        return om1.l(sb2, this.f19725c, ')');
    }
}
