package k6;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f27185a;

    public u(w wVar) {
        this.f27185a = wVar;
    }

    @Override // k6.a1
    public final void a(RecyclerView recyclerView, int i, int i10) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        w wVar = this.f27185a;
        int i11 = wVar.f27195a;
        int iComputeVerticalScrollRange = wVar.f27212s.computeVerticalScrollRange();
        int i12 = wVar.f27211r;
        wVar.f27213t = iComputeVerticalScrollRange - i12 > 0 && i12 >= i11;
        int iComputeHorizontalScrollRange = wVar.f27212s.computeHorizontalScrollRange();
        int i13 = wVar.f27210q;
        boolean z5 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= i11;
        wVar.f27214u = z5;
        boolean z10 = wVar.f27213t;
        if (!z10 && !z5) {
            if (wVar.f27215v != 0) {
                wVar.d(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i12;
            wVar.f27205l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            wVar.f27204k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (wVar.f27214u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i13;
            wVar.f27208o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            wVar.f27207n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = wVar.f27215v;
        if (i14 == 0 || i14 == 1) {
            wVar.d(1);
        }
    }
}
