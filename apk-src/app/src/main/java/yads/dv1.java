package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static dv1 f37897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f37898c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.collections.l f37899a = new kotlin.collections.l();

    public final void a(fu1 fu1Var, String str, String str2) {
        if (gu1.f38874a.a()) {
            bv1 bv1Var = new bv1(System.currentTimeMillis(), fu1Var.name(), str, str2);
            synchronized (f37898c) {
                try {
                    if (this.f37899a.a() > 5000) {
                        this.f37899a.removeFirst();
                    }
                    this.f37899a.addLast(bv1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final List b() {
        List listR;
        synchronized (f37898c) {
            listR = CollectionsKt.R(this.f37899a);
        }
        return listR;
    }

    public final void a() {
        synchronized (f37898c) {
            this.f37899a.clear();
            Unit unit = Unit.f27471a;
        }
    }
}
