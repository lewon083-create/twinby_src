package ob;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f30319b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f30320c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f30321d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f30322a;

    public o0(b1 b1Var) {
        this.f30322a = b1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        pa.c0.i(atomicReference);
        pa.c0.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f30322a.a() ? str : g(str, y1.f30545c, y1.f30543a, f30319b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f30322a.a() ? str : g(str, y1.f30548f, y1.f30547e, f30320c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f30322a.a() ? str : str.startsWith("_exp_") ? pe.a.f("experiment_id(", str, ")") : g(str, y1.f30551j, y1.i, f30321d);
    }

    public final String d(v vVar) {
        b1 b1Var = this.f30322a;
        if (!b1Var.a()) {
            return vVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(vVar.f30456d);
        sb2.append(",name=");
        sb2.append(a(vVar.f30454b));
        sb2.append(",params=");
        u uVar = vVar.f30455c;
        sb2.append(uVar == null ? null : !b1Var.a() ? uVar.f30430b.toString() : e(uVar.f()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f30322a.a()) {
            return bundle.toString();
        }
        StringBuilder sbJ = pe.a.j("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbJ.length() != 8) {
                sbJ.append(", ");
            }
            sbJ.append(b(str));
            sbJ.append("=");
            Object obj = bundle.get(str);
            sbJ.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbJ.append("}]");
        return sbJ.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbJ = pe.a.j("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbJ.length() != 1) {
                    sbJ.append(", ");
                }
                sbJ.append(strE);
            }
        }
        sbJ.append("]");
        return sbJ.toString();
    }
}
