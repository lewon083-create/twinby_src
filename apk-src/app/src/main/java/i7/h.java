package i7;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.gms.internal.ads.y50;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import q0.n;
import x0.b0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21198c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f21196a = i;
        this.f21197b = obj;
        this.f21198c = obj2;
    }

    @Override // f2.a
    public final void accept(Object obj) {
        switch (this.f21196a) {
            case 0:
                k this$0 = (k) this.f21197b;
                Activity activity = (Activity) this.f21198c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                ka.k kVar = this$0.f21206e;
                if (kVar != null) {
                    kVar.O(activity, this$0.a(activity));
                }
                break;
            case 1:
                Surface surface = (Surface) this.f21197b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f21198c;
                surface.release();
                surfaceTexture.release();
                break;
            case 2:
                q0.f fVar = (q0.f) this.f21197b;
                n nVar = (n) this.f21198c;
                nVar.close();
                Surface surface2 = (Surface) fVar.i.remove(nVar);
                if (surface2 != null) {
                    y50 y50Var = fVar.f31566b;
                    s0.i.d(true, (AtomicBoolean) y50Var.f12502c);
                    s0.i.c((Thread) y50Var.f12504e);
                    y50Var.j(surface2, true);
                }
                break;
            case 3:
                r0.d dVar = (r0.d) this.f21197b;
                n nVar2 = (n) this.f21198c;
                nVar2.close();
                Surface surface3 = (Surface) dVar.i.remove(nVar2);
                if (surface3 != null) {
                    r0.c cVar = dVar.f32146b;
                    s0.i.d(true, (AtomicBoolean) cVar.f12502c);
                    s0.i.c((Thread) cVar.f12504e);
                    cVar.j(surface3, true);
                }
                break;
            default:
                b0 b0Var = (b0) this.f21197b;
                j1.h hVar = (j1.h) this.f21198c;
                Throwable th2 = (Throwable) obj;
                if (b0Var.X == null) {
                    if (th2 instanceof e1.h) {
                        b0Var.A(5);
                    } else {
                        b0Var.A(6);
                    }
                    b0Var.X = th2;
                    b0Var.K(true);
                    hVar.b(null);
                }
                break;
        }
    }
}
