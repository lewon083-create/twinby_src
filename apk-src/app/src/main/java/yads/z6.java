package yads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f45265a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sp0 f45266b;

    public static final void a(sp0 sp0Var) {
        f45266b = sp0Var;
        for (j3.h0 h0Var : f45265a) {
            if (f45266b != null) {
                sp0 sp0Var2 = f45266b;
                if (sp0Var2 != null) {
                    com.google.android.gms.internal.ads.yf0 yf0Var = ((s3.y) sp0Var2.f43022a).f32708n;
                    h0Var.getClass();
                    yf0Var.a(h0Var);
                }
            } else {
                f45265a.add(h0Var);
            }
        }
    }
}
