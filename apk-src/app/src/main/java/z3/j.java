package z3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f46089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.l f46093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46094h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f46095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f46096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f46097l;

    public j(String str, i iVar, long j10, int i, long j11, j3.l lVar, String str2, String str3, long j12, long j13, boolean z5) {
        this.f46088b = str;
        this.f46089c = iVar;
        this.f46090d = j10;
        this.f46091e = i;
        this.f46092f = j11;
        this.f46093g = lVar;
        this.f46094h = str2;
        this.i = str3;
        this.f46095j = j12;
        this.f46096k = j13;
        this.f46097l = z5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j10 = this.f46092f;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }
}
