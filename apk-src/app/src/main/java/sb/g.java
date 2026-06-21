package sb;

import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f32858a = new m();

    public final void a(Exception exc) {
        this.f32858a.m(exc);
    }

    public final void b(Object obj) {
        this.f32858a.l(obj);
    }

    public final boolean c(Exception exc) {
        m mVar = this.f32858a;
        mVar.getClass();
        c0.j(exc, "Exception must not be null");
        synchronized (mVar.f32876a) {
            try {
                if (mVar.f32878c) {
                    return false;
                }
                mVar.f32878c = true;
                mVar.f32881f = exc;
                mVar.f32877b.w(mVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(Object obj) {
        m mVar = this.f32858a;
        synchronized (mVar.f32876a) {
            try {
                if (mVar.f32878c) {
                    return false;
                }
                mVar.f32878c = true;
                mVar.f32880e = obj;
                mVar.f32877b.w(mVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
