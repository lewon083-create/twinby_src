package t1;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la.m f33342a;

    public e(la.m mVar) {
        this.f33342a = mVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        la.m mVar = this.f33342a;
        int i10 = mVar.f28098c;
        if ((i10 & 1) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[0], frameMetrics.getMetric(8));
        }
        if ((i10 & 2) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[1], frameMetrics.getMetric(1));
        }
        if ((i10 & 4) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[2], frameMetrics.getMetric(3));
        }
        if ((i10 & 8) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[3], frameMetrics.getMetric(4));
        }
        if ((i10 & 16) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[4], frameMetrics.getMetric(5));
        }
        if ((i10 & 64) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[6], frameMetrics.getMetric(7));
        }
        if ((i10 & 32) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[5], frameMetrics.getMetric(6));
        }
        if ((i10 & 128) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[7], frameMetrics.getMetric(0));
        }
        if ((i10 & 256) != 0) {
            la.m.a(((SparseIntArray[]) mVar.f28099d)[8], frameMetrics.getMetric(2));
        }
    }
}
