package yads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb2 f39469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f39470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f39472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja f39476h;

    public ia(tb2 tb2Var, String str, List list) {
        ja jaVar = ja.f39792d;
        ArrayList arrayList = new ArrayList();
        this.f39471c = arrayList;
        this.f39472d = new HashMap();
        this.f39469a = tb2Var;
        this.f39470b = null;
        this.f39473e = str;
        this.f39476h = jaVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pd3 pd3Var = (pd3) it.next();
            this.f39472d.put(UUID.randomUUID().toString(), pd3Var);
        }
        this.f39475g = null;
        this.f39474f = null;
    }

    public final ja a() {
        return this.f39476h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.f39472d);
    }

    public final String c() {
        return this.f39473e;
    }

    public final WebView d() {
        return this.f39470b;
    }
}
