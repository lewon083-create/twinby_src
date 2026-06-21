package ad;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f833c;

    public l0(Object obj, Object obj2, Object obj3) {
        this.f831a = obj;
        this.f832b = obj2;
        this.f833c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f831a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f832b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f833c);
        return new IllegalArgumentException(sb2.toString());
    }
}
