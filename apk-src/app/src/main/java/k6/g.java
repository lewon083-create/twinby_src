package k6;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f27079d;

    public /* synthetic */ g(m mVar, ArrayList arrayList, int i) {
        this.f27077b = i;
        this.f27079d = mVar;
        this.f27078c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27077b) {
            case 0:
                ArrayList arrayList = this.f27078c;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    m mVar = this.f27079d;
                    if (!zHasNext) {
                        arrayList.clear();
                        mVar.f27123m.remove(arrayList);
                    } else {
                        l lVar = (l) it.next();
                        androidx.recyclerview.widget.p pVar = lVar.f27110a;
                        int i = lVar.f27111b;
                        int i10 = lVar.f27112c;
                        int i11 = lVar.f27113d;
                        int i12 = lVar.f27114e;
                        mVar.getClass();
                        View view = pVar.itemView;
                        int i13 = i11 - i;
                        int i14 = i12 - i10;
                        if (i13 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i14 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        mVar.f27126p.add(pVar);
                        viewPropertyAnimatorAnimate.setDuration(mVar.f1707e).setListener(new i(mVar, pVar, i13, view, i14, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = this.f27078c;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    m mVar2 = this.f27079d;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        mVar2.f27122l.remove(arrayList2);
                    } else {
                        androidx.recyclerview.widget.p pVar2 = (androidx.recyclerview.widget.p) it2.next();
                        mVar2.getClass();
                        View view2 = pVar2.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        mVar2.f27125o.add(pVar2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(mVar2.f1705c).setListener(new h(mVar2, pVar2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
