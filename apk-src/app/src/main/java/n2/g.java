package n2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import java.util.Arrays;
import k6.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k0 f29014v = new k0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29016b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f29018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f29019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f29020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f29021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f29022h;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f29023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f29025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f29026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f29027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f29028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f29029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f29030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f29031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewGroup f29033t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29017c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ac.g f29034u = new ac.g(21, this);

    public g(Context context, ViewGroup viewGroup, f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f29033t = viewGroup;
        this.f29030q = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f29028o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f29016b = viewConfiguration.getScaledTouchSlop();
        this.f29026m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29027n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29029p = new OverScroller(context, f29014v);
    }

    public final void a() {
        this.f29017c = -1;
        float[] fArr = this.f29018d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f29019e, 0.0f);
            Arrays.fill(this.f29020f, 0.0f);
            Arrays.fill(this.f29021g, 0.0f);
            Arrays.fill(this.f29022h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f29023j, 0);
            this.f29024k = 0;
        }
        VelocityTracker velocityTracker = this.f29025l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29025l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f29033t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f29031r = view;
        this.f29017c = i;
        this.f29030q.onViewCaptured(view, i);
        p(1);
    }

    public final boolean c(float f10, float f11, int i, int i10) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f29022h[i] & i10) == i10 && (0 & i10) != 0 && (this.f29023j[i] & i10) != i10 && (this.i[i] & i10) != i10) {
            float f12 = this.f29016b;
            if (fAbs > f12 || fAbs2 > f12) {
                if (fAbs < fAbs2 * 0.5f && this.f29030q.onEdgeLock(i10)) {
                    int[] iArr = this.f29023j;
                    iArr[i] = iArr[i] | i10;
                    return false;
                }
                if ((this.i[i] & i10) == 0 && fAbs > this.f29016b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L45
        L4:
            n2.f r1 = r4.f29030q
            int r2 = r1.getViewHorizontalDragRange(r5)
            r3 = 1
            if (r2 <= 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r0
        L10:
            int r5 = r1.getViewVerticalDragRange(r5)
            if (r5 <= 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r0
        L19:
            if (r2 == 0) goto L29
            if (r5 == 0) goto L29
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r5 = r4.f29016b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L29:
            if (r2 == 0) goto L37
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f29016b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L37:
            if (r5 == 0) goto L45
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.f29016b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
        L44:
            return r3
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.d(android.view.View, float, float):boolean");
    }

    public final void e(int i) {
        float[] fArr = this.f29018d;
        if (fArr != null) {
            int i10 = this.f29024k;
            int i11 = 1 << i;
            if ((i10 & i11) != 0) {
                fArr[i] = 0.0f;
                this.f29019e[i] = 0.0f;
                this.f29020f[i] = 0.0f;
                this.f29021g[i] = 0.0f;
                this.f29022h[i] = 0;
                this.i[i] = 0;
                this.f29023j[i] = 0;
                this.f29024k = (~i11) & i10;
            }
        }
    }

    public final int f(int i, int i10, int i11) {
        if (i == 0) {
            return 0;
        }
        float width = this.f29033t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i11) + 1.0f) * 256.0f), VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION);
    }

    public final boolean g() {
        if (this.f29015a == 2) {
            OverScroller overScroller = this.f29029p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f29031r.getLeft();
            int top = currY - this.f29031r.getTop();
            if (left != 0) {
                View view = this.f29031r;
                Field field = n0.f19900a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f29031r;
                Field field2 = n0.f19900a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f29030q.onViewPositionChanged(this.f29031r, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f29033t.post(this.f29034u);
            }
        }
        return this.f29015a == 2;
    }

    public final View h(int i, int i10) {
        ViewGroup viewGroup = this.f29033t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f29030q.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f29031r.getLeft();
        int top = this.f29031r.getTop();
        int i13 = i - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f29029p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f29031r;
        int i15 = (int) this.f29027n;
        int i16 = (int) this.f29026m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i15) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i17 = iAbs5 + iAbs6;
        int i18 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f10 = iAbs5;
            f11 = i17;
        } else {
            f10 = iAbs3;
            f11 = i18;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = iAbs6;
            f13 = i17;
        } else {
            f12 = iAbs4;
            f13 = i18;
        }
        float f15 = f12 / f13;
        f fVar = this.f29030q;
        overScroller.startScroll(left, top, i13, i14, (int) ((f(i14, i12, fVar.getViewVerticalDragRange(view)) * f15) + (f(i13, i11, fVar.getViewHorizontalDragRange(view)) * f14)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f29024k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f29025l == null) {
            this.f29025l = VelocityTracker.obtain();
        }
        this.f29025l.addMovement(motionEvent);
        f fVar = this.f29030q;
        int i10 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x10, (int) y7);
            n(x10, y7, pointerId);
            s(viewH, pointerId);
            int i11 = this.f29022h[pointerId] & 0;
            if (i11 != 0) {
                fVar.onEdgeTouched(i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f29015a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f29015a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if (j(pointerId2)) {
                        float x11 = motionEvent.getX(i10);
                        float y10 = motionEvent.getY(i10);
                        float f10 = x11 - this.f29018d[pointerId2];
                        float f11 = y10 - this.f29019e[pointerId2];
                        m(f10, f11, pointerId2);
                        if (this.f29015a != 1) {
                            View viewH2 = h((int) x11, (int) y10);
                            if (d(viewH2, f10, f11) && s(viewH2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f29017c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f29017c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f29020f;
                int i12 = this.f29017c;
                int i13 = (int) (x12 - fArr[i12]);
                int i14 = (int) (y11 - this.f29021g[i12]);
                int left = this.f29031r.getLeft() + i13;
                int top = this.f29031r.getTop() + i14;
                int left2 = this.f29031r.getLeft();
                int top2 = this.f29031r.getTop();
                if (i13 != 0) {
                    left = fVar.clampViewPositionHorizontal(this.f29031r, left, i13);
                    Field field = n0.f19900a;
                    this.f29031r.offsetLeftAndRight(left - left2);
                }
                int i15 = left;
                if (i14 != 0) {
                    top = fVar.clampViewPositionVertical(this.f29031r, top, i14);
                    Field field2 = n0.f19900a;
                    this.f29031r.offsetTopAndBottom(top - top2);
                }
                int i16 = top;
                if (i13 != 0 || i14 != 0) {
                    this.f29030q.onViewPositionChanged(this.f29031r, i15, i16, i15 - left2, i16 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f29015a == 1) {
                this.f29032s = true;
                fVar.onViewReleased(this.f29031r, 0.0f, 0.0f);
                this.f29032s = false;
                if (this.f29015a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f29015a == 1 && pointerId3 == this.f29017c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f29017c) {
                        View viewH3 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.f29031r;
                        if (viewH3 == view && s(view, pointerId4)) {
                            i = this.f29017c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x13 = motionEvent.getX(actionIndex);
        float y12 = motionEvent.getY(actionIndex);
        n(x13, y12, pointerId5);
        if (this.f29015a == 0) {
            s(h((int) x13, (int) y12), pointerId5);
            int i17 = this.f29022h[pointerId5] & 0;
            if (i17 != 0) {
                fVar.onEdgeTouched(i17, pointerId5);
                return;
            }
            return;
        }
        int i18 = (int) x13;
        int i19 = (int) y12;
        View view2 = this.f29031r;
        if (view2 != null && i18 >= view2.getLeft() && i18 < view2.getRight() && i19 >= view2.getTop() && i19 < view2.getBottom()) {
            i10 = 1;
        }
        if (i10 != 0) {
            s(this.f29031r, pointerId5);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f29025l;
        float f10 = this.f29026m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f29025l.getXVelocity(this.f29017c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f29027n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f29025l.getYVelocity(this.f29017c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f29032s = true;
        this.f29030q.onViewReleased(this.f29031r, xVelocity, f10);
        this.f29032s = false;
        if (this.f29015a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(float f10, float f11, int i) {
        boolean zC = c(f10, f11, i, 1);
        ?? r02 = zC;
        if (c(f11, f10, i, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f10, f11, i, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f11, f10, i, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r04;
            this.f29030q.getClass();
        }
    }

    public final void n(float f10, float f11, int i) {
        float[] fArr = this.f29018d;
        if (fArr == null || fArr.length <= i) {
            int i10 = i + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f29019e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f29020f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f29021g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29022h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f29023j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f29018d = fArr2;
            this.f29019e = fArr3;
            this.f29020f = fArr4;
            this.f29021g = fArr5;
            this.f29022h = iArr;
            this.i = iArr2;
            this.f29023j = iArr3;
        }
        float[] fArr9 = this.f29018d;
        this.f29020f[i] = f10;
        fArr9[i] = f10;
        float[] fArr10 = this.f29019e;
        this.f29021g[i] = f11;
        fArr10[i] = f11;
        int[] iArr7 = this.f29022h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        ViewGroup viewGroup = this.f29033t;
        int left = viewGroup.getLeft();
        int i13 = this.f29028o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < viewGroup.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > viewGroup.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > viewGroup.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i] = i14;
        this.f29024k |= 1 << i;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i);
                float y7 = motionEvent.getY(i);
                this.f29020f[pointerId] = x10;
                this.f29021g[pointerId] = y7;
            }
        }
    }

    public final void p(int i) {
        this.f29033t.removeCallbacks(this.f29034u);
        if (this.f29015a != i) {
            this.f29015a = i;
            this.f29030q.onViewDragStateChanged(i);
            if (this.f29015a == 0) {
                this.f29031r = null;
            }
        }
    }

    public final boolean q(int i, int i10) {
        if (this.f29032s) {
            return i(i, i10, (int) this.f29025l.getXVelocity(this.f29017c), (int) this.f29025l.getYVelocity(this.f29017c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i) {
        if (view == this.f29031r && this.f29017c == i) {
            return true;
        }
        if (view == null || !this.f29030q.b(view, i)) {
            return false;
        }
        this.f29017c = i;
        b(view, i);
        return true;
    }
}
