package s7;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l7.n;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f32786f = n.i("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.a f32787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32789c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f32790d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f32791e;

    public d(Context context, x7.a aVar) {
        this.f32788b = context.getApplicationContext();
        this.f32787a = aVar;
    }

    public abstract Object a();

    public final void b(r7.c cVar) {
        synchronized (this.f32789c) {
            try {
                if (this.f32790d.remove(cVar) && this.f32790d.isEmpty()) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f32789c) {
            try {
                Object obj2 = this.f32791e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f32791e = obj;
                    ((j0.e) ((x7.b) this.f32787a).f35979d).execute(new b3(3, this, new ArrayList(this.f32790d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
