package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f28377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f28378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1 f28379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l.j f28380q;

    public u1(Context context, boolean z5) {
        super(context, z5);
        if (1 == t1.a(context.getResources().getConfiguration())) {
            this.f28377n = 21;
            this.f28378o = 22;
        } else {
            this.f28377n = 22;
            this.f28378o = 21;
        }
    }

    @Override // m.d1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.g gVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f28379p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                gVar = (l.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (l.g) adapter;
                headersCount = 0;
            }
            l.j jVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= gVar.getCount()) ? null : gVar.getItem(i);
            l.j jVar = this.f28380q;
            if (jVar != jVarB) {
                l.i iVar = gVar.f27621b;
                if (jVar != null) {
                    this.f28379p.c(iVar, jVar);
                }
                this.f28380q = jVarB;
                if (jVarB != null) {
                    this.f28379p.l(iVar, jVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f28377n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f28378o) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.g) adapter).f27621b.c(false);
        return true;
    }

    public void setHoverListener(q1 q1Var) {
        this.f28379p = q1Var;
    }

    @Override // m.d1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
