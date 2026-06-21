package d;

import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.e f15469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f15470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f15471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a6.c f15473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f15474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15475g;

    public r(s onBackPressedCallback, a6.e initialInfo) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Intrinsics.checkNotNullParameter(initialInfo, "info");
        boolean zIsEnabled = onBackPressedCallback.isEnabled();
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        this.f15469a = initialInfo;
        b0 b0Var = b0.f27475b;
        this.f15470b = b0Var;
        this.f15471c = b0Var;
        this.f15472d = zIsEnabled;
        this.f15474f = onBackPressedCallback;
        this.f15475g = true;
    }

    public final void a() {
        a6.c cVar = this.f15473e;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(this, "handler");
            if (cVar.f450c.remove(this)) {
                a6.g gVar = cVar.f449b;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(this, "handler");
                if (equals(gVar.f461f)) {
                    if (gVar.f462g == -1) {
                        this.f15474f.handleOnBackCancelled();
                    }
                    gVar.f461f = null;
                    gVar.f462g = 0;
                    gVar.f463h = null;
                }
                gVar.f459d.remove(this);
                gVar.f460e.remove(this);
                this.f15473e = null;
                gVar.b();
            }
        }
    }

    public final void b(boolean z5) {
        a6.g gVar;
        this.f15475g = z5;
        boolean z10 = z5 && this.f15474f.isEnabled();
        if (this.f15472d == z10) {
            return;
        }
        this.f15472d = z10;
        a6.c cVar = this.f15473e;
        if (cVar == null || (gVar = cVar.f449b) == null) {
            return;
        }
        gVar.b();
    }
}
