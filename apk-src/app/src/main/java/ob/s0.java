package ob;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.ur;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f30408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ur f30411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ur f30412h;
    public final ur i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ur f30413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ur f30414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ur f30415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ur f30416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ur f30417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ur f30418o;

    public s0(l1 l1Var) {
        super(l1Var);
        this.f30408d = (char) 0;
        this.f30409e = -1L;
        this.f30411g = new ur(this, 6, false, false);
        this.f30412h = new ur(this, 6, true, false);
        this.i = new ur(this, 6, false, true);
        this.f30413j = new ur(this, 5, false, false);
        this.f30414k = new ur(this, 5, true, false);
        this.f30415l = new ur(this, 5, false, true);
        this.f30416m = new ur(this, 4, false, false);
        this.f30417n = new ur(this, 3, false, false);
        this.f30418o = new ur(this, 2, false, false);
    }

    public static r0 K(String str) {
        if (str == null) {
            return null;
        }
        return new r0(str);
    }

    public static String N(boolean z5, String str, Object obj, Object obj2, Object obj3) {
        String strO = O(obj, z5);
        String strO2 = O(obj2, z5);
        String strO3 = O(obj3, z5);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strO)) {
            sb2.append(str2);
            sb2.append(strO);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strO2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strO2);
        }
        if (!TextUtils.isEmpty(strO3)) {
            sb2.append(str3);
            sb2.append(strO3);
        }
        return sb2.toString();
    }

    public static String O(Object obj, boolean z5) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z5) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(pe.a.b(str.length() + length + 3, String.valueOf(jRound2).length(), str));
            pe.a.s(sb2, str, jRound, "...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof r0 ? ((r0) obj).f30381a : z5 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z5 ? th2.getClass().getName() : th2.toString());
        String canonicalName = l1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb3.toString();
    }

    @Override // ob.s1
    public final boolean D() {
        return false;
    }

    public final ur G() {
        return this.f30411g;
    }

    public final ur H() {
        return this.f30413j;
    }

    public final ur I() {
        return this.f30417n;
    }

    public final ur J() {
        return this.f30418o;
    }

    public final void L(int i, boolean z5, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z5 && Log.isLoggable(M(), i)) {
            Log.println(i, M(), N(false, str, obj, obj2, obj3));
        }
        if (z10 || i < 5) {
            return;
        }
        pa.c0.i(str);
        i1 i1Var = ((l1) this.f15951b).f30266h;
        if (i1Var == null) {
            Log.println(6, M(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!i1Var.f30419c) {
                Log.println(6, M(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            i1Var.L(new q0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String M() {
        String str;
        synchronized (this) {
            try {
                if (this.f30410f == null) {
                    ((l1) ((l1) this.f15951b).f30263e.f15951b).getClass();
                    this.f30410f = "FA";
                }
                pa.c0.i(this.f30410f);
                str = this.f30410f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
