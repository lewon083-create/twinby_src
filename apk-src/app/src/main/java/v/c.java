package v;

import a0.i0;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f34614a;

    public c(Object obj) {
        this.f34614a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long jLongValue = l10.longValue();
            i0 i0Var = (i0) a.f34612a.get(l10);
            if (i0Var == null) {
                com.google.android.gms.internal.auth.g.O("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (i0Var != null) {
                hashSet.add(i0Var);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // v.b
    public final Set a() {
        return d(this.f34614a.getSupportedProfiles());
    }

    @Override // v.b
    public final DynamicRangeProfiles b() {
        return this.f34614a;
    }

    @Override // v.b
    public final Set c(i0 i0Var) {
        Long lA = a.a(i0Var, this.f34614a);
        f2.g.a("DynamicRange is not supported: " + i0Var, lA != null);
        return d(this.f34614a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}
