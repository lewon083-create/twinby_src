package u6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f34296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f34297c;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r rVar = this.f34296b;
        ViewGroup viewGroup = this.f34297c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!v.f34300c.remove(viewGroup)) {
            return true;
        }
        h1.e eVarB = v.b();
        ArrayList arrayList = (ArrayList) eVarB.get(viewGroup);
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            arrayList = new ArrayList();
            eVarB.put(viewGroup, arrayList);
        } else if (arrayList.size() > 0) {
            arrayList2 = new ArrayList(arrayList);
        }
        arrayList.add(rVar);
        rVar.addListener(new t(this, eVarB));
        rVar.captureValues(viewGroup, false);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((r) it.next()).resume(viewGroup);
            }
        }
        rVar.playTransition(viewGroup);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f34297c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        v.f34300c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) v.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r) it.next()).resume(viewGroup);
            }
        }
        this.f34296b.clearValues(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
