package ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e1.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f30120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f30122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f30123f;

    public final boolean D(String str) {
        return "1".equals(this.f30122e.i(str, "gaia_collection_enabled"));
    }

    public final boolean E(String str) {
        return "1".equals(this.f30122e.i(str, "measurement.event_sampling_enabled"));
    }

    public final boolean F() {
        if (this.f30120c == null) {
            Boolean boolO = O("app_measurement_lite");
            this.f30120c = boolO;
            if (boolO == null) {
                this.f30120c = Boolean.FALSE;
            }
        }
        return this.f30120c.booleanValue() || !((l1) this.f15951b).f30261c;
    }

    public final String G(String str) {
        l1 l1Var = (l1) this.f15951b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            pa.c0.i(str2);
            return str2;
        } catch (ClassNotFoundException e3) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(e3, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e7) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(e7, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.f30411g.g(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            s0 s0Var4 = l1Var.f30265g;
            l1.k(s0Var4);
            s0Var4.f30411g.g(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void H() {
        ((l1) this.f15951b).getClass();
    }

    public final String I(String str, c0 c0Var) {
        return TextUtils.isEmpty(str) ? (String) c0Var.a(null) : (String) c0Var.a(this.f30122e.i(str, c0Var.f29976a));
    }

    public final long J(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        String strI = this.f30122e.i(str, c0Var.f29976a);
        if (TextUtils.isEmpty(strI)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        try {
            return ((Long) c0Var.a(Long.valueOf(Long.parseLong(strI)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c0Var.a(null)).longValue();
        }
    }

    public final int K(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        String strI = this.f30122e.i(str, c0Var.f29976a);
        if (TextUtils.isEmpty(strI)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        try {
            return ((Integer) c0Var.a(Integer.valueOf(Integer.parseInt(strI)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c0Var.a(null)).intValue();
        }
    }

    public final double L(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        String strI = this.f30122e.i(str, c0Var.f29976a);
        if (TextUtils.isEmpty(strI)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) c0Var.a(Double.valueOf(Double.parseDouble(strI)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
    }

    public final boolean M(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c0Var.a(null)).booleanValue();
        }
        String strI = this.f30122e.i(str, c0Var.f29976a);
        return TextUtils.isEmpty(strI) ? ((Boolean) c0Var.a(null)).booleanValue() : ((Boolean) c0Var.a(Boolean.valueOf("1".equals(strI)))).booleanValue();
    }

    public final Bundle N() {
        l1 l1Var = (l1) this.f15951b;
        try {
            Context context = l1Var.f30260b;
            Context context2 = l1Var.f30260b;
            s0 s0Var = l1Var.f30265g;
            if (context.getPackageManager() == null) {
                l1.k(s0Var);
                s0Var.f30411g.f("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = wa.b.a(context2).c(128, context2.getPackageName());
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            l1.k(s0Var);
            s0Var.f30411g.f("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(e3, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean O(String str) {
        pa.c0.f(str);
        Bundle bundleN = N();
        if (bundleN != null) {
            if (bundleN.containsKey(str)) {
                return Boolean.valueOf(bundleN.getBoolean(str));
            }
            return null;
        }
        s0 s0Var = ((l1) this.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30411g.f("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean P() {
        ((l1) this.f15951b).getClass();
        Boolean boolO = O("firebase_analytics_collection_deactivated");
        return boolO != null && boolO.booleanValue();
    }

    public final boolean Q() {
        Boolean boolO = O("google_analytics_automatic_screen_reporting_enabled");
        return boolO == null || boolO.booleanValue();
    }

    public final u1 R(String str, boolean z5) {
        Object obj;
        pa.c0.f(str);
        l1 l1Var = (l1) this.f15951b;
        Bundle bundleN = N();
        if (bundleN == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleN.get(str);
        }
        u1 u1Var = u1.UNINITIALIZED;
        if (obj == null) {
            return u1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return u1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return u1.DENIED;
        }
        if (z5 && "eu_consent_policy".equals(obj)) {
            return u1.POLICY;
        }
        s0 s0Var2 = l1Var.f30265g;
        l1.k(s0Var2);
        s0Var2.f30413j.g(str, "Invalid manifest metadata for");
        return u1Var;
    }
}
