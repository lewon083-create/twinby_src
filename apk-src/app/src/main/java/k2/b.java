package k2;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.auth.i;
import l7.o;
import m.n2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f26834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f26836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f26837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f26838h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f26834d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                i iVar = this.f26836f;
                if (iVar != null) {
                    cursor2.unregisterContentObserver(iVar);
                }
                a aVar = this.f26837g;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f26834d = cursor;
            if (cursor != null) {
                i iVar2 = this.f26836f;
                if (iVar2 != null) {
                    cursor.registerContentObserver(iVar2);
                }
                a aVar2 = this.f26837g;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f26835e = cursor.getColumnIndexOrThrow("_id");
                this.f26832b = true;
                notifyDataSetChanged();
            } else {
                this.f26835e = -1;
                this.f26832b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View f(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f26832b || (cursor = this.f26834d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f26832b) {
            return null;
        }
        this.f26834d.moveToPosition(i);
        if (view == null) {
            n2 n2Var = (n2) this;
            view = n2Var.f28311k.inflate(n2Var.f28310j, viewGroup, false);
        }
        a(view, this.f26834d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f26838h == null) {
            c cVar = new c();
            cVar.f26839a = this;
            this.f26838h = cVar;
        }
        return this.f26838h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f26832b || (cursor = this.f26834d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f26834d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f26832b && (cursor = this.f26834d) != null && cursor.moveToPosition(i)) {
            return this.f26834d.getLong(this.f26835e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f26832b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f26834d.moveToPosition(i)) {
            throw new IllegalStateException(o.i(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = f(viewGroup);
        }
        a(view, this.f26834d);
        return view;
    }
}
