package yads;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43604a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f43605b = new WeakHashMap();

    public final boolean a() {
        boolean z5;
        synchronized (this.f43604a) {
            z5 = !this.f43605b.isEmpty();
        }
        return z5;
    }

    public final void b() {
        ArrayList<od3> arrayList;
        synchronized (this.f43604a) {
            arrayList = new ArrayList(this.f43605b.keySet());
            this.f43605b.clear();
            Unit unit = Unit.f27471a;
        }
        for (od3 od3Var : arrayList) {
            if (od3Var != null) {
                od3Var.a();
            }
        }
    }

    public final void a(od3 od3Var) {
        synchronized (this.f43604a) {
            this.f43605b.put(od3Var, null);
            Unit unit = Unit.f27471a;
        }
    }

    public final void b(od3 od3Var) {
        synchronized (this.f43604a) {
            this.f43605b.remove(od3Var);
        }
    }
}
