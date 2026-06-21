package k6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27071h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f27075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27076n;

    public final void a(int i) {
        if ((this.f27067d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f27067d));
    }

    public final int b() {
        return this.f27070g ? this.f27065b - this.f27066c : this.f27068e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f27064a + ", mData=null, mItemCount=" + this.f27068e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f27065b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f27066c + ", mStructureChanged=" + this.f27069f + ", mInPreLayout=" + this.f27070g + ", mRunSimpleAnimations=" + this.f27072j + ", mRunPredictiveAnimations=" + this.f27073k + '}';
    }
}
