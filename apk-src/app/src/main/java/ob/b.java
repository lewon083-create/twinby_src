package ob;

import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.y7;
import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f29947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f29948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f29949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f29950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f29951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f29952h;
    public final k5 i;

    public b(c cVar, String str, int i, k5 k5Var, int i10) {
        this.f29951g = i10;
        this.f29952h = cVar;
        this.f29945a = str;
        this.f29946b = i;
        this.i = k5Var;
    }

    public static Boolean c(Boolean bool, boolean z5) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.y1 y1Var, s0 s0Var) {
        List listU;
        pa.c0.i(y1Var);
        if (str != null && y1Var.p() && y1Var.x() != 1 && (y1Var.x() != 7 ? y1Var.q() : y1Var.v() != 0)) {
            int iX = y1Var.x();
            boolean zT = y1Var.t();
            String strR = (zT || iX == 2 || iX == 7) ? y1Var.r() : y1Var.r().toUpperCase(Locale.ENGLISH);
            if (y1Var.v() == 0) {
                listU = null;
            } else {
                listU = y1Var.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (s0Var != null) {
                                    s0Var.f30413j.g(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case 5:
                        return Boolean.valueOf(str.equals(strR));
                    case 6:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.v1 r9, double r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.v1, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.d3 r24, long r25, ob.s r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.d3, long, ob.s, boolean):boolean");
    }

    public boolean b(Long l10, Long l11, com.google.android.gms.internal.measurement.u3 u3Var, boolean z5) {
        boolean z10;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        y7.a();
        l1 l1Var = (l1) this.f29952h.f15951b;
        g gVar = l1Var.f30263e;
        o0 o0Var = l1Var.f30268k;
        s0 s0Var = l1Var.f30265g;
        boolean zM = gVar.M(this.f29945a, d0.D0);
        com.google.android.gms.internal.measurement.x1 x1Var = (com.google.android.gms.internal.measurement.x1) this.i;
        boolean zT = x1Var.t();
        boolean zU = x1Var.u();
        boolean zW = x1Var.w();
        boolean z11 = zT || zU || zW;
        if (z5 && !z11) {
            l1.k(s0Var);
            s0Var.f30418o.h(Integer.valueOf(this.f29946b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", x1Var.p() ? Integer.valueOf(x1Var.q()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.s1 s1VarS = x1Var.s();
        boolean zU2 = s1VarS.u();
        if (!u3Var.u()) {
            z10 = zW;
            if (!u3Var.y()) {
                if (!u3Var.s()) {
                    l1.k(s0Var);
                    s0Var.f30413j.g(o0Var.c(u3Var.r()), "User property has no value, property");
                } else if (s1VarS.p()) {
                    String strT = u3Var.t();
                    com.google.android.gms.internal.measurement.y1 y1VarQ = s1VarS.q();
                    l1.k(s0Var);
                    boolC = c(d(strT, y1VarQ, s0Var), zU2);
                } else if (!s1VarS.r()) {
                    l1.k(s0Var);
                    s0Var.f30413j.g(o0Var.c(u3Var.r()), "No string or number filter defined. property");
                } else if (v0.i0(u3Var.t())) {
                    String strT2 = u3Var.t();
                    com.google.android.gms.internal.measurement.v1 v1VarS = s1VarS.s();
                    if (v0.i0(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), v1VarS, ConfigValue.DOUBLE_DEFAULT_VALUE);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                        boolC = c(boolE, zU2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zU2);
                    }
                } else {
                    l1.k(s0Var);
                    s0Var.f30413j.h(o0Var.c(u3Var.r()), "Invalid user property value for Numeric number filter. property, value", u3Var.t());
                }
                boolC = null;
            } else if (s1VarS.r()) {
                double dZ = u3Var.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), s1VarS.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                l1.k(s0Var);
                s0Var.f30413j.g(o0Var.c(u3Var.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (s1VarS.r()) {
            z10 = zW;
            try {
                boolE3 = e(new BigDecimal(u3Var.v()), s1VarS.s(), ConfigValue.DOUBLE_DEFAULT_VALUE);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            l1.k(s0Var);
            s0Var.f30413j.g(o0Var.c(u3Var.r()), "No number filter for long property. property");
            z10 = zW;
            boolC = null;
        }
        l1.k(s0Var);
        s0Var.f30418o.g(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f29947c = Boolean.TRUE;
        if (!z10 || boolC.booleanValue()) {
            if (!z5 || x1Var.t()) {
                this.f29948d = boolC;
            }
            if (boolC.booleanValue() && z11 && u3Var.p()) {
                long jQ = u3Var.q();
                if (l10 != null) {
                    jQ = l10.longValue();
                }
                if (zM && x1Var.t() && !x1Var.u() && l11 != null) {
                    jQ = l11.longValue();
                }
                if (x1Var.u()) {
                    this.f29950f = Long.valueOf(jQ);
                } else {
                    this.f29949e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}
