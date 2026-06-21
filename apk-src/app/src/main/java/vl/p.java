package vl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f34939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34940c;

    public static void m(StringBuilder sb2, int i, g gVar) {
        String strValueOf;
        Appendable appendableAppend = sb2.append('\n');
        int i10 = i * gVar.f34917g;
        if (i10 < 0) {
            String[] strArr = tl.a.f33942a;
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr2 = tl.a.f33942a;
        if (i10 < 21) {
            strValueOf = strArr2[i10];
        } else {
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public String a(String str) {
        k3.f.t(str);
        if (!k(str)) {
            return "";
        }
        String strE = e();
        String strB = b(str);
        String[] strArr = tl.a.f33942a;
        try {
            try {
                return tl.a.f(new URL(strE), strB).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strB).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    public String b(String str) {
        String str2;
        k3.f.v(str);
        if (l()) {
            b bVarD = d();
            int iO = bVarD.o(str);
            if (iO == -1 || (str2 = bVarD.f34911d[iO]) == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return str2;
            }
            if (str.startsWith("abs:")) {
                return a(str.substring(4));
            }
        }
        return "";
    }

    public void c(String str, String str2) {
        b bVarD = d();
        int iO = bVarD.o(str);
        if (iO != -1) {
            bVarD.f34911d[iO] = str2;
            if (bVarD.f34910c[iO].equals(str)) {
                return;
            }
            bVarD.f34910c[iO] = str;
            return;
        }
        bVarD.c(bVarD.f34909b + 1);
        String[] strArr = bVarD.f34910c;
        int i = bVarD.f34909b;
        strArr[i] = str;
        bVarD.f34911d[i] = str2;
        bVarD.f34909b = i + 1;
    }

    public abstract b d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract int f();

    @Override // 
    public p g() {
        p pVarH = h(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(pVarH);
        while (!linkedList.isEmpty()) {
            p pVar = (p) linkedList.remove();
            int iF = pVar.f();
            for (int i = 0; i < iF; i++) {
                List listJ = pVar.j();
                p pVarH2 = ((p) listJ.get(i)).h(pVar);
                listJ.set(i, pVarH2);
                linkedList.add(pVarH2);
            }
        }
        return pVarH;
    }

    public p h(p pVar) {
        try {
            p pVar2 = (p) super.clone();
            pVar2.f34939b = pVar;
            pVar2.f34940c = pVar == null ? 0 : this.f34940c;
            return pVar2;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public abstract void i(String str);

    public abstract List j();

    public boolean k(String str) {
        k3.f.v(str);
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (d().o(strSubstring) != -1 && !a(strSubstring).equals("")) {
                return true;
            }
        }
        return d().o(str) != -1;
    }

    public abstract boolean l();

    public final p n() {
        p pVar = this.f34939b;
        if (pVar == null) {
            return null;
        }
        List listJ = pVar.j();
        int i = this.f34940c + 1;
        if (listJ.size() > i) {
            return (p) listJ.get(i);
        }
        return null;
    }

    public abstract String o();

    public String p() {
        StringBuilder sb2 = new StringBuilder(128);
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f34939b;
            if (pVar2 == null) {
                break;
            }
            pVar = pVar2;
        }
        h hVar = pVar instanceof h ? (h) pVar : null;
        if (hVar == null) {
            hVar = new h();
        }
        g gVar = hVar.f34919j;
        r3.b bVar = new r3.b(25, false);
        bVar.f32188c = sb2;
        bVar.f32189d = gVar;
        gVar.b();
        rl.b.v(bVar, this);
        return sb2.toString();
    }

    public abstract void q(StringBuilder sb2, int i, g gVar);

    public abstract void r(StringBuilder sb2, int i, g gVar);

    public void s(p pVar) {
        k3.f.r(pVar.f34939b == this);
        int i = pVar.f34940c;
        j().remove(i);
        List listJ = j();
        while (i < listJ.size()) {
            ((p) listJ.get(i)).f34940c = i;
            i++;
        }
        pVar.f34939b = null;
    }

    public String toString() {
        return p();
    }
}
