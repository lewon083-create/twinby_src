package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class az {
    public static final Boolean a(tg1 tg1Var, String str) {
        vg1 vg1Var = (vg1) tg1Var;
        if (!vg1Var.a(str)) {
            vg1Var = null;
        }
        if (vg1Var != null) {
            return Boolean.valueOf(vg1Var.a(str, false));
        }
        return null;
    }

    public static final Integer b(tg1 tg1Var, String str) {
        vg1 vg1Var = (vg1) tg1Var;
        if (!vg1Var.a(str)) {
            vg1Var = null;
        }
        if (vg1Var != null) {
            return Integer.valueOf(vg1Var.a(0, str));
        }
        return null;
    }

    public static final void a(tg1 tg1Var, String str, Boolean bool) {
        if (bool == null) {
            ((vg1) tg1Var).d(str);
        } else {
            ((vg1) tg1Var).b(str, bool.booleanValue());
        }
    }

    public static final void a(tg1 tg1Var, String str, Integer num) {
        if (num != null) {
            ((vg1) tg1Var).b(num.intValue(), str);
        } else {
            ((vg1) tg1Var).d(str);
        }
    }
}
