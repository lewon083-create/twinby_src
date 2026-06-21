package wl;

import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.measurement.d4;
import io.sentry.SentryLockReason;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Mechanism;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f35362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vl.h f35363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f35364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kv0 f35366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f35367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f35368h;
    public k0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f35369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f35370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f35371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public vl.k f35373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public vl.n f35374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f35375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f35376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j0 f35377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f35380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f35356v = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f35357w = {"ol", "ul"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f35358x = {"button"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f35359y = {"html", "table"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f35360z = {"optgroup", "option"};
    public static final String[] A = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    public static final String[] B = {SentryLockReason.JsonKeys.ADDRESS, "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", SentryLogEvent.JsonKeys.BODY, "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", Mechanism.JsonKeys.META, "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    public static boolean u(ArrayList arrayList, vl.k kVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((vl.k) arrayList.get(size)) == kVar) {
                return true;
            }
        }
        return false;
    }

    public final void A(String str) {
        kv0 kv0Var = this.f35366f;
        k0 k0Var = this.i;
        if (kv0Var == k0Var) {
            k0 k0Var2 = new k0();
            k0Var2.x(str);
            x(k0Var2);
        } else {
            k0Var.m();
            k0Var.x(str);
            x(k0Var);
        }
    }

    public final void B(vl.k kVar) {
        int size = this.f35375p.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                vl.k kVar2 = (vl.k) this.f35375p.get(size);
                if (kVar2 == null) {
                    break;
                }
                if (kVar.f34922d.f35436a.equals(kVar2.o()) && kVar.d().equals(kVar2.d())) {
                    i++;
                }
                if (i == 3) {
                    this.f35375p.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f35375p.add(kVar);
    }

    public final void C() {
        boolean z5 = true;
        vl.k kVar = this.f35375p.size() > 0 ? (vl.k) gf.a.g(1, this.f35375p) : null;
        if (kVar == null || u(this.f35364d, kVar)) {
            return;
        }
        int size = this.f35375p.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            kVar = (vl.k) this.f35375p.get(i);
            if (kVar == null || u(this.f35364d, kVar)) {
                z5 = false;
                break;
            }
        }
        while (true) {
            if (!z5) {
                i++;
                kVar = (vl.k) this.f35375p.get(i);
            }
            k3.f.v(kVar);
            vl.k kVar2 = new vl.k(d0.a(kVar.o(), this.f35368h), this.f35365e, null);
            t(kVar2);
            this.f35364d.add(kVar2);
            kVar2.d().a(kVar.d());
            this.f35375p.set(i, kVar2);
            if (i == size) {
                return;
            } else {
                z5 = false;
            }
        }
    }

    public final void D(vl.k kVar) {
        for (int size = this.f35375p.size() - 1; size >= 0; size--) {
            if (((vl.k) this.f35375p.get(size)) == kVar) {
                this.f35375p.remove(size);
                return;
            }
        }
    }

    public final void E(vl.k kVar) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            if (((vl.k) this.f35364d.get(size)) == kVar) {
                this.f35364d.remove(size);
                return;
            }
        }
    }

    public final void F() {
        boolean z5 = false;
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) this.f35364d.get(size);
            if (size == 0) {
                kVar = null;
                z5 = true;
            }
            String strO = kVar.o();
            if ("select".equals(strO)) {
                this.f35370k = a0.f35347q;
                return;
            }
            if ("td".equals(strO) || ("th".equals(strO) && !z5)) {
                this.f35370k = a0.f35346p;
                return;
            }
            if ("tr".equals(strO)) {
                this.f35370k = a0.f35345o;
                return;
            }
            if ("tbody".equals(strO) || "thead".equals(strO) || "tfoot".equals(strO)) {
                this.f35370k = a0.f35344n;
                return;
            }
            if ("caption".equals(strO)) {
                this.f35370k = a0.f35342l;
                return;
            }
            if ("colgroup".equals(strO)) {
                this.f35370k = a0.f35343m;
                return;
            }
            if ("table".equals(strO)) {
                this.f35370k = a0.f35340j;
                return;
            }
            if ("head".equals(strO)) {
                this.f35370k = a0.f35339h;
                return;
            }
            if (SentryLogEvent.JsonKeys.BODY.equals(strO)) {
                this.f35370k = a0.f35339h;
                return;
            }
            if ("frameset".equals(strO)) {
                this.f35370k = a0.f35350t;
                return;
            } else if ("html".equals(strO)) {
                this.f35370k = a0.f35335d;
                return;
            } else {
                if (z5) {
                    this.f35370k = a0.f35339h;
                    return;
                }
            }
        }
    }

    public final vl.k a(vl.k kVar) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            if (((vl.k) this.f35364d.get(size)) == kVar) {
                return (vl.k) this.f35364d.get(size - 1);
            }
        }
        return null;
    }

    public final void b() {
        while (!this.f35375p.isEmpty()) {
            int size = this.f35375p.size();
            if ((size > 0 ? (vl.k) this.f35375p.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void c(String... strArr) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) this.f35364d.get(size);
            if (tl.a.a(kVar.o(), strArr) || kVar.o().equals("html")) {
                return;
            }
            this.f35364d.remove(size);
        }
    }

    public final vl.k d() {
        int size = this.f35364d.size();
        if (size > 0) {
            return (vl.k) this.f35364d.get(size - 1);
        }
        return null;
    }

    public final void e(a0 a0Var) {
        if (this.f35367g.a()) {
            b0 b0Var = this.f35367g;
            a aVar = this.f35361a;
            b0Var.add(new d8.i("Unexpected token [%s] when in state [%s]", aVar.f35330f + aVar.f35329e, new Object[]{this.f35366f.getClass().getSimpleName(), a0Var}));
        }
    }

    public final void f(String str) {
        while (str != null && !pe.a.t(this, str) && tl.a.b(d().o(), A)) {
            v();
        }
    }

    public final vl.k g(String str) {
        for (int size = this.f35375p.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) this.f35375p.get(size);
            if (kVar == null) {
                return null;
            }
            if (kVar.o().equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public final vl.k h(String str) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) this.f35364d.get(size);
            if (kVar.o().equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public final boolean i(String str) {
        String[] strArr = this.f35380u;
        strArr[0] = str;
        return l(strArr, f35356v, f35358x);
    }

    public final boolean j(String str) {
        String[] strArr = this.f35380u;
        strArr[0] = str;
        return l(strArr, f35356v, null);
    }

    public final boolean k(String str) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            String strO = ((vl.k) this.f35364d.get(size)).o();
            if (strO.equals(str)) {
                return true;
            }
            if (!tl.a.b(strO, f35360z)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    public final boolean l(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f35364d.size();
        int i = size - 1;
        int i10 = i > 100 ? size - 101 : 0;
        while (i >= i10) {
            String strO = ((vl.k) this.f35364d.get(i)).o();
            if (!tl.a.b(strO, strArr)) {
                if (tl.a.b(strO, strArr2) || (strArr3 != null && tl.a.b(strO, strArr3))) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean m(String str) {
        String[] strArr = this.f35380u;
        strArr[0] = str;
        return l(strArr, f35359y, null);
    }

    public final vl.k n(k0 k0Var) {
        if (k0Var.f35457k) {
            vl.k kVarQ = q(k0Var);
            this.f35364d.add(kVarQ);
            m0 m0Var = this.f35362b;
            m0Var.f35463c = c3.f35386b;
            j0 j0Var = this.f35377r;
            j0Var.m();
            j0Var.x(kVarQ.f34922d.f35436a);
            m0Var.g(j0Var);
            return kVarQ;
        }
        d0 d0VarA = d0.a(k0Var.w(), this.f35368h);
        String str = this.f35365e;
        c0 c0Var = this.f35368h;
        vl.b bVar = k0Var.f35458l;
        if (!c0Var.f35384b) {
            for (int i = 0; i < bVar.f34909b; i++) {
                String[] strArr = bVar.f34910c;
                strArr[i] = d4.p(strArr[i]);
            }
        }
        vl.k kVar = new vl.k(d0VarA, str, bVar);
        t(kVar);
        this.f35364d.add(kVar);
        return kVar;
    }

    public final void o(f0 f0Var) {
        vl.o fVar;
        String str = d().f34922d.f35436a;
        String str2 = f0Var.f35444d;
        if (f0Var instanceof e0) {
            fVar = new vl.d(str2);
        } else if (str.equals("script") || str.equals("style")) {
            fVar = new vl.f();
            fVar.f34938d = str2;
        } else {
            fVar = new vl.r(str2);
        }
        d().t(fVar);
    }

    public final void p(g0 g0Var) {
        String string = g0Var.f35445d.toString();
        vl.e eVar = new vl.e();
        eVar.f34938d = string;
        t(eVar);
    }

    public final vl.k q(k0 k0Var) {
        d0 d0VarA = d0.a(k0Var.w(), this.f35368h);
        vl.k kVar = new vl.k(d0VarA, this.f35365e, k0Var.f35458l);
        t(kVar);
        if (k0Var.f35457k) {
            if (!d0.f35429j.containsKey(d0VarA.f35436a)) {
                d0VarA.f35441f = true;
            } else if (!d0VarA.f35440e) {
                m0 m0Var = this.f35362b;
                b0 b0Var = m0Var.f35462b;
                if (b0Var.a()) {
                    a aVar = m0Var.f35461a;
                    int i = aVar.f35330f + aVar.f35329e;
                    d8.i iVar = new d8.i(2);
                    iVar.f15634b = i;
                    iVar.f15635c = "Tag cannot be self closing; not a void tag";
                    b0Var.add(iVar);
                    return kVar;
                }
            }
        }
        return kVar;
    }

    public final void r(k0 k0Var, boolean z5) {
        vl.n nVar = new vl.n(d0.a(k0Var.w(), this.f35368h), this.f35365e, k0Var.f35458l);
        this.f35374o = nVar;
        t(nVar);
        if (z5) {
            this.f35364d.add(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(vl.p r6) {
        /*
            r5 = this;
            java.lang.String r0 = "table"
            vl.k r0 = r5.h(r0)
            r1 = 0
            if (r0 == 0) goto L17
            vl.p r2 = r0.f34939b
            vl.k r2 = (vl.k) r2
            if (r2 == 0) goto L11
            r3 = 1
            goto L20
        L11:
            vl.k r2 = r5.a(r0)
        L15:
            r3 = r1
            goto L20
        L17:
            java.util.ArrayList r2 = r5.f35364d
            java.lang.Object r2 = r2.get(r1)
            vl.k r2 = (vl.k) r2
            goto L15
        L20:
            if (r3 == 0) goto L70
            k3.f.v(r0)
            vl.p r2 = r0.f34939b
            k3.f.v(r2)
            vl.p r2 = r0.f34939b
            int r0 = r0.f34940c
            vl.p[] r6 = new vl.p[]{r6}
            r2.getClass()
            r3 = r6[r1]
            if (r3 == 0) goto L68
            java.util.List r3 = r2.j()
            r1 = r6[r1]
            r1.getClass()
            vl.p r4 = r1.f34939b
            if (r4 == 0) goto L49
            r4.s(r1)
        L49:
            r1.f34939b = r2
            java.util.List r6 = java.util.Arrays.asList(r6)
            r3.addAll(r0, r6)
            java.util.List r6 = r2.j()
        L56:
            int r1 = r6.size()
            if (r0 >= r1) goto L67
            java.lang.Object r1 = r6.get(r0)
            vl.p r1 = (vl.p) r1
            r1.f34940c = r0
            int r0 = r0 + 1
            goto L56
        L67:
            return
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array must not contain any null objects"
            r6.<init>(r0)
            throw r6
        L70:
            r2.t(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.b.s(vl.p):void");
    }

    public final void t(vl.p pVar) {
        vl.n nVar;
        if (this.f35364d.size() == 0) {
            this.f35363c.t(pVar);
        } else if (this.f35379t) {
            s(pVar);
        } else {
            d().t(pVar);
        }
        if (pVar instanceof vl.k) {
            vl.k kVar = (vl.k) pVar;
            if (!kVar.f34922d.f35443h || (nVar = this.f35374o) == null) {
                return;
            }
            nVar.f34936j.add(kVar);
        }
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f35366f + ", state=" + this.f35370k + ", currentElement=" + d() + '}';
    }

    public final void v() {
    }

    public final void w(String str) {
        for (int size = this.f35364d.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) this.f35364d.get(size);
            this.f35364d.remove(size);
            if (kVar.o().equals(str)) {
                return;
            }
        }
    }

    public final boolean x(kv0 kv0Var) {
        this.f35366f = kv0Var;
        return this.f35370k.c(kv0Var, this);
    }

    public final boolean y(kv0 kv0Var, a0 a0Var) {
        this.f35366f = kv0Var;
        return a0Var.c(kv0Var, this);
    }

    public final boolean z(String str) {
        kv0 kv0Var = this.f35366f;
        j0 j0Var = this.f35369j;
        if (kv0Var == j0Var) {
            j0 j0Var2 = new j0();
            j0Var2.x(str);
            return x(j0Var2);
        }
        j0Var.m();
        j0Var.x(str);
        return x(j0Var);
    }
}
