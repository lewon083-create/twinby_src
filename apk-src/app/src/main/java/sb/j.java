package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l, d, c, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f32869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f32870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f32871e;

    public /* synthetic */ j(Executor executor, a aVar, m mVar, int i) {
        this.f32868b = i;
        this.f32869c = executor;
        this.f32870d = aVar;
        this.f32871e = mVar;
    }

    @Override // sb.l
    public final void a(Task task) {
        switch (this.f32868b) {
            case 0:
                this.f32869c.execute(new b3(4, this, task));
                break;
            default:
                this.f32869c.execute(new s9.i(1, this, task, false));
                break;
        }
    }

    @Override // sb.b
    public void b() {
        this.f32871e.n();
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        this.f32871e.m(exc);
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        this.f32871e.l(obj);
    }
}
