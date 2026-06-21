package k6;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27108a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f27109b;

    public k1(l1 l1Var) {
        this.f27109b = l1Var;
    }

    @Override // k6.a1
    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (i == 0 && i10 == 0) {
            return;
        }
        this.f27108a = true;
    }

    @Override // k6.a1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.f27108a) {
            this.f27108a = false;
            this.f27109b.snapToTargetExistingView();
        }
    }
}
