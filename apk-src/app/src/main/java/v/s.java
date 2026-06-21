package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34637a;

    public s(int i, ArrayList arrayList, j0.i iVar, z0 z0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f34637a = new q(i, arrayList, iVar, z0Var);
        } else {
            this.f34637a = new p(i, arrayList, iVar, z0Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((h) it.next()).f34619a.c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f34637a.equals(((s) obj).f34637a);
    }

    public final int hashCode() {
        return this.f34637a.hashCode();
    }
}
