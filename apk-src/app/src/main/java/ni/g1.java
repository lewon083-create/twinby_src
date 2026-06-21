package ni;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g1 implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29397a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Surface f29398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29400d;

    public /* synthetic */ g1(l6.i iVar, Surface surface, m1 m1Var) {
        this.f29399c = iVar;
        this.f29398b = surface;
        this.f29400d = m1Var;
    }

    @Override // f2.a
    public final void accept(Object obj) {
        String str;
        switch (this.f29397a) {
            case 0:
                l6.i iVar = (l6.i) this.f29399c;
                m1 m1Var = (m1) this.f29400d;
                iVar.getClass();
                this.f29398b.release();
                int i = ((a0.l) obj).f153a;
                if (i != 0 && i != 1 && i != 3 && i != 4) {
                    if (i == 2) {
                        str = i + ": Provided surface could not be used by the camera.";
                    } else {
                        str = i + ": Attempt to provide a surface resulted with unrecognizable code.";
                    }
                    m1Var.f29441b.f29437a.l(new a(2, m1Var, str));
                    break;
                }
                break;
            default:
                r0.d dVar = (r0.d) this.f29399c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f29400d;
                dVar.getClass();
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                this.f29398b.release();
                dVar.f32150f--;
                dVar.a();
                break;
        }
    }

    public /* synthetic */ g1(r0.d dVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.f29399c = dVar;
        this.f29400d = surfaceTexture;
        this.f29398b = surface;
    }
}
