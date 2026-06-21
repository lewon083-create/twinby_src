package xl;

import java.util.regex.Pattern;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f36274b;

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        String str = this.f36273a;
        return kVar2.k(str) && this.f36274b.matcher(kVar2.b(str)).find();
    }

    public final String toString() {
        return z.f("[", this.f36273a, "~=", this.f36274b.toString(), "]");
    }
}
