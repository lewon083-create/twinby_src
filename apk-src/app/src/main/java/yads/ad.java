package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ad implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0 f36688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pg0 f36689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f36690d;

    public /* synthetic */ ad(Context context, boolean z5, int i) {
        this(context, (i & 2) != 0 ? false : z5, new lg0(), new pg0());
    }

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            Context context = this.f36690d;
            zl3 zl3Var = nl3.f41290a;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            pg0 pg0Var = this.f36689c;
            Context context2 = this.f36690d;
            pg0Var.getClass();
            int iA = pg0.a(context2, 420.0f);
            int i11 = this.f36690d.getResources().getConfiguration().orientation;
            if (this.f36688b.a(this.f36690d) != kg0.f40188b || i11 != 1) {
                iMin = (int) Math.min(iMin, iA);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z5 = this.f36687a;
            int iC = nl3.c(this.f36690d);
            pg0 pg0Var2 = this.f36689c;
            Context context3 = this.f36690d;
            pg0Var2.getClass();
            int iA2 = pg0.a(context3, 350.0f);
            if (!z5) {
                iC = (int) Math.min(iC, iA2);
            }
            i10 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iC, size2), 1073741824);
        }
        jj1 jj1Var = new jj1();
        jj1Var.f39878b = i10;
        jj1Var.f39877a = i;
        return jj1Var;
    }

    public ad(Context context, boolean z5, lg0 lg0Var, pg0 pg0Var) {
        this.f36687a = z5;
        this.f36688b = lg0Var;
        this.f36689c = pg0Var;
        this.f36690d = context.getApplicationContext();
    }
}
