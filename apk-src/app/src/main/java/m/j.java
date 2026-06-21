package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.twinby.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l.i f28263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f28264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l.o f28265f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMenuView f28267h;
    public h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f28268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f28275q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f28277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f28278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0.i f28279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f28280v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28266g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f28276r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f28281w = new i(this);

    public j(Context context) {
        this.f28261b = context;
        this.f28264e = LayoutInflater.from(context);
    }

    @Override // l.p
    public final boolean a(l.j jVar) {
        return false;
    }

    @Override // l.p
    public final void b(l.i iVar, boolean z5) {
        j();
        f fVar = this.f28278t;
        if (fVar != null && fVar.b()) {
            fVar.i.dismiss();
        }
        l.o oVar = this.f28265f;
        if (oVar != null) {
            oVar.b(iVar, z5);
        }
    }

    @Override // l.p
    public final boolean c() {
        int size;
        ArrayList arrayListK;
        int i;
        boolean z5;
        j jVar = this;
        l.i iVar = jVar.f28263d;
        if (iVar != null) {
            arrayListK = iVar.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i10 = jVar.f28274p;
        int i11 = jVar.f28273o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = jVar.f28267h;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i = 2;
            z5 = true;
            if (i12 >= size) {
                break;
            }
            l.j jVar2 = (l.j) arrayListK.get(i12);
            int i15 = jVar2.f27671y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z10 = true;
            }
            if (jVar.f28275q && jVar2.B) {
                i10 = 0;
            }
            i12++;
        }
        if (jVar.f28270l && (z10 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = jVar.f28276r;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            l.j jVar3 = (l.j) arrayListK.get(i17);
            int i19 = jVar3.f27671y;
            boolean z11 = (i19 & 2) == i ? z5 : false;
            int i20 = jVar3.f27649b;
            if (z11) {
                View viewI = jVar.i(jVar3, null, actionMenuView);
                viewI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewI.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z5);
                }
                jVar3.d(z5);
            } else if ((i19 & 1) == z5) {
                boolean z12 = sparseBooleanArray.get(i20);
                boolean z13 = ((i16 > 0 || z12) && i11 > 0) ? z5 : false;
                if (z13) {
                    View viewI2 = jVar.i(jVar3, null, actionMenuView);
                    viewI2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewI2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z13 &= i11 + i18 > 0;
                }
                if (z13 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z12) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        l.j jVar4 = (l.j) arrayListK.get(i21);
                        if (jVar4.f27649b == i20) {
                            if ((jVar4.f27670x & 32) == 32) {
                                i16++;
                            }
                            jVar4.d(false);
                        }
                    }
                }
                if (z13) {
                    i16--;
                }
                jVar3.d(z13);
            } else {
                jVar3.d(false);
                i17++;
                i = 2;
                jVar = this;
                z5 = true;
            }
            i17++;
            i = 2;
            jVar = this;
            z5 = true;
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.p
    public final void d() {
        int i;
        ActionMenuView actionMenuView = this.f28267h;
        ArrayList arrayList = null;
        boolean z5 = false;
        if (actionMenuView != null) {
            l.i iVar = this.f28263d;
            if (iVar != null) {
                iVar.i();
                ArrayList arrayListK = this.f28263d.k();
                int size = arrayListK.size();
                i = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.j jVar = (l.j) arrayListK.get(i10);
                    if ((jVar.f27670x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        l.j itemData = childAt instanceof l.q ? ((l.q) childAt).getItemData() : null;
                        View viewI = i(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            viewI.setPressed(false);
                            viewI.jumpDrawablesToCurrentState();
                        }
                        if (viewI != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewI.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewI);
                            }
                            this.f28267h.addView(viewI, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.i) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f28267h.requestLayout();
        l.i iVar2 = this.f28263d;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((l.j) arrayList2.get(i11)).getClass();
            }
        }
        l.i iVar3 = this.f28263d;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f27636j;
        }
        if (this.f28270l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z5 = !((l.j) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.i == null) {
                this.i = new h(this, this.f28261b);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.i.getParent();
            if (viewGroup2 != this.f28267h) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.i);
                }
                ActionMenuView actionMenuView2 = this.f28267h;
                h hVar = this.i;
                actionMenuView2.getClass();
                l lVarI = ActionMenuView.i();
                lVarI.f28285a = true;
                actionMenuView2.addView(hVar, lVarI);
            }
        } else {
            h hVar2 = this.i;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                ActionMenuView actionMenuView3 = this.f28267h;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.i);
                }
            }
        }
        this.f28267h.setOverflowReserved(this.f28270l);
    }

    @Override // l.p
    public final void e(l.o oVar) {
        throw null;
    }

    @Override // l.p
    public final void f(Context context, l.i iVar) {
        this.f28262c = context;
        LayoutInflater.from(context);
        this.f28263d = iVar;
        Resources resources = context.getResources();
        if (!this.f28271m) {
            this.f28270l = true;
        }
        int i = 2;
        this.f28272n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i = 4;
        } else if (i10 >= 360) {
            i = 3;
        }
        this.f28274p = i;
        int measuredWidth = this.f28272n;
        if (this.f28270l) {
            if (this.i == null) {
                h hVar = new h(this, this.f28261b);
                this.i = hVar;
                if (this.f28269k) {
                    hVar.setImageDrawable(this.f28268j);
                    this.f28268j = null;
                    this.f28269k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f28273o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.p
    public final boolean g(l.t tVar) {
        boolean z5;
        if (tVar.hasVisibleItems()) {
            l.t tVar2 = tVar;
            while (true) {
                l.i iVar = tVar2.f27703w;
                if (iVar == this.f28263d) {
                    break;
                }
                tVar2 = (l.t) iVar;
            }
            l.j jVar = tVar2.f27704x;
            ActionMenuView actionMenuView = this.f28267h;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof l.q) && ((l.q) childAt).getItemData() == jVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                tVar.f27704x.getClass();
                int size = tVar.f27633f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i10++;
                }
                f fVar = new f(this, this.f28262c, tVar, view);
                this.f28278t = fVar;
                fVar.f27681g = z5;
                l.k kVar = fVar.i;
                if (kVar != null) {
                    kVar.l(z5);
                }
                f fVar2 = this.f28278t;
                if (!fVar2.b()) {
                    if (fVar2.f27679e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                l.o oVar = this.f28265f;
                if (oVar != null) {
                    oVar.c(tVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.p
    public final boolean h(l.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View i(l.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.f27672z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((jVar.f27671y & 8) != 0 && view2 != null)) {
            l.q qVar = view instanceof l.q ? (l.q) view : (l.q) this.f28264e.inflate(this.f28266g, (ViewGroup) actionMenuView, false);
            qVar.b(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f28267h);
            if (this.f28280v == null) {
                this.f28280v = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.f28280v);
            view3 = (View) qVar;
        }
        view3.setVisibility(jVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof l)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    public final boolean j() {
        ActionMenuView actionMenuView;
        k0.i iVar = this.f28279u;
        if (iVar != null && (actionMenuView = this.f28267h) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f28279u = null;
            return true;
        }
        f fVar = this.f28277s;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.i.dismiss();
        }
        return true;
    }

    public final boolean k() {
        l.i iVar;
        if (!this.f28270l) {
            return false;
        }
        f fVar = this.f28277s;
        if ((fVar != null && fVar.b()) || (iVar = this.f28263d) == null || this.f28267h == null || this.f28279u != null) {
            return false;
        }
        iVar.i();
        if (iVar.f27636j.isEmpty()) {
            return false;
        }
        k0.i iVar2 = new k0.i(15, this, new f(this, this.f28262c, this.f28263d, this.i), false);
        this.f28279u = iVar2;
        this.f28267h.post(iVar2);
        return true;
    }
}
