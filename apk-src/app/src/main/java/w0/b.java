package w0;

import a0.n;
import a0.q2;
import a0.u1;
import android.util.Range;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import g0.c0;
import g0.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f34945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0.f f34946d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34944b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34947e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1 f34948f = null;

    public b(u uVar, l0.f fVar) {
        this.f34945c = uVar;
        this.f34946d = fVar;
        if (((w) uVar.getLifecycle()).f1606c.a(o.f1576e)) {
            fVar.h();
        } else {
            fVar.t();
        }
        uVar.getLifecycle().a(this);
    }

    @Override // a0.n
    public final c0 a() {
        return this.f34946d.f27721b.f19536d;
    }

    @Override // a0.n
    public final d0 b() {
        return this.f34946d.f27721b.f19535c;
    }

    public final void c(u1 u1Var) {
        synchronized (this.f34944b) {
            try {
                u1 u1Var2 = this.f34948f;
                if (u1Var2 == null) {
                    this.f34948f = u1Var;
                } else if (u1Var.f226b) {
                    if (!u1Var2.f226b) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList((List) this.f34948f.f229e);
                    arrayList.addAll((List) u1Var.f229e);
                    this.f34948f = new u1(arrayList, (List) u1Var.f227c);
                } else {
                    if (u1Var2.f226b) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f34948f = u1Var;
                    l0.f fVar = this.f34946d;
                    fVar.A((ArrayList) fVar.x());
                }
                synchronized (this.f34946d.f27730l) {
                }
                l0.f fVar2 = this.f34946d;
                List list = (List) u1Var.f227c;
                synchronized (fVar2.f27730l) {
                    fVar2.i = list;
                }
                synchronized (this.f34946d.f27730l) {
                }
                l0.f fVar3 = this.f34946d;
                Range range = (Range) u1Var.f230f;
                synchronized (fVar3.f27730l) {
                    fVar3.f27728j = range;
                }
                d0 cameraInfoInternal = b();
                Intrinsics.checkNotNullParameter(u1Var, "<this>");
                Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
                c0.c cVarD = wd.d.d(u1Var, cameraInfoInternal);
                ((j0.d) u1Var.i).execute(new v0(12, cVarD, u1Var));
                this.f34946d.c((List) u1Var.f229e, cVarD);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u e() {
        u uVar;
        synchronized (this.f34944b) {
            uVar = this.f34945c;
        }
        return uVar;
    }

    public final List h() {
        List listUnmodifiableList;
        synchronized (this.f34944b) {
            listUnmodifiableList = Collections.unmodifiableList(this.f34946d.x());
        }
        return listUnmodifiableList;
    }

    @f0(androidx.lifecycle.n.ON_DESTROY)
    public void onDestroy(u uVar) {
        synchronized (this.f34944b) {
            l0.f fVar = this.f34946d;
            fVar.A((ArrayList) fVar.x());
        }
    }

    @f0(androidx.lifecycle.n.ON_PAUSE)
    public void onPause(u uVar) {
        this.f34946d.f27721b.j(false);
    }

    @f0(androidx.lifecycle.n.ON_RESUME)
    public void onResume(u uVar) {
        this.f34946d.f27721b.j(true);
    }

    @f0(androidx.lifecycle.n.ON_START)
    public void onStart(u uVar) {
        synchronized (this.f34944b) {
            try {
                if (!this.f34947e) {
                    this.f34946d.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(androidx.lifecycle.n.ON_STOP)
    public void onStop(u uVar) {
        synchronized (this.f34944b) {
            try {
                if (!this.f34947e) {
                    this.f34946d.t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean r(q2 q2Var) {
        boolean zContains;
        synchronized (this.f34944b) {
            zContains = ((ArrayList) this.f34946d.x()).contains(q2Var);
        }
        return zContains;
    }

    public final void s() {
        synchronized (this.f34944b) {
            try {
                if (this.f34947e) {
                    return;
                }
                onStop(this.f34945c);
                this.f34947e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(u1 u1Var) {
        boolean z5;
        boolean z10;
        synchronized (this.f34944b) {
            try {
                u1 u1Var2 = this.f34948f;
                if (u1Var2 != null && (z5 = u1Var2.f226b) == (z10 = u1Var.f226b)) {
                    u1 u1Var3 = null;
                    if (z5 || z10) {
                        if (z5 && z10) {
                            ArrayList arrayList = new ArrayList((List) this.f34948f.f229e);
                            arrayList.removeAll((List) u1Var.f229e);
                            if (!arrayList.isEmpty()) {
                                this.f34948f.getClass();
                                u1Var3 = new u1(arrayList, (List) this.f34948f.f227c);
                            }
                            this.f34948f = u1Var3;
                        }
                    } else if (u1Var2 != u1Var) {
                        return;
                    } else {
                        this.f34948f = null;
                    }
                    ArrayList arrayList2 = new ArrayList((List) u1Var.f229e);
                    arrayList2.retainAll(this.f34946d.x());
                    this.f34946d.A(arrayList2);
                }
            } finally {
            }
        }
    }

    public final void u() {
        synchronized (this.f34944b) {
            l0.f fVar = this.f34946d;
            fVar.A((ArrayList) fVar.x());
            this.f34948f = null;
        }
    }

    public final void v() {
        synchronized (this.f34944b) {
            try {
                if (this.f34947e) {
                    this.f34947e = false;
                    if (((w) this.f34945c.getLifecycle()).f1606c.a(o.f1576e)) {
                        onStart(this.f34945c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
