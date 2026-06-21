package o4;

import i4.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f29699c;

    public /* synthetic */ u(v vVar, int i, long j10) {
        this.f29698b = 3;
        this.f29699c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f29698b;
        v vVar = this.f29699c;
        switch (i) {
            case 0:
                s3.t tVar = vVar.f29701b;
                String str = m3.z.f28608a;
                t3.d dVar = tVar.f32648b.f32714t;
                dVar.z(dVar.y(), 1016, new t3.b(19));
                break;
            case 1:
                s3.t tVar2 = vVar.f29701b;
                String str2 = m3.z.f28608a;
                t3.d dVar2 = tVar2.f32648b.f32714t;
                dVar2.z(dVar2.y(), 1030, new t3.b(1));
                break;
            case 2:
                s3.t tVar3 = vVar.f29701b;
                String str3 = m3.z.f28608a;
                t3.d dVar3 = tVar3.f32648b.f32714t;
                dVar3.z(dVar3.y(), 1019, new t3.b(8));
                break;
            case 3:
                s3.t tVar4 = vVar.f29701b;
                String str4 = m3.z.f28608a;
                t3.d dVar4 = tVar4.f32648b.f32714t;
                dVar4.z(dVar4.v((c0) dVar4.f33420d.f31950e), 1018, new t3.b(24));
                break;
            case 4:
                s3.t tVar5 = vVar.f29701b;
                String str5 = m3.z.f28608a;
                t3.d dVar5 = tVar5.f32648b.f32714t;
                dVar5.z(dVar5.v((c0) dVar5.f33420d.f31950e), 1021, new t3.b(26));
                break;
            default:
                s3.t tVar6 = vVar.f29701b;
                String str6 = m3.z.f28608a;
                t3.d dVar6 = tVar6.f32648b.f32714t;
                dVar6.z(dVar6.y(), 1015, new t3.c(4));
                break;
        }
    }

    public /* synthetic */ u(v vVar, long j10, int i) {
        this.f29698b = 4;
        this.f29699c = vVar;
    }

    public /* synthetic */ u(v vVar, Object obj, int i) {
        this.f29698b = i;
        this.f29699c = vVar;
    }

    public /* synthetic */ u(v vVar, String str, long j10, long j11) {
        this.f29698b = 0;
        this.f29699c = vVar;
    }
}
