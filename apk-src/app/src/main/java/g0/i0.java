package g0;

import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t.p f19597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f19598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0.u1 f19599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f19600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f19601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f19602h;
    public final CopyOnWriteArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f19603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f19604k;

    public i0(Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f19595a = backgroundExecutor;
        this.f19596b = new Object();
        this.f19600f = new h0(0, this);
        this.f19601g = kotlin.collections.b0.f27475b;
        this.f19602h = new AtomicBoolean(false);
        this.i = new CopyOnWriteArrayList();
        this.f19603j = new CopyOnWriteArrayList();
        this.f19604k = new LinkedHashMap();
    }

    public final void a(String str) {
        l0 l0Var = this.f19598d;
        if (l0Var == null) {
            return;
        }
        try {
            f0 f0VarB = l0Var.b(str);
            Intrinsics.checkNotNullExpressionValue(f0VarB, "getCamera(...)");
            d0 d0VarP = f0VarB.p();
            Intrinsics.checkNotNullExpressionValue(d0VarP, "getCameraInfoInternal(...)");
            d(d0VarP);
        } catch (IllegalArgumentException unused) {
            com.google.android.gms.internal.auth.g.O("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19603j;
        if (!zIsEmpty) {
            com.google.android.gms.internal.auth.g.t("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.auth.g.t("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        Iterator it2 = copyOnWriteArrayList.iterator();
        if (it2.hasNext()) {
            throw om1.i(it2);
        }
    }

    public final void c(String str) {
        synchronized (this.f19596b) {
            androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.f19604k.remove(str);
            l0 l0Var = this.f19598d;
            if (e0Var != null && l0Var != null) {
                try {
                    f0 f0VarB = l0Var.b(str);
                    Intrinsics.checkNotNullExpressionValue(f0VarB, "getCamera(...)");
                    hl.d.s().execute(new e1.y(16, f0VarB, e0Var));
                    com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.f27471a;
        }
    }

    public final void d(d0 d0Var) {
        final String strE = d0Var.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        if (this.f19602h.get()) {
            synchronized (this.f19596b) {
                if (this.f19604k.containsKey(strE)) {
                    return;
                }
                androidx.lifecycle.e0 e0Var = new androidx.lifecycle.e0() { // from class: g0.g0
                    @Override // androidx.lifecycle.e0
                    public final void a(Object obj) {
                        a0.f fVar = (a0.f) obj;
                        i0 i0Var = this.f19564a;
                        if (!i0Var.f19602h.get()) {
                            com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if ((fVar != null ? fVar.f76b : null) == null) {
                            if ((fVar != null ? fVar.f75a : 0) != 5) {
                                return;
                            }
                        }
                        StringBuilder sbP = om1.p("Camera ", strE, " state changed to ");
                        sbP.append(a0.u.v(fVar.f75a));
                        sbP.append(" with error: ");
                        a0.g gVar = fVar.f76b;
                        sbP.append(gVar != null ? Integer.valueOf(gVar.f83a) : null);
                        sbP.append(". Triggering refresh.");
                        com.google.android.gms.internal.auth.g.O("CameraPresencePrvdr", sbP.toString());
                        a0.u1 u1Var = i0Var.f19599e;
                        if (u1Var != null) {
                            u1Var.A();
                        }
                    }
                };
                hl.d.s().execute(new e1.y(17, d0Var, e0Var));
                this.f19604k.put(strE, e0Var);
                com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Registered state observer for camera: " + strE);
                Unit unit = Unit.f27471a;
            }
        }
    }

    public final void e() {
        if (!this.f19602h.getAndSet(false)) {
            com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        com.google.android.gms.internal.auth.g.t("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        a0.u1 u1Var = this.f19599e;
        if (u1Var != null) {
            u1Var.v(this.f19600f);
        }
        synchronized (this.f19596b) {
            if (!this.f19604k.isEmpty()) {
                Map mapL = kotlin.collections.j0.l(this.f19604k);
                this.f19604k.clear();
                Unit unit = Unit.f27471a;
                l0 l0Var = this.f19598d;
                if (l0Var != null) {
                    LinkedHashSet linkedHashSetC = l0Var.c();
                    Intrinsics.checkNotNullExpressionValue(linkedHashSetC, "getCameras(...)");
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.j(linkedHashSetC, 10));
                    Iterator it = linkedHashSetC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((f0) it.next()).p());
                    }
                    com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Clearing all " + mapL.size() + " state observers.");
                    ArrayList arrayList2 = new ArrayList(mapL.size());
                    for (Map.Entry entry : mapL.entrySet()) {
                        hl.d.s().execute(new a1.c(arrayList, (androidx.lifecycle.e0) entry.getValue(), (String) entry.getKey(), 15));
                        arrayList2.add(Unit.f27471a);
                    }
                }
            }
        }
        this.i.clear();
        this.f19603j.clear();
        this.f19601g = kotlin.collections.b0.f27475b;
        this.f19597c = null;
        this.f19598d = null;
    }

    public final void f(t.p cameraFactory, l0 cameraRepository) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.f19602h.compareAndSet(false, true)) {
            com.google.android.gms.internal.auth.g.t("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            LinkedHashSet<String> linkedHashSetA = cameraFactory.a();
            Intrinsics.checkNotNullExpressionValue(linkedHashSetA, "getAvailableCameraIds(...)");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(linkedHashSetA, 10));
            for (String primaryCameraId : linkedHashSetA) {
                Intrinsics.b(primaryCameraId);
                Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
                ArrayList cameraIds = kotlin.collections.s.g(primaryCameraId);
                Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
                arrayList.add(new a0.v(cameraIds, null));
            }
            this.f19601g = arrayList;
            this.f19597c = cameraFactory;
            this.f19598d = cameraRepository;
            a0.u1 u1Var = cameraFactory.f33211j;
            this.f19599e = u1Var;
            if (u1Var != null) {
                u1Var.J(this.f19595a, this.f19600f);
            }
        }
    }
}
