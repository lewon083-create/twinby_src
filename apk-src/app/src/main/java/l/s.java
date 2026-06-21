package l;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import m.v1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f27685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f27686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f27687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27690h;
    public final v1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f27691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f27692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f27693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f27694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f27695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f27696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f27697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27701t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27702u;

    public s(Context context, i iVar, View view, int i, boolean z5) {
        int i10 = 1;
        this.f27691j = new c(this, i10);
        this.f27692k = new d(i10, this);
        this.f27685c = context;
        this.f27686d = iVar;
        this.f27688f = z5;
        this.f27687e = new g(iVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f27690h = i;
        Resources resources = context.getResources();
        this.f27689g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f27694m = view;
        this.i = new v1(context, null, i);
        iVar.b(this, context);
    }

    @Override // l.p
    public final void b(i iVar, boolean z5) {
        if (iVar != this.f27686d) {
            return;
        }
        dismiss();
        o oVar = this.f27696o;
        if (oVar != null) {
            oVar.b(iVar, z5);
        }
    }

    @Override // l.p
    public final boolean c() {
        return false;
    }

    @Override // l.p
    public final void d() {
        this.f27699r = false;
        g gVar = this.f27687e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // l.r
    public final void dismiss() {
        if (isShowing()) {
            this.i.dismiss();
        }
    }

    @Override // l.p
    public final void e(o oVar) {
        this.f27696o = oVar;
    }

    @Override // l.p
    public final boolean g(t tVar) {
        boolean z5;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f27685c, tVar, this.f27695n, this.f27688f, this.f27690h, 0);
            o oVar = this.f27696o;
            nVar.f27682h = oVar;
            k kVar = nVar.i;
            if (kVar != null) {
                kVar.e(oVar);
            }
            int size = tVar.f27633f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = tVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i++;
            }
            nVar.f27681g = z5;
            k kVar2 = nVar.i;
            if (kVar2 != null) {
                kVar2.l(z5);
            }
            nVar.f27683j = this.f27693l;
            this.f27693l = null;
            this.f27686d.c(false);
            v1 v1Var = this.i;
            int horizontalOffset = v1Var.getHorizontalOffset();
            int verticalOffset = v1Var.getVerticalOffset();
            int i10 = this.f27701t;
            View view = this.f27694m;
            Field field = n0.f19900a;
            if ((Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.f27694m.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f27679e != null) {
                    nVar.d(horizontalOffset, verticalOffset, true, true);
                }
            }
            o oVar2 = this.f27696o;
            if (oVar2 != null) {
                oVar2.c(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // l.r
    public final ListView getListView() {
        return this.i.getListView();
    }

    @Override // l.r
    public final boolean isShowing() {
        return !this.f27698q && this.i.isShowing();
    }

    @Override // l.k
    public final void k(View view) {
        this.f27694m = view;
    }

    @Override // l.k
    public final void l(boolean z5) {
        this.f27687e.f27623d = z5;
    }

    @Override // l.k
    public final void m(int i) {
        this.f27701t = i;
    }

    @Override // l.k
    public final void n(int i) {
        this.i.setHorizontalOffset(i);
    }

    @Override // l.k
    public final void o(PopupWindow.OnDismissListener onDismissListener) {
        this.f27693l = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f27698q = true;
        this.f27686d.c(true);
        ViewTreeObserver viewTreeObserver = this.f27697p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f27697p = this.f27695n.getViewTreeObserver();
            }
            this.f27697p.removeGlobalOnLayoutListener(this.f27691j);
            this.f27697p = null;
        }
        this.f27695n.removeOnAttachStateChangeListener(this.f27692k);
        PopupWindow.OnDismissListener onDismissListener = this.f27693l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f27702u = z5;
    }

    @Override // l.k
    public final void q(int i) {
        this.i.setVerticalOffset(i);
    }

    @Override // l.r
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.f27698q || (view = this.f27694m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f27695n = view;
        v1 v1Var = this.i;
        v1Var.setOnDismissListener(this);
        v1Var.setOnItemClickListener(this);
        v1Var.setModal(true);
        View view2 = this.f27695n;
        boolean z5 = this.f27697p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f27697p = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f27691j);
        }
        view2.addOnAttachStateChangeListener(this.f27692k);
        v1Var.setAnchorView(view2);
        v1Var.setDropDownGravity(this.f27701t);
        boolean z10 = this.f27699r;
        Context context = this.f27685c;
        g gVar = this.f27687e;
        if (!z10) {
            this.f27700s = k.j(gVar, context, this.f27689g);
            this.f27699r = true;
        }
        v1Var.setContentWidth(this.f27700s);
        v1Var.setInputMethodMode(2);
        v1Var.setEpicenterBounds(this.f27673b);
        v1Var.show();
        ListView listView = v1Var.getListView();
        listView.setOnKeyListener(this);
        if (this.f27702u) {
            i iVar = this.f27686d;
            if (iVar.f27638l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f27638l);
                }
                frameLayout.setEnabled(false);
                listView.addHeaderView(frameLayout, null, false);
            }
        }
        v1Var.setAdapter(gVar);
        v1Var.show();
    }

    @Override // l.k
    public final void i(i iVar) {
    }
}
