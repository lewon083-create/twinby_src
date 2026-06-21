package bf;

import a0.u;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.dl;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.l80;
import com.google.android.gms.internal.ads.nz;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.uh0;
import com.google.android.gms.internal.ads.ut0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.yv0;
import com.google.android.gms.internal.ads.zt0;
import com.google.android.gms.internal.measurement.j4;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.UUID;
import md.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, uh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f2120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Serializable f2122h;

    public /* synthetic */ i(String str, String str2, String str3, int i, WebView webView, String str4, int i10) {
        this.f2116b = str;
        this.f2119e = str2;
        this.f2120f = str3;
        this.f2117c = i;
        this.f2121g = webView;
        this.f2122h = str4;
        this.f2118d = i10;
    }

    @Override // bf.h
    public synchronized void b(f fVar) {
        ((LinkedList) this.f2119e).add(fVar);
        Iterator it = new HashSet((HashSet) this.f2120f).iterator();
        while (it.hasNext()) {
            i((g) it.next());
        }
    }

    @Override // bf.h
    public synchronized void c() {
        try {
            for (g gVar : (HashSet) this.f2120f) {
                synchronized (gVar) {
                    HandlerThread handlerThread = gVar.f2112c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        gVar.f2112c = null;
                        gVar.f2113d = null;
                    }
                }
            }
            for (g gVar2 : (HashSet) this.f2121g) {
                synchronized (gVar2) {
                    HandlerThread handlerThread2 = gVar2.f2112c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        gVar2.f2112c = null;
                        gVar2.f2113d = null;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d(md.i iVar) {
        if (((HashSet) this.f2120f).contains(iVar.f28853a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2121g).add(iVar);
    }

    public md.b e() {
        if (((md.e) this.f2119e) != null) {
            return new md.b((String) this.f2116b, new HashSet((HashSet) this.f2120f), new HashSet((HashSet) this.f2121g), this.f2117c, this.f2118d, (md.e) this.f2119e, (HashSet) this.f2122h);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized f f(g gVar) {
        f fVar;
        g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f2119e).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (f) listIterator.next();
                gVar2 = fVar.a() != null ? (g) ((HashMap) this.f2122h).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void g(int i) {
        if (!(this.f2117c == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f2117c = i;
    }

    @Override // com.google.android.gms.internal.ads.uh0
    public Object h() {
        String str = (String) this.f2116b;
        String str2 = (String) this.f2119e;
        String str3 = (String) this.f2120f;
        int i = this.f2117c;
        WebView webView = (WebView) this.f2121g;
        String str4 = (String) this.f2122h;
        int i10 = this.f2118d;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        dl dlVar = new dl(str, str2);
        zt0 zt0VarO = l80.o("javascript");
        zt0 zt0VarO2 = l80.o(str3);
        vt0 vt0VarQ = l80.q(u.d(i));
        zt0 zt0Var = zt0.NONE;
        if (zt0VarO == zt0Var) {
            u9.i.h("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (vt0VarQ == null) {
            u9.i.h("Omid js session error; Unable to parse creative type: ".concat(u.x(i)));
            return null;
        }
        if (vt0VarQ == vt0.VIDEO && zt0VarO2 == zt0Var) {
            u9.i.h("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str3)));
            return null;
        }
        k7 k7Var = new k7(dlVar, webView, str4, "", tt0.JAVASCRIPT);
        yv0 yv0VarB = yv0.b(vt0VarQ, l80.p(u.e(i10)), zt0VarO, zt0VarO2, true);
        if (nz.A.f12499c) {
            return new wh0(new ut0(yv0VarB, k7Var, UUID.randomUUID().toString()), k7Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public synchronized void i(g gVar) {
        try {
            f fVarF = f(gVar);
            if (fVarF != null) {
                ((HashSet) this.f2121g).add(gVar);
                ((HashSet) this.f2120f).remove(gVar);
                if (fVarF.a() != null) {
                    ((HashMap) this.f2122h).put(fVarF.a(), gVar);
                }
                gVar.f2113d.post(new a0.d(12, gVar, fVarF));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // bf.h
    public synchronized void start() {
        for (int i = 0; i < this.f2117c; i++) {
            g gVar = new g(((String) this.f2116b) + i, this.f2118d);
            gVar.a(new a0.d(13, this, gVar));
            ((HashSet) this.f2120f).add(gVar);
        }
    }

    public i(int i, int i10) {
        this.f2119e = new LinkedList();
        this.f2120f = new HashSet();
        this.f2121g = new HashSet();
        this.f2122h = new HashMap();
        this.f2116b = "Sqflite";
        this.f2117c = i;
        this.f2118d = i10;
    }

    public i(Class cls, Class[] clsArr) {
        this.f2116b = null;
        HashSet hashSet = new HashSet();
        this.f2120f = hashSet;
        this.f2121g = new HashSet();
        this.f2117c = 0;
        this.f2118d = 0;
        this.f2122h = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            j4.e(cls2, "Null interface");
            ((HashSet) this.f2120f).add(q.a(cls2));
        }
    }

    public i(q qVar, q[] qVarArr) {
        this.f2116b = null;
        HashSet hashSet = new HashSet();
        this.f2120f = hashSet;
        this.f2121g = new HashSet();
        this.f2117c = 0;
        this.f2118d = 0;
        this.f2122h = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            j4.e(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2120f, qVarArr);
    }

    public i(Integer num, int i, Boolean bool, Integer num2, int i10, Integer num3, Boolean bool2) {
        this.f2116b = num;
        this.f2117c = i;
        this.f2119e = bool;
        this.f2120f = num2;
        this.f2118d = i10;
        this.f2121g = num3;
        this.f2122h = bool2;
    }
}
