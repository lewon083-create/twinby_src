package z2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements androidx.lifecycle.j, o6.g, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f45919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f45920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.a0 f45921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.w f45922e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o6.f f45923f = null;

    public o0(t tVar, z0 z0Var, t.a0 a0Var) {
        this.f45919b = tVar;
        this.f45920c = z0Var;
        this.f45921d = a0Var;
    }

    public final void a(androidx.lifecycle.n nVar) {
        this.f45922e.e(nVar);
    }

    public final void b() {
        if (this.f45922e == null) {
            this.f45922e = new androidx.lifecycle.w(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            g8.c cVar = new g8.c(this, new androidx.lifecycle.q0(6, this));
            this.f45923f = new o6.f(cVar);
            cVar.a();
            this.f45921d.run();
        }
    }

    @Override // androidx.lifecycle.j
    public final f3.c getDefaultViewModelCreationExtras() {
        Application application;
        t tVar = this.f45919b;
        Context applicationContext = tVar.M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        f3.d dVar = new f3.d(0);
        if (application != null) {
            dVar.b(x0.f1615f, application);
        }
        dVar.b(androidx.lifecycle.p0.f1579a, tVar);
        dVar.b(androidx.lifecycle.p0.f1580b, this);
        Bundle bundle = tVar.f45973g;
        if (bundle != null) {
            dVar.b(androidx.lifecycle.p0.f1581c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        b();
        return this.f45922e;
    }

    @Override // o6.g
    public final o6.e getSavedStateRegistry() {
        b();
        return this.f45923f.f29784b;
    }

    @Override // androidx.lifecycle.a1
    public final z0 getViewModelStore() {
        b();
        return this.f45920c;
    }
}
