package androidx.work.impl;

import android.content.Context;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.consent_sdk.c;
import java.util.HashMap;
import k6.t0;
import l6.a;
import l6.d;
import l6.i;
import r3.b;
import s7.g;
import u7.e;
import u7.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1767s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile c f1768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile b f1769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile b f1770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile f f1771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile b f1772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile g f1773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile b f1774r;

    @Override // l6.g
    public final d d() {
        return new d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // l6.g
    public final q6.b e(a aVar) {
        i iVar = new i(0, aVar, new t0(2, this));
        Context context = (Context) aVar.f27941d;
        String str = (String) aVar.f27942e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((q6.a) aVar.f27940c).a(new b7(context, str, iVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b i() {
        b bVar;
        if (this.f1769m != null) {
            return this.f1769m;
        }
        synchronized (this) {
            try {
                if (this.f1769m == null) {
                    this.f1769m = new b(this, 17);
                }
                bVar = this.f1769m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b j() {
        b bVar;
        if (this.f1774r != null) {
            return this.f1774r;
        }
        synchronized (this) {
            try {
                if (this.f1774r == null) {
                    this.f1774r = new b(this, 18);
                }
                bVar = this.f1774r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final f k() {
        f fVar;
        if (this.f1771o != null) {
            return this.f1771o;
        }
        synchronized (this) {
            try {
                if (this.f1771o == null) {
                    this.f1771o = new f(this);
                }
                fVar = this.f1771o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b l() {
        b bVar;
        if (this.f1772p != null) {
            return this.f1772p;
        }
        synchronized (this) {
            try {
                if (this.f1772p == null) {
                    this.f1772p = new b(this, 19);
                }
                bVar = this.f1772p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g m() {
        g gVar;
        if (this.f1773q != null) {
            return this.f1773q;
        }
        synchronized (this) {
            try {
                if (this.f1773q == null) {
                    g gVar2 = new g();
                    gVar2.f32795b = this;
                    gVar2.f32796c = new u7.b(this, 4);
                    gVar2.f32797d = new e(this, 1);
                    gVar2.f32798e = new e(this, 2);
                    this.f1773q = gVar2;
                }
                gVar = this.f1773q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c n() {
        c cVar;
        if (this.f1768l != null) {
            return this.f1768l;
        }
        synchronized (this) {
            try {
                if (this.f1768l == null) {
                    this.f1768l = new c(this);
                }
                cVar = this.f1768l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b o() {
        b bVar;
        if (this.f1770n != null) {
            return this.f1770n;
        }
        synchronized (this) {
            try {
                if (this.f1770n == null) {
                    this.f1770n = new b(this, 20);
                }
                bVar = this.f1770n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
