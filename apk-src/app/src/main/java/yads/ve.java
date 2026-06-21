package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ve implements dg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f44005c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f44006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f44007b;

    public ve(te teVar, Executor executor) {
        this.f44006a = teVar;
        this.f44007b = executor;
    }

    public static void a(bg bgVar) {
        bgVar.a();
        bgVar.b();
    }

    public final void b(bg bgVar) {
        this.f44007b.execute(new zl.n(5, this, bgVar));
    }

    public static final void a(ve veVar, bg bgVar) {
        veVar.getClass();
        a(bgVar);
        if (veVar.f44006a.f43290a.b()) {
            try {
                ij.k kVar = ij.m.f21341c;
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", bgVar.f37009a, bgVar.f37010b);
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                com.google.android.gms.internal.measurement.h5.s(th2);
            }
        }
    }
}
