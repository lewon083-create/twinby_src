package androidx.recyclerview.widget;

import a0.b1;
import java.util.ArrayList;
import k6.q0;
import k6.r0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f1703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1708f;

    public static void b(p pVar) {
        int i = pVar.mFlags;
        if (!pVar.isInvalid() && (i & 4) == 0) {
            pVar.getOldPosition();
            pVar.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(p pVar, p pVar2, r0 r0Var, r0 r0Var2);

    public final void c(p pVar) {
        q0 q0Var = this.f1703a;
        if (q0Var != null) {
            RecyclerView recyclerView = (RecyclerView) ((b1) q0Var).f45c;
            pVar.setIsRecyclable(true);
            if (pVar.mShadowedHolder != null && pVar.mShadowingHolder == null) {
                pVar.mShadowedHolder = null;
            }
            pVar.mShadowingHolder = null;
            if (pVar.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(pVar.itemView) || !pVar.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(pVar.itemView, false);
        }
    }

    public abstract void d(p pVar);

    public abstract void e();

    public abstract boolean f();
}
