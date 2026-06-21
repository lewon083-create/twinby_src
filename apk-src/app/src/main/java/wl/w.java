package wl;

import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.measurement.d4;
import io.sentry.SentryLogEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum w extends a0 {
    public w() {
        super("InBody", 6);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        vl.k kVar;
        int iM = t.z.m(kv0Var.f7316c);
        if (iM == 0) {
            bVar.e(this);
            return false;
        }
        String[] strArr = b.B;
        String[] strArr2 = z.f35484h;
        String[] strArr3 = z.f35479c;
        String[] strArr4 = z.f35482f;
        if (iM != 1) {
            if (iM != 2) {
                if (iM == 3) {
                    bVar.p((g0) kv0Var);
                    return true;
                }
                if (iM != 4) {
                    return true;
                }
                f0 f0Var = (f0) kv0Var;
                if (f0Var.f35444d.equals(a0.f35354x)) {
                    bVar.e(this);
                    return false;
                }
                if (bVar.f35378s && a0.a(f0Var)) {
                    bVar.C();
                    bVar.o(f0Var);
                    return true;
                }
                bVar.C();
                bVar.o(f0Var);
                bVar.f35378s = false;
                return true;
            }
            j0 j0Var = (j0) kv0Var;
            String str = j0Var.f35452e;
            if (!tl.a.b(str, z.f35491p)) {
                if (tl.a.b(str, z.f35490o)) {
                    if (!bVar.j(str)) {
                        bVar.e(this);
                        return false;
                    }
                    if (!pe.a.t(bVar, str)) {
                        bVar.e(this);
                    }
                    bVar.w(str);
                    return true;
                }
                if (str.equals("span")) {
                    return d(kv0Var, bVar);
                }
                boolean zEquals = str.equals("li");
                String[] strArr5 = b.f35356v;
                if (zEquals) {
                    String[] strArr6 = bVar.f35380u;
                    strArr6[0] = str;
                    if (!bVar.l(strArr6, strArr5, b.f35357w)) {
                        bVar.e(this);
                        return false;
                    }
                    bVar.f(str);
                    if (!bVar.d().o().equals(str)) {
                        bVar.e(this);
                    }
                    bVar.w(str);
                    return true;
                }
                if (str.equals(SentryLogEvent.JsonKeys.BODY)) {
                    if (bVar.j(SentryLogEvent.JsonKeys.BODY)) {
                        bVar.f35370k = a0.f35349s;
                        return true;
                    }
                    bVar.e(this);
                    return false;
                }
                if (str.equals("html")) {
                    if (bVar.z(SentryLogEvent.JsonKeys.BODY)) {
                        return bVar.x(j0Var);
                    }
                    return true;
                }
                if (str.equals("form")) {
                    vl.k kVar2 = bVar.f35374o;
                    bVar.f35374o = null;
                    if (kVar2 == null || !bVar.j(str)) {
                        bVar.e(this);
                        return false;
                    }
                    if (!pe.a.t(bVar, str)) {
                        bVar.e(this);
                    }
                    bVar.E(kVar2);
                    return true;
                }
                if (str.equals("p")) {
                    if (!bVar.i(str)) {
                        bVar.e(this);
                        bVar.A(str);
                        return bVar.x(j0Var);
                    }
                    bVar.f(str);
                    if (!bVar.d().o().equals(str)) {
                        bVar.e(this);
                    }
                    bVar.w(str);
                    return true;
                }
                if (tl.a.b(str, strArr4)) {
                    if (!bVar.j(str)) {
                        bVar.e(this);
                        return false;
                    }
                    bVar.f(str);
                    if (!bVar.d().o().equals(str)) {
                        bVar.e(this);
                    }
                    bVar.w(str);
                    return true;
                }
                if (tl.a.b(str, strArr3)) {
                    if (!bVar.l(strArr3, strArr5, null)) {
                        bVar.e(this);
                        return false;
                    }
                    bVar.f(str);
                    if (!bVar.d().o().equals(str)) {
                        bVar.e(this);
                    }
                    for (int size = bVar.f35364d.size() - 1; size >= 0; size--) {
                        vl.k kVar3 = (vl.k) bVar.f35364d.get(size);
                        bVar.f35364d.remove(size);
                        if (tl.a.b(kVar3.o(), strArr3)) {
                            return true;
                        }
                    }
                    return true;
                }
                if (str.equals("sarcasm")) {
                    return d(kv0Var, bVar);
                }
                if (!tl.a.b(str, strArr2)) {
                    if (!str.equals("br")) {
                        return d(kv0Var, bVar);
                    }
                    bVar.e(this);
                    bVar.A("br");
                    return false;
                }
                if (bVar.j("name")) {
                    return true;
                }
                if (!bVar.j(str)) {
                    bVar.e(this);
                    return false;
                }
                if (!pe.a.t(bVar, str)) {
                    bVar.e(this);
                }
                bVar.w(str);
                bVar.b();
                return true;
            }
            for (int i = 0; i < 8; i++) {
                vl.k kVarG = bVar.g(str);
                if (kVarG == null) {
                    return d(kv0Var, bVar);
                }
                if (!b.u(bVar.f35364d, kVarG)) {
                    bVar.e(this);
                    bVar.D(kVarG);
                    return true;
                }
                if (!bVar.j(kVarG.o())) {
                    bVar.e(this);
                    return false;
                }
                if (bVar.d() != kVarG) {
                    bVar.e(this);
                }
                ArrayList arrayList = bVar.f35364d;
                int size2 = arrayList.size();
                boolean z5 = false;
                vl.k kVar4 = null;
                for (int i10 = 0; i10 < size2 && i10 < 64; i10++) {
                    kVar = (vl.k) arrayList.get(i10);
                    if (kVar != kVarG) {
                        if (z5 && tl.a.b(kVar.o(), strArr)) {
                            break;
                        }
                    } else {
                        kVar4 = (vl.k) arrayList.get(i10 - 1);
                        z5 = true;
                    }
                }
                kVar = null;
                if (kVar == null) {
                    bVar.w(kVarG.o());
                    bVar.D(kVarG);
                    return true;
                }
                vl.k kVarA = kVar;
                vl.k kVar5 = kVarA;
                for (int i11 = 0; i11 < 3; i11++) {
                    if (b.u(bVar.f35364d, kVarA)) {
                        kVarA = bVar.a(kVarA);
                    }
                    if (!b.u(bVar.f35375p, kVarA)) {
                        bVar.E(kVarA);
                    } else {
                        if (kVarA == kVarG) {
                            break;
                        }
                        String strO = kVarA.o();
                        k3.f.v(strO);
                        HashMap map = d0.f35429j;
                        d0 d0Var = (d0) map.get(strO);
                        if (d0Var == null) {
                            String strTrim = strO.trim();
                            k3.f.t(strTrim);
                            d0Var = (d0) map.get(strTrim);
                            if (d0Var == null) {
                                d0Var = new d0(strTrim);
                                d0Var.f35437b = false;
                            }
                        }
                        vl.k kVar6 = new vl.k(d0Var, bVar.f35365e, null);
                        ArrayList arrayList2 = bVar.f35375p;
                        int iLastIndexOf = arrayList2.lastIndexOf(kVarA);
                        k3.f.r(iLastIndexOf != -1);
                        arrayList2.set(iLastIndexOf, kVar6);
                        ArrayList arrayList3 = bVar.f35364d;
                        int iLastIndexOf2 = arrayList3.lastIndexOf(kVarA);
                        k3.f.r(iLastIndexOf2 != -1);
                        arrayList3.set(iLastIndexOf2, kVar6);
                        vl.p pVar = kVar5.f34939b;
                        if (((vl.k) pVar) != null) {
                            k3.f.v(pVar);
                            kVar5.f34939b.s(kVar5);
                        }
                        kVar6.t(kVar5);
                        kVarA = kVar6;
                        kVar5 = kVarA;
                    }
                }
                if (tl.a.b(kVar4.o(), z.f35492q)) {
                    vl.p pVar2 = kVar5.f34939b;
                    if (((vl.k) pVar2) != null) {
                        k3.f.v(pVar2);
                        kVar5.f34939b.s(kVar5);
                    }
                    bVar.s(kVar5);
                } else {
                    vl.p pVar3 = kVar5.f34939b;
                    if (((vl.k) pVar3) != null) {
                        k3.f.v(pVar3);
                        kVar5.f34939b.s(kVar5);
                    }
                    kVar4.t(kVar5);
                }
                vl.k kVar7 = new vl.k(kVarG.f34922d, bVar.f35365e, null);
                kVar7.d().a(kVarG.d());
                for (vl.p pVar4 : (vl.p[]) Collections.unmodifiableList(kVar.j()).toArray(new vl.p[kVar.f34924f.size()])) {
                    kVar7.t(pVar4);
                }
                kVar.t(kVar7);
                bVar.D(kVarG);
                bVar.E(kVarG);
                int iLastIndexOf3 = bVar.f35364d.lastIndexOf(kVar);
                k3.f.r(iLastIndexOf3 != -1);
                bVar.f35364d.add(iLastIndexOf3 + 1, kVar7);
            }
            return true;
        }
        k0 k0Var = (k0) kv0Var;
        String str2 = k0Var.f35452e;
        if (str2.equals("a")) {
            if (bVar.g("a") != null) {
                bVar.e(this);
                bVar.z("a");
                vl.k kVarH = bVar.h("a");
                if (kVarH != null) {
                    bVar.D(kVarH);
                    bVar.E(kVarH);
                }
            }
            bVar.C();
            bVar.B(bVar.n(k0Var));
            return true;
        }
        if (tl.a.b(str2, z.i)) {
            bVar.C();
            bVar.q(k0Var);
            bVar.f35378s = false;
            return true;
        }
        if (tl.a.b(str2, z.f35478b)) {
            if (bVar.i("p")) {
                bVar.z("p");
            }
            bVar.n(k0Var);
            return true;
        }
        if (str2.equals("span")) {
            bVar.C();
            bVar.n(k0Var);
            return true;
        }
        boolean zEquals2 = str2.equals("li");
        String[] strArr7 = z.f35481e;
        if (zEquals2) {
            bVar.f35378s = false;
            ArrayList arrayList4 = bVar.f35364d;
            int size3 = arrayList4.size() - 1;
            while (true) {
                if (size3 <= 0) {
                    break;
                }
                vl.k kVar8 = (vl.k) arrayList4.get(size3);
                if (kVar8.o().equals("li")) {
                    bVar.z("li");
                    break;
                }
                if (tl.a.b(kVar8.o(), strArr) && !tl.a.b(kVar8.o(), strArr7)) {
                    break;
                }
                size3--;
            }
            if (bVar.i("p")) {
                bVar.z("p");
            }
            bVar.n(k0Var);
            return true;
        }
        if (str2.equals("html")) {
            bVar.e(this);
            vl.k kVar9 = (vl.k) bVar.f35364d.get(0);
            vl.b bVar2 = k0Var.f35458l;
            bVar2.getClass();
            int i12 = 0;
            while (i12 < bVar2.f34909b) {
                String str3 = bVar2.f34910c[i12];
                String str4 = bVar2.f34911d[i12];
                k3.f.v(str3);
                String strTrim2 = str3.trim();
                k3.f.t(str3);
                i12++;
                if (!kVar9.k(strTrim2)) {
                    vl.b bVarD = kVar9.d();
                    bVarD.getClass();
                    bVarD.p(strTrim2, str4);
                }
            }
            return true;
        }
        if (tl.a.b(str2, z.f35477a)) {
            bVar.f35366f = kv0Var;
            return a0.f35336e.c(kv0Var, bVar);
        }
        if (str2.equals(SentryLogEvent.JsonKeys.BODY)) {
            bVar.e(this);
            ArrayList arrayList5 = bVar.f35364d;
            if (arrayList5.size() == 1) {
                return false;
            }
            if (arrayList5.size() > 2 && !((vl.k) arrayList5.get(1)).o().equals(SentryLogEvent.JsonKeys.BODY)) {
                return false;
            }
            bVar.f35378s = false;
            vl.k kVar10 = (vl.k) arrayList5.get(1);
            vl.b bVar3 = k0Var.f35458l;
            bVar3.getClass();
            int i13 = 0;
            while (i13 < bVar3.f34909b) {
                String str5 = bVar3.f34910c[i13];
                String str6 = bVar3.f34911d[i13];
                k3.f.v(str5);
                String strTrim3 = str5.trim();
                k3.f.t(str5);
                i13++;
                if (!kVar10.k(strTrim3)) {
                    vl.b bVarD2 = kVar10.d();
                    bVarD2.getClass();
                    bVarD2.p(strTrim3, str6);
                }
            }
        } else {
            if (str2.equals("frameset")) {
                bVar.e(this);
                ArrayList arrayList6 = bVar.f35364d;
                if (arrayList6.size() == 1) {
                    return false;
                }
                if ((arrayList6.size() > 2 && !((vl.k) arrayList6.get(1)).o().equals(SentryLogEvent.JsonKeys.BODY)) || !bVar.f35378s) {
                    return false;
                }
                vl.k kVar11 = (vl.k) arrayList6.get(1);
                vl.p pVar5 = kVar11.f34939b;
                if (((vl.k) pVar5) != null) {
                    k3.f.v(pVar5);
                    kVar11.f34939b.s(kVar11);
                }
                while (arrayList6.size() > 1) {
                    arrayList6.remove(arrayList6.size() - 1);
                }
                bVar.n(k0Var);
                bVar.f35370k = a0.f35350t;
                return true;
            }
            if (tl.a.b(str2, strArr3)) {
                if (bVar.i("p")) {
                    bVar.z("p");
                }
                if (tl.a.b(bVar.d().o(), strArr3)) {
                    bVar.e(this);
                    bVar.v();
                }
                bVar.n(k0Var);
                return true;
            }
            if (tl.a.b(str2, z.f35480d)) {
                if (bVar.i("p")) {
                    bVar.z("p");
                }
                bVar.n(k0Var);
                bVar.f35361a.k("\n");
                bVar.f35378s = false;
                return true;
            }
            if (str2.equals("form")) {
                if (bVar.f35374o != null) {
                    bVar.e(this);
                    return false;
                }
                if (bVar.i("p")) {
                    bVar.z("p");
                }
                bVar.r(k0Var, true);
                return true;
            }
            if (tl.a.b(str2, strArr4)) {
                bVar.f35378s = false;
                ArrayList arrayList7 = bVar.f35364d;
                int size4 = arrayList7.size() - 1;
                while (true) {
                    if (size4 <= 0) {
                        break;
                    }
                    vl.k kVar12 = (vl.k) arrayList7.get(size4);
                    if (tl.a.b(kVar12.o(), strArr4)) {
                        bVar.z(kVar12.o());
                        break;
                    }
                    if (tl.a.b(kVar12.o(), strArr) && !tl.a.b(kVar12.o(), strArr7)) {
                        break;
                    }
                    size4--;
                }
                if (bVar.i("p")) {
                    bVar.z("p");
                }
                bVar.n(k0Var);
                return true;
            }
            if (str2.equals("plaintext")) {
                if (bVar.i("p")) {
                    bVar.z("p");
                }
                bVar.n(k0Var);
                bVar.f35362b.f35463c = c3.f35398h;
                return true;
            }
            if (str2.equals("button")) {
                if (bVar.i("button")) {
                    bVar.e(this);
                    bVar.z("button");
                    bVar.x(k0Var);
                    return true;
                }
                bVar.C();
                bVar.n(k0Var);
                bVar.f35378s = false;
                return true;
            }
            if (tl.a.b(str2, z.f35483g)) {
                bVar.C();
                bVar.B(bVar.n(k0Var));
                return true;
            }
            if (str2.equals("nobr")) {
                bVar.C();
                if (bVar.j("nobr")) {
                    bVar.e(this);
                    bVar.z("nobr");
                    bVar.C();
                }
                bVar.B(bVar.n(k0Var));
                return true;
            }
            if (tl.a.b(str2, strArr2)) {
                bVar.C();
                bVar.n(k0Var);
                bVar.f35375p.add(null);
                bVar.f35378s = false;
                return true;
            }
            boolean zEquals3 = str2.equals("table");
            y yVar = a0.f35340j;
            if (zEquals3) {
                if (bVar.f35363c.f34920k != 2 && bVar.i("p")) {
                    bVar.z("p");
                }
                bVar.n(k0Var);
                bVar.f35378s = false;
                bVar.f35370k = yVar;
                return true;
            }
            if (str2.equals("input")) {
                bVar.C();
                if (!bVar.q(k0Var).b("type").equalsIgnoreCase("hidden")) {
                    bVar.f35378s = false;
                    return true;
                }
            } else {
                if (tl.a.b(str2, z.f35485j)) {
                    bVar.q(k0Var);
                    return true;
                }
                if (str2.equals("hr")) {
                    if (bVar.i("p")) {
                        bVar.z("p");
                    }
                    bVar.q(k0Var);
                    bVar.f35378s = false;
                    return true;
                }
                if (str2.equals("image")) {
                    if (bVar.h("svg") == null) {
                        k0Var.x("img");
                        return bVar.x(k0Var);
                    }
                    bVar.n(k0Var);
                    return true;
                }
                if (str2.equals("isindex")) {
                    bVar.e(this);
                    if (bVar.f35374o != null) {
                        return false;
                    }
                    bVar.A("form");
                    if (k0Var.f35458l.n("action") != -1) {
                        bVar.f35374o.c("action", k0Var.f35458l.f("action"));
                    }
                    bVar.A("hr");
                    bVar.A("label");
                    String strF = k0Var.f35458l.n("prompt") != -1 ? k0Var.f35458l.f("prompt") : "This is a searchable index. Enter search keywords: ";
                    f0 f0Var2 = new f0();
                    f0Var2.f35444d = strF;
                    bVar.x(f0Var2);
                    vl.b bVar4 = new vl.b();
                    vl.b bVar5 = k0Var.f35458l;
                    bVar5.getClass();
                    int i14 = 0;
                    while (i14 < bVar5.f34909b) {
                        String str7 = bVar5.f34910c[i14];
                        String str8 = bVar5.f34911d[i14];
                        k3.f.v(str7);
                        String strTrim4 = str7.trim();
                        k3.f.t(str7);
                        i14++;
                        if (!tl.a.b(strTrim4, z.f35486k)) {
                            bVar4.p(strTrim4, str8);
                        }
                    }
                    bVar4.p("name", "isindex");
                    kv0 kv0Var2 = bVar.f35366f;
                    k0 k0Var2 = bVar.i;
                    if (kv0Var2 == k0Var2) {
                        k0 k0Var3 = new k0();
                        k0Var3.f35451d = "input";
                        k0Var3.f35458l = bVar4;
                        k0Var3.f35452e = d4.p("input");
                        bVar.x(k0Var3);
                    } else {
                        k0Var2.m();
                        k0Var2.f35451d = "input";
                        k0Var2.f35458l = bVar4;
                        k0Var2.f35452e = d4.p("input");
                        bVar.x(k0Var2);
                    }
                    bVar.z("label");
                    bVar.A("hr");
                    bVar.z("form");
                    return true;
                }
                if (str2.equals("textarea")) {
                    bVar.n(k0Var);
                    bVar.f35362b.f35463c = c3.f35390d;
                    bVar.f35371l = bVar.f35370k;
                    bVar.f35378s = false;
                    bVar.f35370k = a0.i;
                    return true;
                }
                if (str2.equals("xmp")) {
                    if (bVar.i("p")) {
                        bVar.z("p");
                    }
                    bVar.C();
                    bVar.f35378s = false;
                    a0.b(k0Var, bVar);
                    return true;
                }
                if (str2.equals("iframe")) {
                    bVar.f35378s = false;
                    a0.b(k0Var, bVar);
                    return true;
                }
                if (str2.equals("noembed")) {
                    a0.b(k0Var, bVar);
                    return true;
                }
                if (str2.equals("select")) {
                    bVar.C();
                    bVar.n(k0Var);
                    bVar.f35378s = false;
                    a0 a0Var = bVar.f35370k;
                    if (a0Var.equals(yVar) || a0Var.equals(a0.f35342l) || a0Var.equals(a0.f35344n) || a0Var.equals(a0.f35345o) || a0Var.equals(a0.f35346p)) {
                        bVar.f35370k = a0.f35348r;
                        return true;
                    }
                    bVar.f35370k = a0.f35347q;
                    return true;
                }
                if (tl.a.b(str2, z.f35487l)) {
                    if (pe.a.t(bVar, "option")) {
                        bVar.z("option");
                    }
                    bVar.C();
                    bVar.n(k0Var);
                    return true;
                }
                if (!tl.a.b(str2, z.f35488m)) {
                    if (str2.equals("math")) {
                        bVar.C();
                        bVar.n(k0Var);
                        return true;
                    }
                    if (str2.equals("svg")) {
                        bVar.C();
                        bVar.n(k0Var);
                        return true;
                    }
                    if (tl.a.b(str2, z.f35489n)) {
                        bVar.e(this);
                        return false;
                    }
                    bVar.C();
                    bVar.n(k0Var);
                    return true;
                }
                if (bVar.j("ruby")) {
                    if (!pe.a.t(bVar, "ruby")) {
                        bVar.e(this);
                        for (int size5 = bVar.f35364d.size() - 1; size5 >= 0 && !((vl.k) bVar.f35364d.get(size5)).o().equals("ruby"); size5--) {
                            bVar.f35364d.remove(size5);
                        }
                    }
                    bVar.n(k0Var);
                    return true;
                }
            }
        }
        return true;
    }

    public final boolean d(kv0 kv0Var, b bVar) {
        c0 c0Var = bVar.f35368h;
        kv0Var.getClass();
        String strW = ((j0) kv0Var).w();
        c0Var.getClass();
        String strTrim = strW.trim();
        if (!c0Var.f35383a) {
            strTrim = d4.p(strTrim);
        }
        ArrayList arrayList = bVar.f35364d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vl.k kVar = (vl.k) arrayList.get(size);
            if (kVar.o().equals(strTrim)) {
                bVar.f(strTrim);
                if (!strTrim.equals(bVar.d().o())) {
                    bVar.e(this);
                }
                bVar.w(strTrim);
                return true;
            }
            if (tl.a.b(kVar.o(), b.B)) {
                bVar.e(this);
                return false;
            }
        }
        return true;
    }
}
