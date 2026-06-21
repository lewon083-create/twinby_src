package s3;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements o4.q, w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o4.q f32654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f32655c;

    @Override // o4.q
    public final void a(long j10, long j11, j3.o oVar, MediaFormat mediaFormat) {
        o4.q qVar = this.f32654b;
        if (qVar != null) {
            qVar.a(j10, j11, oVar, mediaFormat);
        }
    }

    public final void b() {
        u uVar = this.f32655c;
        if (uVar != null) {
            uVar.b();
        }
    }

    public final void c() {
        u uVar = this.f32655c;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // s3.w0
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.f32654b = (o4.q) obj;
        } else if (i == 8) {
            this.f32655c = (u) obj;
        } else if (i == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
