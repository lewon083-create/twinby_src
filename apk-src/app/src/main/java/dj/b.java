package dj;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.f;
import s3.l;
import s3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15805b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15806c;

    public b(Context context, l lVar) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f15806c = surfaceView;
        int i = Build.VERSION.SDK_INT;
        if (i == 28) {
            surfaceView.getHolder().addCallback(new a(0, lVar));
            return;
        }
        if (i <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        y yVar = (y) lVar;
        yVar.n0();
        SurfaceHolder holder = surfaceView.getHolder();
        yVar.n0();
        if (holder == null) {
            yVar.n0();
            yVar.a0();
            yVar.e0(null);
            yVar.W(0, 0);
            return;
        }
        yVar.a0();
        yVar.W = true;
        yVar.V = holder;
        holder.addCallback(yVar.f32718x);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            yVar.e0(null);
            yVar.W(0, 0);
        } else {
            yVar.e0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            yVar.W(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final void a() {
        switch (this.f15805b) {
            case 0:
                ((SurfaceView) this.f15806c).getHolder().getSurface().release();
                break;
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final View getView() {
        switch (this.f15805b) {
            case 0:
                return (SurfaceView) this.f15806c;
            default:
                return new View((Context) this.f15806c);
        }
    }

    private final void b() {
    }

    public b(Context context) {
        this.f15806c = context;
    }
}
