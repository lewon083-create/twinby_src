package q7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import l7.n;
import r7.d;
import s7.e;
import s7.f;
import s7.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r7.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f31783d = n.i("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.c[] f31785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31786c;

    public c(Context context, x7.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f31784a = bVar;
        this.f31785b = new r7.c[]{new r7.a((s7.a) g.B(applicationContext, aVar).f32795b, 0), new r7.a((s7.b) g.B(applicationContext, aVar).f32796c, 1), new r7.a((f) g.B(applicationContext, aVar).f32798e, 4), new r7.a((e) g.B(applicationContext, aVar).f32797d, 2), new r7.a((e) g.B(applicationContext, aVar).f32797d, 3), new r7.e((e) g.B(applicationContext, aVar).f32797d), new d((e) g.B(applicationContext, aVar).f32797d)};
        this.f31786c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f31786c) {
            try {
                for (r7.c cVar : this.f31785b) {
                    Object obj = cVar.f32268b;
                    if (obj != null && cVar.b(obj) && cVar.f32267a.contains(str)) {
                        n.g().e(f31783d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f31786c) {
            try {
                for (r7.c cVar : this.f31785b) {
                    if (cVar.f32270d != null) {
                        cVar.f32270d = null;
                        cVar.d(null, cVar.f32268b);
                    }
                }
                for (r7.c cVar2 : this.f31785b) {
                    cVar2.c(collection);
                }
                for (r7.c cVar3 : this.f31785b) {
                    if (cVar3.f32270d != this) {
                        cVar3.f32270d = this;
                        cVar3.d(this, cVar3.f32268b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f31786c) {
            try {
                for (r7.c cVar : this.f31785b) {
                    ArrayList arrayList = cVar.f32267a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f32269c.b(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
