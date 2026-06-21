package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zw1 extends dt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f45569g = {wb.a(zw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1 f45570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dx1 f45571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm2 f45572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yw1 f45573f = yw1.f45175b;

    public zw1(y6.m mVar, lx1 lx1Var, dx1 dx1Var) {
        this.f45570c = lx1Var;
        this.f45571d = dx1Var;
        this.f45572e = om2.a(mVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        y6.m mVar;
        nm2 nm2Var = this.f45572e;
        dk.i iVar = f45569g[0];
        y6.m mVar2 = (y6.m) nm2Var.f41294a.get();
        if (mVar2 != null) {
            if (nl3.f41290a.a(mVar2).f36778a > 0) {
                androidx.recyclerview.widget.g adapter = mVar2.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = mVar2.getCurrentItem();
                    if (currentItem == 0) {
                        this.f45573f = yw1.f45175b;
                    } else if (currentItem == itemCount - 1) {
                        this.f45573f = yw1.f45176c;
                    }
                } else {
                    this.f37883b = ct.f37492c;
                }
                int iOrdinal = this.f45573f.ordinal();
                if (iOrdinal == 0) {
                    y6.m mVar3 = (y6.m) this.f45570c.f40712a.get();
                    if (mVar3 != null) {
                        mVar3.b(mVar3.getCurrentItem() + 1, true);
                    }
                } else if (iOrdinal == 1 && (mVar = (y6.m) this.f45570c.f40712a.get()) != null) {
                    mVar.b(mVar.getCurrentItem() - 1, true);
                }
                dx1 dx1Var = this.f45571d;
                if (dx1Var.f37912e) {
                    dx1Var.a("first_auto_swipe");
                    dx1Var.f37912e = false;
                }
            }
            unit = Unit.f27471a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f37883b = ct.f37492c;
        }
    }
}
