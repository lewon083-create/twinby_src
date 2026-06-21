package c2;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2189a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2193e;

    static {
        int i = Build.VERSION.SDK_INT;
        f2190b = i >= 30 ? a.f2188a.a(30) : 0;
        f2191c = i >= 30 ? a.f2188a.a(31) : 0;
        f2192d = i >= 30 ? a.f2188a.a(33) : 0;
        f2193e = i >= 30 ? a.f2188a.a(1000000) : 0;
    }

    private b() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num = Intrinsics.a(upperCase, "BAKLAVA") ? num : null;
            String upperCase2 = codename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            num = Intrinsics.a(upperCase2, "BAKLAVA") ? 0 : null;
            if (num == null || num == null) {
                if (num == null && num == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    String upperCase4 = codename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("S", CODENAME);
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("Tiramisu", CODENAME);
    }

    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("UpsideDownCake", CODENAME);
    }
}
