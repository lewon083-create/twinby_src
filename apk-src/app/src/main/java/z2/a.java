package z2;

import android.util.Log;
import com.google.android.gms.internal.ads.jm1;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45792h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f45793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f45795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f45796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f45797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f45799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45801r;

    public a(h0 h0Var) {
        h0Var.H();
        v vVar = h0Var.f45862v;
        if (vVar != null) {
            vVar.f45996d.getClassLoader();
        }
        this.f45785a = new ArrayList();
        this.f45798o = false;
        this.f45801r = -1;
        this.f45799p = h0Var;
    }

    @Override // z2.e0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (h0.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f45791g) {
            return true;
        }
        this.f45799p.f45845d.add(this);
        return true;
    }

    public final void b(n0 n0Var) {
        this.f45785a.add(n0Var);
        n0Var.f45912d = this.f45786b;
        n0Var.f45913e = this.f45787c;
        n0Var.f45914f = this.f45788d;
        n0Var.f45915g = this.f45789e;
    }

    public final void c(int i) {
        if (this.f45791g) {
            if (h0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f45785a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                n0 n0Var = (n0) arrayList.get(i10);
                t tVar = n0Var.f45910b;
                if (tVar != null) {
                    tVar.f45984s += i;
                    if (h0.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + n0Var.f45910b + " to " + n0Var.f45910b.f45984s);
                    }
                }
            }
        }
    }

    public final int d(boolean z5) {
        if (this.f45800q) {
            throw new IllegalStateException("commit already called");
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new jm1());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f45800q = true;
        boolean z10 = this.f45791g;
        h0 h0Var = this.f45799p;
        if (z10) {
            this.f45801r = h0Var.f45850j.getAndIncrement();
        } else {
            this.f45801r = -1;
        }
        h0Var.y(this, z5);
        return this.f45801r;
    }

    public final void e(int i, t tVar, String str, int i10) {
        String str2 = tVar.M;
        if (str2 != null) {
            a3.d.d(tVar, str2);
        }
        Class<?> cls = tVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = tVar.f45991z;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(tVar);
                sb2.append(": was ");
                throw new IllegalStateException(t.z.g(sb2, tVar.f45991z, " now ", str));
            }
            tVar.f45991z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + tVar + " with tag " + str + " to container view with no id");
            }
            int i11 = tVar.f45989x;
            if (i11 != 0 && i11 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + tVar + ": was " + tVar.f45989x + " now " + i);
            }
            tVar.f45989x = i;
            tVar.f45990y = i;
        }
        b(new n0(i10, tVar));
        tVar.f45985t = this.f45799p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f45792h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f45801r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f45800q);
            if (this.f45790f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f45790f));
            }
            if (this.f45786b != 0 || this.f45787c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f45786b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f45787c));
            }
            if (this.f45788d != 0 || this.f45789e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f45788d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f45789e));
            }
            if (this.i != 0 || this.f45793j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f45793j);
            }
            if (this.f45794k != 0 || this.f45795l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f45794k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f45795l);
            }
        }
        ArrayList arrayList = this.f45785a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n0 n0Var = (n0) arrayList.get(i);
            switch (n0Var.f45909a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + n0Var.f45909a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(n0Var.f45910b);
            if (z5) {
                if (n0Var.f45912d != 0 || n0Var.f45913e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(n0Var.f45912d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(n0Var.f45913e));
                }
                if (n0Var.f45914f != 0 || n0Var.f45915g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(n0Var.f45914f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(n0Var.f45915g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f45801r >= 0) {
            sb2.append(" #");
            sb2.append(this.f45801r);
        }
        if (this.f45792h != null) {
            sb2.append(" ");
            sb2.append(this.f45792h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
