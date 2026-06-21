package l;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.f1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f27584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f1 f27585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f1 f27586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27587h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f27588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f27589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f27590l;

    public a(View view) {
        this.f27588j = new int[2];
        this.f27584e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f27581b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f27582c = tapTimeout;
        this.f27583d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        f1 f1Var = this.f27586g;
        View view = this.f27584e;
        if (f1Var != null) {
            view.removeCallbacks(f1Var);
        }
        f1 f1Var2 = this.f27585f;
        if (f1Var2 != null) {
            view.removeCallbacks(f1Var2);
        }
    }

    public final k b() {
        m.f fVar;
        switch (this.f27589k) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f27590l).f1053g;
                if (bVar == null || (fVar = ((m.g) bVar).f28210a.f28278t) == null) {
                    return null;
                }
                return fVar.a();
            default:
                m.f fVar2 = ((m.h) this.f27590l).f28223b.f28277s;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        k kVarB;
        switch (this.f27589k) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f27590l;
                h hVar = actionMenuItemView.f1051e;
                return hVar != null && hVar.a(actionMenuItemView.f1048b) && (kVarB = b()) != null && kVarB.isShowing();
            default:
                ((m.h) this.f27590l).f28223b.k();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f27587h = false;
        this.i = -1;
        f1 f1Var = this.f27585f;
        if (f1Var != null) {
            this.f27584e.removeCallbacks(f1Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f27589k = 0;
        this.f27590l = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(m.h hVar, m.h hVar2) {
        this(hVar2);
        this.f27589k = 1;
        this.f27590l = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
