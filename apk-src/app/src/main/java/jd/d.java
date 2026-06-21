package jd;

import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.m1;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements vd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f26620a = new d();

    @Override // vd.b
    public final void a(vd.a aVar) {
        boolean z5 = aVar.f34857a.f16748a;
        synchronized (c.class) {
            c cVar = c.f26618b;
            c0.i(cVar);
            m1 m1Var = (m1) cVar.f26619a.f45c;
            m1Var.c(new i1(m1Var, z5));
        }
    }
}
