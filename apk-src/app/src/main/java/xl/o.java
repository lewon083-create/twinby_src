package xl;

import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.internal.measurement.d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f36282d = {StringUtils.COMMA, ">", "+", "~", " "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f36283e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f36284f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f36285g = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d8.i f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f36288c;

    public static m h(String str) {
        try {
            o oVar = new o();
            oVar.f36288c = new ArrayList();
            oVar.f36287b = str;
            oVar.f36286a = new d8.i(str, 3);
            return oVar.g();
        } catch (IllegalArgumentException e3) {
            throw new xx1(e3.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(char r11) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.o.a(char):void");
    }

    public final int b() {
        String strTrim = this.f36286a.c().trim();
        String[] strArr = tl.a.f33942a;
        boolean z5 = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z5 = true;
                    break;
                }
                if (!Character.isDigit(strTrim.codePointAt(i))) {
                    break;
                }
                i++;
            }
        }
        if (z5) {
            return Integer.parseInt(strTrim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    public final void c(boolean z5) {
        ArrayList arrayList = this.f36288c;
        d8.i iVar = this.f36286a;
        iVar.e(z5 ? ":containsOwn" : ":contains");
        String strN = d8.i.n(iVar.b('(', ')'));
        k3.f.u(strN, ":contains(text) query must not be empty");
        if (z5) {
            e eVar = new e(4);
            eVar.f36269b = d4.p(strN);
            arrayList.add(eVar);
        } else {
            e eVar2 = new e(5);
            eVar2.f36269b = d4.p(strN);
            arrayList.add(eVar2);
        }
    }

    public final void d(boolean z5, boolean z10) {
        ArrayList arrayList = this.f36288c;
        String strR = d4.r(this.f36286a.c());
        Matcher matcher = f36284f.matcher(strR);
        Matcher matcher2 = f36285g.matcher(strR);
        int i = 2;
        int i10 = 1;
        if (!"odd".equals(strR)) {
            if ("even".equals(strR)) {
                i10 = 0;
            } else if (matcher.matches()) {
                int i11 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i10 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i11;
            } else {
                if (!matcher2.matches()) {
                    throw new xx1("Could not parse nth-index '%s': unexpected format", strR);
                }
                i10 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        if (z10) {
            if (z5) {
                arrayList.add(new k(i, i10, 2));
                return;
            } else {
                arrayList.add(new k(i, i10, 3));
                return;
            }
        }
        if (z5) {
            arrayList.add(new k(i, i10, 1));
        } else {
            arrayList.add(new k(i, i10, 0));
        }
    }

    public final void e() {
        String str = this.f36287b;
        ArrayList arrayList = this.f36288c;
        d8.i iVar = this.f36286a;
        int i = 6;
        if (iVar.i("#")) {
            String strF = iVar.f();
            k3.f.t(strF);
            e eVar = new e(i);
            eVar.f36269b = strF;
            arrayList.add(eVar);
            return;
        }
        int i10 = 2;
        if (iVar.i(".")) {
            String strF2 = iVar.f();
            k3.f.t(strF2);
            String strTrim = strF2.trim();
            e eVar2 = new e(i10);
            eVar2.f36269b = strTrim;
            arrayList.add(eVar2);
            return;
        }
        int i11 = 0;
        int i12 = 1;
        if (iVar.l() || iVar.j("*|")) {
            int i13 = iVar.f15634b;
            while (!iVar.h() && (iVar.l() || iVar.k("*|", "|", "_", "-"))) {
                iVar.f15634b++;
            }
            String strSubstring = iVar.f15635c.substring(i13, iVar.f15634b);
            k3.f.t(strSubstring);
            if (!strSubstring.startsWith("*|")) {
                if (strSubstring.contains("|")) {
                    strSubstring = strSubstring.replace("|", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                arrayList.add(new e(strSubstring.trim()));
                return;
            }
            e eVar3 = new e(d4.r(strSubstring));
            String strR = d4.r(strSubstring.replace("*|", StringUtils.PROCESS_POSTFIX_DELIMITER));
            e eVar4 = new e(8);
            eVar4.f36269b = strR;
            List listAsList = Arrays.asList(eVar3, eVar4);
            b bVar = new b();
            int i14 = bVar.f36266b;
            ArrayList arrayList2 = bVar.f36265a;
            if (i14 > 1) {
                arrayList2.add(new a(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            bVar.f36266b = arrayList2.size();
            arrayList.add(bVar);
            return;
        }
        int i15 = 4;
        int i16 = 3;
        if (iVar.j("[")) {
            d8.i iVar2 = new d8.i(iVar.b('[', ']'), 3);
            int i17 = iVar2.f15634b;
            while (!iVar2.h() && !iVar2.k(f36283e)) {
                iVar2.f15634b++;
            }
            String strSubstring2 = iVar2.f15635c.substring(i17, iVar2.f15634b);
            k3.f.t(strSubstring2);
            iVar2.g();
            if (iVar2.h()) {
                if (!strSubstring2.startsWith("^")) {
                    e eVar5 = new e(i11);
                    eVar5.f36269b = strSubstring2;
                    arrayList.add(eVar5);
                    return;
                } else {
                    String strSubstring3 = strSubstring2.substring(1);
                    e eVar6 = new e(i12);
                    k3.f.t(strSubstring3);
                    eVar6.f36269b = d4.p(strSubstring3);
                    arrayList.add(eVar6);
                    return;
                }
            }
            if (iVar2.i("=")) {
                arrayList.add(new f(strSubstring2, iVar2.m(), 0));
                return;
            }
            if (iVar2.i("!=")) {
                arrayList.add(new f(strSubstring2, iVar2.m(), 3));
                return;
            }
            if (iVar2.i("^=")) {
                arrayList.add(new f(strSubstring2, iVar2.m(), 4));
                return;
            }
            if (iVar2.i("$=")) {
                arrayList.add(new f(strSubstring2, iVar2.m(), 2));
                return;
            }
            if (iVar2.i("*=")) {
                arrayList.add(new f(strSubstring2, iVar2.m(), 1));
                return;
            }
            if (!iVar2.i("~=")) {
                throw new xx1("Could not parse attribute query '%s': unexpected token at '%s'", str, iVar2.m());
            }
            Pattern patternCompile = Pattern.compile(iVar2.m());
            g gVar = new g();
            gVar.f36273a = d4.r(strSubstring2);
            gVar.f36274b = patternCompile;
            arrayList.add(gVar);
            return;
        }
        if (iVar.i("*")) {
            arrayList.add(new d(i11));
            return;
        }
        if (iVar.i(":lt(")) {
            arrayList.add(new h(b(), 2));
            return;
        }
        if (iVar.i(":gt(")) {
            arrayList.add(new h(b(), 1));
            return;
        }
        if (iVar.i(":eq(")) {
            arrayList.add(new h(b(), 0));
            return;
        }
        if (iVar.j(":has(")) {
            iVar.e(":has");
            String strB = iVar.b('(', ')');
            k3.f.u(strB, ":has(el) subselect must not be empty");
            m mVarH = h(strB);
            p pVar = new p(i11);
            pVar.f36289a = mVarH;
            arrayList.add(pVar);
            return;
        }
        if (iVar.j(":contains(")) {
            c(false);
            return;
        }
        if (iVar.j(":containsOwn(")) {
            c(true);
            return;
        }
        if (iVar.j(":containsData(")) {
            iVar.e(":containsData");
            String strN = d8.i.n(iVar.b('(', ')'));
            k3.f.u(strN, ":containsData(text) query must not be empty");
            e eVar7 = new e(i16);
            eVar7.f36269b = d4.p(strN);
            arrayList.add(eVar7);
            return;
        }
        if (iVar.j(":matches(")) {
            f(false);
            return;
        }
        if (iVar.j(":matchesOwn(")) {
            f(true);
            return;
        }
        if (iVar.j(":not(")) {
            iVar.e(":not");
            String strB2 = iVar.b('(', ')');
            k3.f.u(strB2, ":not(selector) subselect must not be empty");
            m mVarH2 = h(strB2);
            p pVar2 = new p(i16);
            pVar2.f36289a = mVarH2;
            arrayList.add(pVar2);
            return;
        }
        if (iVar.i(":nth-child(")) {
            d(false, false);
            return;
        }
        if (iVar.i(":nth-last-child(")) {
            d(true, false);
            return;
        }
        if (iVar.i(":nth-of-type(")) {
            d(false, true);
            return;
        }
        if (iVar.i(":nth-last-of-type(")) {
            d(true, true);
            return;
        }
        if (iVar.i(":first-child")) {
            arrayList.add(new d(i10));
            return;
        }
        if (iVar.i(":last-child")) {
            arrayList.add(new d(i16));
            return;
        }
        if (iVar.i(":first-of-type")) {
            arrayList.add(new i(0, 1, 3));
            return;
        }
        if (iVar.i(":last-of-type")) {
            arrayList.add(new j(0, 1, 2));
            return;
        }
        if (iVar.i(":only-child")) {
            arrayList.add(new d(i15));
            return;
        }
        if (iVar.i(":only-of-type")) {
            arrayList.add(new d(5));
            return;
        }
        if (iVar.i(":empty")) {
            arrayList.add(new d(i12));
        } else if (iVar.i(":root")) {
            arrayList.add(new d(i));
        } else {
            if (!iVar.i(":matchText")) {
                throw new xx1("Could not parse query '%s': unexpected token at '%s'", str, iVar.m());
            }
            arrayList.add(new d(7));
        }
    }

    public final void f(boolean z5) {
        ArrayList arrayList = this.f36288c;
        d8.i iVar = this.f36286a;
        iVar.e(z5 ? ":matchesOwn" : ":matches");
        String strB = iVar.b('(', ')');
        k3.f.u(strB, ":matches(regex) query must not be empty");
        if (z5) {
            Pattern patternCompile = Pattern.compile(strB);
            l lVar = new l(1);
            lVar.f36281b = patternCompile;
            arrayList.add(lVar);
            return;
        }
        Pattern patternCompile2 = Pattern.compile(strB);
        l lVar2 = new l(0);
        lVar2.f36281b = patternCompile2;
        arrayList.add(lVar2);
    }

    public final m g() {
        ArrayList arrayList = this.f36288c;
        d8.i iVar = this.f36286a;
        iVar.g();
        String[] strArr = f36282d;
        if (iVar.k(strArr)) {
            arrayList.add(new d(8));
            a(iVar.d());
        } else {
            e();
        }
        while (!iVar.h()) {
            boolean zG = iVar.g();
            if (iVar.k(strArr)) {
                a(iVar.d());
            } else if (zG) {
                a(' ');
            } else {
                e();
            }
        }
        return arrayList.size() == 1 ? (m) arrayList.get(0) : new a(arrayList);
    }
}
