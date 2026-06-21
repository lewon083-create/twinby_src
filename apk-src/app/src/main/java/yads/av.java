package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class av {
    public static String a(yu yuVar) {
        if (yuVar instanceof uu) {
            String str = ((uu) yuVar).f43768a.f43657h;
            return str == null ? "unknown" : str;
        }
        if (yuVar instanceof vu) {
            return "default";
        }
        if (yuVar instanceof wu) {
            return "empty";
        }
        if (yuVar instanceof xu) {
            return "error";
        }
        throw new ij.j();
    }
}
