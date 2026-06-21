package sb;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, c, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32861b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f32863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Exception f32867h;
    public boolean i;

    public i(int i, m mVar) {
        this.f32862c = i;
        this.f32863d = mVar;
    }

    public final void a() {
        int i = this.f32864e + this.f32865f + this.f32866g;
        int i10 = this.f32862c;
        if (i == i10) {
            Exception exc = this.f32867h;
            m mVar = this.f32863d;
            if (exc == null) {
                if (this.i) {
                    mVar.n();
                    return;
                } else {
                    mVar.l(null);
                    return;
                }
            }
            int i11 = this.f32865f;
            int length = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 8 + 24);
            sb2.append(i11);
            sb2.append(" out of ");
            sb2.append(i10);
            sb2.append(" underlying tasks failed");
            mVar.m(new ExecutionException(sb2.toString(), this.f32867h));
        }
    }

    @Override // sb.b
    public final void b() {
        synchronized (this.f32861b) {
            this.f32866g++;
            this.i = true;
            a();
        }
    }

    @Override // sb.c
    public final void onFailure(Exception exc) {
        synchronized (this.f32861b) {
            this.f32865f++;
            this.f32867h = exc;
            a();
        }
    }

    @Override // sb.d
    public final void onSuccess(Object obj) {
        synchronized (this.f32861b) {
            this.f32864e++;
            a();
        }
    }
}
