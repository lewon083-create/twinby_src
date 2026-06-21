package zc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g {
    public abstract boolean a(char c8);

    @Override // zc.g
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
