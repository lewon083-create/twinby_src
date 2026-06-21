package u2;

import a0.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m3.x;
import t.a0;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.d f34045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f34046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34047d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f34048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f34049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f34050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ya.e f34051h;

    public l(Context context, d2.d dVar) {
        f2.g.g(context, "Context cannot be null");
        this.f34044a = context.getApplicationContext();
        this.f34045b = dVar;
        this.f34046c = m.f34052d;
    }

    @Override // u2.g
    public final void a(ya.e eVar) {
        synchronized (this.f34047d) {
            this.f34051h = eVar;
        }
        synchronized (this.f34047d) {
            try {
                if (this.f34051h == null) {
                    return;
                }
                if (this.f34049f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new x("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f34050g = threadPoolExecutor;
                    this.f34049f = threadPoolExecutor;
                }
                this.f34049f.execute(new a0(7, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f34047d) {
            try {
                this.f34051h = null;
                Handler handler = this.f34048e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f34048e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f34050g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f34049f = null;
                this.f34050g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d2.i c() {
        try {
            t0 t0Var = this.f34046c;
            Context context = this.f34044a;
            d2.d dVar = this.f34045b;
            t0Var.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            d2.h hVarA = d2.c.a(context, Collections.unmodifiableList(arrayList));
            int i = hVarA.f15546a;
            if (i != 0) {
                throw new RuntimeException(u.k(i, "fetchFonts failed (", ")"));
            }
            d2.i[] iVarArr = (d2.i[]) hVarA.f15547b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}
