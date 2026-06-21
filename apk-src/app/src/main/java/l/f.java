package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.twinby.R;
import g2.n0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.v1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f27598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f27602g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f27604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f27605k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f27609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f27610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f27615u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f27617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f27618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f27619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f27620z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f27603h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fe.c f27606l = new fe.c(29, this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27607m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27608n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27616v = false;

    public f(Context context, View view, int i, boolean z5) {
        this.f27604j = new c(this, i);
        this.f27605k = new d(i, this);
        this.f27598c = context;
        this.f27609o = view;
        this.f27600e = i;
        this.f27601f = z5;
        Field field = n0.f19900a;
        this.f27611q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f27599d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f27602g = new Handler();
    }

    @Override // l.p
    public final void b(i iVar, boolean z5) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i)).f27596b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i10 = i + 1;
        if (i10 < arrayList.size()) {
            ((e) arrayList.get(i10)).f27596b.c(false);
        }
        e eVar = (e) arrayList.remove(i);
        i iVar2 = eVar.f27596b;
        v1 v1Var = eVar.f27595a;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = iVar2.f27645s;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.A) {
            v1Var.b();
            v1Var.setAnimationStyle(0);
        }
        v1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f27611q = ((e) arrayList.get(size2 - 1)).f27597c;
        } else {
            View view = this.f27609o;
            Field field = n0.f19900a;
            this.f27611q = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((e) arrayList.get(0)).f27596b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f27618x;
        if (oVar != null) {
            oVar.b(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f27619y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f27619y.removeGlobalOnLayoutListener(this.f27604j);
            }
            this.f27619y = null;
        }
        this.f27610p.removeOnAttachStateChangeListener(this.f27605k);
        this.f27620z.onDismiss();
    }

    @Override // l.p
    public final boolean c() {
        return false;
    }

    @Override // l.p
    public final void d() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f27595a.getListView().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.r
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i = size - 1; i >= 0; i--) {
                e eVar = eVarArr[i];
                if (eVar.f27595a.isShowing()) {
                    eVar.f27595a.dismiss();
                }
            }
        }
    }

    @Override // l.p
    public final void e(o oVar) {
        this.f27618x = oVar;
    }

    @Override // l.p
    public final boolean g(t tVar) {
        for (e eVar : this.i) {
            if (tVar == eVar.f27596b) {
                eVar.f27595a.getListView().requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        i(tVar);
        o oVar = this.f27618x;
        if (oVar != null) {
            oVar.c(tVar);
        }
        return true;
    }

    @Override // l.r
    public final ListView getListView() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) gf.a.g(1, arrayList)).f27595a.getListView();
    }

    @Override // l.k
    public final void i(i iVar) {
        iVar.b(this, this.f27598c);
        if (isShowing()) {
            r(iVar);
        } else {
            this.f27603h.add(iVar);
        }
    }

    @Override // l.r
    public final boolean isShowing() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f27595a.isShowing();
    }

    @Override // l.k
    public final void k(View view) {
        if (this.f27609o != view) {
            this.f27609o = view;
            int i = this.f27607m;
            Field field = n0.f19900a;
            this.f27608n = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // l.k
    public final void l(boolean z5) {
        this.f27616v = z5;
    }

    @Override // l.k
    public final void m(int i) {
        if (this.f27607m != i) {
            this.f27607m = i;
            View view = this.f27609o;
            Field field = n0.f19900a;
            this.f27608n = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // l.k
    public final void n(int i) {
        this.f27612r = true;
        this.f27614t = i;
    }

    @Override // l.k
    public final void o(PopupWindow.OnDismissListener onDismissListener) {
        this.f27620z = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i);
            if (!eVar.f27595a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (eVar != null) {
            eVar.f27596b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.k
    public final void p(boolean z5) {
        this.f27617w = z5;
    }

    @Override // l.k
    public final void q(int i) {
        this.f27613s = true;
        this.f27615u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(l.i r19) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.r(l.i):void");
    }

    @Override // l.r
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f27603h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r((i) it.next());
        }
        arrayList.clear();
        View view = this.f27609o;
        this.f27610p = view;
        if (view != null) {
            boolean z5 = this.f27619y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f27619y = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f27604j);
            }
            this.f27610p.addOnAttachStateChangeListener(this.f27605k);
        }
    }
}
