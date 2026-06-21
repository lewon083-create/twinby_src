package ok;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f30724e;

    static {
        int i = k.f30732c;
        int i10 = k.f30733d;
        long j10 = k.f30734e;
        String str = k.f30730a;
        e eVar = new e();
        eVar.f30726d = new c(str, i, i10, j10);
        f30724e = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // hk.x
    public final String toString() {
        return "Dispatchers.Default";
    }
}
