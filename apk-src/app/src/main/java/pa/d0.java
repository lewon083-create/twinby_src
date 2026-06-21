package pa;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.b f31325b;

    public d0(ma.b bVar) {
        c0.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f28761c == 0 || bVar.f28762d == null) ? false : true);
        this.f31325b = bVar;
    }
}
