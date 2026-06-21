package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f37784c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej1 f37785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cj1 f37786b = new cj1();

    public dj1(tg1 tg1Var) {
        this.f37785a = new ej1(tg1Var);
    }

    public final String a() {
        String strA;
        synchronized (f37784c) {
            strA = this.f37785a.a();
            if (strA == null) {
                this.f37786b.getClass();
                strA = cj1.a();
                this.f37785a.a(strA);
            }
        }
        return strA;
    }
}
