package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tu3 f41468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m52 f41469b;

    public /* synthetic */ o52(Context context, uu3 uu3Var) {
        this(uu3Var.a(context), new m52());
    }

    public final void a() {
        List listR;
        tu3 tu3Var = this.f41468a;
        if (tu3Var != null) {
            synchronized (tu3Var.f43443b) {
                listR = CollectionsKt.R(tu3Var.f43444c);
                tu3Var.f43444c.clear();
                Unit unit = Unit.f27471a;
            }
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                tu3Var.f43442a.a((od3) it.next());
            }
        }
    }

    public o52(tu3 tu3Var, m52 m52Var) {
        this.f41468a = tu3Var;
        this.f41469b = m52Var;
    }
}
