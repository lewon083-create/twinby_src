package vl;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import wl.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends p {
    public static final List i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f34922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f34923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f34924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f34925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34926h;

    static {
        Pattern.compile("\\s+");
    }

    public k(d0 d0Var, String str, b bVar) {
        k3.f.v(d0Var);
        k3.f.v(str);
        this.f34924f = i;
        this.f34926h = str;
        this.f34925g = bVar;
        this.f34922d = d0Var;
    }

    public static boolean A(p pVar) {
        if (pVar != null && (pVar instanceof k)) {
            k kVar = (k) pVar;
            int i10 = 0;
            while (!kVar.f34922d.f35442g) {
                kVar = (k) kVar.f34939b;
                i10++;
                if (i10 >= 6 || kVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    public static void u(StringBuilder sb2, r rVar) {
        String strT = rVar.t();
        if (A(rVar.f34939b) || (rVar instanceof d)) {
            sb2.append(strT);
            return;
        }
        boolean zV = r.v(sb2);
        String[] strArr = tl.a.f33942a;
        int length = strT.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z10 = false;
        while (iCharCount < length) {
            int iCodePointAt = strT.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!zV || z5) && !z10) {
                    sb2.append(' ');
                    z10 = true;
                }
            } else if (Character.getType(iCodePointAt) != 16 || (iCodePointAt != 8203 && iCodePointAt != 8204 && iCodePointAt != 8205 && iCodePointAt != 173)) {
                sb2.appendCodePoint(iCodePointAt);
                z10 = false;
                z5 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public final k B() {
        p pVar = this.f34939b;
        if (pVar == null) {
            return null;
        }
        List listV = ((k) pVar).v();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= listV.size()) {
                break;
            }
            if (listV.get(i11) == this) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 > 0) {
            return (k) listV.get(i10 - 1);
        }
        return null;
    }

    @Override // vl.p
    public final b d() {
        if (!l()) {
            this.f34925g = new b();
        }
        return this.f34925g;
    }

    @Override // vl.p
    public final String e() {
        return this.f34926h;
    }

    @Override // vl.p
    public final int f() {
        return this.f34924f.size();
    }

    @Override // vl.p
    public final p h(p pVar) {
        k kVar = (k) super.h(pVar);
        b bVar = this.f34925g;
        kVar.f34925g = bVar != null ? bVar.clone() : null;
        kVar.f34926h = this.f34926h;
        j jVar = new j(kVar, this.f34924f.size());
        kVar.f34924f = jVar;
        jVar.addAll(this.f34924f);
        return kVar;
    }

    @Override // vl.p
    public final void i(String str) {
        this.f34926h = str;
    }

    @Override // vl.p
    public final List j() {
        if (this.f34924f == i) {
            this.f34924f = new j(this, 4);
        }
        return this.f34924f;
    }

    @Override // vl.p
    public final boolean l() {
        return this.f34925g != null;
    }

    @Override // vl.p
    public String o() {
        return this.f34922d.f35436a;
    }

    @Override // vl.p
    public void q(StringBuilder sb2, int i10, g gVar) throws IOException {
        boolean z5;
        k kVar;
        boolean z10 = gVar.f34916f;
        d0 d0Var = this.f34922d;
        if (z10 && ((d0Var.f35438c || ((kVar = (k) this.f34939b) != null && kVar.f34922d.f35438c)) && sb2.length() > 0)) {
            p.m(sb2, i10, gVar);
        }
        sb2.append('<').append(d0Var.f35436a);
        b bVar = this.f34925g;
        if (bVar != null) {
            bVar.g(sb2, gVar);
        }
        if (!this.f34924f.isEmpty() || (!(z5 = d0Var.f35440e) && !d0Var.f35441f)) {
            sb2.append('>');
        } else if (gVar.f34918h == 1 && z5) {
            sb2.append('>');
        } else {
            sb2.append(" />");
        }
    }

    @Override // vl.p
    public void r(StringBuilder sb2, int i10, g gVar) throws IOException {
        boolean zIsEmpty = this.f34924f.isEmpty();
        d0 d0Var = this.f34922d;
        if (zIsEmpty && (d0Var.f35440e || d0Var.f35441f)) {
            return;
        }
        if (gVar.f34916f && !this.f34924f.isEmpty() && d0Var.f35438c) {
            p.m(sb2, i10, gVar);
        }
        sb2.append("</").append(d0Var.f35436a).append('>');
    }

    public final void t(p pVar) {
        k3.f.v(pVar);
        p pVar2 = pVar.f34939b;
        if (pVar2 != null) {
            pVar2.s(pVar);
        }
        pVar.f34939b = this;
        j();
        this.f34924f.add(pVar);
        pVar.f34940c = this.f34924f.size() - 1;
    }

    @Override // vl.p
    public final String toString() {
        return p();
    }

    public final List v() {
        List list;
        WeakReference weakReference = this.f34923e;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f34924f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f34924f.get(i10);
            if (pVar instanceof k) {
                arrayList.add((k) pVar);
            }
        }
        this.f34923e = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // vl.p
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k g() {
        return (k) super.g();
    }

    public final String x() {
        StringBuilder sb2 = new StringBuilder();
        for (p pVar : this.f34924f) {
            if (pVar instanceof f) {
                sb2.append(((f) pVar).t());
            } else if (pVar instanceof e) {
                sb2.append(((e) pVar).t());
            } else if (pVar instanceof k) {
                sb2.append(((k) pVar).x());
            } else if (pVar instanceof d) {
                sb2.append(((d) pVar).t());
            }
        }
        return sb2.toString();
    }

    public final int y() {
        k kVar = (k) this.f34939b;
        if (kVar == null) {
            return 0;
        }
        List listV = kVar.v();
        for (int i10 = 0; i10 < listV.size(); i10++) {
            if (listV.get(i10) == this) {
                return i10;
            }
        }
        return 0;
    }

    public final String z() {
        StringBuilder sb2 = new StringBuilder();
        for (p pVar : this.f34924f) {
            if (pVar instanceof r) {
                u(sb2, (r) pVar);
            } else if ((pVar instanceof k) && ((k) pVar).f34922d.f35436a.equals("br") && !r.v(sb2)) {
                sb2.append(" ");
            }
        }
        return sb2.toString().trim();
    }
}
