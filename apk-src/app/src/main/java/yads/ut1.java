package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ut1 {
    public static wt1 a(nu2 nu2Var) {
        if (wt1.f44467g == null) {
            synchronized (wt1.f44466f) {
                try {
                    if (wt1.f44467g == null) {
                        wt1.f44467g = new wt1(new pt1(new qt1()), new tt1(), new wu2(), nu2Var, vt1.f44119b);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        wt1 wt1Var = wt1.f44467g;
        if (wt1Var != null) {
            return wt1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
