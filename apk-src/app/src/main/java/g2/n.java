package g2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f19896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f19897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f19899e;

    public n(ViewGroup viewGroup) {
        this.f19897c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z5) {
        ViewParent viewParentE;
        if (this.f19898d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f19897c, f10, f11, z5);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f19898d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f19897c, f10, f11);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentE;
        int i12;
        int i13;
        if (!this.f19898d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f19897c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f19899e == null) {
                this.f19899e = new int[2];
            }
            iArr = this.f19899e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof o) {
            ((o) viewParentE).f(viewGroup, i, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i, i10, iArr3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f19898d && (viewParentE = e(i13)) != null) {
            if (i != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f19897c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f19899e == null) {
                        this.f19899e = new int[2];
                    }
                    int[] iArr4 = this.f19899e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof p) {
                    ((p) viewParentE).a(viewGroup, i, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof o) {
                        ((o) viewParentE).b(viewGroup, i, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i, i10, i11, i12);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e3);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f19895a;
        }
        if (i != 1) {
            return null;
        }
        return this.f19896b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f19898d) {
                View view = this.f19897c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z5 = parent instanceof o;
                    if (z5) {
                        zOnStartNestedScroll = ((o) parent).c(view2, view, i, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f19895a = parent;
                        } else if (i10 == 1) {
                            this.f19896b = parent;
                        }
                        if (z5) {
                            ((o) parent).d(view2, view, i, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e7) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z5 = viewParentE instanceof o;
            ViewGroup viewGroup = this.f19897c;
            if (z5) {
                ((o) viewParentE).e(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i == 0) {
                this.f19895a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f19896b = null;
            }
        }
    }
}
