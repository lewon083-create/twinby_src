package k2;

import android.database.Cursor;
import android.widget.Filter;
import m.n2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f26839a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((n2) this.f26839a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            k2.b r0 = r4.f26839a
            m.n2 r0 = (m.n2) r0
            androidx.appcompat.widget.SearchView r1 = r0.f28312l
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            goto Lf
        Lb:
            java.lang.String r5 = r5.toString()
        Lf:
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L31
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L1d
            goto L31
        L1d:
            android.app.SearchableInfo r1 = r0.f28313m     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r5 = r0.i(r1, r5)     // Catch: java.lang.RuntimeException -> L29
            if (r5 == 0) goto L31
            r5.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L32
        L29:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L31:
            r5 = r3
        L32:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L42
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L47
        L42:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f26839a;
        Cursor cursor = bVar.f26834d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((n2) bVar).b((Cursor) obj);
    }
}
