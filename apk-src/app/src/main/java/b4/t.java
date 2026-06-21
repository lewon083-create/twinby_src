package b4;

import a0.a2;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import yads.xk1;
import yads.yk1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1960c;

    public /* synthetic */ t(int i, Object obj) {
        this.f1959b = i;
        this.f1960c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1959b) {
            case 0:
                x xVar = (x) this.f1960c;
                return xVar.b(obj2) - xVar.b(obj);
            case 1:
                g0.l lVar = (g0.l) obj2;
                ((fd.b) this.f1960c).getClass();
                Class cls = ((g0.l) obj).f19641a.f19517j;
                int i = 0;
                int i10 = cls == MediaCodec.class ? 2 : (cls == a2.class || cls == u0.d.class) ? 0 : 1;
                Class cls2 = lVar.f19641a.f19517j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 != a2.class && cls2 != u0.d.class) {
                    i = 1;
                }
                return i10 - i;
            case 2:
                Rect rect = (Rect) this.f1960c;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            default:
                return yk1.a((xk1) this.f1960c, obj, obj2);
        }
    }
}
