package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.internal.ads.pv1;
import com.google.android.gms.internal.ads.st1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import k6.a0;
import k6.b0;
import k6.c0;
import k6.e1;
import k6.f1;
import k6.h0;
import k6.u0;
import k6.v0;
import k6.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends i implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f1667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1672h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f1674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final st1 f1675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pv1 f1676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f1678o;

    public LinearLayoutManager(int i) {
        this.f1665a = 1;
        this.f1669e = false;
        this.f1670f = false;
        this.f1671g = false;
        this.f1672h = true;
        this.i = -1;
        this.f1673j = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f1674k = null;
        this.f1675l = new st1();
        this.f1676m = new pv1();
        this.f1677n = 2;
        this.f1678o = new int[2];
        setOrientation(i);
        assertNotInLayoutOrScroll(null);
        if (this.f1669e) {
            this.f1669e = false;
            requestLayout();
        }
    }

    public void A(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (this.f1671g == z5) {
            return;
        }
        this.f1671g = z5;
        requestLayout();
    }

    public final void B(int i, int i10, boolean z5, f1 f1Var) {
        int iK;
        this.f1666b.f27033l = this.f1667c.i() == 0 && this.f1667c.f() == 0;
        this.f1666b.f27028f = i;
        int[] iArr = this.f1678o;
        iArr[0] = 0;
        iArr[1] = 0;
        c(f1Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i == 1;
        a0 a0Var = this.f1666b;
        int i11 = z10 ? iMax2 : iMax;
        a0Var.f27030h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        a0Var.i = iMax;
        if (z10) {
            a0Var.f27030h = this.f1667c.h() + i11;
            View viewT = t();
            a0 a0Var2 = this.f1666b;
            a0Var2.f27027e = this.f1670f ? -1 : 1;
            int position = getPosition(viewT);
            a0 a0Var3 = this.f1666b;
            a0Var2.f27026d = position + a0Var3.f27027e;
            a0Var3.f27024b = this.f1667c.b(viewT);
            iK = this.f1667c.b(viewT) - this.f1667c.g();
        } else {
            View viewU = u();
            a0 a0Var4 = this.f1666b;
            a0Var4.f27030h = this.f1667c.k() + a0Var4.f27030h;
            a0 a0Var5 = this.f1666b;
            a0Var5.f27027e = this.f1670f ? 1 : -1;
            int position2 = getPosition(viewU);
            a0 a0Var6 = this.f1666b;
            a0Var5.f27026d = position2 + a0Var6.f27027e;
            a0Var6.f27024b = this.f1667c.e(viewU);
            iK = (-this.f1667c.e(viewU)) + this.f1667c.k();
        }
        a0 a0Var7 = this.f1666b;
        a0Var7.f27025c = i10;
        if (z5) {
            a0Var7.f27025c = i10 - iK;
        }
        a0Var7.f27029g = iK;
    }

    public final void C(int i, int i10) {
        this.f1666b.f27025c = this.f1667c.g() - i10;
        a0 a0Var = this.f1666b;
        a0Var.f27027e = this.f1670f ? -1 : 1;
        a0Var.f27026d = i;
        a0Var.f27028f = 1;
        a0Var.f27024b = i10;
        a0Var.f27029g = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    }

    public final void D(int i, int i10) {
        this.f1666b.f27025c = i10 - this.f1667c.k();
        a0 a0Var = this.f1666b;
        a0Var.f27026d = i;
        a0Var.f27027e = this.f1670f ? 1 : -1;
        a0Var.f27028f = -1;
        a0Var.f27024b = i10;
        a0Var.f27029g = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    }

    @Override // androidx.recyclerview.widget.i
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f1674k == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void c(f1 f1Var, int[] iArr) {
        int i;
        int iL = f1Var.f27064a != -1 ? this.f1667c.l() : 0;
        if (this.f1666b.f27028f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean canScrollHorizontally() {
        return this.f1665a == 0;
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean canScrollVertically() {
        return this.f1665a == 1;
    }

    @Override // androidx.recyclerview.widget.i
    public final void collectAdjacentPrefetchPositions(int i, int i10, f1 f1Var, u0 u0Var) {
        if (this.f1665a != 0) {
            i = i10;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        i();
        B(i > 0 ? 1 : -1, Math.abs(i), true, f1Var);
        d(f1Var, this.f1666b, (c) u0Var);
    }

    @Override // androidx.recyclerview.widget.i
    public final void collectInitialPrefetchPositions(int i, u0 u0Var) {
        boolean z5;
        int i10;
        b0 b0Var = this.f1674k;
        if (b0Var == null || (i10 = b0Var.f27037b) < 0) {
            z();
            z5 = this.f1670f;
            i10 = this.i;
            if (i10 == -1) {
                i10 = z5 ? i - 1 : 0;
            }
        } else {
            z5 = b0Var.f27039d;
        }
        int i11 = z5 ? -1 : 1;
        for (int i12 = 0; i12 < this.f1677n && i10 >= 0 && i10 < i; i12++) {
            ((c) u0Var).a(i10, 0);
            i10 += i11;
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final int computeHorizontalScrollExtent(f1 f1Var) {
        return e(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeHorizontalScrollOffset(f1 f1Var) {
        return f(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeHorizontalScrollRange(f1 f1Var) {
        return g(f1Var);
    }

    @Override // k6.e1
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = (i < getPosition(getChildAt(0))) != this.f1670f ? -1 : 1;
        return this.f1665a == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.i
    public final int computeVerticalScrollExtent(f1 f1Var) {
        return e(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeVerticalScrollOffset(f1 f1Var) {
        return f(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeVerticalScrollRange(f1 f1Var) {
        return g(f1Var);
    }

    public void d(f1 f1Var, a0 a0Var, c cVar) {
        int i = a0Var.f27026d;
        if (i < 0 || i >= f1Var.b()) {
            return;
        }
        cVar.a(i, Math.max(0, a0Var.f27029g));
    }

    public final int e(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        h0 h0Var = this.f1667c;
        boolean z5 = !this.f1672h;
        return k6.b.a(f1Var, h0Var, l(z5), k(z5), this, this.f1672h);
    }

    public final int f(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        h0 h0Var = this.f1667c;
        boolean z5 = !this.f1672h;
        return k6.b.b(f1Var, h0Var, l(z5), k(z5), this, this.f1672h, this.f1670f);
    }

    @Override // androidx.recyclerview.widget.i
    public final View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public final int g(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        i();
        h0 h0Var = this.f1667c;
        boolean z5 = !this.f1672h;
        return k6.b.c(f1Var, h0Var, l(z5), k(z5), this, this.f1672h);
    }

    @Override // androidx.recyclerview.widget.i
    public w0 generateDefaultLayoutParams() {
        return new w0(-2, -2);
    }

    public final int h(int i) {
        if (i == 1) {
            return (this.f1665a != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f1665a != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f1665a == 0) {
                return -1;
            }
            return VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if (i == 33) {
            if (this.f1665a == 1) {
                return -1;
            }
            return VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if (i == 66) {
            if (this.f1665a == 0) {
                return 1;
            }
            return VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if (i == 130 && this.f1665a == 1) {
            return 1;
        }
        return VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    }

    public final void i() {
        if (this.f1666b == null) {
            a0 a0Var = new a0();
            a0Var.f27023a = true;
            a0Var.f27030h = 0;
            a0Var.i = 0;
            a0Var.f27032k = null;
            this.f1666b = a0Var;
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int j(k kVar, a0 a0Var, f1 f1Var, boolean z5) {
        int i;
        int i10 = a0Var.f27025c;
        int i11 = a0Var.f27029g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f27029g = i11 + i10;
            }
            x(kVar, a0Var);
        }
        int i12 = a0Var.f27025c + a0Var.f27030h;
        while (true) {
            if ((!a0Var.f27033l && i12 <= 0) || (i = a0Var.f27026d) < 0 || i >= f1Var.b()) {
                break;
            }
            pv1 pv1Var = this.f1676m;
            pv1Var.f9192a = 0;
            pv1Var.f9193b = false;
            pv1Var.f9194c = false;
            pv1Var.f9195d = false;
            v(kVar, f1Var, a0Var, pv1Var);
            if (!pv1Var.f9193b) {
                int i13 = a0Var.f27024b;
                int i14 = pv1Var.f9192a;
                a0Var.f27024b = (a0Var.f27028f * i14) + i13;
                if (!pv1Var.f9194c || a0Var.f27032k != null || !f1Var.f27070g) {
                    a0Var.f27025c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f27029g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f27029g = i16;
                    int i17 = a0Var.f27025c;
                    if (i17 < 0) {
                        a0Var.f27029g = i16 + i17;
                    }
                    x(kVar, a0Var);
                }
                if (z5 && pv1Var.f9195d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.f27025c;
    }

    public final View k(boolean z5) {
        return this.f1670f ? p(0, getChildCount(), z5) : p(getChildCount() - 1, -1, z5);
    }

    public final View l(boolean z5) {
        return this.f1670f ? p(getChildCount() - 1, -1, z5) : p(0, getChildCount(), z5);
    }

    public final int m() {
        View viewP = p(0, getChildCount(), false);
        if (viewP == null) {
            return -1;
        }
        return getPosition(viewP);
    }

    public final int n() {
        View viewP = p(getChildCount() - 1, -1, false);
        if (viewP == null) {
            return -1;
        }
        return getPosition(viewP);
    }

    public final View o(int i, int i10) {
        int i11;
        int i12;
        i();
        if (i10 <= i && i10 >= i) {
            return getChildAt(i);
        }
        if (this.f1667c.e(getChildAt(i)) < this.f1667c.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.f1665a == 0 ? this.mHorizontalBoundCheck.a(i, i10, i11, i12) : this.mVerticalBoundCheck.a(i, i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.i
    public void onDetachedFromWindow(RecyclerView recyclerView, k kVar) {
        onDetachedFromWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.i
    public View onFocusSearchFailed(View view, int i, k kVar, f1 f1Var) {
        int iH;
        z();
        if (getChildCount() != 0 && (iH = h(i)) != Integer.MIN_VALUE) {
            i();
            B(iH, (int) (this.f1667c.l() * 0.33333334f), false, f1Var);
            a0 a0Var = this.f1666b;
            a0Var.f27029g = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            a0Var.f27023a = false;
            j(kVar, a0Var, f1Var, true);
            View viewO = iH == -1 ? this.f1670f ? o(getChildCount() - 1, -1) : o(0, getChildCount()) : this.f1670f ? o(0, getChildCount()) : o(getChildCount() - 1, -1);
            View viewU = iH == -1 ? u() : t();
            if (!viewU.hasFocusable()) {
                return viewO;
            }
            if (viewO != null) {
                return viewU;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(m());
            accessibilityEvent.setToIndex(n());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b1  */
    @Override // androidx.recyclerview.widget.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayoutChildren(androidx.recyclerview.widget.k r17, k6.f1 r18) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.k, k6.f1):void");
    }

    @Override // androidx.recyclerview.widget.i
    public void onLayoutCompleted(f1 f1Var) {
        this.f1674k = null;
        this.i = -1;
        this.f1673j = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f1675l.e();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof b0) {
            b0 b0Var = (b0) parcelable;
            this.f1674k = b0Var;
            if (this.i != -1) {
                b0Var.f27037b = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final Parcelable onSaveInstanceState() {
        b0 b0Var = this.f1674k;
        if (b0Var != null) {
            b0 b0Var2 = new b0();
            b0Var2.f27037b = b0Var.f27037b;
            b0Var2.f27038c = b0Var.f27038c;
            b0Var2.f27039d = b0Var.f27039d;
            return b0Var2;
        }
        b0 b0Var3 = new b0();
        if (getChildCount() <= 0) {
            b0Var3.f27037b = -1;
            return b0Var3;
        }
        i();
        boolean z5 = this.f1668d ^ this.f1670f;
        b0Var3.f27039d = z5;
        if (z5) {
            View viewT = t();
            b0Var3.f27038c = this.f1667c.g() - this.f1667c.b(viewT);
            b0Var3.f27037b = getPosition(viewT);
            return b0Var3;
        }
        View viewU = u();
        b0Var3.f27037b = getPosition(viewU);
        b0Var3.f27038c = this.f1667c.e(viewU) - this.f1667c.k();
        return b0Var3;
    }

    public final View p(int i, int i10, boolean z5) {
        i();
        int i11 = z5 ? 24579 : 320;
        return this.f1665a == 0 ? this.mHorizontalBoundCheck.a(i, i10, i11, 320) : this.mVerticalBoundCheck.a(i, i10, i11, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View q(androidx.recyclerview.widget.k r17, k6.f1 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.i()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            k6.h0 r7 = r0.f1667c
            int r7 = r7.k()
            k6.h0 r8 = r0.f1667c
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            k6.h0 r14 = r0.f1667c
            int r14 = r14.e(r12)
            k6.h0 r15 = r0.f1667c
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            k6.w0 r13 = (k6.w0) r13
            androidx.recyclerview.widget.p r13 = r13.f27220a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.q(androidx.recyclerview.widget.k, k6.f1, boolean, boolean):android.view.View");
    }

    public final int r(int i, k kVar, f1 f1Var, boolean z5) {
        int iG;
        int iG2 = this.f1667c.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(-iG2, kVar, f1Var);
        int i11 = i + i10;
        if (!z5 || (iG = this.f1667c.g() - i11) <= 0) {
            return i10;
        }
        this.f1667c.o(iG);
        return iG + i10;
    }

    public final int s(int i, k kVar, f1 f1Var, boolean z5) {
        int iK;
        int iK2 = i - this.f1667c.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(iK2, kVar, f1Var);
        int i11 = i + i10;
        if (!z5 || (iK = i11 - this.f1667c.k()) <= 0) {
            return i10;
        }
        this.f1667c.o(-iK);
        return i10 - iK;
    }

    public final int scrollBy(int i, k kVar, f1 f1Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        i();
        this.f1666b.f27023a = true;
        int i10 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        B(i10, iAbs, true, f1Var);
        a0 a0Var = this.f1666b;
        int iJ = j(kVar, a0Var, f1Var, false) + a0Var.f27029g;
        if (iJ < 0) {
            return 0;
        }
        if (iAbs > iJ) {
            i = i10 * iJ;
        }
        this.f1667c.o(-i);
        this.f1666b.f27031j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.i
    public int scrollHorizontallyBy(int i, k kVar, f1 f1Var) {
        if (this.f1665a == 1) {
            return 0;
        }
        return scrollBy(i, kVar, f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public final void scrollToPosition(int i) {
        this.i = i;
        this.f1673j = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        b0 b0Var = this.f1674k;
        if (b0Var != null) {
            b0Var.f27037b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.i
    public int scrollVerticallyBy(int i, k kVar, f1 f1Var) {
        if (this.f1665a == 0) {
            return 0;
        }
        return scrollBy(i, kVar, f1Var);
    }

    public final void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(l7.o.i(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.f1665a || this.f1667c == null) {
            h0 h0VarA = h0.a(this, i);
            this.f1667c = h0VarA;
            this.f1675l.f10390f = h0VarA;
            this.f1665a = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.i
    public void smoothScrollToPosition(RecyclerView recyclerView, f1 f1Var, int i) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.setTargetPosition(i);
        startSmoothScroll(c0Var);
    }

    @Override // androidx.recyclerview.widget.i
    public boolean supportsPredictiveItemAnimations() {
        return this.f1674k == null && this.f1668d == this.f1671g;
    }

    public final View t() {
        return getChildAt(this.f1670f ? 0 : getChildCount() - 1);
    }

    public final View u() {
        return getChildAt(this.f1670f ? getChildCount() - 1 : 0);
    }

    public void v(k kVar, f1 f1Var, a0 a0Var, pv1 pv1Var) {
        int i;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iD;
        int i13;
        int i14;
        View viewB = a0Var.b(kVar);
        if (viewB == null) {
            pv1Var.f9193b = true;
            return;
        }
        w0 w0Var = (w0) viewB.getLayoutParams();
        if (a0Var.f27032k == null) {
            if (this.f1670f == (a0Var.f27028f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.f1670f == (a0Var.f27028f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        pv1Var.f9192a = this.f1667c.c(viewB);
        if (this.f1665a == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.f1667c.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.f1667c.d(viewB) + paddingLeft;
            }
            if (a0Var.f27028f == -1) {
                i14 = a0Var.f27024b;
                i13 = i14 - pv1Var.f9192a;
            } else {
                i13 = a0Var.f27024b;
                i14 = pv1Var.f9192a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            i10 = i14;
            i = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.f1667c.d(viewB) + paddingTop;
            if (a0Var.f27028f == -1) {
                int i16 = a0Var.f27024b;
                i11 = i16 - pv1Var.f9192a;
                i = i16;
                i10 = iD2;
            } else {
                int i17 = a0Var.f27024b;
                i = pv1Var.f9192a + i17;
                i10 = iD2;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i11, i12, i, i10);
        if (w0Var.f27220a.isRemoved() || w0Var.f27220a.isUpdated()) {
            pv1Var.f9194c = true;
        }
        pv1Var.f9195d = viewB.hasFocusable();
    }

    public final void x(k kVar, a0 a0Var) {
        if (!a0Var.f27023a || a0Var.f27033l) {
            return;
        }
        int i = a0Var.f27029g;
        int i10 = a0Var.i;
        if (a0Var.f27028f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int iF = (this.f1667c.f() - i) + i10;
            if (this.f1670f) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (this.f1667c.e(childAt) < iF || this.f1667c.n(childAt) < iF) {
                        y(kVar, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt2 = getChildAt(i13);
                if (this.f1667c.e(childAt2) < iF || this.f1667c.n(childAt2) < iF) {
                    y(kVar, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i14 = i - i10;
        int childCount2 = getChildCount();
        if (!this.f1670f) {
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt3 = getChildAt(i15);
                if (this.f1667c.b(childAt3) > i14 || this.f1667c.m(childAt3) > i14) {
                    y(kVar, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = childCount2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View childAt4 = getChildAt(i17);
            if (this.f1667c.b(childAt4) > i14 || this.f1667c.m(childAt4) > i14) {
                y(kVar, i16, i17);
                return;
            }
        }
    }

    public final void y(k kVar, int i, int i10) {
        if (i == i10) {
            return;
        }
        if (i10 <= i) {
            while (i > i10) {
                removeAndRecycleViewAt(i, kVar);
                i--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i; i11--) {
                removeAndRecycleViewAt(i11, kVar);
            }
        }
    }

    public final void z() {
        if (this.f1665a == 1 || !isLayoutRTL()) {
            this.f1670f = this.f1669e;
        } else {
            this.f1670f = !this.f1669e;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f1665a = 1;
        this.f1669e = false;
        this.f1670f = false;
        this.f1671g = false;
        this.f1672h = true;
        this.i = -1;
        this.f1673j = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f1674k = null;
        this.f1675l = new st1();
        this.f1676m = new pv1();
        this.f1677n = 2;
        this.f1678o = new int[2];
        v0 properties = i.getProperties(context, attributeSet, i, i10);
        setOrientation(properties.f27189a);
        boolean z5 = properties.f27191c;
        assertNotInLayoutOrScroll(null);
        if (z5 != this.f1669e) {
            this.f1669e = z5;
            requestLayout();
        }
        A(properties.f27192d);
    }

    public void w(k kVar, f1 f1Var, st1 st1Var, int i) {
    }
}
