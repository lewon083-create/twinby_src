package k6;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s0 implements z0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final ac.g B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f27197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f27198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f27201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f27202h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f27206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27209p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f27212s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f27219z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27210q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27211r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27213t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27214u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27215v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27216w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f27217x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f27218y = new int[2];

    public w(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27219z = valueAnimatorOfFloat;
        this.A = 0;
        ac.g gVar = new ac.g(15, this);
        this.B = gVar;
        u uVar = new u(this);
        this.f27197c = stateListDrawable;
        this.f27198d = drawable;
        this.f27201g = stateListDrawable2;
        this.f27202h = drawable2;
        this.f27199e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f27200f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f27203j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f27195a = i10;
        this.f27196b = i11;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        valueAnimatorOfFloat.addListener(new v(this));
        valueAnimatorOfFloat.addUpdateListener(new ac.b(1, this));
        RecyclerView recyclerView2 = this.f27212s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f27212s.removeOnItemTouchListener(this);
            this.f27212s.removeOnScrollListener(uVar);
            this.f27212s.removeCallbacks(gVar);
        }
        this.f27212s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f27212s.addOnItemTouchListener(this);
        this.f27212s.addOnScrollListener(uVar);
    }

    public static int c(float f10, float f11, int[] iArr, int i, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    public final boolean a(float f10, float f11) {
        if (f11 < this.f27211r - this.i) {
            return false;
        }
        int i = this.f27208o;
        int i10 = this.f27207n;
        return f10 >= ((float) (i - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i));
    }

    public final boolean b(float f10, float f11) {
        Field field = g2.n0.f19900a;
        int layoutDirection = this.f27212s.getLayoutDirection();
        int i = this.f27199e;
        if (layoutDirection == 1) {
            if (f10 > i) {
                return false;
            }
        } else if (f10 < this.f27210q - i) {
            return false;
        }
        int i10 = this.f27205l;
        int i11 = this.f27204k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final void d(int i) {
        ac.g gVar = this.B;
        StateListDrawable stateListDrawable = this.f27197c;
        if (i == 2 && this.f27215v != 2) {
            stateListDrawable.setState(C);
            this.f27212s.removeCallbacks(gVar);
        }
        if (i == 0) {
            this.f27212s.invalidate();
        } else {
            e();
        }
        if (this.f27215v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.f27212s.removeCallbacks(gVar);
            this.f27212s.postDelayed(gVar, 1200);
        } else if (i == 1) {
            this.f27212s.removeCallbacks(gVar);
            this.f27212s.postDelayed(gVar, 1500);
        }
        this.f27215v = i;
    }

    public final void e() {
        int i = this.A;
        ValueAnimator valueAnimator = this.f27219z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // k6.s0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, f1 f1Var) {
        int i = this.f27210q;
        RecyclerView recyclerView2 = this.f27212s;
        if (i != recyclerView2.getWidth() || this.f27211r != recyclerView2.getHeight()) {
            this.f27210q = recyclerView2.getWidth();
            this.f27211r = recyclerView2.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f27213t) {
                int i10 = this.f27210q;
                int i11 = this.f27199e;
                int i12 = i10 - i11;
                int i13 = this.f27205l;
                int i14 = this.f27204k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f27197c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f27200f;
                int i17 = this.f27211r;
                Drawable drawable = this.f27198d;
                drawable.setBounds(0, 0, i16, i17);
                Field field = g2.n0.f19900a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f27214u) {
                int i18 = this.f27211r;
                int i19 = this.i;
                int i20 = i18 - i19;
                int i21 = this.f27208o;
                int i22 = this.f27207n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f27201g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f27210q;
                int i25 = this.f27203j;
                Drawable drawable2 = this.f27202h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }
}
