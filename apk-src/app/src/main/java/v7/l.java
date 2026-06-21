package v7;

import android.content.Context;
import androidx.work.ListenableWorker;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34780h = l7.n.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w7.j f34781b = new w7.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f34782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u7.j f34783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListenableWorker f34784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f34785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x7.a f34786g;

    public l(Context context, u7.j jVar, ListenableWorker listenableWorker, m mVar, x7.b bVar) {
        this.f34782c = context;
        this.f34783d = jVar;
        this.f34784e = listenableWorker;
        this.f34785f = mVar;
        this.f34786g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f34783d.f34345q || c2.b.b()) {
            this.f34781b.j(null);
            return;
        }
        w7.j jVar = new w7.j();
        x7.b bVar = (x7.b) this.f34786g;
        ((j0.e) bVar.f35979d).execute(new s9.i(7, this, jVar, false));
        jVar.a(new b3(11, this, jVar), (j0.e) bVar.f35979d);
    }
}
