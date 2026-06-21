package v;

import a0.i0;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f34615a = new t0(16, new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f34616b = Collections.singleton(i0.f112d);

    @Override // v.b
    public final Set a() {
        return f34616b;
    }

    @Override // v.b
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // v.b
    public final Set c(i0 i0Var) {
        f2.g.a("DynamicRange is not supported: " + i0Var, i0.f112d.equals(i0Var));
        return f34616b;
    }
}
