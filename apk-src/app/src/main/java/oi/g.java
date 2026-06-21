package oi;

import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.g f30681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f30682d;

    public /* synthetic */ g(j jVar, sb.g gVar) {
        this.f30680b = 2;
        this.f30682d = jVar;
        this.f30681c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVarQ;
        m mVarQ2;
        switch (this.f30680b) {
            case 0:
                sb.g gVar = this.f30681c;
                try {
                    FirebaseAnalytics firebaseAnalytics = this.f30682d.f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    try {
                        mVarQ = b4.d(new id.d(firebaseAnalytics, 1), firebaseAnalytics.b());
                        break;
                    } catch (RuntimeException e3) {
                        m1 m1Var = firebaseAnalytics.f14753a;
                        m1Var.getClass();
                        m1Var.c(new d1(m1Var, "Failed to schedule task for getSessionId", (Object) null));
                        mVarQ = b4.q(e3);
                    }
                    gVar.b(b4.b(mVarQ));
                    return;
                } catch (Exception e7) {
                    gVar.a(e7);
                    return;
                }
            case 1:
                sb.g gVar2 = this.f30681c;
                try {
                    FirebaseAnalytics firebaseAnalytics2 = this.f30682d.f30690b;
                    if (firebaseAnalytics2 == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    try {
                        mVarQ2 = b4.d(new id.d(firebaseAnalytics2, 0), firebaseAnalytics2.b());
                        break;
                    } catch (RuntimeException e10) {
                        m1 m1Var2 = firebaseAnalytics2.f14753a;
                        m1Var2.getClass();
                        m1Var2.c(new d1(m1Var2, "Failed to schedule task for getAppInstanceId", (Object) null));
                        mVarQ2 = b4.q(e10);
                    }
                    gVar2.b(b4.b(mVarQ2));
                    return;
                } catch (Exception e11) {
                    gVar2.a(e11);
                    return;
                }
            default:
                j jVar = this.f30682d;
                sb.g gVar3 = this.f30681c;
                try {
                    FirebaseAnalytics firebaseAnalytics3 = jVar.f30690b;
                    if (firebaseAnalytics3 == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    m1 m1Var3 = firebaseAnalytics3.f14753a;
                    m1Var3.getClass();
                    m1Var3.c(new b1(m1Var3));
                    gVar3.b(null);
                    return;
                } catch (Exception e12) {
                    gVar3.a(e12);
                    return;
                }
        }
    }

    public /* synthetic */ g(sb.g gVar, j jVar, int i) {
        this.f30680b = i;
        this.f30681c = gVar;
        this.f30682d = jVar;
    }
}
