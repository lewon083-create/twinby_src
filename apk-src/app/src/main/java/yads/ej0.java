package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38145a;

    public ej0(String str) {
        this.f38145a = str;
    }

    public static ej0 a(lb2 lb2Var) {
        String str;
        lb2Var.e(lb2Var.f40464b + 2);
        int iM = lb2Var.m();
        int i = iM >> 1;
        int iM2 = ((lb2Var.m() >> 3) & 31) | ((iM & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i);
        return new ej0(l7.o.j(iM2, iM2 >= 10 ? "." : ".0", sb2));
    }
}
