package yads;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fg2 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f38439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f38441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wz1 f38442d;

    public fg2(za zaVar, List list, lv lvVar, wz1 wz1Var) {
        this.f38439a = zaVar;
        this.f38440b = list;
        this.f38441c = lvVar;
        this.f38442d = wz1Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f38440b.size()) {
            return true;
        }
        za.a(this.f38439a, ((gu0) this.f38440b.get(itemId)).f38873b, n83.f41191c);
        lv lvVar = this.f38441c;
        eo2 eo2Var = eo2.f38212v;
        lvVar.getClass();
        lvVar.f40692d.a(lvVar.a(eo2Var, new HashMap()));
        this.f38442d.f44534a.a();
        return true;
    }
}
