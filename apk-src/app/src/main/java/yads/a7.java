package yads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f36642a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile tp0 f36643b;

    public static final void a(tp0 tp0Var) {
        f36643b = tp0Var;
        for (oe2 oe2Var : f36642a) {
            if (f36643b != null) {
                tp0 tp0Var2 = f36643b;
                if (tp0Var2 != null) {
                    ((ao0) tp0Var2.f43399a).a(oe2Var);
                }
            } else {
                f36642a.add(oe2Var);
            }
        }
    }
}
