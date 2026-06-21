package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f27621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27622c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f27625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27626g;

    public g(i iVar, LayoutInflater layoutInflater, boolean z5, int i) {
        this.f27624e = z5;
        this.f27625f = layoutInflater;
        this.f27621b = iVar;
        this.f27626g = i;
        a();
    }

    public final void a() {
        i iVar = this.f27621b;
        j jVar = iVar.f27646t;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f27636j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((j) arrayList.get(i)) == jVar) {
                    this.f27622c = i;
                    return;
                }
            }
        }
        this.f27622c = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i) {
        ArrayList arrayListK;
        boolean z5 = this.f27624e;
        i iVar = this.f27621b;
        if (z5) {
            iVar.i();
            arrayListK = iVar.f27636j;
        } else {
            arrayListK = iVar.k();
        }
        int i10 = this.f27622c;
        if (i10 >= 0 && i >= i10) {
            i++;
        }
        return (j) arrayListK.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z5 = this.f27624e;
        i iVar = this.f27621b;
        if (z5) {
            iVar.i();
            arrayListK = iVar.f27636j;
        } else {
            arrayListK = iVar.k();
        }
        return this.f27622c < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f27625f.inflate(this.f27626g, viewGroup, false);
        }
        int i10 = getItem(i).f27649b;
        int i11 = i - 1;
        int i12 = i11 >= 0 ? getItem(i11).f27649b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f27621b.l() && i10 != i12) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        q qVar = (q) view;
        if (this.f27623d) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
