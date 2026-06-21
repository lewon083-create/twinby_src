package nc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f29270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f29271d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f29270c = arrayList;
        this.f29271d = matrix;
    }

    @Override // nc.s
    public final void a(Matrix matrix, mc.a aVar, int i, Canvas canvas) {
        Iterator it = this.f29270c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f29271d, aVar, i, canvas);
        }
    }
}
