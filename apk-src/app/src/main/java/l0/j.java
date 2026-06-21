package l0;

import com.google.android.gms.internal.ads.om1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27746b;

    public j(Map streamSpecs, int i) {
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        this.f27745a = streamSpecs;
        this.f27746b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f27745a.equals(jVar.f27745a) && this.f27746b == jVar.f27746b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27746b) + (this.f27745a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb2.append(this.f27745a);
        sb2.append(", maxSupportedFrameRate=");
        return om1.l(sb2, this.f27746b, ')');
    }
}
