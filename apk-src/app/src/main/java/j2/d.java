package j2;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.d1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f26184s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f26186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1 f26187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ac.g f26188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f26189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f26190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26191h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f26192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f26193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f26194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1 f26200r;

    public d(d1 d1Var) {
        a aVar = new a();
        aVar.f26178e = Long.MIN_VALUE;
        aVar.f26180g = -1L;
        aVar.f26179f = 0L;
        this.f26185b = aVar;
        this.f26186c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f26189f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f26190g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f26192j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f26193k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f26194l = fArr5;
        this.f26187d = d1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f26191h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i = f26184s;
        aVar.f26174a = 500;
        aVar.f26175b = 500;
        this.f26200r = d1Var;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f26189f
            r0 = r0[r4]
            float[] r1 = r3.f26190g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f26186c
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f26192j
            r0 = r0[r4]
            float[] r1 = r3.f26193k
            r1 = r1[r4]
            float[] r2 = r3.f26194l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i = this.f26191h;
            if (i == 0 || i == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f26198p && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void f() {
        int i = 0;
        if (this.f26196n) {
            this.f26198p = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f26185b;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f26178e);
        int i11 = aVar.f26175b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        aVar.i = i;
        aVar.f26181h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f26180g = jCurrentAnimationTimeMillis;
    }

    public final boolean g() {
        d1 d1Var;
        int count;
        a aVar = this.f26185b;
        float f10 = aVar.f26177d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f26176c);
        if (iAbs != 0 && (count = (d1Var = this.f26200r).getCount()) != 0) {
            int childCount = d1Var.getChildCount();
            int firstVisiblePosition = d1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && d1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && d1Var.getChildAt(childCount - 1).getBottom() <= d1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f26199q
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.f()
            return r1
        L1b:
            r7.f26197o = r2
            r7.f26195m = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            m.d1 r4 = r7.f26187d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            j2.a r9 = r7.f26185b
            r9.f26176c = r0
            r9.f26177d = r8
            boolean r8 = r7.f26198p
            if (r8 != 0) goto L7e
            boolean r8 = r7.g()
            if (r8 == 0) goto L7e
            ac.g r8 = r7.f26188e
            if (r8 != 0) goto L62
            ac.g r8 = new ac.g
            r9 = 12
            r8.<init>(r9, r7)
            r7.f26188e = r8
        L62:
            r7.f26198p = r2
            r7.f26196n = r2
            boolean r8 = r7.f26195m
            if (r8 != 0) goto L77
            int r8 = r7.i
            if (r8 <= 0) goto L77
            ac.g r9 = r7.f26188e
            long r5 = (long) r8
            java.lang.reflect.Field r8 = g2.n0.f19900a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            ac.g r8 = r7.f26188e
            r8.run()
        L7c:
            r7.f26195m = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
