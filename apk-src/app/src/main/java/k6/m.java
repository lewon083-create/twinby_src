package k6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.recyclerview.widget.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f27117s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f27119h;
    public ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f27120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f27121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f27122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f27123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f27124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f27125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f27126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f27127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f27128r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.p) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.h
    public final boolean a(androidx.recyclerview.widget.p pVar, androidx.recyclerview.widget.p pVar2, r0 r0Var, r0 r0Var2) {
        int i;
        int i10;
        int i11 = r0Var.f27169a;
        int i12 = r0Var.f27170b;
        if (pVar2.shouldIgnore()) {
            int i13 = r0Var.f27169a;
            i10 = r0Var.f27170b;
            i = i13;
        } else {
            i = r0Var2.f27169a;
            i10 = r0Var2.f27170b;
        }
        if (pVar == pVar2) {
            return g(pVar, i11, i12, i, i10);
        }
        float translationX = pVar.itemView.getTranslationX();
        float translationY = pVar.itemView.getTranslationY();
        float alpha = pVar.itemView.getAlpha();
        l(pVar);
        pVar.itemView.setTranslationX(translationX);
        pVar.itemView.setTranslationY(translationY);
        pVar.itemView.setAlpha(alpha);
        l(pVar2);
        pVar2.itemView.setTranslationX(-((int) ((i - i11) - translationX)));
        pVar2.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        pVar2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f27121k;
        k kVar = new k();
        kVar.f27101a = pVar;
        kVar.f27102b = pVar2;
        kVar.f27103c = i11;
        kVar.f27104d = i12;
        kVar.f27105e = i;
        kVar.f27106f = i10;
        arrayList.add(kVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.h
    public final void d(androidx.recyclerview.widget.p pVar) {
        ArrayList arrayList = this.f27122l;
        ArrayList arrayList2 = this.f27123m;
        ArrayList arrayList3 = this.f27124n;
        View view = pVar.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f27120j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((l) arrayList4.get(size)).f27110a == pVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(pVar);
                arrayList4.remove(size);
            }
        }
        j(this.f27121k, pVar);
        if (this.f27119h.remove(pVar)) {
            view.setAlpha(1.0f);
            c(pVar);
        }
        if (this.i.remove(pVar)) {
            view.setAlpha(1.0f);
            c(pVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, pVar);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((l) arrayList6.get(size4)).f27110a == pVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(pVar);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(pVar)) {
                view.setAlpha(1.0f);
                c(pVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f27127q.remove(pVar);
        this.f27125o.remove(pVar);
        this.f27128r.remove(pVar);
        this.f27126p.remove(pVar);
        i();
    }

    @Override // androidx.recyclerview.widget.h
    public final void e() {
        ArrayList arrayList = this.f27124n;
        ArrayList arrayList2 = this.f27122l;
        ArrayList arrayList3 = this.f27123m;
        ArrayList arrayList4 = this.f27121k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f27119h;
        ArrayList arrayList7 = this.f27120j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            l lVar = (l) arrayList7.get(size);
            View view = lVar.f27110a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(lVar.f27110a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((androidx.recyclerview.widget.p) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            androidx.recyclerview.widget.p pVar = (androidx.recyclerview.widget.p) arrayList5.get(size3);
            pVar.itemView.setAlpha(1.0f);
            c(pVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            k kVar = (k) arrayList4.get(size4);
            androidx.recyclerview.widget.p pVar2 = kVar.f27101a;
            if (pVar2 != null) {
                k(kVar, pVar2);
            }
            androidx.recyclerview.widget.p pVar3 = kVar.f27102b;
            if (pVar3 != null) {
                k(kVar, pVar3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    l lVar2 = (l) arrayList8.get(size6);
                    View view2 = lVar2.f27110a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(lVar2.f27110a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    androidx.recyclerview.widget.p pVar4 = (androidx.recyclerview.widget.p) arrayList9.get(size8);
                    pVar4.itemView.setAlpha(1.0f);
                    c(pVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    k kVar2 = (k) arrayList10.get(size10);
                    androidx.recyclerview.widget.p pVar5 = kVar2.f27101a;
                    if (pVar5 != null) {
                        k(kVar2, pVar5);
                    }
                    androidx.recyclerview.widget.p pVar6 = kVar2.f27102b;
                    if (pVar6 != null) {
                        k(kVar2, pVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f27127q);
            h(this.f27126p);
            h(this.f27125o);
            h(this.f27128r);
            ArrayList arrayList11 = this.f1704b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.h
    public final boolean f() {
        return (this.i.isEmpty() && this.f27121k.isEmpty() && this.f27120j.isEmpty() && this.f27119h.isEmpty() && this.f27126p.isEmpty() && this.f27127q.isEmpty() && this.f27125o.isEmpty() && this.f27128r.isEmpty() && this.f27123m.isEmpty() && this.f27122l.isEmpty() && this.f27124n.isEmpty()) ? false : true;
    }

    public final boolean g(androidx.recyclerview.widget.p pVar, int i, int i10, int i11, int i12) {
        View view = pVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i10 + ((int) pVar.itemView.getTranslationY());
        l(pVar);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(pVar);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.f27120j;
        l lVar = new l();
        lVar.f27110a = pVar;
        lVar.f27111b = translationX;
        lVar.f27112c = translationY;
        lVar.f27113d = i11;
        lVar.f27114e = i12;
        arrayList.add(lVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1704b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, androidx.recyclerview.widget.p pVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k kVar = (k) arrayList.get(size);
            if (k(kVar, pVar) && kVar.f27101a == null && kVar.f27102b == null) {
                arrayList.remove(kVar);
            }
        }
    }

    public final boolean k(k kVar, androidx.recyclerview.widget.p pVar) {
        if (kVar.f27102b == pVar) {
            kVar.f27102b = null;
        } else {
            if (kVar.f27101a != pVar) {
                return false;
            }
            kVar.f27101a = null;
        }
        pVar.itemView.setAlpha(1.0f);
        pVar.itemView.setTranslationX(0.0f);
        pVar.itemView.setTranslationY(0.0f);
        c(pVar);
        return true;
    }

    public final void l(androidx.recyclerview.widget.p pVar) {
        if (f27117s == null) {
            f27117s = new ValueAnimator().getInterpolator();
        }
        pVar.itemView.animate().setInterpolator(f27117s);
        d(pVar);
    }
}
