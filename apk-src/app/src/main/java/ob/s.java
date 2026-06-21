package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f30405h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f30406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f30407k;

    public s(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        pa.c0.f(str);
        pa.c0.f(str2);
        pa.c0.b(j10 >= 0);
        pa.c0.b(j11 >= 0);
        pa.c0.b(j12 >= 0);
        pa.c0.b(j14 >= 0);
        this.f30398a = str;
        this.f30399b = str2;
        this.f30400c = j10;
        this.f30401d = j11;
        this.f30402e = j12;
        this.f30403f = j13;
        this.f30404g = j14;
        this.f30405h = l10;
        this.i = l11;
        this.f30406j = l12;
        this.f30407k = bool;
    }

    public final s a(long j10) {
        return new s(this.f30398a, this.f30399b, this.f30400c, this.f30401d, this.f30402e, j10, this.f30404g, this.f30405h, this.i, this.f30406j, this.f30407k);
    }

    public final s b(Long l10, Long l11, Boolean bool) {
        return new s(this.f30398a, this.f30399b, this.f30400c, this.f30401d, this.f30402e, this.f30403f, this.f30404g, this.f30405h, l10, l11, bool);
    }
}
