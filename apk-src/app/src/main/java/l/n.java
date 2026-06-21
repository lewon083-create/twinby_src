package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f27676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f27679e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f27682h;
    public k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f27683j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27680f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f27684k = new l(this);

    public n(Context context, i iVar, View view, boolean z5, int i, int i10) {
        this.f27675a = context;
        this.f27676b = iVar;
        this.f27679e = view;
        this.f27677c = z5;
        this.f27678d = i;
    }

    public final k a() {
        k sVar;
        if (this.i == null) {
            Context context = this.f27675a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            m.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new f(context, this.f27679e, this.f27678d, this.f27677c);
            } else {
                sVar = new s(this.f27675a, this.f27676b, this.f27679e, this.f27678d, this.f27677c);
            }
            sVar.i(this.f27676b);
            sVar.o(this.f27684k);
            sVar.k(this.f27679e);
            sVar.e(this.f27682h);
            sVar.l(this.f27681g);
            sVar.m(this.f27680f);
            this.i = sVar;
        }
        return this.i;
    }

    public final boolean b() {
        k kVar = this.i;
        return kVar != null && kVar.isShowing();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f27683j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i10, boolean z5, boolean z10) {
        k kVarA = a();
        kVarA.p(z10);
        if (z5) {
            int i11 = this.f27680f;
            View view = this.f27679e;
            Field field = n0.f19900a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f27679e.getWidth();
            }
            kVarA.n(i);
            kVarA.q(i10);
            int i12 = (int) ((this.f27675a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarA.f27673b = new Rect(i - i12, i10 - i12, i + i12, i10 + i12);
        }
        kVarA.show();
    }
}
