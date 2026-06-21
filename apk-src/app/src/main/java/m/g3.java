package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.twinby.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static g3 f28212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static g3 f28213m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f28214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f28215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f3 f28217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f3 f28218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28220h;
    public h3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28222k;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.f3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.f3] */
    public g3(View view, CharSequence charSequence) {
        final int i = 0;
        this.f28217e = new Runnable(this) { // from class: m.f3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g3 f28209c;

            {
                this.f28209c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f28209c.c(false);
                        break;
                    default:
                        this.f28209c.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f28218f = new Runnable(this) { // from class: m.f3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g3 f28209c;

            {
                this.f28209c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f28209c.c(false);
                        break;
                    default:
                        this.f28209c.a();
                        break;
                }
            }
        };
        this.f28214b = view;
        this.f28215c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = g2.o0.f19905a;
        this.f28216d = Build.VERSION.SDK_INT >= 28 ? c2.f.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f28222k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(g3 g3Var) {
        g3 g3Var2 = f28212l;
        if (g3Var2 != null) {
            g3Var2.f28214b.removeCallbacks(g3Var2.f28217e);
        }
        f28212l = g3Var;
        if (g3Var != null) {
            g3Var.f28214b.postDelayed(g3Var.f28217e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        g3 g3Var = f28213m;
        View view = this.f28214b;
        if (g3Var == this) {
            f28213m = null;
            h3 h3Var = this.i;
            if (h3Var != null) {
                View view2 = (View) h3Var.f28251c;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) h3Var.f28250b).getSystemService("window")).removeView(view2);
                }
                this.i = null;
                this.f28222k = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f28212l == this) {
            b(null);
        }
        view.removeCallbacks(this.f28218f);
    }

    public final void c(boolean z5) {
        int height;
        int i;
        int i10;
        boolean z10;
        int i11;
        int i12;
        long longPressTimeout;
        long j10;
        long j11;
        Field field = g2.n0.f19900a;
        View view = this.f28214b;
        if (view.isAttachedToWindow()) {
            b(null);
            g3 g3Var = f28213m;
            if (g3Var != null) {
                g3Var.a();
            }
            f28213m = this;
            this.f28221j = z5;
            Context context = view.getContext();
            h3 h3Var = new h3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            h3Var.f28253e = layoutParams;
            h3Var.f28254f = new Rect();
            h3Var.f28255g = new int[2];
            h3Var.f28256h = new int[2];
            h3Var.f28250b = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            h3Var.f28251c = viewInflate;
            h3Var.f28252d = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(h3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131886084;
            layoutParams.flags = 24;
            View view2 = (View) h3Var.f28251c;
            Context context2 = (Context) h3Var.f28250b;
            this.i = h3Var;
            int width = this.f28219g;
            int i13 = this.f28220h;
            boolean z11 = this.f28221j;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) h3Var.f28253e;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) h3Var.f28252d).setText(this.f28215c);
            int[] iArr = (int[]) h3Var.f28256h;
            int[] iArr2 = (int[]) h3Var.f28255g;
            Rect rect = (Rect) h3Var.f28254f;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i14 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i;
                    z10 = z11;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i12 = 1;
                    i10 = i;
                    z10 = z11;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i15;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams2.x = (i15 + i14) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[i12];
                int i17 = ((i16 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i17 >= 0) {
                        layoutParams2.y = i17;
                    } else {
                        layoutParams2.y = i18;
                    }
                } else if (measuredHeight + i18 <= rect.height()) {
                    layoutParams2.y = i18;
                } else {
                    layoutParams2.y = i17;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f28221j) {
                j11 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            f3 f3Var = this.f28218f;
            view.removeCallbacks(f3Var);
            view.postDelayed(f3Var, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m.h3 r4 = r3.i
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f28221j
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f28214b
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f28222k = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m.h3 r4 = r3.i
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f28222k
            if (r1 != 0) goto L66
            int r1 = r3.f28219g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f28216d
            if (r1 > r2) goto L66
            int r1 = r3.f28220h
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f28219g = r4
            r3.f28220h = r5
            r3.f28222k = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f28219g = view.getWidth() / 2;
        this.f28220h = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
