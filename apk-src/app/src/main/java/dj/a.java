package dj;

import android.view.SurfaceHolder;
import e1.d0;
import io.flutter.embedding.engine.renderer.j;
import j3.j0;
import s3.l;
import s3.y;
import xh.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15804c;

    public /* synthetic */ a(int i, Object obj) {
        this.f15803b = i;
        this.f15804c = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        switch (this.f15803b) {
            case 0:
                return;
            default:
                n nVar = (n) this.f15804c;
                j jVar = nVar.f36155d;
                if (jVar == null || nVar.f36154c) {
                    return;
                }
                if (jVar == null) {
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                jVar.f25607a.onSurfaceChanged(i10, i11);
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f15803b) {
            case 0:
                j0 j0Var = (l) this.f15804c;
                ((y) j0Var).f0(surfaceHolder.getSurface());
                d0 d0Var = (d0) j0Var;
                d0Var.getClass();
                d0Var.w(((y) d0Var).I(), 1L);
                break;
            default:
                n nVar = (n) this.f15804c;
                nVar.f36153b = true;
                if (nVar.f36155d != null && !nVar.f36154c) {
                    nVar.c();
                    break;
                }
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f15803b) {
            case 0:
                ((y) ((l) this.f15804c)).f0(null);
                return;
            default:
                n nVar = (n) this.f15804c;
                nVar.f36153b = false;
                j jVar = nVar.f36155d;
                if (jVar == null || nVar.f36154c) {
                    return;
                }
                if (jVar == null) {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
                jVar.j();
                return;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
    }
}
