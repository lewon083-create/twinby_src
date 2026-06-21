package ob;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements s3.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f30542f;

    public y0(z0 z0Var, String str, long j10) {
        Objects.requireNonNull(z0Var);
        this.f30542f = z0Var;
        pa.c0.f(str);
        this.f30541e = str;
        this.f30539c = j10;
    }

    @Override // s3.i0
    public void a(j3.f0 f0Var) {
        if (this.f30538b) {
            b(c());
        }
        this.f30542f = f0Var;
    }

    public void b(long j10) {
        this.f30539c = j10;
        if (this.f30538b) {
            ((m3.t) this.f30541e).getClass();
            this.f30540d = SystemClock.elapsedRealtime();
        }
    }

    @Override // s3.i0
    public long c() {
        long j10 = this.f30539c;
        if (!this.f30538b) {
            return j10;
        }
        ((m3.t) this.f30541e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f30540d;
        j3.f0 f0Var = (j3.f0) this.f30542f;
        return (f0Var.f26237a == 1.0f ? m3.z.M(jElapsedRealtime) : jElapsedRealtime * ((long) f0Var.f26239c)) + j10;
    }

    public void d() {
        if (this.f30538b) {
            return;
        }
        ((m3.t) this.f30541e).getClass();
        this.f30540d = SystemClock.elapsedRealtime();
        this.f30538b = true;
    }

    public long f() {
        if (!this.f30538b) {
            this.f30538b = true;
            z0 z0Var = (z0) this.f30542f;
            this.f30540d = z0Var.G().getLong((String) this.f30541e, this.f30539c);
        }
        return this.f30540d;
    }

    public void g(long j10) {
        SharedPreferences.Editor editorEdit = ((z0) this.f30542f).G().edit();
        editorEdit.putLong((String) this.f30541e, j10);
        editorEdit.apply();
        this.f30540d = j10;
    }

    @Override // s3.i0
    public j3.f0 getPlaybackParameters() {
        return (j3.f0) this.f30542f;
    }

    public y0(m3.t tVar) {
        this.f30541e = tVar;
        this.f30542f = j3.f0.f26236d;
    }
}
