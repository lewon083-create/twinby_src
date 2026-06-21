package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f27592c;

    public /* synthetic */ c(k kVar, int i) {
        this.f27591b = i;
        this.f27592c = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f27591b) {
            case 0:
                f fVar = (f) this.f27592c;
                ArrayList arrayList = fVar.i;
                if (fVar.isShowing() && arrayList.size() > 0 && !((e) arrayList.get(0)).f27595a.isModal()) {
                    View view = fVar.f27610p;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).f27595a.show();
                        }
                    } else {
                        fVar.dismiss();
                    }
                    break;
                }
                break;
            default:
                s sVar = (s) this.f27592c;
                if (sVar.isShowing() && !sVar.i.isModal()) {
                    View view2 = sVar.f27695n;
                    if (view2 != null && view2.isShown()) {
                        sVar.i.show();
                    } else {
                        sVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
