package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s9 f43239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f43240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t9 f43241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t9 f43242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t9 f43243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t9[] f43244g;

    static {
        t9 t9Var = new t9(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f43241d = t9Var;
        t9 t9Var2 = new t9(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f43242e = t9Var2;
        t9 t9Var3 = new t9(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f43243f = t9Var3;
        t9[] t9VarArr = {t9Var, t9Var2, t9Var3};
        f43244g = t9VarArr;
        hl.d.k(t9VarArr);
        f43239b = new s9();
        f43240c = kotlin.collections.j0.h(new Pair(s9.a("values_dimen_%s", t9Var.name()), 48), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var.name()), 56), new Pair(s9.a("values_dimen_%s", t9Var2.name()), 15), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var2.name()), 17), new Pair(s9.a("values_dimen_%s", t9Var3.name()), 19), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var3.name()), 23));
    }

    public t9(int i, String str) {
    }

    public static t9 valueOf(String str) {
        return (t9) Enum.valueOf(t9.class, str);
    }

    public static t9[] values() {
        return (t9[]) f43244g.clone();
    }

    public final int a(Context context) {
        try {
            s9 s9Var = f43239b;
            StringBuilder sb2 = new StringBuilder(name());
            int iD = nl3.d(context);
            int iB = nl3.b(context);
            if (iD > iB) {
                iD = iB;
            }
            if (iD >= 600) {
                sb2.append("_sw600dp");
            }
            String string = sb2.toString();
            s9Var.getClass();
            Integer num = (Integer) f43240c.get(s9.a("values_dimen_%s", string));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            s9 s9Var2 = f43239b;
            String strName = name();
            s9Var2.getClass();
            Integer num2 = (Integer) f43240c.get(s9.a("values_dimen_%s", strName));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
