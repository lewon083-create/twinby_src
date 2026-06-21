package ac;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.auth.m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.a f741b;

    public /* synthetic */ d(r1.a aVar, int i) {
        this.f740a = i;
        this.f741b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // n2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f740a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            r1.a r6 = r4.f741b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f14651h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f14657o
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            r1.a r0 = r4.f741b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f14484a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.Y
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.V
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.b(android.view.View, int):boolean");
    }

    @Override // n2.f
    public final int clampViewPositionHorizontal(View view, int i, int i10) {
        switch (this.f740a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f741b;
                return m.e(i, sideSheetBehavior.f14644a.h(), sideSheetBehavior.f14655m);
        }
    }

    @Override // n2.f
    public final int clampViewPositionVertical(View view, int i, int i10) {
        switch (this.f740a) {
            case 0:
                return m.e(i, ((BottomSheetBehavior) this.f741b).w(), getViewVerticalDragRange(view));
            default:
                return view.getTop();
        }
    }

    @Override // n2.f
    public int getViewHorizontalDragRange(View view) {
        switch (this.f740a) {
            case 1:
                return ((SideSheetBehavior) this.f741b).f14655m;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // n2.f
    public int getViewVerticalDragRange(View view) {
        switch (this.f740a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f741b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // n2.f
    public final void onViewDragStateChanged(int i) {
        switch (this.f740a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f741b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.A(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f741b;
                    if (sideSheetBehavior.f14650g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    @Override // n2.f
    public final void onViewPositionChanged(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f740a) {
            case 0:
                ((BottomSheetBehavior) this.f741b).t(i10);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f741b;
                WeakReference weakReference = sideSheetBehavior.f14658p;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    m4.d dVar = sideSheetBehavior.f14644a;
                    int left = view.getLeft();
                    view.getRight();
                    int i13 = ((SideSheetBehavior) dVar.f28630b).f14655m;
                    if (left <= i13) {
                        marginLayoutParams.rightMargin = i13 - left;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f14662t;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                m4.d dVar2 = sideSheetBehavior.f14644a;
                Object obj = dVar2.f28630b;
                dVar2.h();
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw om1.i(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    @Override // n2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewReleased(android.view.View r8, float r9, float r10) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.onViewReleased(android.view.View, float, float):void");
    }
}
