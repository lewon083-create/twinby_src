package kd;

import ad.b1;
import ad.g0;
import ad.h0;
import ad.j0;
import ad.o0;
import ad.q;
import android.os.Bundle;
import io.sentry.protocol.App;
import ob.y1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f27374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f27375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f27376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f27377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b1 f27378e;

    static {
        int i = o0.f846d;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        o0.q(15, objArr);
        h0 h0Var = j0.f818c;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        q.b(7, objArr2);
        f27374a = j0.p(7, objArr2);
        Object[] objArr3 = {"auto", App.TYPE, "am"};
        q.b(3, objArr3);
        f27375b = j0.p(3, objArr3);
        f27376c = j0.x("_r", "_dbg");
        g0 g0Var = new g0(4);
        g0Var.c(y1.i);
        g0Var.c(y1.f30551j);
        f27377d = g0Var.g();
        f27378e = j0.x("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (!f27374a.contains(str)) {
            if (bundle == null) {
                return true;
            }
            b1 b1Var = f27376c;
            int i = b1Var.f770e;
            int i10 = 0;
            while (i10 < i) {
                boolean zContainsKey = bundle.containsKey((String) b1Var.get(i10));
                i10++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f27377d.contains(str2)) {
            b1 b1Var = f27378e;
            int i = b1Var.f770e;
            int i10 = 0;
            while (i10 < i) {
                boolean zMatches = str2.matches((String) b1Var.get(i10));
                i10++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f27375b.contains(str) && bundle != null) {
            b1 b1Var = f27376c;
            int i = b1Var.f770e;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 101200) {
                        if (iHashCode != 101230) {
                            if (iHashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    }
                } else {
                    boolean zContainsKey = bundle.containsKey((String) b1Var.get(i10));
                    i10++;
                    if (zContainsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
