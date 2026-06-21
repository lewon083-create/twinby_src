package k3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Exception {
    public j(h hVar) {
        this("Unhandled input format:", hVar);
    }

    public j(String str, h hVar) {
        super(str + " " + hVar);
    }
}
