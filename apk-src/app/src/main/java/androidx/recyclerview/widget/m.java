package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f1722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1724g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f1721d;
        if (i >= 0) {
            this.f1721d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f1723f = false;
            return;
        }
        if (!this.f1723f) {
            this.f1724g = 0;
            return;
        }
        Interpolator interpolator = this.f1722e;
        if (interpolator != null && this.f1720c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f1720c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.mViewFlinger.c(this.f1718a, this.f1719b, interpolator, i10);
        int i11 = this.f1724g + 1;
        this.f1724g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1723f = false;
    }
}
