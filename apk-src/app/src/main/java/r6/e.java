package r6;

import android.content.Context;
import java.io.File;
import l6.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f32260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f32262f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f32263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32264h;

    public e(Context context, String str, i iVar, boolean z5) {
        this.f32258b = context;
        this.f32259c = str;
        this.f32260d = iVar;
        this.f32261e = z5;
    }

    public final d a() {
        d dVar;
        synchronized (this.f32262f) {
            try {
                if (this.f32263g == null) {
                    b[] bVarArr = new b[1];
                    if (this.f32259c == null || !this.f32261e) {
                        this.f32263g = new d(this.f32258b, this.f32259c, bVarArr, this.f32260d);
                    } else {
                        this.f32263g = new d(this.f32258b, new File(this.f32258b.getNoBackupFilesDir(), this.f32259c).getAbsolutePath(), bVarArr, this.f32260d);
                    }
                    this.f32263g.setWriteAheadLoggingEnabled(this.f32264h);
                }
                dVar = this.f32263g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // q6.b
    public final b getWritableDatabase() {
        return a().b();
    }

    @Override // q6.b
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        synchronized (this.f32262f) {
            try {
                d dVar = this.f32263g;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z5);
                }
                this.f32264h = z5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
