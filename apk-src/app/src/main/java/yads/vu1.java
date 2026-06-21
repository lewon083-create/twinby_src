package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vu1 {
    public static final void a(boolean z5) {
        cd1.f37338a = z5;
        nc1.f41226c = z5;
        if (z5) {
            return;
        }
        cv1.a().a();
        ku1.a().a();
    }

    public static final void b(boolean z5) {
        gw2 gw2VarA = fw2.a();
        synchronized (gw2.f38918j) {
            gw2VarA.f38922c = Boolean.valueOf(z5);
            Unit unit = Unit.f27471a;
        }
    }
}
