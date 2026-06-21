package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements l.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l.i f28417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l.j f28418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f28419d;

    public z2(Toolbar toolbar) {
        this.f28419d = toolbar;
    }

    @Override // l.p
    public final boolean a(l.j jVar) {
        Toolbar toolbar = this.f28419d;
        toolbar.c();
        ViewParent parent = toolbar.i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.i);
            }
            toolbar.addView(toolbar.i);
        }
        View view = jVar.f27672z;
        if (view == null) {
            view = null;
        }
        toolbar.f1193j = view;
        this.f28418c = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1193j);
            }
            a3 a3VarG = Toolbar.g();
            a3VarG.f28158a = (toolbar.f1198o & 112) | 8388611;
            a3VarG.f28159b = 2;
            toolbar.f1193j.setLayoutParams(a3VarG);
            toolbar.addView(toolbar.f1193j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((a3) childAt.getLayoutParams()).f28159b != 2 && childAt != toolbar.f1186b) {
                toolbar.removeViewAt(childCount);
                toolbar.F.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.B = true;
        jVar.f27660n.o(false);
        KeyEvent.Callback callback = toolbar.f1193j;
        if (callback instanceof k.a) {
            SearchView searchView = (SearchView) ((k.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1149q;
            if (!searchView.f1142a0) {
                searchView.f1142a0 = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1143b0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // l.p
    public final boolean c() {
        return false;
    }

    @Override // l.p
    public final void d() {
        if (this.f28418c != null) {
            l.i iVar = this.f28417b;
            if (iVar != null) {
                int size = iVar.f27633f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f28417b.getItem(i) == this.f28418c) {
                        return;
                    }
                }
            }
            h(this.f28418c);
        }
    }

    @Override // l.p
    public final void f(Context context, l.i iVar) {
        l.j jVar;
        l.i iVar2 = this.f28417b;
        if (iVar2 != null && (jVar = this.f28418c) != null) {
            iVar2.d(jVar);
        }
        this.f28417b = iVar;
    }

    @Override // l.p
    public final boolean g(l.t tVar) {
        return false;
    }

    @Override // l.p
    public final boolean h(l.j jVar) {
        Toolbar toolbar = this.f28419d;
        KeyEvent.Callback callback = toolbar.f1193j;
        if (callback instanceof k.a) {
            SearchView searchView = (SearchView) ((k.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1149q;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.W = "";
            searchView.clearFocus();
            searchView.v(true);
            searchAutoComplete.setImeOptions(searchView.f1143b0);
            searchView.f1142a0 = false;
        }
        toolbar.removeView(toolbar.f1193j);
        toolbar.removeView(toolbar.i);
        toolbar.f1193j = null;
        ArrayList arrayList = toolbar.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f28418c = null;
        toolbar.requestLayout();
        jVar.B = false;
        jVar.f27660n.o(false);
        toolbar.t();
        return true;
    }

    @Override // l.p
    public final void b(l.i iVar, boolean z5) {
    }
}
