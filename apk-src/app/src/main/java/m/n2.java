package m;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.twinby.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends k2.b implements View.OnClickListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f28309y = 0;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f28311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SearchView f28312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchableInfo f28313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f28314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap f28315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f28316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f28318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f28321u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f28322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f28324x;

    public n2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f26833c = true;
        this.f26834d = null;
        this.f26832b = false;
        this.f26835e = -1;
        this.f26836f = new com.google.android.gms.internal.auth.i(this);
        this.f26837g = new k2.a(0, this);
        this.f28310j = suggestionRowLayout;
        this.i = suggestionRowLayout;
        this.f28311k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f28317q = 1;
        this.f28319s = -1;
        this.f28320t = -1;
        this.f28321u = -1;
        this.f28322v = -1;
        this.f28323w = -1;
        this.f28324x = -1;
        this.f28312l = searchView;
        this.f28313m = searchableInfo;
        this.f28316p = searchView.getSuggestionCommitIconResId();
        this.f28314n = context;
        this.f28315o = weakHashMap;
    }

    public static String j(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.n2.a(android.view.View, android.database.Cursor):void");
    }

    @Override // k2.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f28319s = cursor.getColumnIndex("suggest_text_1");
                this.f28320t = cursor.getColumnIndex("suggest_text_2");
                this.f28321u = cursor.getColumnIndex("suggest_text_2_url");
                this.f28322v = cursor.getColumnIndex("suggest_icon_1");
                this.f28323w = cursor.getColumnIndex("suggest_icon_2");
                this.f28324x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // k2.b
    public final String c(Cursor cursor) {
        String strJ;
        String strJ2;
        if (cursor == null) {
            return null;
        }
        String strJ3 = j(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strJ3 != null) {
            return strJ3;
        }
        SearchableInfo searchableInfo = this.f28313m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strJ2 = j(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strJ2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strJ = j(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strJ;
    }

    @Override // k2.b
    public final View f(ViewGroup viewGroup) {
        View viewInflate = this.f28311k.inflate(this.i, viewGroup, false);
        viewInflate.setTag(new m2(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f28316p);
        return viewInflate;
    }

    public final Drawable g(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f28314n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // k2.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewInflate = this.f28311k.inflate(this.f28310j, viewGroup, false);
            if (viewInflate != null) {
                ((m2) viewInflate.getTag()).f28299a.setText(e3.toString());
            }
            return viewInflate;
        }
    }

    @Override // k2.b, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewF = f(viewGroup);
            ((m2) viewF.getTag()).f28299a.setText(e3.toString());
            return viewF;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable h(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.n2.h(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public final Cursor i(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f28314n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f26834d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f26834d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f28312l.o((CharSequence) tag);
        }
    }
}
