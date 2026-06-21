package e4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements q4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4.i f16086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f16087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f16088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f16091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q4.m f16092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16093h;
    public volatile long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f16094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16097m;

    public f(k kVar, int i) {
        f4.i dVar;
        f4.i iVar;
        this.f16089d = i;
        String str = kVar.f16140c.f26335n;
        str.getClass();
        switch (str) {
            case "video/3gpp":
                dVar = new f4.d(kVar, 0);
                iVar = dVar;
                break;
            case "video/hevc":
                dVar = new f4.e(kVar, 1);
                iVar = dVar;
                break;
            case "audio/amr-wb":
            case "audio/3gpp":
                dVar = new f4.c(kVar);
                iVar = dVar;
                break;
            case "audio/mp4a-latm":
                dVar = kVar.f16142e.equals("MP4A-LATM") ? new f4.f(kVar) : new f4.a(kVar);
                iVar = dVar;
                break;
            case "audio/ac3":
                dVar = new f4.b(kVar);
                iVar = dVar;
                break;
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                dVar = new f4.j(kVar);
                iVar = dVar;
                break;
            case "video/mp4v-es":
                dVar = new f4.g(kVar);
                iVar = dVar;
                break;
            case "video/avc":
                dVar = new f4.e(kVar, 0);
                iVar = dVar;
                break;
            case "audio/opus":
                dVar = new f4.h(kVar);
                iVar = dVar;
                break;
            case "video/x-vnd.on2.vp8":
                dVar = new f4.k(kVar);
                iVar = dVar;
                break;
            case "video/x-vnd.on2.vp9":
                dVar = new f4.d(kVar, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f16086a = iVar;
        this.f16087b = new m3.p(65507);
        this.f16088c = new m3.p();
        this.f16090e = new Object();
        this.f16091f = new j();
        this.i = -9223372036854775807L;
        this.f16094j = -1;
        this.f16096l = -9223372036854775807L;
        this.f16097m = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r18, com.google.android.gms.internal.ads.e2 r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.f.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        this.f16086a.c(mVar, this.f16089d);
        mVar.G();
        mVar.j(new q4.o(-9223372036854775807L));
        this.f16092g = mVar;
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        synchronized (this.f16090e) {
            try {
                if (!this.f16095k) {
                    this.f16095k = true;
                }
                this.f16096l = j10;
                this.f16097m = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
